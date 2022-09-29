package by.element.task.appliance.bean.appliance.bean.computer;

import java.io.Serializable;
import java.util.Objects;

import by.element.task.appliance.bean.appliance.bean.ElectricalAppliance;
import by.element.task.appliance.bean.appliance.dao.Data;

public class Computer extends ElectricalAppliance implements Serializable, Data {
    private static final long serialVersionUID = -4862926644813433707L;

    
    protected int core;
    protected int ram;
    protected int ide;


   

    public Computer(){
        this.model = "Unset";
        this.voltage = 0;
        this.core = 0;
        this.ram = 0;
        this.ide = 0;
    }

    public Computer(String model,int voltage, int core, int ram, int ide) {
        this.model = model;
        this.voltage = voltage;
        this.core = core;
        this.ram = ram;
        this.ide = ide;
    }

    
    public int getCore() {
        return core;
    }
    public void setCore(int core) {
        this.core = core;
    }

    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getIde() {
        return ide;
    }
    public void setIde(int ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return getClass()+":"+"Model:"+model+"; Voltage:"+voltage+ "; Core: "+ model+"; Ram: "+ram+"; Ide: "+ide+"; Condition:"+condition;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {return true;}
        if(null == obj){return false;}
        if(getClass() != obj.getClass()){return false;}
        Computer c = (Computer)obj;
        return Objects.equals(model, c.model) &&  voltage == c.voltage && core == c.core && ram == c.ram && ide == c.ide;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(model,voltage,condition,core,ram,ide);
    }

}
