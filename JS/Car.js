function Car(driver,license) {
    this.id;
    this.driver = driver;
    this.license = license;
    this.passenger;
}

Car.prototype.printDataCar = function () {
    console.log(this.driver);
    console.log(this.driver.name);
    console.log(this.driver.document);

}