package programLogic.generateSudokuPuzzle;

public class GenerateCompletedSeedPuzzle
{
	public static char [] [] generateAndReturnSeedPuzzle()
	{
		char [] [] initiallyCompletedSeedPuzzle = new char [9] [9];
		initiallyCompletedSeedPuzzle [0] = new char [] {'3', '9', '1', '2', '8', '6', '5', '7', '4'};
		initiallyCompletedSeedPuzzle [1] = new char [] {'4', '8', '7', '3', '5', '9', '1', '2', '6'};
		initiallyCompletedSeedPuzzle [2] = new char [] {'6', '5', '2', '7', '1', '4', '8', '3', '9'};
		initiallyCompletedSeedPuzzle [3] = new char [] {'8', '7', '5', '4', '3', '1', '6', '9', '2'};
		initiallyCompletedSeedPuzzle [4] = new char [] {'2', '1', '3', '9', '6', '7', '4', '8', '5'};
		initiallyCompletedSeedPuzzle [5] = new char [] {'9', '6', '4', '5', '2', '8', '7', '1', '3'};
		initiallyCompletedSeedPuzzle [6] = new char [] {'1', '4', '9', '6', '7', '3', '2', '5', '8'};
		initiallyCompletedSeedPuzzle [7] = new char [] {'5', '3', '8', '1', '4', '2', '9', '6', '7'};
		initiallyCompletedSeedPuzzle [8] = new char [] {'7', '2', '6', '8', '9', '5', '3', '4', '1'};
		return initiallyCompletedSeedPuzzle;
	}

} // End of class.
