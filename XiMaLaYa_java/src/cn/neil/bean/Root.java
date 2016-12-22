package cn.neil.bean;

public class Root {
	private Response response;

	private ResponseHeader responseHeader;

	public void setResponse(Response response) {
		this.response = response;
	}

	public Response getResponse() {
		return this.response;
	}

	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}

	public ResponseHeader getResponseHeader() {
		return this.responseHeader;
	}

}