package hu.uni.eszterhazy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

import org.junit.Test;

public class PlayingJava {

    @Test
    public void test() throws IOException {
        File file = new File("target");
        if(!file.exists()) {
            // file.mkdirs(); ha fájlnevet is adunk meg a path-ba
            file.createNewFile();
        }

        System.out.println(file.getAbsolutePath());
        List<File> files =Arrays.asList(file.listFiles());
        for(File f: files){
            System.out.println(f.getName());
        }
        System.out.println(file.getParent());


        File cica = new File("cica");
        if (!cica.exists()) {
            cica.createNewFile();
        }
        FileWriter writer = new FileWriter(cica, true);
        writer.write("Szia Cica!\n");
        writer.write("Van gazdád?");
        writer.close();

//        FileReader reader = new FileReader(cica);
//        char[] content = new char[reader.read()];
//        System.out.println(content);

        Scanner sc = new Scanner(cica);
        while(sc.hasNext()) {
            System.out.println(sc.next());
        }

        String string = "2019.11.08";
        System.out.println(string.matches("\\d{4}.\\d{2}.\\d{2}"));
        String string2 = "2019.1.08";
        System.out.println(string2.matches("\\d{4}.\\[1-9]|d{2}.\\d{2}"));

        String[] result = string.split(".", 0);
        System.out.println(result[0]);

        String.valueOf(3);
        Integer.parseInt("3");

        Set<String> stringSet = new HashSet<>();
        stringSet.add("helló");

        List<String> stringList = new ArrayList<>();
        stringList.indexOf("helló");

        Map<String, Double> map = new HashMap<>();
        map.put("cica", new Double(3.4));
        System.out.println(map.get("cica"));

        //java 8-tól
        LocalDate date = LocalDate.now();
        System.out.println(date);
        date.isBefore(LocalDate.now().plusYears(2));
        LocalDate datum = LocalDate.parse("2019-10-10");
        LocalDate.of(1966, 12, 52);
        System.out.println(datum);

        System.out.println(Enum.valami0);
    }
}

enum Enum {
    valami0, valami1, valami2
}
