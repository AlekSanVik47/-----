package theParticipants;

import java.util.StringJoiner;

public class Robot implements CanRunAndJump{
int distance;
double jumpingOver;
String nickName;

public Robot(int distance, double jumpingOver, String nickName) {
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
	return jumpingOver;
}

	@Override
	public boolean passed(CanRunAndJump participant) {
		if (participant.run() > distance ||participant.jump() > jumpingOver) {
			System.out.println("Участник " + participant + " успешно пробежал дистанцию");
			return true;
		} else {
			System.out.println("Участник " + participant + " не смог пробежать дистанцию " + distance);

		}
		return false;
	}

	@Override
	public String toString() {
		return new StringJoiner("" , "", "")
				.add("\nРобот " + nickName + " может ")
				.add("пробежать: " + distance + " м ")
				.add("перепрыгнуть: " + jumpingOver + " м ")
				.toString();
	}
}
