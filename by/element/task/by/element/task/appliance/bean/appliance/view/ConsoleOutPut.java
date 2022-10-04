package by.element.task.appliance.bean.appliance.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import by.element.task.appliance.bean.appliance.bean.Computer;

public class ConsoleOutPut implements Serializable {
    public void print(List<Computer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Model: "+list.get(i).getModel()+", Core quantity: "+list.get(i).getCore()+", RAM: "+list.get(i).getRam()+" ГБ , Disk Driver: "+list.get(i).getIde()+" МБ");
        }
    }
}
