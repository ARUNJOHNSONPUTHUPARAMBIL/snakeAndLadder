package com.ajorgs.snakeandladder.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;

import org.hibernate.engine.internal.Cascade;

@Entity
public class Cell {
	@Id
	@TableGenerator(initialValue = 1, name = "id")
	private int number;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Snake snake;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Ladder ladder;
    @OneToOne(cascade= CascadeType.ALL)
	Player player;

    
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Cell [" + number + "," + snake + "," + ladder + "]\n";
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
