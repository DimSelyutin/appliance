package by.element.task.appliance.bean.appliance.dao;

import java.util.List;

import by.element.task.appliance.bean.appliance.bean.Computer;


public interface FindAplianceDAO {
    List<Computer> find(int property);
    List<Computer> find(String model);

}
