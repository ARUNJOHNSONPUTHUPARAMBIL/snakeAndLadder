package com.ajorgs.snakeandladder.model;

import java.util.Arrays;

public class Board {
	private Cell cells[] = new Cell[100];

	public Board()
	{
		for(int i=0;i<cells.length;i++)
		{
			cells[i]= new Cell();
			cells[i].setNumber(i+1);
		}
	}

	public Cell[] getCells() {
		return cells;
	}

	public void setCells(Cell[] cells) {
		this.cells = cells;
	}

	@Override
	public String toString() {
		return "Board [cells=" + Arrays.toString(cells) + "]";
	}

}
