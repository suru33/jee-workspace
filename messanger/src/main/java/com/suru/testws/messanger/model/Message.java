package com.suru.testws.messanger.model;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Message {
	private Long id;
	private String message;
	private String sender;
	private Date created;
	private Map<Long, Comment> comments = new HashMap<>();
	private List<Link> links = new ArrayList<>();

	public Message() {
	}

	public Message(Long id, String message, String sender, Date created) {
		super();
		this.id = id;
		this.message = message;
		this.sender = sender;
		this.created = created;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@XmlTransient
	@Transient
	public Map<Long, Comment> getComments() {
		return comments;
	}

	public void setComments(Map<Long, Comment> comments) {
		this.comments = comments;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public void addLink(String url, String rel) {
		links.add(new Link(url, rel));
	}

}
