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

	public static void createIndex() {
		System.out.println("Create Index");
		for(int i=1;i<commandArray.length;i++){
			System.out.println(commandArray[i]);
			
			//input .txt file into fileArray
			fileArray.add(new File("C://Users//HP_2//git//TDSP-IR-Project//TDSP-Mike//src"+commandArray[i]));
		    
		
		}
		
		//...
	}

	public static void saveIndex() {
		System.out.println("Save");
		//...
	}

	public static void updateIndex() {
		System.out.println("Update");
		//...
	}

	public static void searchIndex() {
		System.out.println("Search");
		//...
	}

}