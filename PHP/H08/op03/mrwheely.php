<?php

include_once('overzichtauto.php');
include_once('auto.php');

$ditoverzicht = new overzichtauto();
$ditoverzicht->setOverzichtNaam('OccasionCenter');

$opel = new auto('opel', '', 13500.00, "img/opel1.jpg");
$audi = new auto('audi', '', 102500.00, "img/audi1.jpg");
$mercedes = new auto('mercedes', '', 222650.00, "img/mercedes1.jpg");
$ferrari = new auto('ferrari', '', 99500.00, "img/ferrari1.jpg");

$ditoverzicht->voegAutoToe($opel);
$ditoverzicht->voegAutoToe($audi);
$ditoverzicht->voegAutoToe($mercedes);
$ditoverzicht->voegAutoToe($ferrari);

function merkFilter($overzicht, $merk){
    foreach ($overzicht->getAutos() as $auto) {
        if ($auto->getMerk() == $merk) {
            $url = $auto->getUrl();
            $prijs = $auto->getPrijs();
            echo "<div class='wheely-img'
                        style='background-image:url($url);
                         background-position:center center;
                         background-size:cover;'>
                         <h5>Merk: $merk<br>Prijs : &euro; $prijs</h5>
                         </div>";
        }
    }
}

function merkPrijsFilter($overzicht, $merk, $minprijs, $maxprijs) {
    foreach ($overzicht->getAutos() as $auto){
        if ($auto->getMerk() == $merk){
            $url = $auto->getUrl();
            $prijs = $auto->getPrijs();
            if ($prijs > $minprijs AND ($prijs < $maxprijs OR $maxprijs == '')){
                echo "<div class='wheely-img'
                        style='background-image:url($url);
                         background-position:center center;
                         background-size:cover;'>
                         <h5>Merk: $merk<br>Prijs : &euro; $prijs</h5>
                         </div>";
            }
        }
    }
}

function prijsFilter($overzicht, $minprijs, $maxprijs) {
    foreach ($overzicht->getAutos() as $auto) {
        $url = $auto->getUrl();
        $prijs = $auto->getPrijs();
        $merk = $auto->getMerk();
        if ($prijs > $minprijs AND ($prijs < $maxprijs OR $maxprijs == '')){
            echo "<div class='wheely-img'
                        style='background-image:url($url);
                         background-position:center center;
                         background-size:cover;'>
                         <h5>Merk: $merk<br>Prijs : &euro; $prijs</h5>
                         </div>";
        }
    }
}

function alleAutos($overzicht){
    foreach ($overzicht->getAutos() as $auto) {
        $url = $auto->getUrl();
        $prijs = $auto->getPrijs();
        $merk = $auto->getMerk();
        echo "<div class='wheely-img'
                        style='background-image:url($url);
                         background-position:center center;
                         background-size:cover;'>
                         <h5>Merk: $merk<br>Prijs : &euro; $prijs</h5>
                         </div>";
    }
}


?>

<!DOCTYPE html>
<html lang="en-us">

<head>
    <title>Mr wheely</title>
    <link rel="stylesheet" type="text/css" href="mrwheely.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@100&display=swap" rel="stylesheet">
</head>

<body>

<header>
    <img id='header-image' src="wheely_header.jpg" alt="header van de pagina">
</header>

<div id="form">
    <form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">

        <label for="merk">Merk:</label>
        <select id="merk" name="merk">
            <option value="">--Alle merken--</option>
            <option value="audi">Audi</option>
            <option value="mercedes">Mercedes</option>
            <option value="opel">Opel</option>
            <option value="ferrari">Ferrari</option>
        </select>

        <label for="form-minprijs">Minimale prijs:</label>
        <input type="text" id="form-minprijs" name="minprijs">

        <label for="form-maxprijs">Maximale prijs:</label>
        <input type="text" id="form-maxprijs" name="maxprijs">

        <input type="submit" value="Submit" name="knop">
    </form>
</div>

<?php

if (isset($_POST['knop'])) {
    $merkInput = $_POST['merk'];
    $minprijs = $_POST['minprijs'];
    $maxprijs = $_POST['maxprijs'];

    if ($merkInput != '' AND $minprijs == '' AND $maxprijs == '') {
        merkFilter($ditoverzicht, $merkInput);
    } elseif ($merkInput != '' AND ($minprijs != '' OR $maxprijs != '')){
        merkPrijsFilter($ditoverzicht, $merkInput, $minprijs, $maxprijs);
    } elseif ($merkInput == '' AND ($minprijs != '' OR $maxprijs != '')){
        prijsFilter($ditoverzicht, $minprijs, $maxprijs);
    } elseif ($merkInput == '' AND $minprijs == '' AND $maxprijs == '') {
        alleAutos($ditoverzicht);
    }
} else {
    alleAutos($ditoverzicht);
}

?>

</body>

</html>
