package by.element.task.appliance.bean.appliance.bean.household;

import java.io.Serializable;
import java.util.Objects;

import by.element.task.appliance.bean.appliance.bean.ElectricalAppliance;

public class Hairdryer extends ElectricalAppliance implements Serializable {
    private static final long serialVersionUID = -4862926644813433707L;


    private int coolerSpeed;
    private int numberOfMode;
    private int airTemperature;
    

    
    Hairdryer(){
        this.model = "Unset";
        this.voltage = 0;
        this.coolerSpeed = 0;
        this.numberOfMode = 0;
        this.airTemperature = 0;
    }
    
    public Hairdryer(String model, int numberOfMode,int coolerSpeed, int airTemperature, int voltage) {
        this.model = model;
        this.voltage = voltage;
        this.coolerSpeed = coolerSpeed;
        this.numberOfMode = numberOfMode;
        this.airTemperature = airTemperature;
    }
    
    
    
    public int getCoolerSpeed() {
        return coolerSpeed;
    }

    public void setCoolerSpeed(int coolerSpeed) {
        this.coolerSpeed = coolerSpeed;
    }

    public int getNumberOfMode() {
        return numberOfMode;
    }

    public void setNumberOfMode(int numberOfMode) {
        this.numberOfMode = numberOfMode;
    }

    public int getAirTemperature() {
        return airTemperature;
    }

    public void setAirTemperature(int airTemperature) {
        this.airTemperature = airTemperature;
    }
   
    

    @Override
    public String toString() {
        return getClass()+":"+"Model:"+model+"; Voltage:"+voltage+ "; CoolerSpeed: "+coolerSpeed+"; AirTemperature: "+airTemperature+"; Number of Mode:"+numberOfMode;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {return true;}
        if(null == obj){return false;}
        if(getClass() != obj.getClass()){return false;}
        Hairdryer hair = (Hairdryer)obj;
        return Objects.equals(model, hair.model) &&  voltage == hair.voltage 
                && airTemperature == hair.airTemperature && coolerSpeed == hair.coolerSpeed && numberOfMode == hair.numberOfMode;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(model,voltage,condition,coolerSpeed,airTemperature,numberOfMode);
    }
}
