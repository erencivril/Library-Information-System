/*
* We used it 2 HashMaps, one of them is inside of the other one. 
* That inner HashMap contains all the user datas such as userid, password, email etc.
* Outer HashMap one contains user's ID as key and user's data's HashMap as value.
*/
import java.util.HashMap; 
import javax.swing.JOptionPane; //We used JOptionPane is for the message dialogs that will show up to our screen.

public class Accounts {
    
    //We don't want to create an instance when we are calling these methods and variables so we used static
    static HashMap<String, HashMap<String, String>> accountList = new HashMap<>();
    
    public static void createAccount(String userID, String password, String email, String fullName, String department){
        
        //We have to check that there isn't any account with the same userID
        if (accountList.containsKey(userID)){
            JOptionPane.showMessageDialog(null, "There is an account with that userID");
        }
        else{
            //Now we create a new HashMap to store user's data
            HashMap<String, String> Data = new HashMap<>();
            Data.put("userID", userID);
            Data.put("password", password);
            Data.put("email", email);
            Data.put("fullName", fullName);
            Data.put("department", department);
            //Now we are putting that inner HashMap into outer HashMap
            accountList.put(userID, Data);
            /*
             * We added this if condition because our Main.java creates an admin account when we run the program.
             * So we don't want to get an notification right after the program starts so we added that if condition to prevent that notification.
            */
            if (!userID.equals("admin")){
                JOptionPane.showMessageDialog(null, "Member created successfully");
            }
        }
    }
     
    public static void deleteAccount(String userID){
        //We have to be sure there is an account with that userID and it shouldn't be the admin account.
        if (accountList.containsKey(userID) && !userID.equals("admin")){
            accountList.remove(userID);
            JOptionPane.showMessageDialog(null, "Member deleted successfully");
        }
        //If there isn't any account with that userID our program will show a message dialog.
        else{
            JOptionPane.showMessageDialog(null, "There isn't any member with that userID");
        }
    }
    
    public static void queryAccount(String userID){
        //We have to be sure there is an account with that userID and it shouldn't be the admin account.
        if (accountList.containsKey(userID) && !userID.equals("admin")){
            /*
             * We get the user's data from outer HashMap and assign it to a new HashMap named userData
             * That makes us to easier to get data instead of typing .get again and again
             */
            HashMap<String, String> userData = accountList.get(userID);
            //Now we made a new String variable and prepared our information sentence
            String info = "Member's Full Name : " +  userData.get("fullName") + "\nMember's ID : " +  userData.get("userID") + "\nMember's password : " + userData.get("password") + "\nMember's email : " + userData.get("email") + "\nMember's department: " + userData.get("department");
            JOptionPane.showMessageDialog(null, info);
        }
        //If there isn't any account with that userID our program will return a message dialog.
        else{
            JOptionPane.showMessageDialog(null, "There isn't any member with that userID");
        }
    }
}
