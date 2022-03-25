package vo;

public class Guestbook {
	private int guestbookNo;
	private String guestbookContent;
	private String writer;
	private String createDate;
	private String updateDate;
	private String guestbookPw;
	public Guestbook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Guestbook(int guestbookNo, String guestbookContent, String writer, String createDate, String updateDate,
			String guestbookPw) {
		super();
		this.guestbookNo = guestbookNo;
		this.guestbookContent = guestbookContent;
		this.writer = writer;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.guestbookPw = guestbookPw;
	}
	public int getGuestbookNo() {
		return guestbookNo;
	}
	public void setGuestbookNo(int guestbookNo) {
		this.guestbookNo = guestbookNo;
	}
	public String getGuestbookContent() {
		return guestbookContent;
	}
	public void setGuestbookContent(String guestbookContent) {
		this.guestbookContent = guestbookContent;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getGuestbookPw() {
		return guestbookPw;
	}
	public void setGuestbookPw(String guestbookPw) {
		this.guestbookPw = guestbookPw;
	}
	@Override
	public String toString() {
		return "Guestbook [guestbookNo=" + guestbookNo + ", guestbookContent=" + guestbookContent + ", writer=" + writer
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + ", guestbookPw=" + guestbookPw + "]";
	}
	
}
