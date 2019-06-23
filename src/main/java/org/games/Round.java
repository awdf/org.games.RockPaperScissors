package org.games;

import static org.games.GameOver.*;

enum Round {
    ROCK    (0),
    PAPER   (1),
    SCISSOR (2);

    private int code;

    private static GameOver[][] games = new GameOver[][]{
            {DRAW, LOSS, WIN },
            {WIN,  DRAW, LOSS},
            {LOSS, WIN,  DRAW}
    };


    Round(int r) {
        this.code = r;
    }

    public int getCode() {
        return this.code;
    }

    public GameOver vs(Round opponent){
        return games[this.getCode()][opponent.getCode()];
    }

    public static Round getAnyOne(){
        int any = (int) Math.round(Round.values().length * Math.random());
        return Round.values()[any == 3 ? 0 : any]; //The
    }

    @Override
    public String toString() {
        return this.name();
    }
}