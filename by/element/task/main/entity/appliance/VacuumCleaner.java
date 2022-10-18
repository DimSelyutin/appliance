package by.element.task.main.entity.appliance;

import java.io.Serializable;

public class VacuumCleaner extends Appliance implements Serializable{
    private final long SerialVersionUID = 4862926644813433707L;

    private float power_consumption;
    private String filter_type;
    private String bag_type;
    private String wand_type;
    private float motor_speed_regulation;
    private float cleaning_width;

    
    public VacuumCleaner(float power_consumption, String filter_type, String bag_type, String wand_type,
            float motor_speed_regulation, float cleaning_width) {
        this.power_consumption = power_consumption;
        this.filter_type = filter_type;
        this.bag_type = bag_type;
        this.wand_type = wand_type;
        this.motor_speed_regulation = motor_speed_regulation;
        this.cleaning_width = cleaning_width;
    }


    public VacuumCleaner(String maker, float power_consumption, String filter_type, String bag_type, String wand_type,
            float motor_speed_regulation, float cleaning_width) {
        super(maker);
        this.power_consumption = power_consumption;
        this.filter_type = filter_type;
        this.bag_type = bag_type;
        this.wand_type = wand_type;
        this.motor_speed_regulation = motor_speed_regulation;
        this.cleaning_width = cleaning_width;
    }


    public float getPower_consumption() {
        return power_consumption;
    }
    public void setPower_consumption(float power_consumption) {
        this.power_consumption = power_consumption;
    }
    public String getFilter_type() {
        return filter_type;
    }
    public void setFilter_type(String filter_type) {
        this.filter_type = filter_type;
    }
    public String getBag_type() {
        return bag_type;
    }
    public void setBag_type(String bag_type) {
        this.bag_type = bag_type;
    }
    public String getWand_type() {
        return wand_type;
    }
    public void setWand_type(String wand_type) {
        this.wand_type = wand_type;
    }
    public float getMotor_speed_regulation() {
        return motor_speed_regulation;
    }
    public void setMotor_speed_regulation(float motor_speed_regulation) {
        this.motor_speed_regulation = motor_speed_regulation;
    }
    public float getCleaning_width() {
        return cleaning_width;
    }
    public void setCleaning_width(float cleaning_width) {
        this.cleaning_width = cleaning_width;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (int) (SerialVersionUID ^ (SerialVersionUID >>> 32));
        result = prime * result + Float.floatToIntBits(power_consumption);
        result = prime * result + ((filter_type == null) ? 0 : filter_type.hashCode());
        result = prime * result + ((bag_type == null) ? 0 : bag_type.hashCode());
        result = prime * result + ((wand_type == null) ? 0 : wand_type.hashCode());
        result = prime * result + Float.floatToIntBits(motor_speed_regulation);
        result = prime * result + Float.floatToIntBits(cleaning_width);
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
        VacuumCleaner other = (VacuumCleaner) obj;
        if (SerialVersionUID != other.SerialVersionUID)
            return false;
        if (Float.floatToIntBits(power_consumption) != Float.floatToIntBits(other.power_consumption))
            return false;
        if (filter_type == null) {
            if (other.filter_type != null)
                return false;
        } else if (!filter_type.equals(other.filter_type))
            return false;
        if (bag_type == null) {
            if (other.bag_type != null)
                return false;
        } else if (!bag_type.equals(other.bag_type))
            return false;
        if (wand_type == null) {
            if (other.wand_type != null)
                return false;
        } else if (!wand_type.equals(other.wand_type))
            return false;
        if (Float.floatToIntBits(motor_speed_regulation) != Float.floatToIntBits(other.motor_speed_regulation))
            return false;
        if (Float.floatToIntBits(cleaning_width) != Float.floatToIntBits(other.cleaning_width))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "VacuumCleaner [SerialVersionUID=" + SerialVersionUID + ", power_consumption=" + power_consumption
                + ", filter_type=" + filter_type + ", bag_type=" + bag_type + ", wand_type=" + wand_type
                + ", motor_speed_regulation=" + motor_speed_regulation + ", cleaning_width=" + cleaning_width + "]";
    }

    
    
}
