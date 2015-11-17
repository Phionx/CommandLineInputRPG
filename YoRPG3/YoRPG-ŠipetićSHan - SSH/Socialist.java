/*
ŠipetićSHan - SSH
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Socialist extends Character {
private int [] critiques;

public Socialist (){
this("Bob");
}
public Socialist (String foo){
super(100, 150, 20, 1, 1, "Socialist", foo);
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
	return "Socialist is the good guy, representing the fight against the capitalists in theory and for realsies. Your job will be to critisize and ridicule capitalists. You will also have the option of physically assaulting capitalists, which will result in a sentence in prison of which the length will be determined by the amount of monies the capitalist has to pay lawyers with. In this case, the game will become more of a don't-die-in-prison type thing. The alternative, to peacefully engage capitalists will involve hurting their feelings and helping Bernie Sanders in his campaign.";
    }
}
