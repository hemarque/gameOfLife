package org.scmad.gdcr.kataGameOfLife;

public class Panel {
	public int rows;
	public int columns;
	char[][] matrix = new char[rows][columns];

	public Panel(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.matrix = new char[rows][columns];
	}

	public int getColumns() {
		return columns;
	}

	public int getRows() {
		return rows;
	}

	public String toString() {
		return matrixToString();
	}

	private String matrixToString() {
		String response = "";
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				response += ".";
			}
			response += "\n";
		}
		return response;
	}
}