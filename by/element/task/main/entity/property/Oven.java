package by.element.task.main.entity.property;

import java.io.Serializable;

public class Oven extends Appliance implements Serializable {

    static final long SerialVersionUID = -4862926644813433707L;
    
    private int power_consumption;
    private int weight;
    private int capacity;
    private int depth;
    private float height;
    private float width;
   
    public Oven(){
        super();
        this.power_consumption = 0;
        this.weight = 0;
        this.capacity = 0;
        this.depth = 0;
        this.height = 0;
        this.width = 0;
    }
    public Oven(int power_consumption, int weight, int capacity, int depth, float height, float width) {
        this.power_consumption = power_consumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public Oven(String maker, int power_consumption, int weight, int capacity, int depth, float height, float width) {
        super(maker);
        this.power_consumption = power_consumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    
    public int getPower_consumption() {
        return power_consumption;
    }
    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getDepth() {
        return depth;
    }
    public void setDepth(int depth) {
        this.depth = depth;
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
        result = prime * result + power_consumption;
        result = prime * result + weight;
        result = prime * result + capacity;
        result = prime * result + depth;
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
        Oven other = (Oven) obj;
        if (power_consumption != other.power_consumption)
            return false;
        if (weight != other.weight)
            return false;
        if (capacity != other.capacity)
            return false;
        if (depth != other.depth)
            return false;
        if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
            return false;
        if (Float.floatToIntBits(width) != Float.floatToIntBits(other.width))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Oven [power_consumption=" + power_consumption + ", weight=" + weight + ", capacity=" + capacity
                + ", depth=" + depth + ", height=" + height + ", width=" + width + "]";
    }

}
