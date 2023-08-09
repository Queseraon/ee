package com.ee.vo;

public class TestInfoVO {
	private int tiNum;
	private String tiName;
	private String tiId;
	private String tiPwd;
	private String tiDesc;
	public int getTiNum() {
		return tiNum;
	}
	public void setTiNum(int tiNum) {
		this.tiNum = tiNum;
	}
	public String getTiName() {
		return tiName;
	}
	public void setTiName(String tiName) {
		this.tiName = tiName;
	}
	public String getTiId() {
		return tiId;
	}
	public void setTiId(String tiId) {
		this.tiId = tiId;
	}
	public String getTiPwd() {
		return tiPwd;
	}
	public void setTiPwd(String tiPwd) {
		this.tiPwd = tiPwd;
	}
	public String getTiDesc() {
		return tiDesc;
	}
	public void setTiDesc(String tiDesc) {
		this.tiDesc = tiDesc;
	}
	
	@Override
	public String toString() {
		return "TestInfoVO [tiNum=" + tiNum + ", tiName=" + tiName + ", tiId=" + tiId + ", tiPwd=" + tiPwd + ", tiDesc="
				+ tiDesc + "]";
	}
}
