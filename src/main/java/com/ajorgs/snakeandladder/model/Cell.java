package com.ajorgs.snakeandladder.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Cell {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private int number;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Snake snake;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval=true)
	private Ladder ladder;
	@OneToOne(cascade = CascadeType.ALL)
	Player player;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Cell [id=" + id + ", number=" + number + ", snake=" + snake + ", ladder=" + ladder + ", player="
				+ player + " \n ]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Snake getSnake() {
		return snake;
	}

	public void setSnake(Snake snake) {
		this.snake = snake;
	}

	public Ladder getLadder() {
		return ladder;
	}

	public void setLadder(Ladder ladder) {
		this.ladder = ladder;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}
