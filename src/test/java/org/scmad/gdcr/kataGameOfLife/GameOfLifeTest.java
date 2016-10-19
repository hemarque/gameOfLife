package org.scmad.gdcr.kataGameOfLife;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.scmad.gdcr.kataGameOfLife.GameOfLife;

public class GameOfLifeTest {

	@Test
	public void thePanelCouldHave4rowsAnd8Columns() {
		GameOfLife game = new GameOfLife();
		assertEquals(4, game.getPanelRows());
		assertEquals(8, game.getPanelColumns());
	}

}
