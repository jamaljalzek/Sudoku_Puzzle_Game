package programLogic;

import java.util.Arrays;

public class CheckUserCompletedPuzzle
{
	private static char [] [] solutionPuzzle;
	
	
	public static void passInAndMakeACopyOfCompletedPuzzleToRecordAsSolutionPuzzle(char [] [] solutionPuzzle)
	{
		CheckUserCompletedPuzzle.solutionPuzzle = new char [9] [9];
		for (int currentRow = 0; currentRow < 9; ++currentRow)
		{
			CheckUserCompletedPuzzle.solutionPuzzle [currentRow] = solutionPuzzle [currentRow].clone();
		}
	}
	
	
	public static boolean checkIfUserCompletedPuzzleMatchesSolutionPuzzle(char [] [] userCompletedPuzzle)
	{
		for (int currentRow = 0; currentRow < 9; ++currentRow)
		{
			if ( !Arrays.equals(userCompletedPuzzle [currentRow], solutionPuzzle [currentRow]) )
			{
				return false;
			}
		}
		return true;
	}

} // End of class.
