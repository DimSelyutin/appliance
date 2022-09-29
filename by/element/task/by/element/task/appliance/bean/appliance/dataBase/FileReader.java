package by.element.task.appliance.bean.appliance.dataBase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import by.element.task.appliance.bean.appliance.dao.Data;

public class FileReader implements Data{
    public FileReader(){

    }

    public String readLines(String className,int line){
        if(line < 0 || line > 5) {
            line = 0;
        }
        String trPath = "E:/GitHub/Epam/epam/by/element/task/by/element/task/appliance/bean/appliance/dataBase/"+className;
        String str;
        try {
            str = Files.readAllLines(Paths.get(trPath)).get(line);
        } catch (IOException e) {
            str = "Data base error";
            e.printStackTrace();
        }
        return str;
    }

   
}
