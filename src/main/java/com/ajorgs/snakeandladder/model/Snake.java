package com.ajorgs.snakeandladder.model;

public class Snake {
	private int head;
	private int tail;

	public Snake(int head, int tail) {
		this.head = head;
		this.tail = tail;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

	@Override
	public String toString() {
		return "Snake [head=" + head + ", tail=" + tail + "]\n";
	}

	public int getHead() {
		return head;
	}

	public void setHead(int head) {
		this.head = head;
	}

}
