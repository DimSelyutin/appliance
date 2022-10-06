package by.element.task.appliance.bean.appliance.entity.request;

public final class AllProperty {
    public static enum Oven{
        POWER_CONSUMPTION, WEIGHT,CAPACITY,DEPTH, HEIGHT,WIDTH
    }

    public static enum Laptop{
        BATTERY_CAPACITY, OS,MEMORY_ROM,SYSTEM_MEMORY, CPU,DISPLAY_INCHS
    }

    public static enum Refrigerator{
        POWER_CONSUMPTION, WEIGHT,MEMOFREEZER_CAPACITY, OVERALL_CAPACITY,HEIGHT, WIDTH
    }

    public static enum VacuumCleaner{
        POWER_CONSUMPTION, FILTER_TYPE,BAG_TYPE, WAND_TYPE,MOTOR_SPEED_REGULATION, CLEANING_WIDTH
    }

    public static enum TabletPC{
        BATTERY_CAPACITY, DISPLAY_INCHES,MEMORY_ROM, FLASH_MEMORY_CAPACITY,COLOR
    }

    public static enum Speakers{
        POWER_CONSUMPTION, NUMBER_OF_SPEAKERS,FREQUENCY_RANGE, CORD_LENGTH
    }

    private AllProperty(){}
}
