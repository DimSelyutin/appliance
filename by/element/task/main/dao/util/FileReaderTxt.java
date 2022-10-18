package by.element.task.main.dao.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReaderTxt {
    public final String path;


    public FileReaderTxt (String path){
        this.path = path;
    }

    //возвращает все приборы
    private List<String> readFile() throws IOException {

        List<String> allApplianceLines = Files.readAllLines(Paths.get(path));
        return allApplianceLines;

    }


    //делает список приборов найденых по имени типа приборов
    private List<String> readFile(String applianceGroup) throws IOException {
        
        List<String> groupNameList = new ArrayList<>();
        List<String> allApplianceLines = Files.readAllLines(Paths.get(path));

        for (String appLine : allApplianceLines) {
            if (appLine.contains(applianceGroup)) {
                groupNameList.add(appLine);
            }
        }
        
        return groupNameList;
    }

    //готовит список приборов в зависимости от типа прибора
    public List<String> selectionApp(String groupName) throws IOException{
        

        List<String> appliances = new ArrayList<>();
        if (groupName == null) {
             appliances = readFile();
        } else {
             appliances = readFile(groupName);
        }

        return appliances;

    }
}
