package cn.neil.bean;

/**
 * 为满足要求的显示格式，新建该类，并将Doc转化成该类，然后json化，打印
 * 
 * @author Neil
 *
 */
public class SimplifiedDoc {
	private String title;
	private String anchorman;
	private String info;
	private int totalPlayCount;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAnchorman() {
		return anchorman;
	}

	public void setAnchorman(String anchorman) {
		this.anchorman = anchorman;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getTotalPlayCount() {
		return totalPlayCount;
	}

	public void setTotalPlayCount(int totalPlayCount) {
		this.totalPlayCount = totalPlayCount;
	}

	/**
	 * 将Doc类进行简化
	 * 
	 * @param doc
	 *            doc类对象
	 * @return 简化的SimplifiedDoc对象
	 */
	public static SimplifiedDoc simplify(Doc doc) {
		if (doc == null)
			return null;
		SimplifiedDoc result = new SimplifiedDoc();
		result.setAnchorman(doc.getNickname());
		result.setTotalPlayCount(doc.getPlay());
		result.setInfo(doc.getIntro());
		result.setTitle(doc.getTitle());
		return result;
	}
}
