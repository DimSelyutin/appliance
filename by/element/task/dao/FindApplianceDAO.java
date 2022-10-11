package by.element.task.dao;

import java.io.IOException;
import java.util.List;

import by.element.task.entity.property.Property;



public interface FindApplianceDAO {

    List<String> find(Property prop) throws IOException;

}
