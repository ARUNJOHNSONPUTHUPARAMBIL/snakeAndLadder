package com.ajorgs.snakeandladder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ladder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	private int head;
	private int tail;

	public Ladder(int head, int tail) {
		this.head = head;
		this.tail = tail;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getHead() {
		return head;
	}

	public void setHead(int head) {
		this.head = head;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

	@Override
	public String toString() {
		return "Ladder [id=" + id + ", head=" + head + ", tail=" + tail + "]";
	}

	
}
