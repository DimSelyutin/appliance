package by.element.task.appliance.bean.appliance.database;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class WriteObj implements Serializable {
    private static final long serialVersionUID = -4862926644813433707L;

    private boolean succesOrFail; // message of succes write

    public boolean isSuccesOrFail() {
        return succesOrFail;
    }

    public boolean serializeObj(HashMap<Integer, Object> apl) { // write data in file

        FileOutputStream fout = null;
        ObjectOutputStream oos = null;

        try {

            fout = new FileOutputStream("base/base.ser");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(apl);

            succesOrFail = true;

        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        return succesOrFail;
    }

    public boolean serializeObjJDK7(HashMap<Integer, Object> comp) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("databse/base.ser"))) {

            oos.writeObject(comp);
            succesOrFail = true;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return succesOrFail;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (succesOrFail ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WriteObj other = (WriteObj) obj;
        if (succesOrFail != other.succesOrFail)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "WriteObj [succesOrFail=" + succesOrFail + "]";
    }
}