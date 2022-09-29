package by.element.task.appliance.bean.appliance.bean.cooker;

import java.io.Serializable;
import java.util.Objects;

import by.element.task.appliance.bean.appliance.bean.ElectricalAppliance;

public class Multicooker extends ElectricalAppliance implements Serializable{
    private static final long serialVersionUID = -1L;

    private String typeCoating;
    private int volume;
    private int maxTemperature;
    

    Multicooker(){
        this.model = "Unset";
        this.voltage = 0;
        this.typeCoating = "Unknown";
        this.volume = 0;
        this.maxTemperature = 0;
    }

    public Multicooker(String model, String typeCoating, int volume, int maxTemperature, int voltage) {
        this.model = model;
        this.voltage = voltage;
        this.typeCoating = typeCoating;
        this.volume = volume;
        this.maxTemperature = maxTemperature;
    }



    public String getTypeCoating() {
        return typeCoating;
    }

    public void setTypeCoating(String typeCoating) {
        this.typeCoating = typeCoating;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }


    @Override
    public String toString() {
        return getClass()+":"+"Model:"+model+"; Voltage:"+voltage+ "; TypeOfCoating: "+typeCoating+"; MaxTemperature: "+maxTemperature+"; Volume:"+volume;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {return true;}
        if(null == obj){return false;}
        if(getClass() != obj.getClass()){return false;}
        Multicooker multi = (Multicooker)obj;
        return Objects.equals(model, multi.model) && Objects.equals(typeCoating, multi.typeCoating) &&  voltage == multi.voltage 
                && maxTemperature == multi.maxTemperature && volume == multi.volume;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(model,voltage,condition,typeCoating,maxTemperature,volume);
    }
}
