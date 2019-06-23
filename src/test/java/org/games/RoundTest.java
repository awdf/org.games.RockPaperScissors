package org.games;

import org.junit.Test;

import static org.games.Round.*;
import static org.junit.Assert.*;

public class RoundTest {

    //Rock tests

    @Test
    public void RockVsPaper(){
        assertEquals(ROCK.vs(PAPER), GameOver.LOSS);
    }

    @Test
    public void RockVsScissor(){
        assertEquals(ROCK.vs(SCISSOR), GameOver.WIN);
    }

    @Test
    public void RockVsRock(){
        assertEquals(ROCK.vs(ROCK), GameOver.DRAW);
    }

    //Paper tests

    @Test
    public void PaperVsRock(){
        assertEquals(PAPER.vs(ROCK), GameOver.WIN);
    }

    @Test
    public void PaperVsScissor(){
        assertEquals(PAPER.vs(SCISSOR), GameOver.LOSS);
    }

    @Test
    public void PaperVsPaper(){
        assertEquals(PAPER.vs(PAPER), GameOver.DRAW);
    }

    //Scissor tests

    @Test
    public void ScissorVsRock(){
        assertEquals(SCISSOR.vs(ROCK), GameOver.LOSS);
    }

    @Test
    public void ScissorVsPaper(){
        assertEquals(SCISSOR.vs(PAPER), GameOver.WIN);
    }

    @Test
    public void ScissorVsScissor(){
        assertEquals(SCISSOR.vs(SCISSOR), GameOver.DRAW);
    }

}
