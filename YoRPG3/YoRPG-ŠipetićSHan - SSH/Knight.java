/*
ŠipetićSHan - SSH
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Knight extends Character {
private int [] weapons;

public Knight (){
this("Bob");
}
public Knight (String foo){
super(100, 150, 20, 1, 1, "Knight", foo);
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
	return "Knights are extremely skilled warriors hand picked by his majesty himself. While they have higher stats than a warrior and a horse to assist them in their travels, their main disadvantage is that they are bound to serve their majesty, and therefore have no free will whatsoever. They still get to, like, kill stuff though.";
    }
}
