<?php
    class UberX extends Car {
        public $brand;
        public $model;

        public function __construct($driver, $license,$brand,$model){
            parent::__construct($driver,$license);
            $this->brand = $brand;
            $this->model = $model;
         }
}
?>