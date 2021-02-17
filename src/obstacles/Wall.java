package obstacles;

import theParticipants.Participants;

public class Wall implements Obstacles {
double wallHeight;
int obstacleNumber;

	public Wall(int obstacleNumber, double wallHeight) {
		this.wallHeight = wallHeight;
		this.obstacleNumber = obstacleNumber;
	}

	@Override
public String toString() {
	return "Стена{" +
			       "стена №_ " + obstacleNumber +
			       ", высотой " + wallHeight +
			       " m" + "} \n";
}

public static void main(String[] args) {
	Wall wall = new Wall(1,0.5);

}

	@Override
	public boolean passed(Participants participant) {
		if (participant.jump() > wallHeight) {
			System.out.println("Участник " + participant + " успешно перепрыгнул стену");
			return true;
		}
		else {
			System.out.println("Участник " + participant + " не смог перепрыгнуть стену " + wallHeight);
			return false;
		}
	}
}
