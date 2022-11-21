package GB_java_homwork6;

import java.util.*;

public class task {
    public static void main(String[] args) {
        Set<Laptop> fn = new HashSet<>();
        fn=taskFunc();
        Map<String, String> db = new HashMap<>();
       enter(db);
        for (Laptop elem : fn) {
            if (elem.getColor().equals(db.get("Color"))&&
            elem.getOperatingSystem().equals(db.get("OperatingSystem"))&&
                    Integer.parseInt(elem.getRam())>=Integer.parseInt(db.get("Ram"))&&
                    Integer.parseInt(elem.getRailwayVolume())>=Integer.parseInt(db.get("RailwayVolume"))){
                System.out.println(elem);
            }
    }

    }

    public static Set<Laptop> taskFunc() {
        Laptop laptop1 = new Laptop();
        laptop1.setColor("Red");
        laptop1.setOperatingSystem("Windows");
        laptop1.setRailwayVolume("13");
        laptop1.setRam("20");
        Laptop laptop2 = new Laptop();
        laptop2.setColor("Yellow");
        laptop2.setOperatingSystem("Windows");
        laptop2.setRailwayVolume("20");
        laptop2.setRam("25");
        Laptop laptop3 = new Laptop();
        laptop3.setColor("Green");
        laptop3.setOperatingSystem("Windows");
        laptop3.setRailwayVolume("13");
        laptop3.setRam("40");
        Laptop laptop4 = new Laptop();
        laptop4.setColor("Red");
        laptop4.setOperatingSystem("MakOis");
        laptop4.setRailwayVolume("20");
        laptop4.setRam("21");
        Laptop laptop5 = new Laptop();
        laptop5.setColor("Red");
        laptop5.setOperatingSystem("Windows");
        laptop5.setRailwayVolume("9");
        laptop5.setRam("15");
        Laptop laptop6 = new Laptop();
        laptop6.setColor("Blue");
        laptop6.setOperatingSystem("Linux");
        laptop6.setRailwayVolume("16");
        laptop6.setRam("20");
        Laptop laptop7 = new Laptop();
        laptop7.setColor("Red");
        laptop7.setOperatingSystem("Windows");
        laptop7.setRailwayVolume("13");
        laptop7.setRam("20");
        Set<Laptop> laptopSet = new HashSet<>();
        laptopSet.add(laptop1);
        laptopSet.add(laptop2);
        laptopSet.add(laptop3);
        laptopSet.add(laptop4);
        laptopSet.add(laptop5);
        laptopSet.add(laptop6);
        laptopSet.add(laptop7);
        for (Laptop i : laptopSet) {
            System.out.println(i);
        }
        return laptopSet;

    }

    public static void enter(Map<String, String> sf) {
        Scanner iScanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Введите параметр");
            String k = iScanner.nextLine();
            System.out.println("Введите значение параметра");
            String number = iScanner.nextLine();
            sf.put(k,number);
            }
        }
}
