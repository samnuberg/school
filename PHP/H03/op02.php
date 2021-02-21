<!DOCTYPE html>
<html>
<head>
    <title>PHP opdracht 1</title>
    <style>
        body {
            text-align: center;
        }
    </style>
</head>
<body>
<?php
    for ($i = 0; $i <= 90; $i++) {
        for ($j = 0; $j < $i; $j++){
            echo "*";
        }
        echo "*<br>";
    }
?>

</body>
</html>