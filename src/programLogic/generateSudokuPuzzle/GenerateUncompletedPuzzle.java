package programLogic.generateSudokuPuzzle;

import java.util.Random;

public class GenerateUncompletedPuzzle
{
	private static char [] [] uncompletedPuzzle;
	private static int numberOfSpotsToRemove;
	
	
	public static void setNumberOfSpotsToRemove(int numberOfSpotsToRemove)
	{
		GenerateUncompletedPuzzle.numberOfSpotsToRemove = numberOfSpotsToRemove;
	}


	public static char [] [] generateAndReturnNewUncompletedPuzzle()
	{
		uncompletedPuzzle = GenerateRandomizedCompletedPuzzle.generateAndReturnRandomizedPuzzle();
		randomlyRemoveSpotsInTheCompletedPuzzle();
		return uncompletedPuzzle;
	}


	private static void randomlyRemoveSpotsInTheCompletedPuzzle()
	{
		Random randomGenerator = new Random();
		for (int row = 0; row < 9; ++row)
		{
			for (int spotsRemoved = 0; spotsRemoved < numberOfSpotsToRemove; ++spotsRemoved)
			{
				int spotInRowToRemove = randomGenerator.nextInt(9);
				uncompletedPuzzle [row] [spotInRowToRemove] = 0;	// 0 is the ASCII code for the NULL character.
			}
		}
	}
	
} // End of class.
