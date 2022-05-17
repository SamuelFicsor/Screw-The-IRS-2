import java.util.ArrayList;
import java.util.Collections;

public class Deck
	{
	static ArrayList<Card> deck = new ArrayList<Card>();
	
	public static void fillDeck()
		{
		deck.add(new Front("Deduction ","Wild ", 5000));
		deck.add(new Front("Deduction ","Wild ", 5000));
		deck.add(new Front("Deduction ","Wild ", 5000));
		deck.add(new Front("Deduction ","Wild ", 5000));
		deck.add(new Front("Deduction ","Wild ", 5000));
		deck.add(new Front("Deduction ","Interest ", 5000));
		deck.add(new Front("Deduction ","Interest ", 5000));
		deck.add(new Front("Deduction ","Interest ", 5000));
		deck.add(new Front("Deduction ","Contributions ", 5000));
		deck.add(new Front("Deduction ","Medical ", 5000));
		deck.add(new Front("Deduction ","Wild ", 10000));
		deck.add(new Front("Deduction ","Wild ", 10000));
		deck.add(new Front("Deduction ","Wild ", 10000));
		deck.add(new Front("Deduction ","Wild ", 10000));
		deck.add(new Front("Deduction ","Wild ", 10000));
		deck.add(new Front("Deduction ","Interest ", 10000));
		deck.add(new Front("Deduction ","Interest ", 10000));
		deck.add(new Front("Deduction ","Interest ", 10000));
		deck.add(new Front("Deduction ","Contributions ", 10000));
		deck.add(new Front("Deduction ","Medical ", 10000));
		deck.add(new Front("Deduction ","Medical ", 10000));
		deck.add(new Front("Deduction ","Wild ", 30000));
		deck.add(new Front("Deduction ","Interest ", 30000));
		deck.add(new Front("Deduction ","Interest ", 30000));
		deck.add(new Front("Deduction ","Wild ", 60000));
		deck.add(new Front("Deduction ","Wild ", 60000));
		deck.add(new Front("Deduction ","Contributions ", 60000));
		deck.add(new Front("Deduction ","Wild ", 75000));
		deck.add(new Front("Deduction ","Wild ", 75000));
		deck.add(new Front("Deduction ","Interest ", 75000));
		deck.add(new Front("Deduction ","Contributions ", 75000));
		deck.add(new Front("Deduction ","Contributions ", 75000));
		deck.add(new Front("Deduction ","Wild ", 160000));
		deck.add(new Front("Deduction ","Wild ", 160000));
		deck.add(new Front("Deduction ","Wild ", 160000));
		deck.add(new Front("Deduction ","Interest ", 160000));
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
		deck.add(new Front("Substantiation ","Wild ", 5000));
		deck.add(new Front("Substantiation ","Wild ", 5000));
		deck.add(new Front("Substantiation ","Wild ", 5000));
		deck.add(new Front("Substantiation ","Wild ", 5000));
		deck.add(new Front("Substantiation ","Interest ", 5000));
		deck.add(new Front("Substantiation ","Interest ", 5000));
		deck.add(new Front("Substantiation ","Interest ", 5000));
		deck.add(new Front("Substantiation ","Contributions ", 5000));
		deck.add(new Front("Substantiation ","Medical ", 5000));
		deck.add(new Front("Substantiation ","Wild ", 10000));
		deck.add(new Front("Substantiation ","Wild ", 10000));
		deck.add(new Front("Substantiation ","Wild ", 10000));
		deck.add(new Front("Substantiation ","Wild ", 10000));
		deck.add(new Front("Substantiation ","Interest ", 10000));
		deck.add(new Front("Substantiation ","Interest ", 10000));
		deck.add(new Front("Substantiation ","Contributions ", 10000));
		deck.add(new Front("Substantiation ","Medical ", 10000));
		deck.add(new Front("Substantiation ","Wild ", 30000));
		deck.add(new Front("Substantiation ","Interest ", 30000));
		deck.add(new Front("Substantiation ","Interest ", 30000));
		deck.add(new Front("Substantiation ","Wild ", 60000));
		deck.add(new Front("Substantiation ","Wild ", 60000));
		deck.add(new Front("Substantiation ","Contributions ", 60000));
		deck.add(new Front("Substantiation ","Wild ", 75000));
		deck.add(new Front("Substantiation ","Wild ", 75000));
		deck.add(new Front("Substantiation ","Interest ", 75000));
		deck.add(new Front("Substantiation ","Contributions ", 75000));
		deck.add(new Front("Substantiation ","Contributions ", 75000));
		deck.add(new Front("Substantiation ","Wild ", 160000));
		deck.add(new Front("Substantiation ","Wild ", 160000));
		deck.add(new Front("Substantiation ","Wild ", 160000));
		deck.add(new Front("Substantiation ","Interest ", 160000));
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
				p.addHand(deck.get(0));
				deck.remove(0);
			}
		}
	}