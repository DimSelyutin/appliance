package by.element.task.appliance.bean.appliance.entity.request;

import java.util.HashMap;

public class RequsetApliance {

    private String aplianceName;
    private HashMap<Enum, Object> property;


    public RequsetApliance(){
    }

    public RequsetApliance(String aplianceName, HashMap<Enum, Object> prop) {
        this.aplianceName = aplianceName;
        this.property = prop;
        
    }



    public String getAplianceName() {
        return aplianceName;
    }



    public void setAplianceName(String aplianceName) {
        this.aplianceName = aplianceName;
    }



    public HashMap<Enum, Object> getProperty() {
        return property;
    }



    public void setProperty(HashMap<Enum, Object> property) {
        this.property = property;
    }

    

}
