import 'package:flutter/material.dart';
import 'package:english_words/english_words.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Welcome to Flutter',
      //Scaffold is from the Material library provides a default app bar
      //title and a body poperty
      theme: ThemeData(primaryColor: Colors.black,),
      home: RandomWords(),
    );
  }
}

class RandomWords extends StatefulWidget {
  @override
  RandomWordsState createState() => RandomWordsState();
}

class RandomWordsState extends State<RandomWords> {
  final _suggestions = <WordPair>[];
  final Set<WordPair> _saved = Set<WordPair>();
  final _biggerFont = const TextStyle(fontSize: 20.0);

  @override
  Widget build(BuildContext context) {
    _suggestions.addAll(generateWordPairs().take(20));

    return Scaffold(
      appBar: AppBar(
        title: Center(
          child: Text('Start up name genterator'),
        ),
        actions: <Widget>[
          IconButton(icon: Icon(Icons.list), onPressed: _pushSaved)
        ],
      ),
      body: _buildSuggestions(),
    );
  }

  void _pushSaved() {
    Navigator.of(context).push(MaterialPageRoute<void>(
      builder: (BuildContext context) {
        final Iterable<ListTile> tiles = _saved.map(
          (WordPair pair) {
            return ListTile(
              title: Text(
                pair.asPascalCase, 
                style: _biggerFont
                ),
            );
          },
        );
         final List<Widget> divided = ListTile.divideTiles(context:context, tiles: tiles,).toList();
         return Scaffold(
           appBar: AppBar(
             title: Text('Saved Suggestions'),
           ),
           body: ListView(children: divided,)
         );
      },
    ),
    );
  }

  Widget _buildSuggestions() {
    return ListView.builder(
      padding: const EdgeInsets.all(11.0),
      itemCount: _suggestions.length,
      itemBuilder: (context, i) {
        if (i.isOdd)
          return Divider(
            thickness: 5.0,
          );
        return Card(
          elevation: 9.0,
          child: Padding(
            padding: const EdgeInsets.all(7.0),
            child: _buildRow(_suggestions[i]),
          ),
        );
      },
    );
  }

  Widget _buildRow(WordPair pair) {
    final bool alreadySaved = _saved.contains(pair);
    return ListTile(
      title: Text(
        pair.asPascalCase,
        style: _biggerFont,
      ),
      trailing: IconButton(
          icon: alreadySaved
              ? Icon(Icons.favorite)
              : Icon(Icons.check_circle_outline),
          color: alreadySaved ? Colors.blueGrey : null,
          onPressed: () {
            setState(() {
              if (alreadySaved)
                _saved.remove(pair);
              else
                _saved.add(pair);
            });
          }),
    );
  }
}
