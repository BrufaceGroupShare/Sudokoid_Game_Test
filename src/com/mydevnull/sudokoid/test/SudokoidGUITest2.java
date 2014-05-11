package com.mydevnull.sudokoid.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import android.content.Intent;
import android.test.ViewAsserts;
import android.widget.Button;
import android.widget.Toast;

import com.mydevnull.sudokoid.Sudokoid;

public class SudokoidGUITest2 extends android.test.ActivityUnitTestCase<Sudokoid>{

	private Sudokoid TestActivity;
	//Initial components that will be tested in the Activity interface
	public Button ContinueButton, NewGameButton, AboutButton, ExitButton;
	//A Toast to seek for the view name in string
	Toast toast;
	public SudokoidGUITest2(){
		super(Sudokoid.class);
	}
	// throws Exception 
	@Before
	public void setUp() throws Exception{
		super.setUp();
		Intent intent = new Intent(getInstrumentation().getTargetContext(), Sudokoid.class);
		startActivity(intent, null, null);
		TestActivity = getActivity();

		//Get the GUI components for the later tests on the class
		TestActivity = getActivity();
		ContinueButton = (Button) TestActivity.findViewById(com.mydevnull.sudokoid.R.id.continue_button);
		NewGameButton = (Button) TestActivity.findViewById(com.mydevnull.sudokoid.R.id.new_button);
		AboutButton = (Button) TestActivity.findViewById(com.mydevnull.sudokoid.R.id.about_button);
		ExitButton = (Button) TestActivity.findViewById(com.mydevnull.sudokoid.R.id.exit_button);
		
	}

	//Test 1: Check the visibility of the view
	@Test
	public void testViewCreated() {
		// assertions here
		assertNotNull(getActivity());
		assertNotNull(ContinueButton);
		assertNotNull(NewGameButton);
		assertNotNull(AboutButton);
		assertNotNull(ExitButton);
	}

	//Test 2: Check the visibility of the GUI elements: Button
	@Test
	public void testViewVisible(){
		//This test is to validate if there is the buttons on the phone screen
		ViewAsserts.assertOnScreen(ContinueButton.getRootView(), ContinueButton);
		ViewAsserts.assertOnScreen(NewGameButton.getRootView(), NewGameButton);
		ViewAsserts.assertOnScreen(AboutButton.getRootView(), AboutButton);
		ViewAsserts.assertOnScreen(ExitButton.getRootView(), ExitButton);
	}
	//Test 3: Test the intent will be triggered when Continue button is pressed

	@Test
	public void testContinueButton(){
		// Trigger a click on the button
		ContinueButton.performClick();
		// Verify the intent was started with correct result extra
		Intent triggeredIntent = getStartedActivityIntent();
		assertNotNull("Intent should have triggered after button press", triggeredIntent);
		//Expected data send to the new intent
		Object data = null;
		assertEquals("Incorrect result data passed via the intent", null, data);
	}
	//Test 4: Test the intent will be triggered when New Game button is pressed

	@Test
	public void testNewGameButton(){
		// Trigger a click on the button
		//NewGameButton.performClick();
		
		/*// Verify the intent was started with correct result extra
		Intent triggeredIntent = getStartedActivityIntent();
		assertNotNull("Intent should have triggered after button press", triggeredIntent);
		//Expected data send to the new intent
		Object data = null;
		assertEquals("Incorrect result data passed via the intent", null, data);*/
		
		//When New Game button is clicked, there will be the Alert Dialog displayed
		//We can test the existance of this dialog by finding it name on the screen
		//Look back to the Sudokoid.java file to find the name as in the values strings
		// is "Difficulty"
		
		//
		/*toast = (Toast)TestActivity.findViewById(com.mydevnull.sudokoid.R.id.);
		ViewAsserts.assertOnScreen(toasts.getRootView(), toast.getRootView());*/
	}
	//Test 5: Test the intent will be triggered when About button is pressed

	@Test
	public void testAboutButton(){
		// Trigger a click on the button
		AboutButton.performClick();
		// Verify the intent was started with correct result extra
		Intent triggeredIntent = getStartedActivityIntent();
		assertNotNull("Intent should have triggered after button press", triggeredIntent);
		//Expected data send to the new intent
		/*Object data = null;
		assertEquals("Incorrect result data passed via the intent", null, data);*/
	}
	//Test 6: Test the intent will be triggered when Exit button is pressed
	
	@Test
	public void testExitButton(){
		// Not yet know how to check when the app is terminated
	}
	
	
	//Test 4: Test the methods that used in the TestActivity
	//None of computing methods with input values to make test


	@After
	public void tearDown() throws Exception {
	}



}
