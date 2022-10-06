package by.element.task.appliance.bean.appliance;




import java.io.IOException;
import java.util.HashMap;

import by.element.task.appliance.bean.appliance.dao.impl.FileDAOtxt;
import by.element.task.appliance.bean.appliance.entity.request.AllProperty;
import by.element.task.appliance.bean.appliance.entity.request.RequsetApliance;
import by.element.task.appliance.bean.appliance.entity.request.AllProperty.Laptop;
import by.element.task.appliance.bean.appliance.entity.request.AllProperty.Oven;
import by.element.task.appliance.bean.appliance.entity.request.AllProperty.VacuumCleaner;
import by.element.task.appliance.bean.appliance.view.ConsoleOutPut;

public class Main{


    public static void main(String[] args) throws IOException {
        System.out.println("To search apliance choose parametr that you need:");
        ConsoleOutPut console = new ConsoleOutPut();

        
        
        FileDAOtxt fl = new FileDAOtxt();
       
        String aplName = "VacuumCleaner";
        ////////////////////////oven
        HashMap<Enum, Object> req = new HashMap<>();

        // req.put(Oven.CAPACITY, 32);
        // req.put(Oven.DEPTH, 60);

        req.put(VacuumCleaner.BAG_TYPE,"A2");
        req.put(VacuumCleaner.MOTOR_SPEED_REGULATION,3000);


        RequsetApliance ra = new RequsetApliance(aplName, req);

        

        console.print(fl.find(ra));

        //////////////////////////electical apliance



        


        
        
       
   
       


    }





    
}
