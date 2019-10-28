import 'package:http/http.dart' as http;
import 'package:webfeed/webfeed.dart';
import 'dart:io';


void main() async {
  var client = new http.Client();
  var file = File('source.txt');
  var content;
  if(await file.exists()){
    content = await file.readAsString();
  }
content = content.split('\n');
print(content[0]);
  // RSS feed
  client.get("http://rss.nytimes.com/services/xml/rss/nyt/World.xml").then((response) {
    return response.body;
  }).then((bodyString) {
    var channel = new RssFeed.parse(bodyString);
    print(channel.items[0].title);
    return channel.items;
  });
}