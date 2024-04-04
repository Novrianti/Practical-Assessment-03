package org.example;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void displayMenu() {
        System.out.println("Welcome to Vehicle Program!\n");
        System.out.println("Choose a vehicle program:");
        System.out.println("1. Motorcycle");
        System.out.println("2. Car");
        System.out.println("3. Exit\n");
    }

    public void setOption(int option) {
        switch (option) {
            case 1:
                try {
                    System.out.print("Input Motorcycle brand: ");
                    String motorcycleBrand = scanner.next();
                    System.out.print("Input Motorcycle model: ");
                    String motorcycleModel = scanner.next();
                    System.out.print("Input Motorcycle year: ");
                    int motorcycleYear = scanner.nextInt();
                    System.out.print("Does the Motorcycle have a sidecar? (true/false): ");
                    boolean motorcycleHasSidecar = scanner.nextBoolean();

                    Motorcycle motorcycle = new Motorcycle(motorcycleBrand, motorcycleModel, motorcycleYear, motorcycleHasSidecar);
                    System.out.println("Motorcycle brand " + motorcycle.getBrand());
                    System.out.println("Motorcycle sound: " + motorcycle.vehicleSound());
                    break;
                } catch (InvalidYearException e) {
                    System.out.println(e.getMessage());
                }


            case 2:
                try {
                    System.out.print("Input Car brand: ");
                    String carBrand = scanner.next();
                    System.out.print("Input Car model: ");
                    String carModel = scanner.next();
                    System.out.print("Input Car year: ");
                    int carYear = scanner.nextInt();
                    System.out.print("Input Car number of doors: ");
                    int carNumOfDoors = scanner.nextInt();

                    Car car = new Car(carBrand, carModel, carYear, carNumOfDoors);
                    System.out.println("Car sound: " + car.vehicleSound());
                    break;
                } catch (InvalidYearException e) {
                    System.out.println(e.getMessage());
                }


            case 3:
                System.exit(0);
                break;

            default:
                System.out.println("Invalid input");
        }
    }

    public void run() {
        while (true) {
            displayMenu();
            System.out.print("Input your choice: ");
            int option = scanner.nextInt();
            setOption(option);
        }
    }
}