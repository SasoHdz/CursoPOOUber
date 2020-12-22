<?php
require_once('uberX.php');
    class UberPool extends UberX {
       
        public function __construct($driver, $license,$brand,$model){
            parent::__construct($driver,$license,$brand,$model);
         }
}
?>