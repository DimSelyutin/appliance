package by.element.task.main.entity.property;

import java.io.Serializable;

public class Apliance implements Serializable {
    static final long SerialVersionUID = -4862926644813433707L;


    private String maker;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((maker == null) ? 0 : maker.hashCode());
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
        Apliance other = (Apliance) obj;
        if (maker == null) {
            if (other.maker != null)
                return false;
        } else if (!maker.equals(other.maker))
            return false;
        return true;
    }

    
    @Override
    public String toString() {
        return "Apliance [maker=" + maker + "]";
    }

    
}