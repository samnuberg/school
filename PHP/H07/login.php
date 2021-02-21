<?php
session_start();

$users = array(
        "test@test.nl" => array('pwd' => 'test', 'rol' => 'administrator'),
        "klaas@carpets.nl" => array('pwd' => 'snoepje777', 'rol' => 'gebruiker')
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
    $message = "Welkom ".$_SESSION["user"]['email']." met de rol ".$_SESSION["user"]['rol'];
} else {
    $message = "inloggen";
}
?>

<html>
<body>
<h1><?php echo $message; ?></h1>
<form action="<?php echo $_SERVER['PHP_SELF'];?>" method="post">
    Email <input type="email" name="email"><br>
    Wachtwoord <input type="password" name="pwd"><br>
    <input type="submit" name="knop">
</form>
<p><a href="website.php">Website</a></p>
<p><a href="login.php?loguit">uitloggen</a></p>
<p><a href="admin.php">admin pagina</a></p>
</body>
</html>
