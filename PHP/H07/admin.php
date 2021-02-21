<?php
session_start();

if (isset($_SESSION['user']) && $_SESSION['user']['rol'] == 'administrator') {
    echo '<h1>Welkom '.$_SESSION['user']['email'].' op het admingedeelte van de website</h1>';
    echo '<p><a href="login.php"">login</a></p>';
} else {
    echo "Onvoldoende rechten om deze pagina te bezoeken";
    echo '<p><a href="login.php"">login</a></p>';
}
