package com.first.hibernate.entity;

import javax.persistence.*;

@Entity
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	
	@Transient
	private double x;
	@Lob
	private byte[] image;
	
	
	

	
	public Image(int id, String name, double x, byte[] image) {
		super();
		this.id = id;
		Name = name;
		this.x = x;
		this.image = image;
	}
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
}
