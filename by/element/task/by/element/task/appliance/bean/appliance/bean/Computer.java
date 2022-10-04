package by.element.task.appliance.bean.appliance.bean;

import java.io.Serializable;

import by.element.task.appliance.bean.appliance.dao.Data;

public class Computer extends ElectricalAppliance implements Data, Serializable {

    private static final long serialVersionUID = -4862926644813433707L;

    private int core;
    private int ram;
    private int ide;

    public Computer() {
        super();
        this.core = 0;
        this.ram = 0;
        this.ide = 0;
    }

    public Computer(String model, int voltage, int core, int ram, int ide) {
        super(model, voltage);
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
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + core;
        result = prime * result + ide;
        result = prime * result + ram;
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
        Computer other = (Computer) obj;
        if (core != other.core)
            return false;
        if (ide != other.ide)
            return false;
        if (ram != other.ram)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Computer: " + super.toString() + ", core=" + core + ", ide=" + ide + ", ram=" + ram;
    }

}
