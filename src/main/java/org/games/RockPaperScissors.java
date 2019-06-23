package org.games;

public class RockPaperScissors {

    public static void main(String[] args){
        Round r1 = Round.getAnyOne();
        Round r2 = Round.getAnyOne();

        System.out.println(r1.name() + " vs " + r2.name() + " => " + r1.vs(r2));
    }

}
