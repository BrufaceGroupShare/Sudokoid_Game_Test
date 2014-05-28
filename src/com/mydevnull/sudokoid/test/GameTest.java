package com.mydevnull.sudokoid.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import android.content.Intent;
import android.test.ViewAsserts;

import com.mydevnull.sudokoid.Game;
import com.mydevnull.sudokoid.PuzzleView;
import com.mydevnull.sudokoid.Sudokoid;

public class GameTest extends android.test.ActivityUnitTestCase<Game>{

	private Game TestActivity;
	
	public GameTest() {
		super(Game.class);		
	}

	@Before
	public void setUp() throws Exception {
		super.setUp();
		
		Intent intent = new Intent(getInstrumentation().getTargetContext(), Game.class);
		startActivity(intent, null, null);
		TestActivity = getActivity();
		//Define a game pattern for later use in the test
				/*
				 * This pattern hold all values of all 9x9 tiles/cells in the game board in a
				 * two dimensional array "usedtest"
				*/
				final int used[][] = new int[9][9];
				//Assign values to pattern
				//This is done manually for 36 tiles and follow the easy level puzzle pattern
				//as bellow
				/*
				360	000	000
		        004	230	800
		        000	004	200
		        
		        070	460	003
		        820	000	014
		        500	013	020
		        
		        001	900	000
		        007	048	300
		        000	000	045
				 * 
				 */
				
				/*
				 * 360	000	000
		         * 004	230	800
		         * 000	004	200
		        */
				used[0][0] = 3;
				used[0][1] = 6;
				used[0][2] = 0;
				used[0][3] = 0;
				used[0][4] = 0;
				used[0][5] = 0;
				used[0][6] = 0;
				used[0][7] = 0;
				used[0][8] = 0;
				
				used[1][0] = 0;
				used[1][1] = 0;
				used[1][2] = 4;
				used[1][3] = 2;
				used[1][4] = 3;
				used[1][5] = 0;
				used[1][6] = 8;
				used[1][7] = 0;
				used[1][8] = 0;
				
				used[2][0] = 0;
				used[2][1] = 0;
				used[2][2] = 0;
				used[2][3] = 0;
				used[2][4] = 0;
				used[2][5] = 4;
				used[2][6] = 2;
				used[2][7] = 0;
				used[2][8] = 0;
				/*
				 * 070	460	003
		         * 820	000	014
		         * 500	013	020
		        */
				used[3][0] = 0;
				used[3][1] = 7;
				used[3][2] = 0;
				used[3][3] = 4;
				used[3][4] = 6;
				used[3][5] = 0;
				used[3][6] = 0;
				used[3][7] = 0;
				used[3][8] = 3;
				
				used[4][0] = 8;
				used[4][1] = 2;
				used[4][2] = 0;
				used[4][3] = 0;
				used[4][4] = 0;
				used[4][5] = 0;
				used[4][6] = 0;
				used[4][7] = 1;
				used[4][8] = 4;
				
				used[5][0] = 5;
				used[5][1] = 0;
				used[5][2] = 0;
				used[5][3] = 0;
				used[5][4] = 1;
				used[5][5] = 3;
				used[5][6] = 0;
				used[5][7] = 2;
				used[5][8] = 0;
				/*
				 * 001	900	000
		         * 007	048	300
		         * 000	000	045
		        */
				used[6][0] = 0;
				used[6][1] = 0;
				used[6][2] = 1;
				used[6][3] = 9;
				used[6][4] = 0;
				used[6][5] = 0;
				used[6][6] = 0;
				used[6][7] = 0;
				used[6][8] = 0;
				
				used[7][0] = 0;
				used[7][1] = 0;
				used[7][2] = 7;
				used[7][3] = 0;
				used[7][4] = 4;
				used[7][5] = 8;
				used[7][6] = 3;
				used[7][7] = 0;
				used[7][8] = 0;
				
				used[8][0] = 0;
				used[8][1] = 0;
				used[8][2] = 0;
				used[8][3] = 0;
				used[8][4] = 0;
				used[8][5] = 0;
				used[8][6] = 0;
				used[8][7] = 4;
				used[8][8] = 5;
				
				//Set variable to initiate the puzzle GUI
				final String KEY_DIFFICULTY = "com.mydevnull.sudokoid.difficulty";

			    final int DIFFICULTY_EASY   = 0;
			    final int DIFFICULTY_MEDIUM = 1;
			    final int DIFFICULTY_HARD   = 2;

			    int puzzle[];

			    PuzzleView puzzleView;

			    final String PREF_PUZZLE = "puzzle";

			    final int DIFFICULTY_CONTINUE = -1;
				
	}

	private Object getIntent() {
		// TODO Auto-generated method stub
		return null;
	}

	@After
	public void tearDown() throws Exception {
	}
	
	//howKeyPadOrError test series
	
	/*
	 * Function of function
	 */
	
	/*
	 * Test strategy
	 */
	
	@Test
	public void testshowKeyPadOrError_test1() {
		//This function has responsible of displaying the keypad for number selection
		//to fill in the tile
		
		//The keypad only be shown when the player press on the valid tile. 
		//Valid tile means the empty tile with zero in displayed value
		//In case of pressing any of filled tiles, there will be a broadcast notification
		
		//The purpose of the test is test to pass approach.
		//The test is performed first by find a empty tile on the game board,
		//acquire its relative position and check the presence of the keypad.
		
		//Selected tile: Equal to tile at (1,3) = 0	
		
	}
	@Test
	public void testshowKeyPadOrError_test2() {
		//This function has responsible of displaying the keypad for number selection
		//to fill in the tile
		
		//The keypad only be shown when the player press on the valid tile. 
		//Valid tile means the empty tile with zero in displayed value
		//In case of pressing any of filled tiles, there will be a broadcast notification
		
		//The purpose of the test is test to pass approach.
		//The test is performed first by find a filled tile on the game board,
		//acquire its relative position and check the presence of the toast.
		
		//int x = 1,y=3;
		//Call the function
		//TestActivity.showKeypadOrError(x, y);
		//assertEqual(TestActivity.toast.getView().isShown(), true);//Check the appearance of the pad
		
	}
	
	//setTileIfValid function test series at tile (4,3) with valid value of 9
	
	/*
	 * Function of function:
	The function has responsibility of checking the entered number from user and
	and check if the inserted value valid for the tile or not.
	Validity means the value was not already exits and follow the game rule for
	the selected tile
	In the test, the selected tile is the empty tile at coordinate (4,3) on the grid
	The correct value for the tile is 9
	*/
	/*
	 * Test strategy:
	We first test whether the inserted 9 give us the true response as output of function
	Later on, we try to test to ensure that the function give the false response to
	input as
		* Give a wrong Integer value for the tile
		* Greater than 9 value for the tile
	*/
	
	@Test
	public void testsetTileIfValid_test1(){
		//Test strategy 1: Check if function give true response with correct value
		
		int x =4, y =3, value= 9;
		boolean returned = TestActivity.setTileIfValid(x, y, value);
		boolean expected = true;
		
		assertEquals(expected, returned);
		
	}
	@Test
	public void testsetTileIfValid_test2(){
		//Test strategy 2: Give the wrong value but still in Integer 
		
		int x =3, y =2, value= 4;
		boolean returned = TestActivity.setTileIfValid(x, y, value);
		boolean expected = false;
		
		assertEquals(returned, expected);
		
	}
	@Test
	public void testsetTileIfValid_test3(){
		//Test strategy 3: Greater than 9
		
		//Even when enter the higher value than 9 into the tile, the function still 
		//give the true response
		//However we dont have to concern for this case because the input values
		// are tied to the inputPad where there are only numbers lesser than
		//9
		
		int x =3, y =2, value = 18;
		boolean returned = TestActivity.setTileIfValid(x, y, value);
		boolean expected = false;
		
		assertEquals(returned, expected);
		// The test failed due to out of bound value
		
	}
	
	//calculateUsedTilesInPosition test series
	
	/*Function of the function:
	 * A tile contains the cell at location (x,y) will be evaluated to extract
	 * the used numbers in the tile as later the reference to verify the input 
	 * value
	 * 
	 */
	
	/*
	 * Test strategy:
	 * Give a x,y of a cell in a tile with known initialed values
	 * Scan all the outputs as collection test
	 * The output is not a single value but a collection and the treatment to this
	 * type of output is different
	 */
	@Test
	public void testcalculateUsedTilesInPosition_test1(){
			
		
	}
	

}
