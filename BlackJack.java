
/**
 * Write a description of class BlackJack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.Math;
public class BlackJack{
    int handNum = 2;
    double firstCard= Math.random();
    int card1 = (int)((firstCard * 11) + 1);
    double secondCard = Math.random();
    int card2 = (int)((secondCard * 11) + 1);
    int total = card1 + card2;
    double dealerUp = Math.random();
    int dealerFaceUp = (int)((dealerUp * 11) + 1);
    double dealer2nd = Math.random();
    int dealerFaceDown = (int)((dealer2nd * 11) + 1);
    int dealerTotal = dealerFaceUp + dealerFaceDown;
    public void start(){
        System.out.println("Your first card is:" + card1);
        System.out.println("Your second card is:" + card2);
        System.out.println("Your total is:" + total);
        System.out.println("The dealer's first card is:" + dealerFaceUp );
    }
    public void hit(){
        double nextCard = Math.random();
        int card = (int)((nextCard * 11) + 1);
        if(handNum <4){
            total = total + card;
            handNum = handNum + 1;
            System.out.println("You have a " + card);
            System.out.println("Your new total is:" + total);
        } else{
            System.out.println("You could only hold 4 cards.");
        }
        if(total > 21){
            System.out.println("You are a bust");
        }
    }
    public void Stay_End(){
        if (dealerTotal < 16){
            double dealerCard = Math.random();
            int dealer = (int)((dealerCard * 11) + 1);
            dealerTotal = dealerTotal + dealer;
        }
        System.out.println("The Dealer has a total of " + dealerTotal);
        System.out.println("Your total is " + total);
        if (dealerTotal > 21){
            System.out.println("The Dealer has bust");
        }
        if (total > 21){
            if(dealerTotal > 21){
                System.out.println("You and the dealer both lose.");
            } else if (dealerTotal <= 21){
                System.out.println("The dealer wins");
            }
        } else if(total <= 21){
            if(dealerTotal <= 21){
                if (total > dealerTotal){
                    System.out.println("You win");                    
                } else if(dealerTotal > total){
                    System.out.println("The Dealer wins");
                } else{
                    System.out.println("It's a tie");
                }
            } else if (dealerTotal > 21){
                System.out.println("You win");
            }
        }
    }
}
