

public class Yahtzee
{
    Die6 die1 = new Die6();
    Die6 die2 = new Die6();
    Die6 die3 = new Die6();
    Die6 die4 = new Die6();
    Die6 die5 = new Die6();
    
    int d1 = 0;
    int d2 = 0;
    int d3 = 0;
    int d4 = 0;
    int d5 = 0;
    int d6 = 0;
    
    private Die6[] dice = {die1, die2, die3, die4, die5};
    
    public Yahtzee() {
        this.roll();
    }

    /**
    * Roll the die! Generate random number 1 <= x <= 6 and assign to value
    * Note that roll does NOT return the new value
    */
    public void roll() {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }
    
    public void roll(int dieNumber){
        dice[dieNumber].roll();
    }
    
    public void summarize() {
        
        for(int i=5; i < 0; i--){
            if(dice[i].getValue() == 1) d1=+1;
            if(dice[i].getValue() == 2) d2=+1;
            if(dice[i].getValue() == 3) d3=+1;
            if(dice[i].getValue() == 4) d4=+1;
            if(dice[i].getValue() == 5) d5=+1;
            if(dice[i].getValue() == 6) d6=+1;
        }
        
        System.out.println("1-" + d1 + "; " + "2-" + d2 + "; " + "3-" + d3 + "; " 
        + "4-" + d4 + "; " + "5-" + d5 + "; " + "6-" + d6);
        return;
    }

    /**
    * Roll the die and return the new value
    * @return Die value
    */
    public void rollAndGetValue() {
        roll();
        summarize();
    }

    
}
