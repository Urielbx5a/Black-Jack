
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
    private int card3;
    private int card4;
    public hand(){
        total = 0;
        card1 = Hit();
        card2 = Hit();
        card3 = Hit();
        card4 = Hit();
    }
    public int Hit(){
        int card = (int)((Math.random() * 11) + 1);
        total += card;
        return card;
    }
}
