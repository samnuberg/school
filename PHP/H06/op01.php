<?php

$user = 'root';
$pass = '';


try {
    $dbh = new PDO('mysql:host=localhost;dbname=schoolphp;port=3306', $user, $pass);
    foreach ($dbh->query('SELECT * FROM cursist') as $row) {
        print_r($row);
    }
    $dbh = null;
} catch (PDOException $e) {
    print "Error!: " . $e->getMessage() . "<br/>";
}
