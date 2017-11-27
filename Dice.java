
public class Dice {
	public Dice() {
		
	}
	public int roll(String diceRoll) {
		String dice = diceRoll;
		int total = 0;
		if(dice.indexOf('+') != -1) {
			int index = dice.indexOf('+');
			total += roll(dice.substring(0, index));
		}
		else if(Integer.parseInt(dice.substring(0,dice.indexOf('d'))) > 1) {
			int amt = Integer.parseInt(dice.substring(0,dice.indexOf('d')));
			total += roll((amt-1)+dice.substring(dice.indexOf('d')));
		}
		total += (int)Math.random()*(Integer.parseInt(dice.substring(dice.indexOf('d')+1)))+1;
		return total;
	}
}
