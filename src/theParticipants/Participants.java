package theParticipants;

import java.util.*;

public class Participants extends ArrayList<Object> implements CanRunAndJump {
    int distance;
    double jumpingOver;
    String nickName;
    private static List<Object> objectList;

    public Participants(List<Object> objectList) {
        Participants.objectList = objectList;
    }

    public Participants() {

    }

    public List<Object> addPartisipants(Object...objects){
        List<Object> objectList = new ArrayList<>(Arrays.asList(objects));
        System.out.println("Участники соревнований: ");
        System.out.println(Arrays.toString(new ArrayList[]{new ArrayList<>(objectList)}));
               return objectList;
    }

    @Override
    public double run() {
        System.out.println(nickName + " пробежал: " + distance + " m");
        return distance;
    }

    @Override
    public double jump() {
        System.out.println(nickName + " перепрыгнул: " + jumpingOver + " m");
        return jumpingOver;
    }

    @Override
    public boolean passed(Participants participant) {
        if (participant.run() > distance ||participant.jump() > jumpingOver) {
            System.out.println("Участник " + participant + " успешно пробежал дистанцию");
            return true;
        } else {
            System.out.println("Участник " + participant + " не смог пробежать дистанцию " + distance);

        }
        return false;
    }

    public static void main(String[] args) {

    }
}
