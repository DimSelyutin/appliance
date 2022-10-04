package by.element.task.appliance.bean.appliance.helper;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Random;

import by.element.task.appliance.bean.appliance.bean.Computer;
import by.element.task.appliance.bean.appliance.bean.Hairdryer;
import by.element.task.appliance.bean.appliance.bean.Multicooker;
import by.element.task.appliance.bean.appliance.bean.Notebook;

public class GenerateBaseFile implements Serializable {
    private static final long serialVersionUID = -4862926644813433707L;

    public GenerateBaseFile() {

    }

    public void generateFile() throws IOException {

        WriteObj obj = new WriteObj();
        Random rand = new Random();
        HashMap<Integer, Object> map = new HashMap<>();

        for (int i = 0; i < 80; i++) {
            if (i < 20) {
                map.put(i, new Computer(name(rand.nextInt(1, 5)), gen(22, 23) * 10, gen(2, 24), gen(2, 64),
                        gen(12, 300) * 10));
            } else if (i > 20 && i < 40) {
                map.put(i, new Notebook(
                        name(rand.nextInt(1, 5)), gen(220, 230), gen(2, 16), gen(2, 64), gen(500, 1000),
                        gen(1200, 4800), gen(1, 3)));
            } else if (i > 40 && i < 60) {
                map.put(i, new Hairdryer(name(rand.nextInt(1, 5)), gen(220, 230), gen(1, 3), gen(1, 3) * 100,
                        gen(3, 8) * 10));
            } else if (i > 60 && i < 80) {
                map.put(i, new Multicooker(name(rand.nextInt(1, 5)), "Non-Stic", gen(22, 23) * 10, gen(5, 12) * 10,
                        gen(22, 23) * 10));
            }

        }
        obj.serializeObj(map);

        System.out.println("Succes!");

    }

    public static int gen(int a, int b) {// helper
        int x;
        Random rand = new Random();
        if ((x = rand.nextInt(a, b)) % 2 != 0) {
            x--;
        }
        return x;
    }

    public static String name(int a) throws IOException {// helper
        File f = new File("base/model.txt");
        String line = Files.readAllLines(f.toPath()).get(a);

        return line;
    }
}
