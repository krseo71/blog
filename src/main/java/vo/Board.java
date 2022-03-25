package vo;

public class Board {
	
	private int boardNo;
	private String categoryName;
	private String boardTitle;
	private String boardContent;
	private String boardPw;
	private String createDate;
	private String updateDate;
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Board(int boardNo, String categoryName, String boardTitle, String boardContent, String boardPw,
			String createDate, String updateDate) {
		super();
		this.boardNo = boardNo;
		this.categoryName = categoryName;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardPw = boardPw;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardPw() {
		return boardPw;
	}
	public void setBoardPw(String boardPw) {
		this.boardPw = boardPw;
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
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", categoryName=" + categoryName + ", boardTitle=" + boardTitle
				+ ", boardContent=" + boardContent + ", boardPw=" + boardPw + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + "]";
	}
	
	
}
