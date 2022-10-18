package by.element.task.main.dao.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import by.element.task.main.dao.ApplianceDAO;
import by.element.task.main.dao.util.ApplianceDataMatcher;
import by.element.task.main.dao.util.FileReaderTxt;
import by.element.task.main.entity.appliance.Appliance;
import by.element.task.main.entity.property.Property;







public class FileApplianceDAOImpl implements ApplianceDAO {



    public FileApplianceDAOImpl() {
    }

    @Override 
    public List<Appliance> find(Property property) throws IOException {
        List<Appliance> appCreate = new ArrayList<>();
        FileReaderTxt flr = new FileReaderTxt("by/element/task/main/appliance/apliance_db.txt");

        String applianceName = property.getAplianceName();
        List<String> datafromSource = flr.selectionApp(applianceName);

        ApplianceDataMatcher appDataMatch = new ApplianceDataMatcher(datafromSource, property);

        List<String> readyStr = appDataMatch.match();
        ApplianceCreator readyApp = new ApplianceCreator(readyStr);
        appCreate = readyApp.make();
        
        return appCreate;
    } 
    

}
