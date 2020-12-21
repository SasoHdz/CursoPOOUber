<?php 
    require_once('account.php')
    class Car{

         public $id;
         public $license;
         public $driver;
         public $passenger;

         public function __construct($driver, $license){
            $this->driver = $driver;
            $this->license = $license;
         }

         public function PrintDataCar(){
             echo "license is: ".$this->license.", the conductor is: ".$this->driver->name."and the document is: ".$this->driver->document;
         }
           
}
?>   