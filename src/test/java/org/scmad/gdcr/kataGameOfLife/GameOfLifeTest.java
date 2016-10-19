package org.scmad.gdcr.kataGameOfLife;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameOfLifeTest {

	@Test
	public void thePanelCouldHave4rowsAnd8Columns() {
		GameOfLife game = new GameOfLife(4, 8);
		assertEquals(4, game.getPanelRows());
		assertEquals(8, game.getPanelColumns());
	}

	@Test
	public void thePanelCouldHave8rowsAnd12Columns() {
		GameOfLife game = new GameOfLife(8, 12);
		assertEquals(8, game.getPanelRows());
		assertEquals(12, game.getPanelColumns());
	}

}
