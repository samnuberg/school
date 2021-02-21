<?php

if ($_POST['voornaam'] == ""){
    echo "Er is geen voornaam ingevoerd!";
    echo "<a href=\"op02.html\">Terug naar het formulier</a>";
}

if ($_POST['adres'] == ""){
    echo "Er is geen adres ingevoerd!";
    echo "<a href=\"op02.html\">Terug naar het formulier</a>";
}

if ($_POST['email'] == ""){
    echo "Er is geen email ingevoerd!";
    echo "<a href=\"op02.html\">Terug naar het formulier</a>";
}

if ($_POST['wachtwoord'] == ""){
    echo "Er is geen wachtwoord ingevoerd!";
    echo "<a href=\"op02.html\">Terug naar het formulier</a>";
}
