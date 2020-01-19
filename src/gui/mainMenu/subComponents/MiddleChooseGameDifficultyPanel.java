package gui.mainMenu.subComponents;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import programLogic.generateSudokuPuzzle.GenerateUncompletedPuzzle;

public class MiddleChooseGameDifficultyPanel extends JPanel
{
	private JPanel radioButtonsPanel;
	private JRadioButton easyMode, mediumMode, hardMode;
	
	
	public MiddleChooseGameDifficultyPanel()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		buildRadioButtonsPanel();
		this.add(radioButtonsPanel);
		easyMode.setSelected(true);
	}
	

	/**
	 * We wrap the radio buttons and labels inside a separate panel (radioButtonsPanel), then add that panel to this class instance.
	 * Wrapping the components in this panel both centers them, as well as prevents them from messing with the alignment of things
	 * outside of this class instance, such as the TopTextDisplayPanel that will be added.
	 */
	private void buildRadioButtonsPanel()
	{
		radioButtonsPanel = new JPanel();
		radioButtonsPanel.setLayout(new BoxLayout(radioButtonsPanel, BoxLayout.Y_AXIS));
		addEasyModeRadioButtonAndDescription();
		radioButtonsPanel.add(Box.createVerticalGlue());
		addMediumModeRadioButtonAndDescription();
		radioButtonsPanel.add(Box.createVerticalGlue());
		addHardModeRadioButtonAndDescription();
	}

	
	private void addEasyModeRadioButtonAndDescription()
	{
		easyMode = new JRadioButton("EASY MODE");
		easyMode.addItemListener(new RadioButtonListener());
		radioButtonsPanel.add(easyMode);
		radioButtonsPanel.add(new JLabel("has 1 randomly missing spot in each row."));
	}
	
	
	private void addMediumModeRadioButtonAndDescription()
	{
		mediumMode = new JRadioButton("MEDIUM MODE");
		mediumMode.addItemListener(new RadioButtonListener());
		radioButtonsPanel.add(mediumMode);
		radioButtonsPanel.add(new JLabel("has up to 2 randomly missing spots in each row."));
	}


	private void addHardModeRadioButtonAndDescription()
	{
		hardMode = new JRadioButton("HARD MODE");
		hardMode.addItemListener(new RadioButtonListener());
		radioButtonsPanel.add(hardMode);
		radioButtonsPanel.add(new JLabel("has up to 3 randomly missing spots in each row."));
	}

	
	private class RadioButtonListener implements ItemListener
	{
		private JRadioButton stateChangedRadioButton;
		
		
		@Override
		public void itemStateChanged(ItemEvent event)
		{
			stateChangedRadioButton = (JRadioButton) event.getItem();
			if (stateChangedRadioButton.isSelected())
			{
				determineGameDifficultySelected();
				unselectOtherRadioButtons();
			}
		}


		private void determineGameDifficultySelected()
		{
			if (stateChangedRadioButton == easyMode)
			{
				GenerateUncompletedPuzzle.setNumberOfSpotsToRemove(1);
			}
			else if (stateChangedRadioButton == mediumMode)
			{
				GenerateUncompletedPuzzle.setNumberOfSpotsToRemove(2);
			}
			else // stateChangedRadioButton == hardMode
			{
				GenerateUncompletedPuzzle.setNumberOfSpotsToRemove(3);
			}
		}
		
		
		private void unselectOtherRadioButtons()
		{
			if (stateChangedRadioButton == easyMode)
			{
				mediumMode.setSelected(false);
				hardMode.setSelected(false);
			}
			else if (stateChangedRadioButton == mediumMode)
			{
				easyMode.setSelected(false);
				hardMode.setSelected(false);
			}
			else // stateChangedRadioButton == hardMode
			{
				easyMode.setSelected(false);
				mediumMode.setSelected(false);
			}
		}
		
	} // End of nested class.
	
} // End of class.
