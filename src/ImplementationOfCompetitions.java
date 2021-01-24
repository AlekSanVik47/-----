import obstacles.AllObstacles;
import obstacles.Obstacles;
import theParticipants.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class ImplementationOfCompetitions {
    private static Competition createAndPrepareCompetition(){
        List<Cat> cats = new ArrayList<>();
        List<Robot> robots = new ArrayList<>();
        List<Man> mens = new ArrayList<>();
        Participants participants = new Participants(cats,robots,mens);
        cats = participants.arraysCats();
        robots = participants.robotArrayList();
        mens = participants.manArrayList();
        participants.allParticipants(cats, robots, mens);

        Random random = new Random();

        AllObstacles allObstacles = new AllObstacles();
        allObstacles.allObstacles();

        Competition competition = new Competition("Эстафета_2021");
        competition.setArrParticipants();
        competition.setArrAllObstacles();
        return competition;

    }
    public static void main(String[] args) {
        System.out.println("Начинаем соревнование....");
        Competition competition = createAndPrepareCompetition();
        System.out.println("Начинаем соревнование!");
        competition.startCompetition();

        System.out.println("Соревнование окончено! Победители: ");
        for (Participants winner: competition.getLastWinners()) {
            System.out.println(winner);
        }
    }
}
