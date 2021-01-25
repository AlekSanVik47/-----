package theParticipants;

import java.util.*;

public class Participants  {
    private List<Cat[]> cats;
    private List<Robot> robots;
    private List<Man> mens;
    private ArrayList<List<Object>> allParticipants;

    /*public Participants(List<Cat[]> cats, List<Robot> robots, List<Man> mens) {
        this.cats = cats;
        this.robots = robots;
        this.mens = mens;

    }*/
    Cat cat = new Cat(300, 1.1, "Baris");
    Cat cat1 = new Cat(50, 0.5, "Laska");
    Cat cat2 = new Cat(100, 1.5, "Jolly");
    Cat cat3 = new Cat(500, 2.0, "Kati");
    Cat cat4 = new Cat(1500, 0.7, "Marta");

    public List<Cat[]> arraysCats (Cat...cat) {
        this.cats = new ArrayList<Cat[]>();
        cats.add(cat);
        System.out.println(cats);
        return cats;
    }
    //Participants participants = new Participants(arraysCats(cat, cat1, cat2, cat3, cat4),robotArrayList(),manArrayList());

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
        System.out.println(allParticipants);
        return allParticipants;
    }

    public static void main(String[] args) {


    }



    public void setCats(List<Cat[]> cats) {
        this.cats = cats;
    }

    public void setRobots(List<Robot> robots) {
        this.robots = robots;
    }

    public void setMens(List<Man> mens) {
        this.mens = mens;
    }

    public void setAllParticipants(ArrayList<List<Object>> allParticipants) {
        this.allParticipants = allParticipants;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Participants.class.getSimpleName() + "[", "]")
                .add("cats=" + cats)
                .add("robots=" + robots)
                .add("mens=" + mens)
                .add("allParticipants=" + allParticipants)
                .add("cat=" + cat)
                .add("cat1=" + cat1)
                .add("cat2=" + cat2)
                .add("cat3=" + cat3)
                .add("cat4=" + cat4)
                .toString();
    }
}
