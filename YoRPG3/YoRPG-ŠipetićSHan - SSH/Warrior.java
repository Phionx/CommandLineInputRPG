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

}
