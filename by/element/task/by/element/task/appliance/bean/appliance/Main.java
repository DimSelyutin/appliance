package by.element.task.appliance.bean.appliance;

import by.element.task.appliance.bean.appliance.bean.Computer;
import by.element.task.appliance.bean.appliance.bean.Notebook;
// import by.element.task.appliance.bean.appliance.bean.Notebook;
import by.element.task.appliance.bean.appliance.dao.Data;


public class Main {
    static Data data = new Computer();
    public static void main(String[] args) {
        
        Computer comp = new Computer("Asus", 220, 4, 16, 500);
        System.out.println(comp.toString());
        Notebook note = new Notebook("Lenovo", 220, 4,16,500,2400,3);
        System.out.println(note.toString());
        
    }
}
