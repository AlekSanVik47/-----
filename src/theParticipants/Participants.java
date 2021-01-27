package theParticipants;

import java.util.*;

public class Participants  {

    private static List<Object> objectList;

    public Participants(List<Object> objectList) {
        Participants.objectList = objectList;
    }

    private void addPartisipants(Object...objects){
        List<Object> objectList = new ArrayList<>(Arrays.asList(objects));
        System.out.println(objectList);
    }

    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        Participants participants = new Participants(objectList);
        Cat cat = new Cat(300, 1.1, "Baris");
        Cat cat1 = new Cat(50, 0.5, "Laska");
        Cat cat2 = new Cat(100, 1.5, "Jolly");
        Cat cat3 = new Cat(500, 2.0, "Kati");
        Cat cat4 = new Cat(1500, 0.7, "Marta");

        Robot robot = new Robot(1000, 1.05,"Rob_0");
        Robot robot1 = new Robot(1200, 1.5,"Rob_1");
        Robot robot2 = new Robot(500, 0.8,"Rob_2");

        Man man = new Man(2500,1.2,"Jon");
        Man man1 = new Man(3500,1.5,"Nik");

        participants.addPartisipants(cat, cat1,cat2, cat3, cat4, robot, robot1, robot2, man, man1);

    }
}
