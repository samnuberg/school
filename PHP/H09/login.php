<?php
session_start();

$users = array(
    "test@test.nl" => array('pwd' => 'test', 'rol' => 'administrator'),
    "sam@nuberg.net" => array('pwd' => 'sonic123', 'rol' => 'administrator')
);

if (isset($_GET["loguit"])) {
    $_SESSION = array();
    session_destroy();
}
if (isset($_POST['knop'])
    && isset($users[$_POST['email']])
    && $users[$_POST['email']]['pwd'] == $_POST['pwd']) {
    $_SESSION['user'] = array('email' => $_POST['email'],
        'pwd' => $users[$_POST['email']]['pwd'],
        'rol' => $users[$_POST['email']]['rol'],
    );
    $message = "Welkom ".$_SESSION["user"]['email'];
} else {
    $message = "inloggen";
}
?>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="wimvlecht.css">
</head>
<body>

<header>
    <img id="header-image" src="img/baguette-1743939_1920.jpg" alt="stokbrood">
</header>

<nav>
    <ul>
        <li><a class="links" href="index.php">Overzicht broodjes</a></li>
        <li><a class="links" href="admin.php">Admin pagina</a></li>
        <li class="login"><a href="login.php?loguit">Uitloggen</a></li>
        <li class="login"><a href="login.php">Inloggen</a></li>
    </ul>
</nav>

<h1><?php echo $message ?></h1>

<div id="form-menu">
    <form action="<?php echo $_SERVER['PHP_SELF'];?>" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" placeholder="Your email...">

        <label for="password">Password</label>
        <input type="password" id="password" name="pwd" placeholder="Your password..">

        <input type="submit" value="Submit" name="knop">
    </form>
</div>

</body>
</html>
