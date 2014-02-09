import java.io.Serializable;
import java.util.ArrayList;

// Revised by Too #3
// Add  Serializable Class
// Continue develop from non-persistent tree
// Add positionList
public  class WordPosition implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int docNum;
	private int lineNum;
	private int wordNum;
	private String word;
	
	private ArrayList<WordPosition> positionList;

	public WordPosition(){
		docNum=0;
		lineNum=0;
		wordNum=0;
		word="";
		positionList = new ArrayList<WordPosition>();
	}
	
	public WordPosition(int docNum,int lineNum,int wordNum, String word){
		this.docNum=docNum;
		this.lineNum=lineNum;
		this.wordNum=wordNum;
		this.word = word;
		this.positionList = new ArrayList<WordPosition>();
	}
	
	public void addToPositionList(WordPosition pos){
		this.positionList.add(pos);
	}
	
	public ArrayList<WordPosition> getWordPositionList(){
		return this.positionList;
	}
	
	public void setWord(String word){
		this.word = word;
	}
	
	public String getWord(){
		return this.word;
	}
	
	
	public int getDocNum(){
		return this.docNum;
	}
	
	public int getLineNum(){
		return this.lineNum;
	}
	
	public int getWordNum(){
		return this.wordNum;
	}
}
