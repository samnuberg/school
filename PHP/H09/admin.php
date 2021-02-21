<?php
session_start();

if (isset($_GET["loguit"])) {
    $_SESSION = array();
    session_destroy();
}

if (isset($_SESSION['user'])) {

} else {
    header('location: login.php');
}

?>

<?php

include_once ('overzichtBroodjes.php');
include_once ('broodje.php');


?>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="wimvlecht.css">
    <title>Wim vlecht -admin</title>
</head>

<body>

<header>
    <img id="header-image" src="img/baguette-1743939_1920.jpg" alt="stokbrood">
</header>

<nav>
    <ul>
        <li> <a class="links"href="index.php">Overzicht broodjes</a> </li>
        <li> <a class="links" href="admin.php">Admin pagina</a> </li>
        <li class="login"> <a href="index.php?loguit">Uitloggen</a></li>
        <li class="login"> <a href="login.php">Inloggen</a> </li>
    </ul>
</nav>

<div id="form-broodjetoevoegen">
    <form action="index.php" method="post">
        <label for="naam">Naam:</label>
        <input type="text" id="naam" name="naam" placeholder="Naam.." required>

        <label for="meel">Meel:</label>
        <input type="text" id="meel" name="meel" placeholder="Meel.." required>

        <label for="vorm">Vorm:</label>
        <input type="text" id="vorm" name="vorm" placeholder="Vorm.." required>

        <label for="gewicht">Gewicht:</label>
        <input type="text" id="gewicht" name="gewicht" placeholder="Gewicht.." required>


        <input type="submit" value="Submit" name="knop-toevoegen">
    </form>
</div>

</body>

</html>
