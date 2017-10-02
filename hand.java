
/**
 * Write a description of class Hand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hand
{
    private int total;
    private int card1;
    private int card2;
    public hand(){
        total = 0;
        card1 = Hit();
        card2 = Hit();
 
    }
    
    public int Hit(){
        int card = (int)((Math.random() * 11) + 1);
        total += card;
        return card;
    }
    
    public int getTotal(){
        return total;
    }
    
    public int getCard1(){
        return card1;
    }
    
    public int getCard2(){
        return card2;
    }
}
