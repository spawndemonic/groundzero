var http = require('http');
var url = require('url');
var dt = require('./firsmod');
var fs = require('fs');
var formidable = require('formidable');

http.createServer(function(req,res){
  if(req.url == '/fileupload'){
    var form = new formidable.IncomingForm();
    form.parse(req, function(err,fields,files){
      var oldpath = files.filetoupload.path;
      var newpath = '/home/black/'+files.filetoupload.name;
      fs.rename(oldpath,newpath,function(err){
        if(err)throw err;
        res.write('File uploaded and moved!');
        res.end();
      });
    });
  }
 else{
   fs.readFile('main.html', function(err,data){
   res.writeHead(200,{'Content-Type':'text/html'});
   res.write(data);
   return res.end();
   });
    }
}).listen(8080);
