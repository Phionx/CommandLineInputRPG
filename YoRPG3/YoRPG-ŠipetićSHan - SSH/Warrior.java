/*
ŠipetićSHan - SSH
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW28 -- Ye Olde Role Playing Game
2015-11-10
*/

public class Warrior extends Character {


public Warrior (){
this("Bob");

}
public Warrior (String foo){
super(100, 150, 20, 1, 1, "Warrior", foo);
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
	return "Warriors are swordwielders that travel by foot. They carry chainmail and a shield in addition to their sword. They are skilled at combatting other monsters and enemies, but not as skilled as the knight. Compared to the other classes, they happen to be the most well-rounded one. They have allegiance to only themselves as they travel the realms fighting monsters, other warriors, knights, and whoever stands in their path.";
}
}
