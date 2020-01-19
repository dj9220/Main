/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intership;

import java.util.Scanner;

/**
 *
 * @author dj922
 */
public class Main {

    public static String plate;
    public static int floor = 10;
    public static int[] floors = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

    public static String type;

    public static void menu() {
        start:
        while (true) {
            System.out.println("Hello to parking system");
            System.out.println("Enter your car type: ");
            System.out.println("Electric car - 1");
            System.out.println("Petrol/diesel car - 2");
            System.out.println("Vans - 3");
            System.out.println("Get the places in all floors - 4");
            Scanner input = new Scanner(System.in);
            type = input.nextLine().trim();
          
            switch (type) {
                case "1":
                    System.out.println("Enter your car plate number");
                    plate = input.nextLine().trim();
                    checkPlates(plate);
                    if(checkPlates(plate)==false)
                        System.out.println("Not valid plate number");
                    else{
                    ElectricCars ec = new ElectricCars(plate);
                    ec.setPlate(plate);
                    for (int i = floors.length - 2; i < floors.length - 1; i++) {
                        if (floors[i] != 0) {
                            floors[i]--;
                            System.out.println("Go to " + (minFloor(floors) - 1) + " floor");
                            break;
                        } else {
                            System.out.println("No available space for parking");
                        }
                    }
                    }
                    break;
                case "2":
                    System.out.println("Enter your car plate number");
                    plate = input.nextLine().trim();
                    checkPlates(plate);
                    if(checkPlates(plate)==false)
                        System.out.println("Not valid plate number");
                    else {
                    PetrolOrDiesel pd = new PetrolOrDiesel(plate);
                    pd.setPlate(plate);
                    for (int i = 0; i < floors.length - 1; i++) {
                        if (floors[i] != 0) {
                            floors[i]--;
                            pd.addPetrolOrDiesel(plate);
                            System.out.println("Go to " + ((minFloor(floors)) - 2) + " floor");
                            break;
                        } else {
                            System.out.println("No available space for parking");
                        }

                    }
                    }
                    break;
                case "3":
                    System.out.println("Enter your car plate number");
                    plate = input.nextLine().trim();
                    checkPlates(plate);
                    if(checkPlates(plate)==false)
                        System.out.println("Not valid plate number");
                    else{
                    Vans v = new Vans(plate);
                    v.setPlate(plate);
                    for (int i = 0; i <= 2; i++) {
                        if (floors[i] != 0) {
                            floors[i]--;
                            v.addVan(plate);
                            System.out.println("Go to " + (minFloor(floors) - 2) + " floor");
                            break;
                        } else {
                            System.out.println("No available space for parking");
                        }
                    }
                    }
                    break;

                case "4":
                    for (int i = 0; i < floors.length - 1; i++) {
                        System.out.println(floors[i]);
                    }
                    break;
                default:
                    System.out.println("The car type does not exists");
            }

        }
    }

    public static int minFloor(int[] x) {
        int index = 0;
        int min = x[index];
        for (int i = 0; i < x.length; i++) {
            if (x[i] <= min) {
                min = x[i];
                index = i;
            }
        }
        return index;
    }
    public static boolean checkPlates(String plates){
          if(plates.length()==6)
          return true;
          else
          return false;
        
    }
    public static void main(String[] args) {

        menu();

    }

}
