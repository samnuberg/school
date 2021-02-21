<?php

//print_r($_POST);

//echo "<img src='img/".$_POST['logos']."'>";

foreach ($_POST['logos'] as $logo){
    echo "<img src='img/".$logo."'>";
}