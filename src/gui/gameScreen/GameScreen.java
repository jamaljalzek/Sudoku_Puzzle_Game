package gui.gameScreen;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import gui.gameScreen.displayBottomPanel.DisplayBottomPanel;
import gui.gameScreen.displayPuzzlePanel.DisplayPuzzlePanel;

public class GameScreen extends JPanel
{
	public GameScreen()
	{
		this.setLayout( new BoxLayout(this, BoxLayout.Y_AXIS) );
		this.add(new DisplayPuzzlePanel());
		this.add(new DisplayBottomPanel());
	}
	
} // End of class.
