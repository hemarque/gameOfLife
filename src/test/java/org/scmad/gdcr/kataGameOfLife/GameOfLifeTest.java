package org.scmad.gdcr.kataGameOfLife;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameOfLifeTest {

	@Test
	public void thePanelCouldHave4rowsAnd8Columns() {
		GameOfLife game = new GameOfLife();
		Panel panel = game.createPanel(4, 8);
		assertEquals(4, panel.getRows());
		assertEquals(8, panel.getColumns());
	}

	@Test
	public void thePanelCouldHave8rowsAnd12Columns() {
		GameOfLife game = new GameOfLife();
		Panel panel = game.createPanel(8, 12);
		assertEquals(8, panel.getRows());
		assertEquals(12, panel.getColumns());
	}

}
