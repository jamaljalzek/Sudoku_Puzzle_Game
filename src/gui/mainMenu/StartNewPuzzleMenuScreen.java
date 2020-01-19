package gui.mainMenu;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import gui.mainMenu.subComponents.BottomButtonsPanel;
import gui.mainMenu.subComponents.MiddleChooseGameDifficultyPanel;
import gui.mainMenu.subComponents.TopTextDisplayPanel;

public class StartNewPuzzleMenuScreen extends JPanel
{
	public StartNewPuzzleMenuScreen()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.add(Box.createVerticalGlue());
		this.add(new TopTextDisplayPanel());
		this.add(Box.createVerticalGlue());
		this.add(new MiddleChooseGameDifficultyPanel());
		this.add(Box.createVerticalGlue());
		this.add(new BottomButtonsPanel());
		this.add(Box.createVerticalGlue());
	}

} // End of class.
