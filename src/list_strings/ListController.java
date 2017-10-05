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
		
		Kahoot TenWaysToDie = new Kahoot("Ryan", 10, "The Ten Ways to Die");
		
		
	}
	private void showTheList()
	{
		String currentCreator"";
		for (int index = 0; index < myKahoot.size();index += 1)
		{
			currentCreator = myKahoot.get(index);
			String creator = currentKahoot.getCreator();
			popup.displayText(myKahoots.get(index));
			
			
			if (currentCreator.equals("nobody"))
			{
				for (int loop = 0; loop < 5; loop+= 1)
				{
					popup.displayText("wow nobody does a lot");
				}
			}
		}
		for (int currentLetterIndex = 0; currentLetterIndex < currentCreator.length(); currentLetterIndex +=1)
		{
			popup.DisplayText(currentCreator.substring(currentLetterIndex,  currentLetterIndex + 1));
		}
	}
}
