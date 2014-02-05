import java.util.ArrayList;

public class Word{
	private String name;
	private int count;
	private ArrayList<WordPosition> position;

	public Word(){
		name="";
		count=0;
		position=new ArrayList<WordPosition>();
	}

	public void setName(String name){
		this.name=name;
	}

	public void countWord(){
		count++;
	}

	public void addWordPosition(WordPosition wp){
		position.add(wp);
	}

}
