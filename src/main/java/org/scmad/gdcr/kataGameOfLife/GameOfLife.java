package org.scmad.gdcr.kataGameOfLife;

public class GameOfLife {
	int rows, columns;

	public GameOfLife(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
	}

	public int getPanelRows() {
		return rows;
	}

	public int getPanelColumns() {
		return columns;
	}

}
