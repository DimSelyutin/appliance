package by.element.task.appliance.bean.appliance.view;



import java.util.List;




public class ConsoleOutPut {
    public void print(List<Object> list){
        for (Object object : list) {
            System.out.println(object);
        }
       
    }
}
