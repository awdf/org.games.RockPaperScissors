package org.games;

import org.junit.Test;

import static org.games.RockPaperScissors.play;
import static org.junit.Assert.*;


public class RockPaperScissorsTest {

    @Test
    public void playTest(){
        assertTrue(play(0).startsWith("Game   0"));
    }

}
