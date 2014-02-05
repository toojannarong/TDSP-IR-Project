import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TDSP {

	public static String[] commandArray;
	public static ArrayList<File> fileArray = new ArrayList<File>();

	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(System.in);

		System.out.print("TDSP command: ");
		String inputCommand = in.nextLine(); 

		//split inputCommand into commandArray 
		splitCommand(inputCommand);

		//select command
		selectCommand();
	}

	public static void splitCommand(String command){
		commandArray = command.split(" ");
		System.out.println("commandArray: "+ Arrays.toString(commandArray ));
	}

	public static void selectCommand() {
		try {   
			if(commandArray[0].equals("create")){
				createIndex();
			}
			else if(commandArray[0].equals("save")){
				saveIndex();
			}
			else if(commandArray[0].equals("update")){
				updateIndex();
			}
			else if(commandArray[0].equals("search")){
				searchIndex();
			}
			else{
				throw new Exception("NO COMMAND");
			}
		}
		catch(Exception e){
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void createIndex() throws FileNotFoundException {
		System.out.println(">Create Index");
		for(int i=1;i<commandArray.length;i++){
			//input .txt file into fileArray
			//PLEASE CHANGE FILE DIRECTORY
			String fileName = "C:/Users/HP_2/git/TDSP-IR-Project/TDSP-Mike/src/"+commandArray[i]+".txt";
			fileArray.add(new File(fileName));
			System.out.println(">Add "+fileName);
		}
		System.out.println();

		//read each document 
		for(int i=0;i<fileArray.size();i++){
			String fileName = "C:/Users/HP_2/git/TDSP-IR-Project/TDSP-Mike/src/"+fileArray.get(i).getName(); 
			System.out.println(">Read "+fileName);

			Scanner in = new Scanner(fileArray.get(i));

			//read each line
			ArrayList<String> eachLine = new ArrayList<String>();
			while(in.hasNextLine()){
				String line = in.nextLine();
				//System.out.println(line);
				eachLine.add(line);
			}

			//read each word of each line
			ArrayList<String[]> eachWord = new ArrayList<String[]>();
		
			for(int j=0;j<eachLine.size();j++){
				String[] temp =eachLine.get(j).split(" ");
				eachWord.add(temp);
			}
		
			for(int j=0;j<eachWord.size();j++){
				for(int k=0;k<eachWord.get(j).length;k++){
					
				    System.out.println("Doc #: "+(i+1));
				    System.out.println("Line #: "+(j+1));
				    System.out.println("Word #: "+(k+1));
					System.out.println(eachWord.get(j)[k]+" ");
					System.out.println();
				}
				System.out.println();
			}

			//finish this doc, go to next doc
			in.close();
			System.out.println();
		}

	}

	public static void saveIndex() {
		System.out.println(">Save");
		//...
	}

	public static void updateIndex() {
		System.out.println(">Update");
		//...
	}

	public static void searchIndex() {
		System.out.println(">Search");
		//...
	}

}