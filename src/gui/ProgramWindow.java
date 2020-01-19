package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class ProgramWindow extends JFrame
{
	private static JFrame programWindow;
	
	
	public ProgramWindow()
	{
		ProgramWindow.programWindow = this;
		this.setTitle("Sudoku");
		this.setSize(500, 550);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	public static void loadNewScreen(JPanel screenToLoad)
	{
		clearProgramWindow();
		ProgramWindow.programWindow.add(screenToLoad);
		updateAppearanceOfProgramWindow();
	}
	
	
	private static void clearProgramWindow()
	{
		ProgramWindow.programWindow.getContentPane().removeAll();
	}
	
	
	private static void updateAppearanceOfProgramWindow()
	{
		ProgramWindow.programWindow.getContentPane().validate();
		ProgramWindow.programWindow.getContentPane().repaint();
	}
	
} // End of class.
