package by.element.task;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import by.element.task.dao.impl.FindApplianceDAOImpl;
import by.element.task.entity.property.AllProperty;
import by.element.task.entity.property.Property;
import by.element.task.entity.property.AllProperty.Oven;
import by.element.task.view.ConsoleOutPut;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("To search apliance enter parametrs that you need:");


        System.out.print("Enter appliance group: ");
        String appGroup = sc.nextLine();
        
        
        Map<String, Object> prop = new HashMap<>();
        EnumMap enumMap = new EnumMap(AllProperty.Oven.class);
        System.out.println(enumMap);
        
        System.out.println( AllProperty.class.getTypeName()+"$"+appGroup);
        

        prop.put(Oven.CAPACITY.toString(), 32);
        Property props = new Property(appGroup, prop);
        ConsoleOutPut console = new ConsoleOutPut();



        FindApplianceDAOImpl fad = new FindApplianceDAOImpl();

        

        console.print(fad.find(props));
        


        

    }

}
