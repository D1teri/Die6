

public class Dice
{
    private Die6 die1;
    private Die6 die2;
    
    private int value;
    
    public Dice() {
        this.Die6();
    }

        /**
        * Getter for value
        * @return Die value
        */
    public int getValue() {
        return value;
    }

    /**
    * Roll the die! Generate random number 1 <= x <= 6 and assign to value
    * Note that roll does NOT return the new value
    */
    public void roll() {
        this.value = die1 + die2;
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
