package by.element.task.main.view;



import java.util.List;

import by.element.task.main.entity.appliance.Appliance;




public class ConsoleOutPut {
    public void printApp(List<Appliance> list){
        for (Object object : list) {
            System.out.println(object);
        }
       
    }
}
