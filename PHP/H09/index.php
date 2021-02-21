<?php
session_start();

if (isset($_GET["loguit"])) {
    $_SESSION = array();
    session_destroy();
}

include_once ('overzichtBroodjes.php');
include_once ('broodje.php');

$wimoverzicht = new overzichtBroodjes();
$wimoverzicht->setOverzichtNaam('BakkerijWimVlecht');
$broodjesArray = array();

if (isset($_POST['knop-toevoegen'])) {
    $_POST['naam'] = new broodje($_POST['naam'], $_POST['meel'], $_POST['vorm'], $_POST['gewicht']);
    $wimoverzicht->voegBroodjeToe($_POST['naam']);
}

?>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="wimvlecht.css">
    <title>Wim vlecht</title>
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


<section>
    <table id='broodjes'>
        <tr>
            <th>Naam:</th>
            <th>Meel:</th>
            <th>Vorm:</th>
            <th>Gewicht:</th>
        </tr>
        <?php
            foreach ($wimoverzicht->getBroodjes() as $broodje) {
                echo "<td>" . $broodje->getNaam() . "</td>
                  <td>" . $broodje->getMeel() . "</td>
                  <td>" . $broodje->getVorm() . "</td>
                  <td>" . $broodje->getGewicht() . "</td>";
        }
        ?>
    </table>
</section>

</body>

</html>
