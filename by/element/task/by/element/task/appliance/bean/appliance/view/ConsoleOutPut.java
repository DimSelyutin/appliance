package by.element.task.appliance.bean.appliance.view;

import java.io.Serializable;
import java.util.ArrayList;

import by.element.task.appliance.bean.appliance.bean.Computer;

public class ConsoleOutPut implements Serializable {
    public void print(ArrayList<Computer> obj){
        for (int i = 0; i < obj.size(); i++) {
            System.out.println("Model: "+obj.get(i).getModel()+", Core quantity: "+obj.get(i).getCore()+", RAM: "+obj.get(i).getRam()+ ", Disk Driver: "+obj.get(i).getIde());
        }
    }
}
