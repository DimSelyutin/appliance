package by.element.task.main.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import by.element.task.main.entity.property.Property;

public class ApplianceDataMatcher {
    private List<String> dataFromSoure;
    private Property property;

    public ApplianceDataMatcher(List<String> dataFromSource, Property property) {
        this.dataFromSoure = dataFromSource;
        this.property = property;
    }

    public List<String> match() {
        List<String> dataResult = new ArrayList<>();
        List<String> propString = propToString(property.getProperty());

        for (String dataResString : dataFromSoure) {
            if (isContain(dataResString, propString) == true) {
                dataResult.add(dataResString);
            }
        }

        return dataResult;
    }

    public List<String> propToString(Map<String, Object> props) {
        List<String> propString = new ArrayList<>();
        for (Map.Entry<String, Object> entry : props.entrySet()) {
            propString.add(entry.getKey() + "=" + entry.getValue());
        }
        return propString;
    }

    public boolean isContain(String dataResString, List<String> props) {
        for (String s : props) {
            if (!dataResString.contains(s)) {
                return false;
            }
        }
        return true;
    }
}
