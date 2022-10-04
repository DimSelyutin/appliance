package by.element.task.appliance.bean.appliance.database;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

import by.element.task.appliance.bean.appliance.bean.Computer;


public class FileReader implements Serializable {
    private static final long serialVersionUID = -4862926644813433707L;

    public FileReader() {
        
    }

    public void readFile() throws IOException, ClassNotFoundException{
        
            
            FileInputStream file = new FileInputStream("base/base.ser");
            ObjectInputStream ois = new ObjectInputStream(file);
            Computer comp = (Computer)ois.readObject();
           


            // Object obj = ois.readObject(); // Получаем объекты в том порядке,в котором записывали
            //                                // Так как Object нужно привести к типу ниже в иерархии
            
            // Computer comp = (Computer) obj;
            // System.out.println(obj);
           
            // ois.close();
            // System.out.println(comp.toString());
            
    }
}
