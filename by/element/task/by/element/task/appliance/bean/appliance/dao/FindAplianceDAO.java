package by.element.task.appliance.bean.appliance.dao;

import java.util.List;

import by.element.task.appliance.bean.appliance.bean.Computer;
import by.element.task.appliance.bean.appliance.bean.ElectricalAppliance;

public interface FindAplianceDAO {
    List<Computer> find(int property);

}
