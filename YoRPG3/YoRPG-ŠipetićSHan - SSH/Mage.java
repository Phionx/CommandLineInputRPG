/*
ŠipetićSHan - SSH
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Mage extends Character {
private int [] goods;

public Mage (){
this("Bob");
}
public Mage (String foo){
super(100, 150, 20, 1, 1, "Mage",  foo);
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
	return "The magicks are strong in these young-uns.";

}}
