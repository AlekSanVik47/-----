package theParticipants;

import java.util.StringJoiner;

public class Robot extends Participants{
int distance;
double jumpingOver;
String nickName;

public Robot(int distance, double jumpingOver, String nickName) {
	this.distance = distance;
	this.jumpingOver = jumpingOver;
	this.nickName = nickName;
}

	@Override
	public String toString() {
		return new StringJoiner("" , "", "")
				.add("\nРобот " + nickName)
				.toString();
	}
}
