
public class WordPosition {
	private int docNum;
	private int lineNum;
	private int wordNum;

	public WordPosition(){
		docNum=0;
		lineNum=0;
		wordNum=0;
	}
	
	public WordPosition(int docNum,int lineNum,int wordNum){
		this.docNum=docNum;
		this.lineNum=lineNum;
		this.wordNum=wordNum;
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
