package com.ajorgs.snakeandladder.model;

public class Ladder {

	private int head;
	private int tail;

	public Ladder(int head, int tail) {
		this.head = head;
		this.tail = tail;

	}

	public int gethead() {
		return head;
	}

	public void sethead(int head) {
		this.head = head;
	}

	public int gettail() {
		return tail;
	}

	public void settail(int tail) {
		this.tail = tail;
	}

	@Override
	public String toString() {
		return "Ladder [head=" + head + ", tail=" + tail + "]\n";
	}

}
