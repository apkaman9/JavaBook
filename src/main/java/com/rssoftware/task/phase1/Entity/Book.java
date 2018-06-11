package com.rssoftware.task.phase1.Entity;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "book")
@XmlAccessorType(XmlAccessType.FIELD)

public class Book {
	@XmlAttribute(name="id")
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@XmlElement(name = "author")
	private String author;
	@XmlElement(name = "title")
	private String title;
	@XmlElement(name = "genre")
	private String genre;
	@XmlElement(name = "publish_date")
	private Date publish_date;
	@XmlElement(name = "description")
	private String description;
	@XmlElement(name = "price")
	private double price;
	@Override
	public String toString() {		
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
			String d=formatter.format(getPublish_date());
		
		//String d=(getPublish_date().getYear()+1900)+"-"+(getPublish_date().getMonth()+1)+"-"+getPublish_date().getDate();
		return ("********************************************************************"+"\n"+
		"Id:"+getId()+"\n"+
		"author : "+getAuthor()+"\n"+
		"Title : "+getTitle()+"\n"+
		"Genre:"+getGenre()+"\n"+
		"Publish_Date(YYYY-MM-DD):"+d+"\n"+
		"Desc : "+getDescription()+"\n"+
		"Price : "+getPrice()+"\n"
		);
		/*return "Book [id=" + id + ", author=" + author + ", title=" + title + ", genre=" + genre + ", publish_date="
				+ publish_date + ", description=" + description + ", price=" + price + "]";*/
	}

	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Date getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}
	 
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(String author, String title, String genre, Date publish_date, String description,
			double price) {
		super();
		this.author = author;
		this.title = title;
		this.genre = genre;
		this.publish_date = publish_date;
		this.description = description;
		this.price = price;
		
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
}
