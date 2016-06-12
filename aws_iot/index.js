var awsIot = require('aws-iot-device-sdk');

//
// Replace the values of '<YourUniqueClientIdentifier>' and '<YourAWSRegion>'
// with a unique client identifier and the AWS region you created your
// certificate in (e.g. 'us-east-1').  NOTE: client identifiers must be
// unique within your AWS account; if a client attempts to connect with a
// client identifier which is already in use, the existing connection will
// be terminated.
//

/*
{
    "host": "A2P1UO6NYTQZKP.iot.us-east-1.amazonaws.com",
    "port": 8883,
    "clientId": "node-red",
    "thingName": "node-red",
    "caCert": "root-CA.crt",
    "clientCert": "991378bb0c-certificate.pem.crt",
    "privateKey": "991378bb0c-private.pem.key"
}*/
var device = awsIot.device({
   keyPath: "991378bb0c-private.pem.key", //<YourPrivateKeyPath>,
  certPath: "991378bb0c-certificate.pem.crt", //<YourCertificatePath>,
    caPath: "root-CA.crt", //<YourRootCACertificatePath>,
    debug: true,
  clientId: "node-red-test", //<YourUniqueClientIdentifier>,
    region: 'us-east-1', //<YourAWSRegion> 
      host: "A2P1UO6NYTQZKP.iot.us-east-1.amazonaws.com",
      port: 8883,
 thingName: "node-red-console",    
});   

/*var device = awsIot.device({
  "host": "A2P1UO6NYTQZKP.iot.us-east-1.amazonaws.com",
  "port": 8883,
  "clientId": "node-red",
  "thingName": "node-red",
  "caCert": "root-CA.crt",
  "clientCert": "0463c63f04-certificate.pem.crt",
  "privateKey": "0463c63f04-private.pem.key"
}); */

//
// Device is an instance returned by mqtt.Client(), see mqtt.js for full
// documentation.
//
device
  .on('connect', function() {
    console.log('connect');
    device.subscribe('debug');
    //device.publish('debug', JSON.stringify({ test_data: 1}));
    });

device
  .on('message', function(topic, payload) {
    console.log('message', topic, payload.toString());
  });
