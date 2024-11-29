package com.hassan.task.management.DTOs;

public class TagSummary {
	
	
	    private Long id;
	    private String name;
	    private Long taskCount;
	    
	    
	    
		public TagSummary() {
			super();
		}
		public TagSummary(String name, Long taskCount) {
			super();
			this.name = name;
			this.taskCount = taskCount;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getTaskCount() {
			return taskCount;
		}
		public void setTaskCount(Long taskCount) {
			this.taskCount = taskCount;
		}

	   
	    
	    


}
