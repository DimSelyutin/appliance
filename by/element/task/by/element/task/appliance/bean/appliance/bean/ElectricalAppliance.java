package by.element.task.appliance.bean.appliance.bean;

import java.io.Serializable;

public abstract class ElectricalAppliance implements Serializable {
    private static final long serialVersionUID = -4862926644813433707L;

    private String model;
    private int voltage;
    private boolean condition;

    public ElectricalAppliance() {
        this.model = "Unset";
        this.voltage = 0;
        this.condition = false;
    }

    public ElectricalAppliance(String model, int voltage) {
        this.model = model;
        this.voltage = voltage;
        this.condition = false;
    }

    public void on() {
        condition = true;
    }

    public void off() {
        condition = false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (condition ? 1231 : 1237);
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + voltage;
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
        ElectricalAppliance other = (ElectricalAppliance) obj;
        if (condition != other.condition)
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (voltage != other.voltage)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Model=" + model + ", condition=" + condition + ", voltage=" + voltage + " ";
    }

}