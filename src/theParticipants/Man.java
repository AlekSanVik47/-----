package theParticipants;

import java.util.StringJoiner;

public class Man extends Participants {
	int distance;
	double jumpingOver;
	String nickName;

	public Man(int distance, double jumpingOver, String nickName) {
		super();
		this.distance = distance;
		this.jumpingOver = jumpingOver;
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return new StringJoiner("" , "", "")
				.add("\nУчастник по имени " + nickName)
				.toString();
	}
}
