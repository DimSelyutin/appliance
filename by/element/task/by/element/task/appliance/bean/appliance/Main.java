package by.element.task.appliance.bean.appliance;


import java.io.IOException;
import java.io.Serializable;

import by.element.task.appliance.bean.appliance.helper.GenerateBaseFile;
import by.element.task.appliance.bean.appliance.logic.FindApliance;
import by.element.task.appliance.bean.appliance.view.ConsoleOutPut;

public class Main implements Serializable {
    private static final long serialVersionUID = -4862926644813433707L;

    public static void main(String[] args) {
        System.out.println("To search apliance choose parametr that you need");

        FindApliance f = new FindApliance();
        ConsoleOutPut console = new ConsoleOutPut();


        console.print(f.find(6));
        
        
       
   
       


    }




    /**
     * Generate file of data file(model, voltage,.....)
     */
    public static void generatData(){
        GenerateBaseFile bs = new GenerateBaseFile();
        try {
            bs.generateFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    
}
