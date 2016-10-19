package org.scmad.gdcr.kataGameOfLife;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameOfLifeTest {
	GameOfLife game = new GameOfLife();

	@Test
	public void thePanelCouldHave4rowsAnd8Columns() {
		Panel panel = game.createPanel(4, 8);
		assertEquals(4, panel.getRows());
		assertEquals(8, panel.getColumns());
	}

	@Test
	public void thePanelCouldHave8rowsAnd12Columns() {
		Panel panel = game.createPanel(8, 12);
		assertEquals(8, panel.getRows());
		assertEquals(12, panel.getColumns());
	}

	@Test
	public void initialPanelOnlyHaveDeadCells() throws Exception {
		Panel panel = game.createPanel(4, 8);
		assertEquals("........\n........\n........\n........\n",
				panel.toString());
	}

	@Test
	public void loadInitialPanel() throws Exception {
		String initialPanel = "....*...\n.*......\n......*.\n.*...*..\n";
		Panel panel = game.createPanel(initialPanel);
		assertEquals(initialPanel, panel.toString());
	}

	@Test
	public void testNeighbours() throws Exception {
		String initialPanel = "...\n.*.\n...\n";
		String expectedNeighbours = "........";
		Panel panel = game.createPanel(initialPanel);
		assertEquals(expectedNeighbours, panel.getNeighbours(1, 1));
	}

	@Test
	public void testNeighboursOnBorders() throws Exception {
		String initialPanel = "...\n*..\n...\n";
		String expectedNeighbours = ".....";
		Panel panel = game.createPanel(initialPanel);
		assertEquals(expectedNeighbours, panel.getNeighbours(1, 0));
	}

	@Test
	public void AnyLiveCellWithFewerThan2LiveNeighboursDies()
			throws Exception {
		String firstIteration = "...\n.*.\n...\n";
		String expectedIteration = "...\n...\n...\n";
		String nextIteration = game.evolve(firstIteration);
		assertEquals(expectedIteration, nextIteration);
	}

}
