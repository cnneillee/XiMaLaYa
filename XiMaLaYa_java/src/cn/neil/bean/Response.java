package cn.neil.bean;

import java.util.List;

public class Response {
	private int start;

	private List<Doc> docs;

	private int numFound;

	public void setStart(int start) {
		this.start = start;
	}

	public int getStart() {
		return this.start;
	}

	public void setDocs(List<Doc> docs) {
		this.docs = docs;
	}

	public List<Doc> getDocs() {
		return this.docs;
	}

	public void setNumFound(int numFound) {
		this.numFound = numFound;
	}

	public int getNumFound() {
		return this.numFound;
	}

}