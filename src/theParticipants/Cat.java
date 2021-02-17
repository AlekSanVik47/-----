package theParticipants;

import java.util.StringJoiner;

public class Cat extends Participants {
	int distance;
	double jumpingOver;
	String nickName;

	@Override
	public String toString() {
		return new StringJoiner("", "", "")
				.add("\nКот с кличкой " + nickName)
				.toString();
	}

	public Cat(int distance, double jumpingOver, String nickName) {
		super();
		this.distance = distance;
		this.jumpingOver = jumpingOver;
		this.nickName = nickName;
	}

}




