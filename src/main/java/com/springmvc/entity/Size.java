package com.springmvc.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the size database table.
 * 
 */
@Entity(name="size")
@Table(name="size")

public class Size implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@Column(name="number")
	private int number;

	public Size() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}


}