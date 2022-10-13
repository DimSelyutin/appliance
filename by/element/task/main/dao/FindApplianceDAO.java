package by.element.task.main.dao;

import java.io.IOException;
import java.util.List;

import by.element.task.main.entity.property.Property;



public interface FindApplianceDAO {

    List<String> find(Property prop) throws IOException;

}
