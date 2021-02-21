<?php

    include_once('radioprogramma.php');
    include_once('liedje.php');

    $ditprogramma = new radioprogramma();
    $ditprogramma->setNaam("mijn eerste programma");
    $ditprogramma->setOmschrijving('even testen');
    foreach ($ditprogramma->getProgramma() as $p) {
        //echo $p."<br>";
    }

    $nieuwliedje = new liedje('dit is de titel', 'rolling stones');

    $ditprogramma->voegLiedjeToe($nieuwliedje);

    foreach ($ditprogramma->getLiedjes() as $liedje) {
        echo $liedje->getTitle().' - '.$liedje->getArtiest().'<br>';
    }