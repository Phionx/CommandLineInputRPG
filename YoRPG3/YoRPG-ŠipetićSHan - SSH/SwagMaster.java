/*
ŠipetićSHan - SSH
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class SwagMaster extends Character {
private int swag;


public SwagMaster (){
this("Bob");
swag = 0;
}
public SwagMaster (String foo){
super(100, 150, 20, 1, 1, "Swagmaster",  foo);
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
	return "A Swagmaster is someone who has so much swag that it is almost unbearable, they have the greatest amount of swagger possible to mankind, and it is very rare to see one. IF you do happen to come across a swagmaster, be respectful!! if you arent, him&his possy will overpower you with their swag. and you dont want that to happen. And also he has a swag variable that is always set to 100, except in the case that he gets out-swagged, in which case he ceases to exist. ";
}
}
