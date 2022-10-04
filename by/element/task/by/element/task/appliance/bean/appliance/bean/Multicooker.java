package by.element.task.appliance.bean.appliance.bean;

import java.io.Serializable;

public class Multicooker extends ElectricalAppliance implements Serializable {

    private static final long serialVersionUID = -4862926644813433707L;

    private String typeCoating;
    private int volume;
    private int maxTemperature;

    public Multicooker() {
        super("Unset", 0);
        this.typeCoating = "Unknown";
        this.volume = 0;
        this.maxTemperature = 0;
    }

    public Multicooker(String model, String typeCoating, int volume, int maxTemperature, int voltage) {
        super(model, voltage);
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
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((typeCoating == null) ? 0 : typeCoating.hashCode());
        result = prime * result + volume;
        result = prime * result + maxTemperature;
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
        Multicooker other = (Multicooker) obj;
        if (typeCoating == null) {
            if (other.typeCoating != null)
                return false;
        } else if (!typeCoating.equals(other.typeCoating))
            return false;
        if (volume != other.volume)
            return false;
        if (maxTemperature != other.maxTemperature)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Multicooker: " + super.toString() + ", typeCoating=" + typeCoating + ", volume=" + volume
                + ", maxTemperature=" + maxTemperature;
    }
}
