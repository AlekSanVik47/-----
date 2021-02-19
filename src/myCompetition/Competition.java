package myCompetition;

import obstacles.AllObstacles;
import obstacles.Obstacles;
import obstacles.Treadmill;
import obstacles.Wall;
import theParticipants.*;

import java.util.*;
import java.util.stream.Stream;



public class Competition {

	List<Participants> participantsList = new ArrayList<>();
	List<Obstacles> allObstacles = new ArrayList<>();
    private List<Participants> winnerslist = new LinkedList<>();
	private final String competitionTitle;



	public void setParticipantsList(List<Participants> participantsList) {
		this.participantsList = participantsList;
	}

	public Competition(String competitionTitle) {
		this.competitionTitle = competitionTitle;
	}

	public boolean passObstacles (Participants participants) {
		for (Obstacles obstacle : allObstacles) {
			if (!obstacle.passed(participants)) {
					return false;
				}
				System.out.println();
			}
		return true;
		}

	public void startCompetition() {
		System.out.println("\nНачало соревнования " + competitionTitle);
		winnerslist.clear();
			participantsList.forEach(participant -> {
				boolean success = passObstacles(participant);
				if (!success) {
					System.out.println("Участник " + participant + " покинул испытание");
				} else {
					winnerslist.add(participant);
					System.out.println(winnerslist + " успешно преодолел припятствие");
				}
			});
	}

	public static void main(String[] args) {
		List<Participants> participantsList;
		Cat cat = new Cat(300, 1.1, "Baris");
		Cat cat1 = new Cat(50, 0.5, "Laska");
		Cat cat2 = new Cat(100, 1.5, "Jolly");
		Cat cat3 = new Cat(500, 2.0, "Kati");
		Cat cat4 = new Cat(1500, 0.7, "Marta");

		Robot robot = new Robot(1000, 1.05, "Rob_0");
		Robot robot1 = new Robot(1200, 1.5, "Rob_1");
		Robot robot2 = new Robot(500, 0.8, "Rob_2");

		Man man = new Man(2500, 1.2, "Jon");
		Man man1 = new Man(3500, 1.5, "Nik");

		participantsList = Arrays.asList(cat, cat1, cat2, cat3, cat4, robot, robot1, robot2, man, man1);


		List<Wall> walls = Arrays.asList(new Wall[5]);
		for (int i = 0; i < walls.size(); i++) {
			walls.set(i, new Wall((i + 1) * 11, (i + 1) * 0.4));
		}
		List<Treadmill> treadmills = Arrays.asList(new Treadmill[5]);
		for (int j = 0; j < treadmills.size(); j++) {
			treadmills.set(j, new Treadmill((j + 1) * 10, (j + 1) * 300));
		}
		/*Arrays.toString(Stream.of(walls, treadmills)
				.flatMap(Stream::of)
				.toArray());*/

		System.out.println(walls);

		Competition competition = new Competition("Test");
		List<List<? extends Obstacles>> result = new ArrayList<>();
		for (List<? extends Obstacles> obstacles : Arrays.asList(walls, treadmills)) {
			for (List<? extends Obstacles> list : Arrays.<List<? extends Obstacles>>asList(obstacles)) {
				result.add(list);
			}
		}
		competition.setAllObstacles(Arrays.toString(result.toArray()));

		competition.setParticipantsList(participantsList);
		competition.startCompetition();
	}

	private void setAllObstacles(String toString) {
	}

	public void setAllObstacles(List<Obstacles> allObstacles) {
		this.allObstacles = allObstacles;
	}
}








