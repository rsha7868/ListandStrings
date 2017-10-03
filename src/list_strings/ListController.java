package list_strings;
import java.util.List;
import java.util.ArrayList;
import tools.model.Kahoot;
import tools.view.Display;
public class ListController
{
	private List<Kahoot> myKahoots;
	private Display popup;
	public ListController()
	{
		myKahoot = new ArrayList<Kahoot>();
		popup = new Display();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
		fillTheList();
		showTheList();
	}
	
	private void fillTheList()
	{
		Kahoot TenWaysToDie = new Kahoot("Ryan", 10);
		myKahoot.add(TenWaysToDie);
	}
	private void showTheList()
	{
		for (int index = 0; index < myKahoot.size();index += 1)
		{
			popup.displayText(myKahoots.get(index));
		}
	}
}
