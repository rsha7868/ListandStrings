package tools.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tools.controller.Controller;
import tools.view.PopupDisplay;
import tools.model.Kahoot;

public class ControllerTest
{
	private Controller tested;

	@Before
	public void setUp() throws Exception
	{
		tested = new Controller();
	}

	@After
	public void tearDown() throws Exception
	{
		tested = null;
	}

	@Test
	public void testController()
	{
		assertNotNull("Popup not initialized.", tested.getPopup());
		assertNotNull("ArrayList of Kahoot not initialized", tested.GetMyKahoots());
	}

	@Test
	public void testStart()
	{
		tested.start();
		assertTrue("ArrayList of Kahoot is too short", tested.GetMyKahoots().size() > 3);
	}

	@Test
	public void testlist_view()
	{
		assertTrue("Popup type is incorrect", tested.getPopup() instanceof PopupDisplay);
	}

	@Test
	public void testGetMyKahoots()
	{
		assertTrue("ArrayList<Kahoot> expected", tested.GetMyKahoots() instanceof ArrayList<?>);

	}

}
