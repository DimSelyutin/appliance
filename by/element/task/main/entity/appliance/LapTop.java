package by.element.task.main.entity.appliance;

import java.io.Serializable;

public class LapTop extends Appliance implements Serializable {
    
    static final long SerialVersionUID = -4862926644813433707L;


    private int battery_capacity;
    private String os;
    private int memory_rom;
    private int system_memory;
    private int cpu;
    private int display_inchs;

    public LapTop(){
        super("Undifained");
        this.battery_capacity = 0;
        this.os = "Unset";
        this.memory_rom = 0;
        this.system_memory = 0;
        this.cpu = 0;
        this.display_inchs = 0;
    }

    public LapTop(String maker, int battery_capacity, String os, int memory_rom, int system_memory, int cpu,
            int display_inchs) {
        super(maker);
        this.battery_capacity = battery_capacity;
        this.os = os;
        this.memory_rom = memory_rom;
        this.system_memory = system_memory;
        this.cpu = cpu;
        this.display_inchs = display_inchs;
    }
    public int getBattery_capacity() {
        return battery_capacity;
    }
    public void setBattery_capacity(int battery_capacity) {
        this.battery_capacity = battery_capacity;
    }
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public int getMemory_rom() {
        return memory_rom;
    }
    public void setMemory_rom(int memory_rom) {
        this.memory_rom = memory_rom;
    }
    public int getSystem_memory() {
        return system_memory;
    }
    public void setSystem_memory(int system_memory) {
        this.system_memory = system_memory;
    }
    public int getCpu() {
        return cpu;
    }
    public void setCpu(int cpu) {
        this.cpu = cpu;
    }
    public int getDisplay_inchs() {
        return display_inchs;
    }
    public void setDisplay_inchs(int display_inchs) {
        this.display_inchs = display_inchs;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + battery_capacity;
        result = prime * result + ((os == null) ? 0 : os.hashCode());
        result = prime * result + memory_rom;
        result = prime * result + system_memory;
        result = prime * result + cpu;
        result = prime * result + display_inchs;
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
        LapTop other = (LapTop) obj;
        if (battery_capacity != other.battery_capacity)
            return false;
        if (os == null) {
            if (other.os != null)
                return false;
        } else if (!os.equals(other.os))
            return false;
        if (memory_rom != other.memory_rom)
            return false;
        if (system_memory != other.system_memory)
            return false;
        if (cpu != other.cpu)
            return false;
        if (display_inchs != other.display_inchs)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "LapTop ["+super.toString()+"battery_capacity=" + battery_capacity + ", os=" + os + ", memory_rom=" + memory_rom
                + ", system_memory=" + system_memory + ", cpu=" + cpu + ", display_inchs=" + display_inchs + "]";
    }
}
