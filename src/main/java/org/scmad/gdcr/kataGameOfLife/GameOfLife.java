package org.scmad.gdcr.kataGameOfLife;

public class GameOfLife {
	Panel data = new Panel(0, 0);

	public Panel createPanel(int rows, int columns) {
		this.data = new Panel(rows, columns);
		return this.data;
	}

}
