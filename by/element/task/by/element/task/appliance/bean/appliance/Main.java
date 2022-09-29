package by.element.task.appliance.bean.appliance;

import by.element.task.appliance.bean.appliance.bean.computer.Computer;


public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer("Asus", 220, 4, 16, 500);
        System.out.println(comp.toString());
    }
}
