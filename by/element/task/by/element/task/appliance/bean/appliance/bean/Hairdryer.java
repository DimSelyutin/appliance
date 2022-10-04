package by.element.task.appliance.bean.appliance.bean;

import java.io.Serializable;

public class Hairdryer extends ElectricalAppliance implements Serializable {

    private static final long serialVersionUID = -4862926644813433707L;

    private int coolerSpeed;
    private int numberOfMode;
    private int airTemperature;

    public Hairdryer() {
        super("Unset", 0);
        this.coolerSpeed = 0;
        this.numberOfMode = 0;
        this.airTemperature = 0;
    }

    public Hairdryer(String model, int voltage, int numberOfMode, int coolerSpeed, int airTemperature) {
        super(model, voltage);
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
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + coolerSpeed;
        result = prime * result + numberOfMode;
        result = prime * result + airTemperature;
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
        Hairdryer other = (Hairdryer) obj;
        if (coolerSpeed != other.coolerSpeed)
            return false;
        if (numberOfMode != other.numberOfMode)
            return false;
        if (airTemperature != other.airTemperature)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Hairdryer:" + super.toString() + "coolerSpeed=" + coolerSpeed + ", numberOfMode=" + numberOfMode
                + ", airTemperature=" + airTemperature + "]";
    }
}
