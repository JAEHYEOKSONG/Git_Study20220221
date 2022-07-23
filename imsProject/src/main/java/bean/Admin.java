package bean;

public class Admin {
	//member
	private int adminID;
	private String loginID;
	private String loginPW;

	//getter
	public int getAdminID() {
		return this.adminID;
	}

	public String getLoginID() {
		return this.loginID;
	}

	public String getLoginPW() {
		return this.loginPW;
	}

	//setter
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public void setLoginPW(String loginPW) {
		this.loginPW = loginPW;
	}
}