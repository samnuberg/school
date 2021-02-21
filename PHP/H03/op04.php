<!DOCTYPE html>
<html>
<head>
    <title>PHP opdracht 4</title>
    <style>
        .rood {
            border: 5px solid red;
        }
        .groen {
            border: 5px solid green;
        }
    </style>
</head>
<body>
<?php
$class = "";
for ($i = 1; $i <= 9; $i++) {
    if ($i % 2 == 0) {
        $class = "class='rood'";
    }
    else {
        $class = "class='groen'";
    }
    echo "<img ".$class." src='img/logo" . $i . ".png'>";
}
?>

</body>
</html>