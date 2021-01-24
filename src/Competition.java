import obstacles.AllObstacles;
import obstacles.Obstacles;
import theParticipants.CanRunAndJump;
import theParticipants.Participants;

import java.util.LinkedList;
import java.util.List;


public class Competition {
private AllObstacles[] arrAllObstacles;
private CanRunAndJump[] arrParticipants;
private final String competitionTitle;

private List<Participants> lastWinners = new LinkedList<>();

public Competition(String competitionTitle) {
		this.competitionTitle = competitionTitle;
	}
	public void setArrAllObstacles(AllObstacles...arrAllObstacles){
		this.arrAllObstacles = arrAllObstacles;
	}
	public void setArrParticipants(CanRunAndJump...arrParticipants){
		this.arrParticipants =arrParticipants;
	}
	private boolean passAllObstacles(CanRunAndJump canRunAndJump){
		for (Obstacles obstacles: arrParticipants) {
			if (!obstacles.passed(canRunAndJump)) {
				return false;
			}
		}
		return true;
	}
	public void startCompetition() {
		System.out.println("Начало соревнования " + competitionTitle);
		lastWinners.clear();
		for (CanRunAndJump canRunAndJump: arrParticipants) {
			boolean success = passAllObstacles(canRunAndJump);
			if (!success){
				System.out.println("Участник " + canRunAndJump + " покинул испытание");
			} else {
				lastWinners.add((Participants) canRunAndJump);
			}
		}
	}
	public List<Participants> getLastWinners(){
	return lastWinners;
	}

	public AllObstacles[] getArrAllObstacles() {
		return arrAllObstacles;
	}
}





