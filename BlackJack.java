
/**
 * Write a description of class BlackJack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.Math;
public class BlackJack{
    private static hand player = new hand();
    private static hand dealer = new hand();
    private static int hand = 2;
    
    public static void start(){
        System.out.println("Your first card is:" + player.getCard1());
        System.out.println("Your second card is:" + player.getCard2());
        System.out.println("Your total is:" + player.getTotal());
        System.out.println("The dealer's first card is:" + dealer.getCard1());
    }

    public static void Hit(){

        if(hand < 4){
            System.out.println("Your new card is:" + player.Hit());
            System.out.println("Your new total is:" + player.getTotal());
            hand += 1;
        } else{
            System.out.println("You could only hold 4 cards.");
        }
        if(player.getTotal()> 21){
            System.out.println("You are a bust");
        }
    }

    public static void Stay_End(){
        while (dealer.getTotal() < 16){
            dealer.Hit();
        }
        System.out.println("The Dealer has a total of " + dealer.getTotal());
        System.out.println("Your total is " + player.getTotal());
        if (dealer.getTotal() > 21){
            System.out.println("The Dealer has bust");
        }
        if (player.getTotal() > 21){
            if(dealer.getTotal() > 21){
                System.out.println("You and the dealer both lose.");
            } else if (dealer.getTotal() <= 21){
                System.out.println("The dealer wins");
            }
        } else if(player.getTotal() <= 21){
            if(dealer.getTotal() <= 21){
                if (player.getTotal() > dealer.getTotal()){
                    System.out.println("You win");                    
                } else if(dealer.getTotal() > player.getTotal()){
                    System.out.println("The Dealer wins");
                } else{
                    System.out.println("It's a tie");
                }
            } else if (dealer.getTotal() > 21){
                System.out.println("You win");
            }
        }
    }

    public static void main(){
        Scanner scanner =  new Scanner(System.in);
        BlackJack.start();
        boolean playerTurn = true;
        while(playerTurn){
           System.out.println("Hit or Stay");
           String input = scanner.next();
        }
    }
}
