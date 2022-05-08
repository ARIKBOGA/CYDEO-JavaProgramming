package day46_Polymorphism.practiceTask;


import day38_Inheritance.carTask.BMW;
import day38_Inheritance.carTask.Car;
import day38_Inheritance.carTask.Tesla;
import day38_Inheritance.carTask.Toyota;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarTask {
    public static void main(String[] args) {
        Car[] cars = {
                new Toyota("Highlander", 2010, 25000, "White", 255000),
                new BMW("X5", 2014, 32000, "Red", 12000),
                new Toyota("Corolla", 2011, 20000, "White", 310000),
                new BMW("M3", 2015, 33000, "Blue", 14030),
                new BMW("M5", 2017, 35000, "Black", 15000),
                new BMW("M4", 2018, 40000, "White", 19000),
                new BMW("7 Series", 2009, 30000, "Purple", 21000),
                new BMW("i3", 2011, 30000, "Black", 9000),
                new Toyota("Camry", 2018, 30000, "Red", 185000),
                new Toyota("Rav4", 2012, 23000, "Red", 285000),
                new Toyota("Avalon", 2019, 35000, "Blue", 175230),
                new Tesla("Model 3", 2015, 45000, "White", 235000),
                new Tesla("Model Y", 2017, 65000, "Black", 135000),
                new Tesla("Model X", 2016, 48000, "White", 235000),
                new Tesla("Model X", 2014, 48000, "White", 236000),
        };

        List<Car> eligibleForRecall = Arrays.stream(cars)
                .filter(p -> (p.brand.equalsIgnoreCase("toyota") && p.year <= 2011 && p.year >= 2010)
                        || (p.brand.equalsIgnoreCase("bmw") && p.year <= 2002 && p.year >= 1929)
                        || (p.brand.equalsIgnoreCase("tesla") && p.year <= 2016 && p.year >= 2015))
                .sorted(Comparator.comparing(p -> p.year))
                .collect(Collectors.toList());

        eligibleForRecall.forEach(System.out::println);

        List<Car> sorted = Arrays.stream(cars)
                .sorted(Comparator.comparing(p -> p.miles))
                .collect(Collectors.toList());
        Car lowestMileage = sorted.get(0);
        Car highestMileage = sorted.get(sorted.size() - 1);

        System.out.println("highestMileage = " + highestMileage);
        System.out.println("lowestMileage = " + lowestMileage);
    }
}