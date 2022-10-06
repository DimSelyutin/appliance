package by.element.task.appliance.bean.appliance.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import by.element.task.appliance.bean.appliance.dao.FindAplianceDAO;
import by.element.task.appliance.bean.appliance.entity.request.AllProperty;
import by.element.task.appliance.bean.appliance.entity.request.RequsetApliance;
import by.element.task.appliance.bean.appliance.entity.request.AllProperty.Laptop;
import by.element.task.appliance.bean.appliance.entity.request.AllProperty.Oven;
import by.element.task.appliance.bean.appliance.entity.request.AllProperty.VacuumCleaner;


public class FileDAOtxt implements FindAplianceDAO {
    private String path = "by/element/task/by/element/task/appliance/bean/appliance/apliance/apliance_db.txt";

    public FileDAOtxt() {

    }

    public List<Object> find(RequsetApliance request) throws IOException {

        List<Object> responce = new ArrayList<>();
        HashMap<Enum, Object> prop = request.getProperty();

        FileReader reader;
        BufferedReader bf;

        try {
            reader = new FileReader(path);
            bf = new BufferedReader(reader);

            List<String> line = Files.readAllLines(Paths.get(path));

            for (int i = 0; i < line.size(); i++) {

                if (line.get(i).contains(request.getAplianceName())) {

                    Object[] arrayProp = VacuumCleaner.values();

                    int a = arrayProp.length;
                    int chek = 0;

                    for (int l = 0; l < a; l++) {

                        String g = arrayProp[l] + "=" + prop.get(arrayProp[l]);

                        if (line.get(i).contains(g)) {
                            chek += 1;
                        }

                    }

                    if (chek == request.getProperty().size()) {
                        responce.add(line.get(i));
                    }

                }

            }

        } catch (FileNotFoundException e) {
            // Path to file is false
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return responce;

    }

}
