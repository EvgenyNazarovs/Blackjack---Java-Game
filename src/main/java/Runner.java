import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Game game = new Game();

        System.out.println("Welcome to BlackJack!");
        System.out.println("How many players will be joining?");

        String input = scanner.next();
        int numberOfPlayers = parseInt(input);

        for(int i = 0; i < numberOfPlayers; i++) {
            String prompt = String.format("Player %s, enter your name: ", (i + 1));
            System.out.println(prompt);
            String playerName = scanner.next();
            Player player = new Player(playerName);
            game.addPlayer(player);
        }

        System.out.println("Awesome, let's go!");

        game.start();
        String dealerCardName = game.showDealersFirstCard();
        System.out.println(dealerCardName);


        for(Player player : game.getPlayers()) {
            String output = String.format("%s has:", player.getName());
            System.out.println(output);
            for(int i = 0; i < player.numberOfCards(); i++) {
                System.out.println(player.showCard(i));
            }
            System.out.println(String.format("Hand total: %s", player.handTotal()));
        }

        for(Player player : game.getPlayers()) {
            String prompt = String.format("%s, Hit or stand?", player.getName());
            System.out.println(prompt);
            String choice = scanner.next().toLowerCase();
            System.out.println(choice);
                if (choice.equals("hit")) {
                    String answer = "You hit!";
                    System.out.println(answer);
                    Card card = game.getDeck().dealCard();
                    player.receiveCard(card);
                    String output = String.format("Your new card is %s and your new total is %s", player.showCard(0), player.handTotal());
                    System.out.println(output);
                }
            }

        Player lead = null;
        int highestPlayer = 0;

        for (Player player : game.getPlayers()) {
            if ((player.handTotal() > highestPlayer) && (player.handTotal() <= 21)) {
                lead = player;
                highestPlayer = player.handTotal();
            }
        }

        if (highestPlayer > game.getDealer().handTotal()) {
            String dealerOutput = String.format("Dealer's total is %s ", game.getDealer().handTotal());
            System.out.println(dealerOutput);
            String output = String.format("%s wins with total %s and the following cards: ", lead.getName(), lead.handTotal());
            System.out.println(output);
            for (int i = 0; i < lead.numberOfCards(); i++) {
                System.out.println(lead.showCard(i));
            }
        }

        else if (game.getDealer().handTotal() > highestPlayer && game.getDealer().handTotal() <= 21) {
            String output = String.format("Dealer wins with total %s and the following cards: ", game.getDealer().handTotal());
            System.out.println(output);
            for (int i = 0; i < game.getDealer().numberOfCards(); i++) {
                System.out.println(game.getDealer().showCard(i));
            }
        }









    }


}
