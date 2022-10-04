package by.element.task.appliance.bean.appliance.database;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

public class FileReader implements Serializable {
    private static final long serialVersionUID = -4862926644813433707L;

    public FileReader() {

    }

    public HashMap readFile() throws IOException, ClassNotFoundException {

        FileInputStream file = new FileInputStream("base/base.ser");
        ObjectInputStream ois = new ObjectInputStream(file);


        HashMap map = (HashMap) ois.readObject();       //write data from file

        ois.close();

        return map;
    }
}
