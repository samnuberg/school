<?php

function inloggen($email, $wachtwoord){
    $mailadressen = array('piet@worldonline.nl', 'klaas@carpets.nl', 'truushendriks@wegweg.nl');
    $wachtwoorden = array('doetje123', 'snoepje777', 'arkiearkie201');
    $ingelogd = false;
    for ($teller = 0; $teller < count($mailadressen); $teller++){
        if ($email == $mailadressen[$teller] and $wachtwoord == $wachtwoorden[$teller]){
            $ingelogd == true;
            return true;
        }
    }
    if ($ingelogd == false) return false;
}

if (inloggen($_POST['email'], $_POST['wachtwoord'])) echo "Welkom!";
else echo "Sorry, geen toegang!";
