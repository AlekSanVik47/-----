package theParticipants;

import obstacles.Obstacles;

public interface CanRunAndJump extends Obstacles {
	double run();
	double jump();

	@Override
	boolean passed(Participants participant);
}
