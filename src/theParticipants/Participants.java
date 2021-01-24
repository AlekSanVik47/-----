package theParticipants;

import java.util.*;

public class Participants  {
    private List<Cat> cats;
    private List<Robot> robots;
    private List<Man> mens;
    private ArrayList<List<Object>> allParticipants;

    public Participants(List<Cat> cats, List<Robot> robots, List<Man> mens) {
        this.cats = cats;
        this.robots = robots;
        this.mens = mens;

    }

    public List<Cat> arraysCats () {
        this.cats = new ArrayList<>();
        Cat cat = new Cat(300, 1.1, "Baris");
        Cat cat1 = new Cat(50, 0.5, "Laska");
        Cat cat2 = new Cat(100, 1.5, "Jolly");
        Cat cat3 = new Cat(500, 2.0, "Kati");
        Cat cat4 = new Cat(1500, 0.7, "Marta");
        cats.add(cat);
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        return cats;
    }

    public List<Robot> robotArrayList(){
        this.robots = new ArrayList<>();
        Robot robot = new Robot(1000, 1.05,"Rob_0");
        Robot robot1 = new Robot(1200, 1.5,"Rob_1");
        Robot robot2 = new Robot(500, 0.8,"Rob_2");
        robots.add(robot);
        robots.add(robot1);
        robots.add(robot2);
        return robots;
    }
    public List<Man> manArrayList(){
        this.mens = new ArrayList<>();
        Man man = new Man(2500,1.2,"Jon");
        Man man1 = new Man(3500,1.5,"Nik");
        mens.add(man);
        mens.add(man1);
        return mens;
    }
    public ArrayList<List<Object>> allParticipants(List<Cat> cats, List<Robot> robots, List<Man> mens){
        this.allParticipants = new ArrayList<List<Object>>(cats.size() + robots.size() + mens.size());
        this.cats = arraysCats ();
        this.robots = robotArrayList();
        this.mens = manArrayList();
        allParticipants.add(Collections.singletonList(cats));
        allParticipants.add(Collections.singletonList(robots));
        allParticipants.add(Collections.singletonList(mens));
        //System.out.println(allParticipants);
        return allParticipants;
    }

    public static void main(String[] args) {


    }

    public ArrayList<List<Object>> getAllParticipants() {
        return allParticipants;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public List<Robot> getRobots() {
        return robots;
    }

    public List<Man> getMens() {
        return mens;
    }
}
