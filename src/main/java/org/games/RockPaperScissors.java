package org.games;

import java.util.stream.IntStream;

public class RockPaperScissors {

    public static void main(String[] args){

        IntStream.range(1,101)
                .mapToObj(RockPaperScissors::play)
                .forEach(System.out::println);
    }

    public static String play (int round) {
        Round player1 = Round.ROCK;
        Round player2 = Round.getAnyOne();
        GameOver game = player1.vs(player2);

        return String.format("Game %3d: %s vs %-8s ==> %s",round, player1.name(), player2.name(), game.name());
    }

}
