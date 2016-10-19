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

	public String evolve(String firstIteration) {
		Panel panel = createPanel(firstIteration);
		Panel nextPanel = createPanel(firstIteration);
		for (int row = 0; row < panel.getRows(); row++) {
			for (int column = 0; column < panel
					.getColumns(); column++) {
				int counter = panel.getNumberOfNeighbours(row,
						column);
				if ((counter < 2) || (counter > 3))
					nextPanel.killCell(row, column);
				if (counter == 3)
					nextPanel.liveCell(row, column);
			}
		}
		return nextPanel.toString();
	}

}
