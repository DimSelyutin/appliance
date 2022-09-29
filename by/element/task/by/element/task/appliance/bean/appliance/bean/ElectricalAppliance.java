package by.element.task.appliance.bean.appliance.bean;

public abstract class ElectricalAppliance {
    
    public String model;
    public int voltage;
    public boolean condition;
    
    public ElectricalAppliance(){
        this.model = "Unset";
        this.voltage = 0;
        this.condition = false;
    }
    
    public ElectricalAppliance(String model, int voltage) {
        this.model = model;
        this.voltage = voltage;
        this.condition = false;
    }
    
    
    
    public void on(){
        condition = true;
    }
    
    public void off(){
        condition = false;
    }

}