from car import Car
from account import Account

if __name__ == "__main__":
    print("hola saso")

    car = Car("AMS233", Account("Alma Veronica", "AHRE2030"))
    print(vars(car))
    print(vars(car.driver))


