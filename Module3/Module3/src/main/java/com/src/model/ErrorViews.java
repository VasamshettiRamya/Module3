package com.src.model;

import java.util.Date;

public class ErrorViews {
		  private Date timetamp;
		  private String message;
		  private String details;

		  public Date getTimestamp() {
			return timetamp;
		}

		public void setTimestamp(Date timestamp) {
			this.timetamp = timestamp;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getDetails() {
			return details;
		}

		public void setDetails(String details) {
			this.details = details;
		}

		public ErrorViews(Date timestamp, String message, String details) {
		    super();
		    this.timetamp = timestamp;
		    this.message = message;
		    this.details = details;
		  }
}
