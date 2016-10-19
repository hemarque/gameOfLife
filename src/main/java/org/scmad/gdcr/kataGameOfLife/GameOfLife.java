package org.scmad.gdcr.kataGameOfLife;

public class GameOfLife {
	Panel data = new Panel(0, 0);

	public Panel createPanel(int rows, int columns) {
		this.data = new Panel(rows, columns);
		return this.data;
	}

	public Panel createPanel(String initialPanel) {
		this.data = new Panel(initialPanel);
		return this.data;
	}

	// public String evolve(String firstIteration) {
	// Panel initialIteration = createPanel(firstIteration);
	// for (int row = 0; row < initialIteration.getRows(); row++) {
	// for (int column = 0; column < initialIteration
	// .getColumns(); column++) {
	// String neighbours = initialIteration
	// .getNeighbours(row, column);
	// }
	// }
	// return null;
	// }

}
