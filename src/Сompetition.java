
import obstacles.Treadmill;
import obstacles.Wall;
import theParticipants.Cat;
import theParticipants.Man;
import theParticipants.Robot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

import static java.lang.System.*;


class Competition {

	private static String[] allObstacles1;


	private Object allObstacles () {

		Wall[] walls = new Wall[5];
		for (int i = 0; i < walls.length; i++) {
			walls[i] = new Wall((i + 1) * 11, (i + 1) * 0.4);

		}
		Treadmill[] treadmills = new Treadmill[5];
		for (int j = 0; j < treadmills.length; j++) {
			treadmills[j] = new Treadmill((j + 1) * 10, (j + 1) * 300);

		}
		Object[] allObstacles1 = Stream.of(walls,treadmills)
				.flatMap(Stream::of)
				.toArray();
		out.println(Arrays.toString(allObstacles1));
		return allObstacles1;
	}



		public static void main (String[]args){
			Competition competition = new Competition();
			competition.allObstacles();

		}

	}





