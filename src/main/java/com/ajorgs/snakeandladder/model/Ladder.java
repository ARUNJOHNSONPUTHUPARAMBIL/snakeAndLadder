package com.ajorgs.snakeandladder.model;

public class Ladder {

	private int startingPossition;
	private int endingPossition;

	public int getStartingPossition() {
		return startingPossition;
	}

	public void setStartingPossition(int startingPossition) {
		this.startingPossition = startingPossition;
	}

	public int getEndingPossition() {
		return endingPossition;
	}

	public void setEndingPossition(int endingPossition) {
		this.endingPossition = endingPossition;
	}

	@Override
	public String toString() {
		return "Ladder [startingPossition=" + startingPossition + ", endingPossition=" + endingPossition + "]";
	}

}
