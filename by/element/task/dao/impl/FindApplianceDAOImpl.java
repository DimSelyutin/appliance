package by.element.task.dao.impl;

import java.io.IOException;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import by.element.task.dao.ApplianceDataMatcher;
import by.element.task.dao.FileReaderTxt;
import by.element.task.dao.FindApplianceDAO;
import by.element.task.entity.property.Property;






public class FindApplianceDAOImpl implements FindApplianceDAO {



    public FindApplianceDAOImpl() {
    }

    @Override
    public List<String> find(Property property) throws IOException {

        FileReaderTxt flr = new FileReaderTxt("by/element/task/appliance/apliance_db.txt");
        String applianceName = property.getAplianceName();
        List<String> datafromSource = flr.selectionApp(applianceName);
        ApplianceDataMatcher appDataMatch = new ApplianceDataMatcher(datafromSource, property);


        List<String> readyStr = appDataMatch.match();

        
        return readyStr;
    }


    public List<String> propsString(Map<String, Object> props){
        List<String> propList = new ArrayList<>();

        for (Map.Entry<String, Object> entry : props.entrySet()) {
            propList.add(entry.getKey()+"="+entry.getValue());
        }
        return propList;
    }
    


    

}
