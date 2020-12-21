<?php class 
    require_once("car.php");
    require_once("account.php");

    $car = new Car(new Account("Arely","ADE324"),"234erf");
    $car->PrintDataCar();
?>
