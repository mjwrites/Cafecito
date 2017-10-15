var myArgs = require('optimist').argv,
    help = 'Input what you want to translate';
var MsTranslator = require('mstranslator');
var request = require("request");
var body;

var client = new MsTranslator({
  api_key: "d2cad78206ae43ac9a179ae4315170f3"
}, true);

if ((myArgs.h)||(myArgs.help)) {
  console.log(help);
  process.exit(0);
}

switch (myArgs._[0]) {
  case 'translate':
    break;
  default:

}

console.log('myArgs: ', myArgs);





var web = request({
    uri: "https://docs.oracle.com/javase/tutorial/",
  }, function(error, response, data) {
    body = data;

    var params = {
        text: myArgs._[1]
        , from: 'en'
        , to: 'es'
        , contentType: 'text/html'
      };
       //console.log(JSON.stringify(body));
      // Don't worry about access token, it will be auto-generated if needed.
      client.translate(params, function(err, data) {
        console.log(data);
      });


  });
