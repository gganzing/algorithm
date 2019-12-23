package leetcode_easy;

//	상하좌우로 움직인 후, 이동 전 처음 지점으로 돌아오는지 판단
//	There is a robot starting at position (0, 0), the origin, on a 2D plane. 
//	Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
//	
//	The move sequence is represented by a string, and the character moves[i] represents its move. 
//	Valid moves are R (right), L (left), U (up), and D (down). 
//	If the robot returns to the origin after it finishes all of its moves, return true. 
//	Otherwise, return false.
//
//	The way that the robot is "facing" is irrelevant. 
//	"R" will always make the robot move to the right once, 
//	"L" will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.


public class RobotReturnToOrigin {

	public static boolean judgeCircle(String moves) {
        
		int ud = 0;
		int lf = 0;
		
		for(int i=0; i<moves.length(); i++) {
			char move = moves.charAt(i);
			switch(move) {
				case 'U': ud++; break;
				case 'D': ud--; break;
				case 'L': lf++; break;
				case 'R': lf--; break;
			}
		}
        
        return ud == 0 && lf == 0;
    }
	
	
	public static void main(String[] args) {
		
//		String moves = "UD";
		String moves = "LL";
		System.out.println(judgeCircle(moves));
		
	}
	
}
