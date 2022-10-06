package by.element.task.appliance.bean.appliance.dao;

import java.io.IOException;
import java.util.List;

import by.element.task.appliance.bean.appliance.entity.request.RequsetApliance;




public interface FindAplianceDAO {
    List<Object> find(RequsetApliance request) throws IOException;

}
