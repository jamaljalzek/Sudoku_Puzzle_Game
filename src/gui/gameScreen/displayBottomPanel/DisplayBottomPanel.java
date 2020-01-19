package gui.gameScreen.displayBottomPanel;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import gui.gameScreen.displayBottomPanel.subComponents.DisplayButtonsPanel;
import gui.gameScreen.displayBottomPanel.subComponents.DisplayGameMessageLabel;
import gui.gameScreen.displayBottomPanel.subComponents.DisplayNumberOfUserMovesMadeLabel;

public class DisplayBottomPanel extends JPanel
{
	public DisplayBottomPanel()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS) );
		this.add(Box.createHorizontalGlue());
		this.add(new DisplayNumberOfUserMovesMadeLabel());
		this.add(Box.createHorizontalGlue());
		this.add(new DisplayButtonsPanel());
		this.add(Box.createHorizontalGlue());
		this.add(new DisplayGameMessageLabel());
		this.add(Box.createHorizontalGlue());
	}

} // End of class.
