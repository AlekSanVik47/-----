package myCompetition;

import obstacles.AllObstacles;
import obstacles.Treadmill;
import obstacles.Wall;
import theParticipants.*;

import java.util.*;
import java.util.stream.Stream;

public class Competition {

	List<Participants> participantsList = new ArrayList<>();
	List<AllObstacles> allObstacles = new ArrayList<>();
    private List<Participants> winnerslist = new LinkedList<>();
	private final String competitionTitle;

	public Competition(List<AllObstacles> allObstacles, String competitionTitle) {
		this.allObstacles = allObstacles;
		this.competitionTitle = competitionTitle;
	}

	public void setParticipantsList(List<Participants> participantsList) {
		this.participantsList = participantsList;
	}

	public Competition(String competitionTitle) {
		this.competitionTitle = competitionTitle;
	}

	public boolean passObstacles (Participants participants) {
		/*AllObstacles obstacles = new AllObstacles();
		AllObstacles[] allObstacles = ( AllObstacles[] ) obstacles.allObstacles();*/
		for (AllObstacles obstacle : allObstacles) {
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
					System.out.println(winnerslist + "test");
				}
			});
	}

	public static void main(String[] args) {

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
		Participants participants = new Participants();
		participants.addPartisipants(cat, cat1, cat2, cat3, cat4, robot, robot1, robot2, man, man1);



		Wall[] walls = new Wall[5];
		for (int i = 0; i < walls.length; i++) {
			walls[i] = new Wall((i + 1) * 11, (i + 1) * 0.4);
		}
		Treadmill[] treadmills = new Treadmill[5];
		for (int j = 0; j < treadmills.length; j++) {
			treadmills[j] = new Treadmill((j + 1) * 10, (j + 1) * 300);
		}
		/*System.out.println(Arrays.toString(Stream.of(walls, treadmills)
				.flatMap(Stream::of)
				.toArray()));*/
		/*Stream.of(walls, treadmills)
				.flatMap(Stream::of)
				.toArray();*/

		List<AllObstacles> allObstacles = new ArrayList<>();
		allObstacles.toArray(Stream.of(walls, treadmills)
				.flatMap(Stream::of)
				.toArray());

		System.out.println(allObstacles);

		Competition competition = new Competition("Test");
		competition.setAllObstacles(allObstacles);

		List<Participants> participantsList = new ArrayList<>();

		competition.setParticipantsList(Collections.singletonList(participants));
		competition.startCompetition();
	}

	public List<Participants> getWinnerslist() {
		return winnerslist;
	}

	public void setAllObstacles(List<AllObstacles> allObstacles) {
		this.allObstacles = allObstacles;
	}

	public void setWinnerslist(List<Participants> winnerslist) {
		this.winnerslist = winnerslist;
	}
}








