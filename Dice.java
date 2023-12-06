

public class Dice
{
    Die6 die1 = new Die6();
    Die6 die2 = new Die6();
    
    public Dice() {
        this.roll();
    }

        /**
        * Getter for value
        * @return Die value
        */
    public int getValue() {
        return die1.getValue() + die2.getValue();
    }

    /**
    * Roll the die! Generate random number 1 <= x <= 6 and assign to value
    * Note that roll does NOT return the new value
    */
    public void roll() {
        die1.roll();
        die2.roll();
    }

    /**
    * Roll the die and return the new value
    * @return Die value
    */
    public int rollAndGetValue() {
        roll();
        return getValue();
    }

    
}
