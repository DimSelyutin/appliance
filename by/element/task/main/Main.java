package by.element.task.main;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


import by.element.task.main.entity.appliance.Appliance;
import by.element.task.main.entity.property.Property;
import by.element.task.main.entity.property.AllProperty.*;
import by.element.task.main.service.ApplianceService;
import by.element.task.main.view.ConsoleOutPut;


public class Main {
    
    public static void main(String[] args)
    throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException {

        ConsoleOutPut console = new ConsoleOutPut();

        ApplianceService allApp = new ApplianceService();
        //подготовка хар-тик
        Property property = propCollector();


        List<Appliance> apliances =  allApp.findAppliance(property);


        if (!apliances.isEmpty()) {
            console.printApp(apliances);
        } else {
            System.out.println("Appliance not found!");
        }

    }






    private static Property propCollector(){

        try (Scanner sc = new Scanner(System.in)) {
            Map<String, Object> prop = new HashMap<>();


            System.out.println("To search apliance enter parametrs that you need:");
            System.out.print("Enter appliance group: ");
            String appGroup = sc.nextLine();


            System.out.println("To skip the parameter press Enter!");
            System.out.println("Enter parametrs of "+appGroup+":");


            switch (appGroup) {
                case "Oven":
                    for (Oven string : Oven.values()) {
                        System.out.print(string+": ");
                        prop.put(string.toString(), sc.nextLine());
                    }
                    break;

                case "Laptop":
                    for (Laptop string : Laptop.values()) {
                        System.out.print(string+": ");
                        prop.put(string+"", sc.nextLine());
                    }
                    break;

                case "Refrigerator":
                    for (Refrigerator string : Refrigerator.values()) {
                        System.out.print(string+": ");
                        prop.put(string+"", sc.nextLine());
                    }
                    break;

                case "VacuumCleaner":
                    for (VacuumCleaner string : VacuumCleaner.values()) {
                        System.out.print(string+": ");
                        prop.put(string+"", sc.nextLine());
                    }
                    break;

                case "TabletPC":
                    for (TabletPC string : TabletPC.values()) {
                        System.out.print(string+": ");
                        prop.put(string+"", sc.nextLine());
                    }
                    break;
                
                case "Speakers":
                    for (Speakers string : Speakers.values()) {
                        System.out.print(string+": ");
                        prop.put(string+"", sc.nextLine());
                    }
                    break;
                default:
                    System.out.println("Check the entered parameters or skip them.");
                    break;
            }
            return new Property(appGroup, prop);
        }
       
    } 

}
