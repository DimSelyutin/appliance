package by.element.task.main.entity;

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

    private List<String> readFile() throws IOException {

        List<String> allList = Files.readAllLines(Paths.get(path));
        return allList;

    }

    private List<String> readFile(String applianceGroup) throws IOException {
        
        List<String> groupNameList = new ArrayList<>();
        List<String> allList = Files.readAllLines(Paths.get(path));

        for (String appLine : allList) {
            if (appLine.contains(applianceGroup)) {
                groupNameList.add(appLine);
            }
        }
        
        return groupNameList;
    }


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
