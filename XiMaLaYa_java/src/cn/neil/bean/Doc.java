package cn.neil.bean;

public class Doc {
	private int uid;

	private String tags;

	private boolean is_v;

	private String nickname;

	private int verify_type;

	private int category_id;

	private String cover_path;

	private String intro;

	private String user_source;

	private int id;

	private String category_title;

	private String title;

	private String updated_at;

	private String last_uptrack_at;

	private String created_at;

	private boolean is_paid;

	private int tracks;

	private int play;

	private int count_comment;

	private int is_finished;

	private int last_uptrack_at_hour;

	private int serialState;

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getUid() {
		return this.uid;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTags() {
		return this.tags;
	}

	public void setIs_v(boolean is_v) {
		this.is_v = is_v;
	}

	public boolean getIs_v() {
		return this.is_v;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setVerify_type(int verify_type) {
		this.verify_type = verify_type;
	}

	public int getVerify_type() {
		return this.verify_type;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getCategory_id() {
		return this.category_id;
	}

	public void setCover_path(String cover_path) {
		this.cover_path = cover_path;
	}

	public String getCover_path() {
		return this.cover_path;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getIntro() {
		return this.intro;
	}

	public void setUser_source(String user_source) {
		this.user_source = user_source;
	}

	public String getUser_source() {
		return this.user_source;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setCategory_title(String category_title) {
		this.category_title = category_title;
	}

	public String getCategory_title() {
		return this.category_title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getUpdated_at() {
		return this.updated_at;
	}

	public void setLast_uptrack_at(String last_uptrack_at) {
		this.last_uptrack_at = last_uptrack_at;
	}

	public String getLast_uptrack_at() {
		return this.last_uptrack_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getCreated_at() {
		return this.created_at;
	}

	public void setIs_paid(boolean is_paid) {
		this.is_paid = is_paid;
	}

	public boolean getIs_paid() {
		return this.is_paid;
	}

	public void setTracks(int tracks) {
		this.tracks = tracks;
	}

	public int getTracks() {
		return this.tracks;
	}

	public void setPlay(int play) {
		this.play = play;
	}

	public int getPlay() {
		return this.play;
	}

	public void setCount_comment(int count_comment) {
		this.count_comment = count_comment;
	}

	public int getCount_comment() {
		return this.count_comment;
	}

	public void setIs_finished(int is_finished) {
		this.is_finished = is_finished;
	}

	public int getIs_finished() {
		return this.is_finished;
	}

	public void setLast_uptrack_at_hour(int last_uptrack_at_hour) {
		this.last_uptrack_at_hour = last_uptrack_at_hour;
	}

	public int getLast_uptrack_at_hour() {
		return this.last_uptrack_at_hour;
	}

	public void setSerialState(int serialState) {
		this.serialState = serialState;
	}

	public int getSerialState() {
		return this.serialState;
	}
	@Override
	public String toString() {
		return getTitle()+"\n"+getNickname()+"\n"+getIntro()+"\n"+getPlay()+"\n\n\n";
	}
}
