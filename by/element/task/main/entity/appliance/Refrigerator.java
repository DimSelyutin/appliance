package by.element.task.main.entity.appliance;

import java.io.Serializable;

public class Refrigerator extends Appliance implements Serializable {
    private final long SerialVersionUID = 4862926644813433707L;

    private float power_consumption;
    private float weight;
    private float freezer_capacity;
    private float overall_capacity;
    private float height;
    private float width;

    
    public Refrigerator(float power_consumption, float weight, float freezer_capacity, float overall_capacity,
            float height, float width) {
        this.power_consumption = power_consumption;
        this.weight = weight;
        this.freezer_capacity = freezer_capacity;
        this.overall_capacity = overall_capacity;
        this.height = height;
        this.width = width;
    }
    public Refrigerator(String maker, float power_consumption, float weight, float freezer_capacity,
            float overall_capacity, float height, float width) {
        super(maker);
        this.power_consumption = power_consumption;
        this.weight = weight;
        this.freezer_capacity = freezer_capacity;
        this.overall_capacity = overall_capacity;
        this.height = height;
        this.width = width;
    }

    
    public float getPower_consumption() {
        return power_consumption;
    }
    public void setPower_consumption(float power_consumption) {
        this.power_consumption = power_consumption;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getFreezer_capacity() {
        return freezer_capacity;
    }
    public void setFreezer_capacity(float freezer_capacity) {
        this.freezer_capacity = freezer_capacity;
    }
    public float getOverall_capacity() {
        return overall_capacity;
    }
    public void setOverall_capacity(float overall_capacity) {
        this.overall_capacity = overall_capacity;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (int) (SerialVersionUID ^ (SerialVersionUID >>> 32));
        result = prime * result + Float.floatToIntBits(power_consumption);
        result = prime * result + Float.floatToIntBits(weight);
        result = prime * result + Float.floatToIntBits(freezer_capacity);
        result = prime * result + Float.floatToIntBits(overall_capacity);
        result = prime * result + Float.floatToIntBits(height);
        result = prime * result + Float.floatToIntBits(width);
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
        Refrigerator other = (Refrigerator) obj;
        if (SerialVersionUID != other.SerialVersionUID)
            return false;
        if (Float.floatToIntBits(power_consumption) != Float.floatToIntBits(other.power_consumption))
            return false;
        if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight))
            return false;
        if (Float.floatToIntBits(freezer_capacity) != Float.floatToIntBits(other.freezer_capacity))
            return false;
        if (Float.floatToIntBits(overall_capacity) != Float.floatToIntBits(other.overall_capacity))
            return false;
        if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
            return false;
        if (Float.floatToIntBits(width) != Float.floatToIntBits(other.width))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Refrigerator [SerialVersionUID=" + SerialVersionUID + ", power_consumption=" + power_consumption
                + ", weight=" + weight + ", freezer_capacity=" + freezer_capacity + ", overall_capacity="
                + overall_capacity + ", height=" + height + ", width=" + width + "]";
    }
}
