package theParticipants;

import java.util.Collection;
import java.util.StringJoiner;

public class Man implements CanRunAndJump {
	int distance;
	double jumpingOver;
	String nickName;

	public Man(int distance, double jumpingOver, String nickName) {
		this.distance = distance;
		this.jumpingOver = jumpingOver;
		this.nickName = nickName;
	}

		public static void main (String[]args){
			Man man = new Man(3000, 1.2, "Alex");
			man.run();
			man.jump();
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
				.add("\nУчастник по имени " + nickName + " может ")
				.add("пробежать: " + distance + " м ")
				.add("перепрыгнуть: " + jumpingOver + " м ")
				.toString();
	}
}
