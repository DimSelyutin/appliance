package by.element.task.main.service;

import java.io.IOException;
import java.util.List;

import by.element.task.main.dao.DAOFactory;
import by.element.task.main.dao.ApplianceDAO;
import by.element.task.main.entity.appliance.Appliance;
import by.element.task.main.entity.property.Property;

public class ApplianceService {
    
    public ApplianceService(){
        
    }
    //готовит список всех приборов
    public List<Appliance> findAllAppliance(Property prop) throws IOException{

        DAOFactory daoObjFactory = DAOFactory.getInstance();
        ApplianceDAO findApp  = daoObjFactory.getFindApplianceDAO();
        

        List<Appliance> allList = findApp.find(prop);
        return allList;
    }

}
