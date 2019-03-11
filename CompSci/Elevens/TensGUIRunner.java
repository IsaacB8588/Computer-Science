
/**
 * Write a description of class TensGUIRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TensGUIRunner
{
    /**
	 * Plays the GUI version of Thirteens.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		Board board = new TensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}
