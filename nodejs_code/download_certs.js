var apn = require('apn');
var https = require('https');
var fs = require('fs');

exports.handler = function(event, context) {
  console.log("Running aws apn push message function");
  console.log("==================================");
  console.log("event", event);

  var certPath = event.certPath;
  var keyPath = event.keyPath;
  var certFileName = event.certFileName;
  var keyFileName = event.keyFileName;
  var passphrase = event.passphrase;
  var apnId = event.apnId;
  var content = event.content;


var certfile = fs.createWriteStream(certFileName);
var certrequest = https.get(certPath, function(certresponse) {
  certresponse.pipe(certfile);
  console.log("downloaded the certificate");

  var keyfile = fs.createWriteStream(keyFileName);
  var keyrequest = https.get(keyPath, function(keyresponse) {
    keyresponse.pipe(keyfile);
    console.log("downloaded the key file");


  var options = { 
                      "cert":certFileName,
                      "key":keyFileName,
                      "passphrase":passphrase,
                      "batchFeedback": true,
                      "interval": 10
                      };

  var apnConnection = new apn.Connection(options);

  var myDevice = new apn.Device(apnId);
  var note = new apn.Notification();
  note.expiry = Math.floor(Date.now() / 1000) + 3600; // Expires 1 hour from now.        
  note.payload = {'COMMAND': content};       
  apnConnection.pushNotification(note, myDevice);
  console.log('message sent to ' + apnId);       

  context.done();

  });
});
}