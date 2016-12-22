package cn.neil.bean;

public class ResponseHeader {
	private int status;

	private int QTime;

	private Params params;

	public void setStatus(int status) {
		this.status = status;
	}

	public int getStatus() {
		return this.status;
	}

	public void setQTime(int QTime) {
		this.QTime = QTime;
	}

	public int getQTime() {
		return this.QTime;
	}

	public void setParams(Params params) {
		this.params = params;
	}

	public Params getParams() {
		return this.params;
	}

}
