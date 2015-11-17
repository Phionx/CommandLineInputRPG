/*
ŠipetićSHan - SSH
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public class Cook extends Character {
private String [] Ingredients_Bag;
private String [] Utensils;

public Cook (){
this("Bob");
}
public Cook (String foo){
super(100, 150, 20, 1, 1, "Cook", foo);
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
	return "Boringest character ever. Cooks stuff. Has Ingredients and Utensils.";
    }

}
