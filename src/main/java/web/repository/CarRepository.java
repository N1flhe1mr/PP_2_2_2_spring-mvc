package web.repository;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarRepository {
    List<Car> cars = List.of(
            new Car("BMW", "X5", 2019),
            new Car("Audi", "A6", 2020),
            new Car("Mercedes", "Benz", 2021),
            new Car("Volkswagen", "Passat", 2022),
            new Car("Toyota", "Camry", 2023),
            new Car("Volvo", "XC90", 2022),
            new Car("Nissan", "Juke", 2018),
            new Car("Hyundai", "Solaris", 2017),
            new Car("Skoda", "Octavia", 2016),
            new Car("Kia", "Sportage", 2015),
            new Car("Ford", "Focus", 2014),
            new Car("Chevrolet", "Cruze", 2013),
            new Car("Mazda", "CX5", 2012),
            new Car("Mitsubishi", "Lancer", 2011),
            new Car("Subaru", "Forester", 2010),
            new Car("Honda", "Accord", 2009)
    );

    public List<Car> getCars() {
        return cars;
    }
}