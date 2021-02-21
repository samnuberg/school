<?php
$leeftijd = 12;
$prijs = 10;

if ($leeftijd > 65) {
    $prijs = $prijs * 0.5;
}

if ($leeftijd <= 12) {
    $prijs = $prijs * 0.5;
}

if ($leeftijd < 3) {
    $prijs = 0;
}

echo $prijs;
