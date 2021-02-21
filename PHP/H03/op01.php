<!DOCTYPE html>
<html>
<head>
    <title>PHP opdracht 1</title>
</head>
<body>
<?php
    for ($i = 1; $i <= 9; $i++) {
        echo "<img src='img/logo".$i.".png'>";
    }
    echo "<br><br><br><br>";
$bomen = array("img_0050.jpg", "lillypilly1.jpg", "Maranchery_Biyyam_Kayal_kandal.jpg", "weeping-elm.jpg", "weeping-elm0091.jpg");

foreach ($bomen as $boom) {
    echo "<img src='img/bomen/".$boom."'>";
}
?>

</body>
</html>