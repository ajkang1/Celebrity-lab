import java.util.ArrayList;

/**
 * The framework for the Celebrity Game project
 * 
 * @author cody.henrichsen
 * @version 2.3 25/09/2018 refactored the prepareGame and play methods
 */
public class CelebrityGame
{
	/**
	 * A reference to a Celebrity or subclass instance.
	 */
	private Celebrity gameCelebrity; // current celeb to guess

	/**
	 * The GUI frame for the Celebrity game.
	 */
	private CelebrityFrame gameWindow;

	/**
	 * The ArrayList of Celebrity values that make up the game
	 */
	private ArrayList<Celebrity> allCelebs;

	/**
	 * Builds the game and starts the GUI
	 */
	public CelebrityGame()
	{
		// initialize the array list
		allCelebs = new ArrayList<Celebrity>();
		gameWindow = new CelebrityFrame(this);
	}

	/**
	 * Prepares the game to start by re-initializing the celebGameList and having the gameFrame open the start screen.
	 */
	public void prepareGame()
	{
		allCelebs = new ArrayList<Celebrity>();
		gameWindow.replaceScreen("Start Game");
		
	}

	/**
	 * Determines if the supplied guess is correct.
	 * 
	 * @param guess
	 *            The supplied String
	 * @return Whether it matches regardless of case or extraneous external
	 *         spaces.
	 */
	public boolean processGuess(String guess)
	{
		//use the Celebrity instance var to check if their guess is correct
		
		//if successful, the Celebrity should be removed from the list
		//where it was pulled from the "front" of the list
		if(guess.toLowerCase().trim().equals(gameCelebrity.getAnswer().toLowerCase().trim())) {
			
			//remove at index 0 from the list
			this.allCelebs.remove(0); //removes object at index 0
			
			//if the list is NOT empty, assign a new celebrity
			//else assign an empty celebrity object (empty strings for the answer and clue)
			if(allCelebs.size() > 0) {
				//assign new celebrity to guess
				gameCelebrity = allCelebs.get(0);
			}else {
				//out of celebrities, just set it to a "blank" Celebrity object
				gameCelebrity = new Celebrity("", ""); //out of clues
			}
			
			//return true inside here since it was a correct guess
			return true; //method is non-void! should return true/false correctly
			
		}
		return false;
	}

	/**
	 * Asserts that the list is initialized and contains at least one Celebrity.
	 * Sets the current celebrity as the first item in the list. Opens the game
	 * play screen.
	 */
	public void play()
	{
		
		if(this.gameCelebrity != null && this.allCelebs.size() > 0) { // check if list is not empty, check that the current celebrity is not null
			
			// set the celebrity to be the first one in the list
			this.gameCelebrity = this.allCelebs.get(0); //from front of list
			
			//(given) - start the game
			gameWindow.replaceScreen("GAME");
			
		} // otherwise not ready to play
			
	}

	/**
	 * Adds a Celebrity of specified type to the game list
	 * 
	 * @param name
	 *            The name of the celebrity
	 * @param guess
	 *            The clue(s) for the celebrity
	 * @param type
	 *            What type of celebrity
	 */
	public void addCelebrity(String name, String guess, String type)
	{
		
	}

	/**
	 * Validates the name of the celebrity. It must have at least 4 characters.
	 * @param name The name of the Celebrity
	 * @return If the supplied Celebrity is valid
	 */
	public boolean validateCelebrity(String name)
	{
		return false;
	}

	/**
	 * Checks that the supplied clue has at least 10 characters or is a series of clues
	 * This method would be expanded based on your subclass of Celebrity.
	 * @param clue The text of the clue(s)
	 * @param type Supports a subclass of Celebrity 
	 * @return If the clue is valid.
	 */
	public boolean validateClue(String clue, String type)
	{
		return false;
	}

	/**
	 * Accessor method for the current size of the list of celebrities
	 * 
	 * @return Remaining number of celebrities
	 */
	public int getCelebrityGameSize()
	{
		return 0;
	}

	/**
	 * Accessor method for the games clue to maintain low coupling between
	 * classes
	 * 
	 * @return The String clue from the current celebrity.
	 */
	public String sendClue()
	{
		return null;
	}

	/**
	 * Accessor method for the games answer to maintain low coupling between
	 * classes
	 * 
	 * @return The String answer from the current celebrity.
	 */
	public String sendAnswer()
	{
		return null;
	}
}
