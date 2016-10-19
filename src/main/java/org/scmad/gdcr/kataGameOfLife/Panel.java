package org.scmad.gdcr.kataGameOfLife;

public class Panel {
	public int rows;
	public int columns;
	char[][] matrix = new char[rows][columns];

	public Panel(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.matrix = new char[rows][columns];
		fill(matrix, '.');
	}

	public Panel(String initialPanel) {
		matrix = stringToMatrix(initialPanel);
		rows = matrix.length;
		columns = matrix[0].length;
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
				response += (matrix[row][column] == '.')
						? matrix[row][column] + "" : "*";
			}
			response += "\n";
		}
		return response;
	}

	private char[][] stringToMatrix(String initialPanel) {
		String[] rows = initialPanel.split("\n");
		char[][] response = new char[rows.length][];
		for (int row = 0; row < rows.length; row++) {
			response[row] = rows[row].toCharArray();
		}
		return response;
	}

	private void fill(char[][] matrix, char cell) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = '.';
			}
		}

	}

	public String getNeighbours(int row, int column) {
		String neighbours = getCell(row - 1, column - 1)
				+ getCell(row - 1, column)
				+ getCell(row - 1, column + 1)
				+ getCell(row, column - 1) + getCell(row, column + 1)
				+ getCell(row + 1, column - 1)
				+ getCell(row + 1, column)
				+ getCell(row + 1, column + 1);
		return neighbours;
	}

	private String getCell(int row, int column) {
		String cell = ((row >= 0) && (row < this.rows))
				&& ((column >= 0) && (column < this.columns))
						? "" + matrix[row][column] : "";
		return cell;
	}

	public void killCell(int row, int column) {
		matrix[row][column] = '.';
	}

	public void liveCell(int row, int column) {
		matrix[row][column] = '*';
	}
}