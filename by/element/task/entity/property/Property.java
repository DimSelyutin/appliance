package by.element.task.entity.property;


import java.util.Map;

public class Property {

    
    
    
    private String applianceName;
    private Map<String, Object> property;
    
    
    public Property(){
    }
    
    public Property(String applianceName, Map<String, Object> prop) {
        this.applianceName = applianceName;
        this.property = prop;
        
    }
    
    
    public String getAplianceName() {
        return applianceName;
    }
    
    
    
    public void setAplianceName(String applianceName) {
        this.applianceName = applianceName;
    }
    
    
    
    public Map<String, Object> getProperty() {
        return property;
    }
    
    
    
    public void setProperty(Map<String, Object> property) {
        this.property = property;
    }
    
    @Override
    public String toString() {
        return "Property [applianceName=" + applianceName + ", property=" + property + "]";
    }
    
    
    
}
