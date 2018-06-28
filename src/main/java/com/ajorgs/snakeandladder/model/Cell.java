package com.ajorgs.snakeandladder.model;


public class Cell {
	private int number;
	private Snake snake;
	private Ladder ladder;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Cell [number=" + number + ", snakes=" + snake + ", ladders=" + ladder + "]";
	}

	public Snake getSnakes() {
		return snake;
	}

	public void setSnakes(Snake snake) {
		this.snake = snake;
	}

	public Ladder getLadders() {
		return ladder;
	}

	public void setLadders(Ladder ladder) {
		this.ladder = ladder;
	}

}
