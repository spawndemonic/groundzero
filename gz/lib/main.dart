import 'package:flutter/material.dart';

void main() {
  //runApp takes given widget and makes root of widget tree
  runApp(Center(
    child: Text(
      'Hello World!',
      textDirection: TextDirection.ltr,
    ),
  ));
}
