package gui.gameScreen.displayPuzzlePanel;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

import gui.gameScreen.displayPuzzlePanel.subComponents.SudokuPuzzleCell;
import programLogic.generateSudokuPuzzle.GenerateUncompletedPuzzle;

public class DisplayPuzzlePanel extends JPanel
{
	private static DisplayPuzzlePanel displayPuzzlePanel;
	private static char [] [] sudokuPuzzle;
	private static JTextField [] [] visiblePuzzleBoard = new JTextField [9] [9];
	private int currentRow, currentColumn;
	
	
	public DisplayPuzzlePanel()
	{
		DisplayPuzzlePanel.displayPuzzlePanel = this;
		this.setLayout(new GridLayout(9, 9));
		displayNewUncompletedPuzzle();
	}
	
	
	public void displayNewUncompletedPuzzle()
	{
		sudokuPuzzle = GenerateUncompletedPuzzle.generateAndReturnNewUncompletedPuzzle();
		for (currentRow = 0; currentRow < 9; ++currentRow)
		{
			for (currentColumn = 0; currentColumn < 9; ++currentColumn)
			{
				addNewPuzzleCellMatchingCurrentSudokuPuzzleSpot();
			}
		}
	}
	
	
	private void addNewPuzzleCellMatchingCurrentSudokuPuzzleSpot()
	{
		char currentPuzzleSpot = sudokuPuzzle [currentRow] [currentColumn];
		SudokuPuzzleCell newPuzzleCell = new SudokuPuzzleCell(currentPuzzleSpot);
		visiblePuzzleBoard [currentRow] [currentColumn] = newPuzzleCell;
		this.add(newPuzzleCell);
	}
	
	
	@Override
	public void paint(Graphics graphics)
	{
		super.paint(graphics);
		drawPuzzleDividerLines(graphics);
	}
	
	
	private static void drawPuzzleDividerLines(Graphics graphics)
	{
		Graphics2D graphics2D = (Graphics2D) graphics;
		graphics2D.setStroke(new BasicStroke(5));	// Set the line width to 5 pixels.
		graphics2D.drawLine(5, 152, 477, 152);		// Draw the top horizontal line.
		graphics2D.drawLine(5, 306, 477, 306);		// Draw the bottom horizontal line.
		graphics2D.drawLine(161, 0, 161, 459);		// Draw the left vertical line.
		graphics2D.drawLine(320, 0, 320, 459);		// Draw the right vertical line.
	}
	
	
	/**
	 * Clicking on a JTextField may overlap one or more of the divider lines, so we repaint *just* the lines.
	 */
	public static void repaintPuzzleDividerLines()
	{
		Graphics displayPanelGraphics = DisplayPuzzlePanel.displayPuzzlePanel.getGraphics();
		drawPuzzleDividerLines(displayPanelGraphics);
	}
	
	
	public static JTextField [] [] returnVisiblePuzzleBoard()
	{
		return DisplayPuzzlePanel.visiblePuzzleBoard;
	}
	
} // End of class.
