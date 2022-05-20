import java.util.ArrayList;
import java.util.Collections;

public class Deck
	{
	static ArrayList<Card> deck = new ArrayList<Card>();
	static ArrayList<Card> discard = new ArrayList<Card>();
	
	public static void fillDeck()
		{
		deck.add(new Deduction("Deduction ","Wild ", 5000, false));
		deck.add(new Deduction("Deduction ","Wild ", 5000, false));
		deck.add(new Deduction("Deduction ","Wild ", 5000, false));
		deck.add(new Deduction("Deduction ","Wild ", 5000, false));
		deck.add(new Deduction("Deduction ","Wild ", 5000, false));
		deck.add(new Deduction("Deduction ","Interest ", 5000, false));
		deck.add(new Deduction("Deduction ","Interest ", 5000, false));
		deck.add(new Deduction("Deduction ","Interest ", 5000, false));
		deck.add(new Deduction("Deduction ","Contributions ", 5000, false));
		deck.add(new Deduction("Deduction ","Medical ", 5000, false));
		deck.add(new Deduction("Deduction ","Wild ", 10000, false));
		deck.add(new Deduction("Deduction ","Wild ", 10000, false));
		deck.add(new Deduction("Deduction ","Wild ", 10000, false));
		deck.add(new Deduction("Deduction ","Wild ", 10000, false));
		deck.add(new Deduction("Deduction ","Wild ", 10000, false));
		deck.add(new Deduction("Deduction ","Interest ", 10000, false));
		deck.add(new Deduction("Deduction ","Interest ", 10000, false));
		deck.add(new Deduction("Deduction ","Interest ", 10000, false));
		deck.add(new Deduction("Deduction ","Contributions ", 10000, false));
		deck.add(new Deduction("Deduction ","Medical ", 10000, false));
		deck.add(new Deduction("Deduction ","Medical ", 10000, false));
		deck.add(new Deduction("Deduction ","Wild ", 30000, false));
		deck.add(new Deduction("Deduction ","Interest ", 30000, false));
		deck.add(new Deduction("Deduction ","Interest ", 30000, false));
		deck.add(new Deduction("Deduction ","Wild ", 60000, false));
		deck.add(new Deduction("Deduction ","Wild ", 60000, false));
		deck.add(new Deduction("Deduction ","Contributions ", 60000, false));
		deck.add(new Deduction("Deduction ","Wild ", 75000, false));
		deck.add(new Deduction("Deduction ","Wild ", 75000, false));
		deck.add(new Deduction("Deduction ","Interest ", 75000, false));
		deck.add(new Deduction("Deduction ","Contributions ", 75000, false));
		deck.add(new Deduction("Deduction ","Contributions ", 75000, false));
		deck.add(new Deduction("Deduction ","Wild ", 160000, false));
		deck.add(new Deduction("Deduction ","Wild ", 160000, false));
		deck.add(new Deduction("Deduction ","Wild ", 160000, false));
		deck.add(new Deduction("Deduction ","Interest ", 160000, false));
		deck.add(new BackTaxes("Back Taxes"));
		deck.add(new BackTaxes("Back Taxes"));
		deck.add(new BackTaxes("Back Taxes"));
		deck.add(new BackTaxes("Back Taxes"));
		deck.add(new BackTaxes("Back Taxes"));
		deck.add(new BackTaxes("Back Taxes"));
		deck.add(new BackTaxes("Back Taxes"));
		deck.add(new Audit("Audit"));
		deck.add(new Audit("Audit"));
		deck.add(new Audit("Audit"));
		deck.add(new Audit("Audit"));
		deck.add(new Audit("Audit"));
		deck.add(new Audit("Audit"));
		deck.add(new Audit("Audit"));
		deck.add(new Audit("Audit"));
		deck.add(new Salary("Salary", 25000));
		deck.add(new Salary("Salary", 25000));
		deck.add(new Salary("Salary", 50000));
		deck.add(new Salary("Salary", 50000));
		deck.add(new Salary("Salary", 100000));
		deck.add(new Salary("Salary", 100000));
		deck.add(new Salary("Salary", 150000));
		deck.add(new Salary("Salary", 150000));
		deck.add(new Salary("Salary", 200000));
		deck.add(new Salary("Salary", 200000));
		deck.add(new Screw("Screw the IRS"));
		deck.add(new Screw("Screw the IRS"));
		deck.add(new Screw("Screw the IRS"));
		deck.add(new Screw("Screw the IRS"));
		deck.add(new Screw("Screw the IRS"));
		deck.add(new Screw("Screw the IRS"));
		deck.add(new Screw("Screw the IRS"));
		deck.add(new Screw("Screw the IRS"));
		deck.add(new LoopHole("Loop Hole"));
		deck.add(new LoopHole("Loop Hole"));
		deck.add(new LoopHole("Loop Hole"));
		deck.add(new Substantiation("Substantiation ","Wild ", 5000));
		deck.add(new Substantiation("Substantiation ","Wild ", 5000));
		deck.add(new Substantiation("Substantiation ","Wild ", 5000));
		deck.add(new Substantiation("Substantiation ","Wild ", 5000));
		deck.add(new Substantiation("Substantiation ","Interest ", 5000));
		deck.add(new Substantiation("Substantiation ","Interest ", 5000));
		deck.add(new Substantiation("Substantiation ","Interest ", 5000));
		deck.add(new Substantiation("Substantiation ","Contributions ", 5000));
		deck.add(new Substantiation("Substantiation ","Medical ", 5000));
		deck.add(new Substantiation("Substantiation ","Wild ", 10000));
		deck.add(new Substantiation("Substantiation ","Wild ", 10000));
		deck.add(new Substantiation("Substantiation ","Wild ", 10000));
		deck.add(new Substantiation("Substantiation ","Wild ", 10000));
		deck.add(new Substantiation("Substantiation ","Interest ", 10000));
		deck.add(new Substantiation("Substantiation ","Interest ", 10000));
		deck.add(new Substantiation("Substantiation ","Contributions ", 10000));
		deck.add(new Substantiation("Substantiation ","Medical ", 10000));
		deck.add(new Substantiation("Substantiation ","Wild ", 30000));
		deck.add(new Substantiation("Substantiation ","Interest ", 30000));
		deck.add(new Substantiation("Substantiation ","Interest ", 30000));
		deck.add(new Substantiation("Substantiation ","Wild ", 60000));
		deck.add(new Substantiation("Substantiation ","Wild ", 60000));
		deck.add(new Substantiation("Substantiation ","Contributions ", 60000));
		deck.add(new Substantiation("Substantiation ","Wild ", 75000));
		deck.add(new Substantiation("Substantiation ","Wild ", 75000));
		deck.add(new Substantiation("Substantiation ","Interest ", 75000));
		deck.add(new Substantiation("Substantiation ","Contributions ", 75000));
		deck.add(new Substantiation("Substantiation ","Contributions ", 75000));
		deck.add(new Substantiation("Substantiation ","Wild ", 160000));
		deck.add(new Substantiation("Substantiation ","Wild ", 160000));
		deck.add(new Substantiation("Substantiation ","Wild ", 160000));
		deck.add(new Substantiation("Substantiation ","Interest ", 160000));
		}
	
	public static void shuffle()
		{
		Collections.shuffle(deck);
		}
	
	public static void deal()
		{
		for(int i = 0; i < 7; i++)
			for(Player p : Driver.players)
			{
				p.draw(deck.get(0));
				deck.remove(0);
			}
		
		discard.add(deck.get(0));
		deck.remove(0);
		}
	}