<?php
function deelbaarDoor3($getal){
    $deelbaar = false;
    if ($getal % 3 == 0) {
        $deelbaar = true;
    }
    return $deelbaar;
}

echo deelbaarDoor3(6);