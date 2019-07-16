package com.bridgelabz.fundoo.model;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Document

public class Note 
{
    @Id
	private String noteId;
	private String userId;
	public String title;
	public String description;
	private String createTime;
	private String updateTime;
	private boolean trash;
	private boolean archive;
	private boolean Pin;
	private LocalDateTime remainder;
	@DBRef
	private List<Label> labels;
	
	public Note(String noteId, String userId, String title, String description, String createTime, String updateTime,
			boolean trash, boolean archive, boolean pin, LocalDateTime remainder, List<Label> labels) {
		super();
		this.noteId = noteId;
		this.userId = userId;
		this.title = title;
		this.description = description;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.trash = trash;
		this.archive = archive;
		Pin = pin;
		this.remainder = remainder;
		this.labels = labels;
	}
	
	public Note()
	{
		
	}

	public String getNoteId() {
		return noteId;
	}

	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public String setTitle(String title) {
		return this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public String setDescription(String description) {
		return this.description = description;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public boolean isTrash() {
		return trash;
	}

	public void setTrash(boolean trash) {
		this.trash = trash;
	}

	public boolean isArchive() {
		return archive;
	}

	public void setArchive(boolean archive) {
		this.archive = archive;
	}

	public boolean isPin() {
		return Pin;
	}

	public void setPin(boolean pin) {
		Pin = pin;
	}

	public LocalDateTime getRemainder() {
		return remainder;
	}

	public void setRemainder(LocalDateTime remainder) {
		this.remainder = remainder;
	}

	public List<Label> getLabels() {
		return labels;
	}

	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}

	@Override
	public String toString() {
		return "Note [noteId=" + noteId + ", userId=" + userId + ", title=" + title + ", description=" + description
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", trash=" + trash + ", archive="
				+ archive + ", Pin=" + Pin + ", remainder=" + remainder + ", labels=" + labels + "]";
	}
	
}