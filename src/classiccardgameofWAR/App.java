package classiccardgameofWAR;


public class App {

	public static void main(String[] args) {
		
		 Deck deck = new Deck();
	        Player player1 = new Player("1");
	        Player player2 = new Player("2");
	        deck.shuffle();
		
		
		
	        for (int i = 0; i < 52; i++) {
	            if ( i % 2 == 0) {
	                player1.draw(deck);
	            } else {
	                player2.draw(deck);
	            }
	        }
		
	        for (int i = 0; i < 26; i++) {
	            Card player1Card = player1.flip();
	            Card player2Card = player2.flip();
	            if (player1Card.getValue() > player2Card.getValue()) {
	                player1.incrementScore();
	            } else if (player1Card.getValue() < player2Card.getValue()) {
	                player2.incrementScore();
	            }
	           
	        System.out.println("Round Number: " + (i+1));
	        System.out.println();
	        System.out.print("Player 1's card is the ");
	        player1Card.describe();
	       System.out.print("Player 2's card is the ");
	        player2Card.describe();
	        System.out.printf("Player 1's score = %d\n", player1.getScore());
	        System.out.printf("Player 2's score = %d\n", player2.getScore());        
	        System.out.println( ); 
	        
	        
	        if (player1Card.getValue()> player2Card.getValue()) {
	            System.out.println("Player 1 wins this round!");
	        } else if (player1Card.getValue() < player2Card.getValue()) {
	            System.out.println("Player 2 wins this round!");
	        } else {
	            System.out.println("It is a DRAW!");
	        }
	        
	        System.out.println( );
	    }
	        System.out.println( "Score Board : ");
	        System.out.println( );
	        System.out.printf("Player 1's final score = %d\n", player1.getScore());
	        System.out.printf("Player 2's final score = %d\n", player2.getScore());
           System.out.println();
	        if (player1.getScore() > player2.getScore()) {
	            System.out.println("Player 1 won the game!");
	        } else if (player1.getScore() < player2.getScore()) {
	            System.out.println("Player 2 won the game!");
	        } else {
	            System.out.println("It is a DRAW!");
	        }  
	}
	
}

