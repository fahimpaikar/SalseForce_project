<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<?php
echo "<h1>Fahim's Site</h1>";
echo "<hr>";
echo "<p>This is my site, please visit</p>";
echo "hello world <br>";
$a = 4;
$b = 56;
echo $a * $b;
echo "<br>";
if ($a == $b)
    echo "The first number is equal to second number<br>";
if ($a != $b)
    echo "The first number in not equal to second number";
$phrase = "I am glad to be here<br>";
echo $phrase;
echo strtolower($phrase);
echo strtoupper($phrase);
echo $phrase[3];
echo "<br>";
echo str_replace("glad", "happy", $phrase);
echo max(250, 3658); // math functions
echo "please complete below form"; echo "<br>";

?>
<form action="test.php" method="get">
		Name: <input type="text" name="name">
		<input type="submit">

	</form>






</body>
</html>