/*
  ŠipetićSHan - SSH
  Shantanu Jha, Aleksandar Šipetić;
  APCS1 pd5
  HW30 -- Ye Olde Role Playing Game, Expanded
  2015-11-15
*/

public class Capitalist extends Character {
    private int [] monies;
    private int [] greed;

    public Capitalist (){
	this("Bob");
    }
    public Capitalist (String foo){
	super(100, 150, 20, 1, 1, "Capitalist", foo);
    }

    public void normalize (){
	super.defense = super.base_defense;
	super.attack = super.base_attack;
    }

    public void specialize(){
	super.defense--;
	super.attack++;
    }

    public String about(){
	return "Capitalist is the evilest class type in the game. Choose this only if you hate the Earth and wish to enforce every sort of oppression upon it. Or if you're greedy. Capitalists have the extra variables of monies and greed (which is set to 100). If you choose this class you will be constantly critisized and ridiculed for your evils by socialists around you.";
    }
}
