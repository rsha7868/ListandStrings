package list_strings;
import java.util.List;
import java.util.ArrayList;
import tools.model.Kahoot;
import tools.view.Display;
public class ListController
{
	private List<Kahoot> myKahoots;
	private list_view.Display popup;
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
		Kahoot Hurtme = new Kahoot("Billy", 15, "HurtMe");
		myKahoots.add(TenWaysToDie);
		myKahoots.add(Hurtme);
		
	}
	private void showTheList()
	{
		String currentCreator"";
		for (int index = 0; index < myKahoots.size();index += 1)
		{
			currentCreator = myKahoots.get(index);
			String creator = currentKahoots.getCreator();
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
			popup.displayText(currentCreator.substring(currentLetterIndex,  currentLetterIndex + 1));
		}
		String topic = current.getTopic(0);
		
		for (int letter = currentKahoot.getTopic().length() - 1; letter >= 0 ; letter -= 1 )
		{
			popup.displayText(topic.substring(letter, letter + 1));
		}
	}
private void changeTheList()
{
	popup.displayText("Thee current list size is: " + myKahoots.size());
	Kahoot removed = myKahoots.remove(3);
	popup.displayText(" I remove the kahoot by " + removed.getCreator());
	popup.displayText("The list now has: + " mykahoots.size() + "items inside.");
	myKahoot.add(0,remove); 
	
	popup.displayText("The list is still: " + myKahoots.size() + " items big.");
	removed = myKahoot.set(2, new Kahoot());
	popup.dsiplayText("The kahoot by" + removed.getCreator() + " was replaced with on by: " +myKahoot.get(2).getCreator());
	
	
	}
private void BurnTheList()
{
	popup.displayText("Lets list the world: " + myKahoots.size());
	Kahoot removed = myKahoots.remove(0);
	popup.displayText("Waiting is fun..." + removed.getCreator());
	
	}
}