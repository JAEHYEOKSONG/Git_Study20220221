package bean;

public class Reply {
	int replyID;
	int inquiryID;
	int adminID;
	String date;
	String description;

	public int getReplyID() {
		return replyID;
	}

	public void setReplyID(int replyID) {
		this.replyID = replyID;
	}

	public int getInquiryID() {
		return inquiryID;
	}

	public void setInquiryID(int inquiryID) {
		this.inquiryID = inquiryID;
	}

	public int getAdminID() {
		return adminID;
	}

	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
