package com.hassan.task.management.DTOs;

import java.util.List;

public class TaskResponse {
	
	    private Long id;
	    private String title;
	    private Boolean status;
	    private List<String> tags;
	  
	    
	    
		public TaskResponse() {
			super();
		}
		public TaskResponse(String title, Boolean status, List<String> tags) {
			super();
			this.title = title;
			this.status = status;
			this.tags = tags;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public Boolean getStatus() {
			return status;
		}
		public void setStatus(Boolean status) {
			this.status = status;
		}
		public List<String> getTags() {
			return tags;
		}
		public void setTags(List<String> tags) {
			this.tags = tags;
		} 
	
	    
	
	
}
