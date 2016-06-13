//http://stackoverflow.com/questions/35439742/how-to-use-aws-iot-to-send-receive-messages-to-from-web-browser

// Configure Cognito identity pool
AWS.config.region = 'us-east-1';
var credentials = new AWS.CognitoIdentityCredentials({
    IdentityPoolId: 'us-east-1:your identity pool guid',
});

// Getting AWS creds from Cognito is async, so we need to drive the rest of the mqtt client initialization in a callback
credentials.get(function(err) {
    if(err) {
        console.log(err);
        return;
    }
    var requestUrl = SigV4Utils.getSignedUrl('wss', 'data.iot.us-east-1.amazonaws.com', '/mqtt',
        'iotdevicegateway', 'us-east-1',
        credentials.accessKeyId, credentials.secretAccessKey, credentials.sessionToken);
    initClient(requestUrl);
});

function init() {
  // do setup stuff
}

// Connect the client, subscribe to the drawing topic, and publish a "hey I connected" message
function initClient(requestUrl) {
    var clientId = String(Math.random()).replace('.', '');
    var client = new Paho.MQTT.Client(requestUrl, clientId);
    var connectOptions = {
        onSuccess: function () {
            console.log('connected');

            // subscribe to the drawing
            client.subscribe("your/mqtt/topic");

            // publish a lifecycle event
            message = new Paho.MQTT.Message('{"id":"' + credentials.identityId + '"}');
            message.destinationName = 'your/mqtt/topic';
            console.log(message);
            client.send(message);
        },
        useSSL: true,
        timeout: 3,
        mqttVersion: 4,
        onFailure: function () {
            console.error('connect failed');
        }
    };
    client.connect(connectOptions);

    client.onMessageArrived = function (message) {

        try {
            console.log("msg arrived: " +  message.payloadString);
        } catch (e) {
            console.log("error! " + e);
        }

    };
}