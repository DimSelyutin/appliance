package by.element.task.main.dao.impl;

import java.util.ArrayList;
import java.util.List;

import by.element.task.main.entity.appliance.Appliance;
import by.element.task.main.entity.appliance.*;


public class ApplianceCreator {
    private List<String> dataFromSource;

    public ApplianceCreator() {

    }

    public ApplianceCreator(List<String> dataFromSource) {
        this.dataFromSource = dataFromSource;
    }

    // создает лист найденых приборов
    public List<Appliance> make() {
        List<Appliance> applianceObjList = new ArrayList<>();

        for (String appStr : dataFromSource) {
            applianceObjList.add(createApp(appStr));
        }

        return applianceObjList;

    }

    // подготавливает прибор из найденой строки
    private Appliance createApp(String appStr) {
        String groupNameSearch;
        int charInStr = appStr.indexOf(":");
        if (charInStr != -1) {
            groupNameSearch = appStr.substring(0, charInStr).trim();
        } else {
            groupNameSearch = "";
        }
        String[] apps = appStr.split(" ");
        List<String> valueOfProperty = new ArrayList<>();

        for (String string : apps) {
            if (string.contains("=")) {
                String value = string.substring(string.indexOf("=") + 1, string.length()).replaceAll("\\,", "");
                valueOfProperty.add(value);
            }
        }

        return switch (groupNameSearch) {
            case "Oven" -> createOven(valueOfProperty);
            case "Laptop" -> createLapTop(valueOfProperty);
            case "Refrigerator" -> createRefrigerator(valueOfProperty);
            case "VacumCleaner" -> createVacuumCleaner(valueOfProperty);

            default -> throw new IllegalArgumentException();

        };

    }

    private Appliance createOven(List<String> valueOfProperty) {

        return new Oven("Gefest", Integer.parseInt(valueOfProperty.get(0)),
                Integer.parseInt(valueOfProperty.get(1)),
                Integer.parseInt(valueOfProperty.get(2)),
                Integer.parseInt(valueOfProperty.get(3)),
                Float.parseFloat(valueOfProperty.get(4)),
                Float.parseFloat(valueOfProperty.get(5)));

    }


    private Appliance createLapTop(List<String> valueOfProperty) {
        return new LapTop("Asus", Float.parseFloat(valueOfProperty.get(0)),
                valueOfProperty.get(1),
                Integer.parseInt(valueOfProperty.get(2)),
                Integer.parseInt(valueOfProperty.get(3)),
                Float.parseFloat(valueOfProperty.get(4)),
                Integer.parseInt(valueOfProperty.get(5)));
    }



    private Appliance createRefrigerator(List<String> valueOfProperty) {
        return new Refrigerator("Atlant", 
                Float.parseFloat(valueOfProperty.get(1)),
                Float.parseFloat(valueOfProperty.get(2)),
                Float.parseFloat(valueOfProperty.get(3)),
                Float.parseFloat(valueOfProperty.get(4)),
                Float.parseFloat(valueOfProperty.get(5)),
                Float.parseFloat(valueOfProperty.get(6)));
    }



    private Appliance createVacuumCleaner(List<String> valueOfProperty) {
        return new VacuumCleaner("LG",
                Float.parseFloat(valueOfProperty.get(0)) ,
                valueOfProperty.get(1),
                valueOfProperty.get(2),
                valueOfProperty.get(3),
                Float.parseFloat(valueOfProperty.get(3)),
                Float.parseFloat(valueOfProperty.get(5)));
    }



    

}
