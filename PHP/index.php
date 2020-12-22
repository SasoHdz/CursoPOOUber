<?php
    require_once("car.php");
    require_once("uberx.php");
    require_once("account.php");

    $uberX= new UberX("CBE234", new Account("Saso hdz","AND456"),"Chevrolet","Spark");
    $uberX->printDataCar();

    $uberPool= new UberPool("EDE234", new Account("Marianda M","AND567"),"Chevrolet","Spark");

?>