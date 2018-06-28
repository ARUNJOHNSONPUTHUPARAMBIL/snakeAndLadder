package com.ajorgs.snakeandladder.model;

public class Board {

	public Board()
	{
		for(int i=0;i<cells.length;i++)
		{
			cells[i]= new Cell();
			cells[i].setNumber(i+1);
		}
	}
	private Cell cells[] = new Cell[100];

	public Cell[] getCells() {
		return cells;
	}

	public void setCells(Cell[] cells) {
		this.cells = cells;
	}

}
