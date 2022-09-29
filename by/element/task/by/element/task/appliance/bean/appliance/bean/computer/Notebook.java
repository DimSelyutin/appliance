package by.element.task.appliance.bean.appliance.bean.computer;

import java.io.Serializable;

public class Notebook extends Computer implements Serializable{
    private static final long serialVersionUID = -4862926644813433707L;

   
    private int batteryVolume;
    private int weight;

    public Notebook(){

    }
    
    public Notebook(String model, int core, int ram, int ide,int voltage, int batteryVolume, int weight) {
        super(model, voltage, core, ram, ide);
        this.batteryVolume = batteryVolume;
        this.weight = weight;
    }


    public int getBatteryVolume() {
        return batteryVolume;
    }
    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + batteryVolume;
        result = prime * result + weight;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Notebook other = (Notebook) obj;
        if (batteryVolume != other.batteryVolume)
            return false;
        if (weight != other.weight)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Notebook [batteryVolume=" + batteryVolume + ", weight=" + weight + "]";
    }
}
