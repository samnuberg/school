<?php
$zwemclubs = array("De spartelkuikens ", 25, " De waterbuffels ", 32, " Plonsmderin ", 11, " Bommetje ", 23);


$tellertje = 0;
$plaatjes = 0;
foreach ($zwemclubs as $club){
    $tellertje++;
    echo $club;
    if ($tellertje % 2 == 0){
        for ($i = 0; $i < floor($club / 5); $i++)
        echo "<img src='img/zwemmer.png'>";
        echo "<br>";

    }

}