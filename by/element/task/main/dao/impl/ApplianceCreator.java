package by.element.task.main.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.element.task.main.entity.appliance.Appliance;
import by.element.task.main.entity.appliance.LapTop;
import by.element.task.main.entity.appliance.Oven;

public class ApplianceCreator {
    private List<String> dataFromSource;

    public ApplianceCreator() {

    }

    public ApplianceCreator(List<String> dataFromSource) {
        this.dataFromSource = dataFromSource;
    }

    public List<Appliance> make() {
        List<Appliance> applianceObjList = new ArrayList<>();

        // получение типа оборудования
        for (String appStr : dataFromSource) {
            applianceObjList.add(createApp(appStr));
        }
        return applianceObjList;

    }
    
    private Appliance createApp(String appStr) {
        String groupNameSearch;
        int charInStr = appStr.indexOf(":");
            if (charInStr != -1) {
                groupNameSearch = appStr.substring(0, charInStr).trim();
            }
            groupNameSearch = "";

        return switch (groupNameSearch) {
            case("Oven") -> createOven(appStr);
            default -> createLapTop();
        };
    }

    private Appliance createOven(String appStr) {
        Pattern pattern = Pattern.compile("=\\d");
        Matcher matcher = pattern.matcher(appStr);

        while (matcher.find()){
            System.out.println("yes");
        }
        return new Oven("Gefest", 10, 80, 20, 80, 0, 0);
    }

    private Appliance createLapTop() {

        return new LapTop(null, 0, null, 0, 0, 0, 0);
    }

}
