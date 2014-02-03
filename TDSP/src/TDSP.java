import java.util.Arrays;
import java.util.Scanner;

public class TDSP {

    public static String[] commandArray;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("TDSP command: ");
        String command = in.nextLine(); 

        /* SPLIT COMMAND AND KEEP IN commandArray */
        commandSpliting(command);
        /* CHOOSE COMMAND DUE TO USER INPUT*/
        commandChoosen();

    }

    public static void commandChoosen() {
        try {   
                if(commandArray[0].equals("create")){
                    creatIndex();
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

    public static void creatIndex() {
        System.out.println("Create Index");

    }

    public static void saveIndex() {
        System.out.println("Save");

    }

    public static void updateIndex() {
        System.out.println("Update");

    }

    public static void searchIndex() {
        System.out.println("Search");

    }

    /* SPLIT COMMAND AND KEEP IN commandArray*/
    public static void commandSpliting(String command){

        commandArray = command.split(" ");
        System.out.println("commandArray: "+ Arrays.toString(commandArray ));

    }
}