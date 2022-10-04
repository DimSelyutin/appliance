package by.element.task.appliance.bean.appliance.logic;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

import by.element.task.appliance.bean.appliance.bean.Computer;
import by.element.task.appliance.bean.appliance.database.FileReader;

public class FindApliance implements Serializable {
    private static final long serialVersionUID = -4862926644813433707L;
    
    private FileReader read = new FileReader();


    public FindApliance(){

    }


    public ArrayList<Computer> byCore(int core){
        ArrayList<Computer> find = new ArrayList<>();
        ArrayList<Computer> comp = new ArrayList<>();
        try {
            for (int i = 0; i < 20; i++) {
                comp.add((Computer)read.readFile().get(i));
            }
            for (Computer computer : comp) {
                if (computer.getCore() == core) {
                    find.add(computer);
                }
            }
            
        } catch (ClassNotFoundException | IOException e) {
            
            e.printStackTrace();
        }

        return find;
        
    }
}
