package org.games;

public enum GameOver {
    DRAW, WIN, LOSS;

    @Override
    public String toString() {
        return this.name();
    }
}
