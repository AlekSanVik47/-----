package theParticipants;

import java.util.StringJoiner;

public class Cat implements CanRunAndJump {
int distance;
double jumpingOver;
String nickName;

	@Override
	public String toString() {
		return new StringJoiner( "" , "", "")
				.add("\nКот с кличкой " + nickName + " может ")
				.add("пробежать: " + distance + " м ")
				.add("перепрыгнуть: " + jumpingOver + " м ")
				.toString();
	}

	public Cat(int distance, double jumpingOver, String nickName) {
	this.distance = distance;
	this.jumpingOver = jumpingOver;
	this.nickName = nickName;
}

@Override
public double run() {
	System.out.println(nickName + " пробежал: " + distance + " m");
	return distance;
}

@Override
public double jump() {
	System.out.println(nickName + " перепрыгнул: " + jumpingOver + " m");
	return (int) jumpingOver;
}

	public int getDistance() {
		return distance;
	}

	public double getJumpingOver() {
		return jumpingOver;
	}

	public String getNickName() {
		return nickName;
	}
}
