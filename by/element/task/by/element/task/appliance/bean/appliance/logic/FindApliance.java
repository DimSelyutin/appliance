package by.element.task.appliance.bean.appliance.logic;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import by.element.task.appliance.bean.appliance.bean.Computer;
import by.element.task.appliance.bean.appliance.dao.FindAplianceDAO;
import by.element.task.appliance.bean.appliance.database.FileReader;

public class FindApliance implements FindAplianceDAO, Serializable {
    private static final long serialVersionUID = -4862926644813433707L;
    
    private FileReader read = new FileReader();


    public FindApliance(){

    }


    @Override
    public List<Computer> find(String model) {
        List<Computer> comp = new ArrayList<>();
        List<Computer> find = new ArrayList<>();
        try {
            for (int i = 0; i < 20; i++) {
                comp.add((Computer)read.readFile().get(i));
            }
            for (Computer computer : comp) {
                if(computer.getModel().equals(model)){
                    find.add(computer);
                }
            }

        } catch(ClassNotFoundException | IOException e){
            e.printStackTrace();

        }
        return null;
        
    }



    @Override
    public List<Computer> find(int core) {
        List<Computer> comp = new ArrayList<>();
        List<Computer> find = new ArrayList<>();
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
