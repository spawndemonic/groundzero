<?php
$wordList = fopen("wordlist.txt","r") or die("Unable to open file!");
$string = $_POST["texta"];
$spacesplit=explode("\n",$string);
$finalString = " ";
for($i=0;i<count($spacesplit);$i++){
while(!feof($wordList))
{
  $temp = str_split($wordList);
  //when match is found
  //$finalString .= ",".$wordList;
 
}
}
echo $finalString;
?>
