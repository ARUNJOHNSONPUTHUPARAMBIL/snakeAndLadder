package com.ajorgs.snakeandladder.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Cell> cells = new ArrayList<>();

	public Board() {
		for (int i=0;i<100;i++) {
			cells.add(new Cell());
		}
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}




	public List<Cell> getCells() {
		return cells;
	}




	public void setCells(List<Cell> cells) {
		this.cells = cells;
	}




	@Override
	public String toString() {
		return "Board [id=" + id + ", cells=" + cells + "]";
	}

}
