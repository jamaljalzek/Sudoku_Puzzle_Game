package programLogic;

import gui.ProgramWindow;
import gui.mainMenu.StartNewPuzzleMenuScreen;

public class StartHere
{
	public static void main(String [] args)
	{
		ProgramWindow programWindow = new ProgramWindow();
		programWindow.add(new StartNewPuzzleMenuScreen());
	}

} // End of class.
