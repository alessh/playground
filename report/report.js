
var http = require('http');
var jsreport = require('jsreport');
var join = require('path').join
var fs = require('fs')

http.createServer(function (req, res) {

  jsreport.render({
    template: {
        content: fs.readFileSync(join(__dirname, 'template.html')).toString('utf8'),
        helpers: fs.readFileSync(join(__dirname, 'scripts.js')).toString('utf8'),
        engine: "handlebars",
        recipe: 'phantom-pdf'/*,
        phantom: {
            header: "<p>some header</p>",
            orientation: "landscape",
            width: "300px",
            footer: "<p>some footer</p>"
        }*/
    },
    data: fs.readFileSync(join(__dirname, 'data.js')).toString('utf8')
  }).then(function(out) {
    out.stream.pipe(res);
  }).catch(function(e) {    
    res.end(e.message);
  });

}).listen(1337, '127.0.0.1');

/*
require("jsreport").render({
    template: {
        content: "Hello world from {{#sayLoudly this.name}}",
        helpers: "function sayLoudly(str) { return str.toUpperCase(); }",
        //engine: "handlebars"
    },
    data: { name: "jsreport" }
}).then(function(out) {
    //pipes pdf with Hello world from JSREPORT
    out.stream.pipe(resp);
});
*/