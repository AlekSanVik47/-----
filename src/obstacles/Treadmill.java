package obstacles;

import theParticipants.Participants;

public class Treadmill implements Obstacles{
	int trackLength, obstacleNumber;



public Treadmill(int obstacleNumber, int trackLength) {
	this.obstacleNumber = obstacleNumber;
	this.trackLength = trackLength;

}

@Override
public String toString() {
	return "Беговая дорожка {" +
			       "дорожка №_ " + obstacleNumber +
			       " дистанция дорожки составляет: "
			       + trackLength + " m" + "};\n" ;
}

public static void main(String[] args) {

}

	@Override
	public boolean passed(Participants participant) {
		if (participant.run() > trackLength) {
			System.out.println("Участник " + participant + " успешно пробежал дистанцию");
			return true;
			} else {
			System.out.println("Участник " + participant + " не смог пробежать дистанцию " + trackLength);
			return false;
		}
	}
}
