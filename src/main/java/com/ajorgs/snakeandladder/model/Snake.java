package com.ajorgs.snakeandladder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Snake {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
