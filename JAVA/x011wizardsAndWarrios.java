package JAVA;

public class x011wizardsAndWarrios {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(x011wizardsAndWarrios fighter) {
        return 1;
    }
    
}

class Warrior extends x011wizardsAndWarrios {
    
    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(x011wizardsAndWarrios fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends x011wizardsAndWarrios {
    boolean spellPrepared = false;
    
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        spellPrepared = true;
    }

    @Override
    public boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    public int getDamagePoints(x011wizardsAndWarrios fighter) {
        return spellPrepared ? 12 : 3;
    }
}

/*
In this exercise you're playing a role-playing game where different types of fighters can combat each other. The game has different rules for each type of fighter. We are going to focus on two specific types: Wizards and Warriors.

For a Warrior, these are the rules:

    A Warrior is never vulnerable.
    A Warrior deals 6 points of damage if the fighter they are attacking is not vulnerable.
    A Warrior deals 10 points of damage if the fighter they are attacking is vulnerable.

For a Wizard, these are the rules:

    A Wizard can prepare a spell in advance.
    A Wizard is vulnerable unless they have prepared a spell in advance.
    A Wizard deals 12 points of damage if they prepared a spell in advance.
    A Wizard deals 3 points of damage if they did not prepare a spell in advance.

1. Create a new class called Warrior. This class should inherit from the existing Fighter class.

2. Update the Warrior class so that its toString() method describes what kind of fighter they are. The method should return the string "Fighter is a Warrior".

3. Update the Warrior class so that its isVulnerable() method always returns false.

4. Update the Warrior class so that its getDamagePoints(Fighter) method calculates the damage dealt by a Warrior according to the rules above.

5. Create another new class called Wizard. This class should also inherit from the existing Fighter class.

6. Update the Wizard class so that its toString() method describes what kind of fighter they are. The method should return the string "Fighter is a Wizard".

7. Update the Wizard class to add a method called prepareSpell(). The class should remember when this method is called, and make sure that its isVulnerable() method returns false only when a spell is prepared.

8. Update the Wizard class so that its getDamagePoints(Fighter) method calculates the damage dealt by a Wizard according to the rules above.
 */