package myCompetition;

import obstacles.AllObstacles;
import obstacles.Obstacles;
import theParticipants.*;

import java.util.*;

public class Competition {
private Obstacles[] arrAllObstacles;
private Participants[] arrAllParticipants;
private final String competitionTitle;

private List<Participants> ListOfWinners = new LinkedList<>();

public Competition(String competitionTitle) {
	this.competitionTitle = competitionTitle;
}

	public void setArrAllObstacles(Obstacles[] arrAllObstacles) {
		this.arrAllObstacles = arrAllObstacles;
	}
	public void setListOfWinners(List<Participants> listOfWinners) {
		ListOfWinners = listOfWinners;
	}
	public void setArrAllParticipants(Participants[] arrAllParticipants) {
		this.arrAllParticipants = arrAllParticipants;
	}

	private boolean passObstacles(Participants canRunAndJump){
		for (Obstacles obstacle: arrAllObstacles) {
			if (!obstacle.passed(( CanRunAndJump ) canRunAndJump)) {
				return false;
			}
			System.out.println();
		}
		return true;
	}
	public void startCompetition(){
		System.out.println("Начало соревнования " + competitionTitle);
		ListOfWinners.clear();
		for (Participants participant: arrAllParticipants) {
			boolean success = passObstacles(participant);
				if (!success) {
					System.out.println("Участник " + participant + " покинул испытание");
				} else {
					ListOfWinners.add(participant);
				}
			}
		}
}





