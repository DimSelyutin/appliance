package by.element.task.appliance.bean.appliance.bean.computer;

import java.util.Objects;

public class Mobile extends Notebook{

    public Mobile(){

    }

    public Mobile(String model, int core, int ram, int ide) {
        this.model = model;
        this.core = core;
        this.ram = ram;
        this.ide = ide;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
    public void on() {

        
    }

    @Override
    public void off() {

        
    }

    @Override
    public String toString() {
        return ""+getClass()+": Model: "+ model+"; Core: "+ core+" Ram: "+ram+" Ide: "+ide;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {return true;}
        if(null == obj){return false;}
        if(getClass() != obj.getClass()){return false;}
        Mobile mobile = (Mobile)obj;
        return Objects.equals(model, mobile.model) && core == mobile.core && ram == mobile.ram && ide == mobile.ide;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(model,core,ram,ide);
    }
}
