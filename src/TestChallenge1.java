import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import org.asl.karelx.Squarebot;


/**
 * Read and implement all of the TODO items in the main method, below.
 * 
 */
public class TestChallenge1 {
	// TODO Complete the provided Sentry class by implementing its patrol() method

	public static void main(String[] args) {
		// TODO Load a default map 
		Display.openWorld("");
		// TODO Create a Squarebot and have it place beepers at the corners of a rectangle
		//   	with bottom right corner at (9, 3) and sized for 5 beepers on each side (see picture)
		
		Squarebot rob = new Squarebot(9,3);
		
		for(int k = 0; k < 4; k++){
		rob.putBeeper();
		for(int i= 0; i < 5; i++){
			rob.move();
		}
		rob.turnLeft();
		}
		
		Sentry susan = new Sentry(4,3);
		susan.patrol();
		// TODO Create a Sentry and have it patrol clockwise around the beepers, indefinitely
	}

}
