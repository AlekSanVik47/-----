package myCompetition;

import obstacles.Obstacles;
import obstacles.Treadmill;
import obstacles.Wall;
import theParticipants.*;
import java.util.*;


public class Competition {

	List<Participants> participantsList = new ArrayList<>();
	List<Obstacles> allObstacles = new ArrayList<>();
    private final List<Participants> winnerslist = new LinkedList<>();
	private final String competitionTitle;

	public Competition(String competitionTitle) {
		this.competitionTitle = competitionTitle;
	}

	public boolean passObstacles (Participants participants) {    //проверка на преодоление припятствия
		for (Obstacles obstacle : allObstacles) {
			if (!obstacle.passed(participants)) return false;
		}
		return true;
		}

	public void startCompetition() {
		System.out.println("\nНачало соревнования " + competitionTitle); // объявляем соревнования
		winnerslist.clear();                                            // очищаем лист победителей
			participantsList.forEach(participant -> {                   // в цикле проверяем успешное прохождение припятствия и выводим результат
				boolean success = passObstacles(participant);
				if (!success) {
					System.out.println(participant + " покинул испытание");
				} else {
					winnerslist.add(participant);
				}
			});
			if (!winnerslist.isEmpty())
		System.out.println(winnerslist + " успешно преодолел припятствие");
	}

	public static void main(String[] args) {
                 // создание массива участников
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

		List<Participants> participantsList;
		participantsList = Arrays.asList(cat, cat1, cat2, cat3, cat4, man, man1, robot, robot1, robot2);
//_________________________________________________________________________________________________________________
		// создание массива припятствий
		List<Wall> walls = Arrays.asList(new Wall[5]);
		for (int i = 0; i < walls.size(); i++) {
			walls.set(i, new Wall((i + 1) * 11, (i + 1) * 0.2));
		}
		List<Treadmill> treadmills = Arrays.asList(new Treadmill[5]);
		for (int j = 0; j < treadmills.size(); j++) {
			treadmills.set(j, new Treadmill((j + 1) * 10, (j + 1) * 300));
		}
		/*Arrays.toString(Stream.of(walls, treadmills)
				.flatMap(Stream::of)
				.toArray());*/

		Competition competition = new Competition("Эстафета_2021"); // создание соревнований
		// добавление припятствий в коллекцию
		List<Obstacles> res1 = new ArrayList<Obstacles>();
		res1.addAll(walls);
		res1.addAll(treadmills);
		//System.out.println(res1);

		/*List<List<? extends Obstacles>> result = new ArrayList<>();
		for (List<? extends Obstacles> obstacles : Arrays.asList(walls, treadmills)) {
			for (List<? extends Obstacles> list : Arrays.<List<? extends Obstacles>>asList(obstacles)) {
				result.add(list);
			}
		}*/
		competition.setAllObstacles(res1); // передаем припятствия
		competition.setParticipantsList(participantsList); // передаем участников
		//System.out.println(participantsList);
		competition.startCompetition(); // начинаем соревнования
	}
	public void setAllObstacles(List<Obstacles> allObstacles) {
		this.allObstacles = allObstacles;
	}

	public void setParticipantsList(List<Participants> participantsList) {
		this.participantsList = participantsList;
	}
}








