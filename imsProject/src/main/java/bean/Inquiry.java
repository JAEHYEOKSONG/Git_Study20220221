package bean;

public class Inquiry {
	// member
	private int inquiryID;
	private String name;
	private String sex;
	private int age;
	private String email;
	private String address;
	private String date;
	private String category;
	private String description;

	// getter
	public int getInquiryID() {
		return this.inquiryID;
	}

	public String getName() {
		return this.name;
	}

	public String getSex() {
		return this.sex;
	}

	public int getAge() {
		return this.age;
	}

	public String getEmail() {
		return this.email;
	}

	public String getAddress() {
		return this.address;
	}

	public String getDate() {
		return this.date;
	}

	public String getCategory() {
		return this.category;
	}

	public String getDescription() {
		return this.description;
	}

	// setter
	public void setInquiryID(int inquiryID) {
		this.inquiryID = inquiryID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
