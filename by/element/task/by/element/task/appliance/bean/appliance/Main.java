package by.element.task.appliance.bean.appliance;

import java.io.IOException;
import java.io.Serializable;

import by.element.task.appliance.bean.appliance.database.FileReader;
import by.element.task.appliance.bean.appliance.database.GenerateBaseFile;
import by.element.task.appliance.bean.appliance.logic.FindApliance;

public class Main implements Serializable {
    private static final long serialVersionUID = -4862926644813433707L;

    public static void main(String[] args) {
        System.out.println("To search apliance choose parametr that you need");
        FindApliance find = new FindApliance();
        // find.findByCore();
    
        FileReader fr = new FileReader();
        try {
            fr.readFile();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        // try {
        //     Object obj = fr.readFile();
        //     System.out.println(obj.toString());
        // } catch (ClassNotFoundException | IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }


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
