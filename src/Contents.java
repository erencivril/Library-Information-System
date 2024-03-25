/*
* We used it 2 HashMaps, one of them is inside of the other one. 
* That inner HashMap contains all the content datas such as contentID, publisher, publishing year etc.
* Outer HashMap one contains content's ID as key and content's data's HashMap as value.
* Also we made a contentIssuelist HashMap if book lent to anyone that data will be in that HashMap
*/
import java.util.HashMap; 
import javax.swing.JOptionPane; //We used JOptionPane is for the message dialogs that will show up to our screen.
public class Contents {
    
    //We don't want to create an instance when we are calling these methods and variables so we used static
    static HashMap<String, HashMap<String, String>> contentList = new HashMap<>();
    //We made a new HashMap named contentIssuelist if there the book is that on list it means it is lent to someone
    static HashMap<String, HashMap<String, String>> contentIssuelist = new HashMap<>();
    
    public static void addContent(String contentID, String fullName, String ISBN, String publisher, String year){
        //We have to check that there isn't any content with the same contentID
        if (contentList.containsKey(contentID)){
            JOptionPane.showMessageDialog(null, "There is a content with that contentID");
        }
        else{
            //Now we create a new HashMap to store content's data
            HashMap<String, String> Data = new HashMap<>();
            Data.put("contentID", contentID);
            Data.put("fullName", fullName);
            Data.put("publisher", publisher);
            Data.put("year", year);
            contentList.put(contentID, Data);
            JOptionPane.showMessageDialog(null, "Content added successfully");
         }
    }
    
    public static void deleteContent(String contentID){
        //We have to be sure there is an content with that contentID
        if (contentList.containsKey(contentID)){
            contentList.remove(contentID);
            JOptionPane.showMessageDialog(null, "Content removed successfully");
        }
        //If there isn't any content with that contentID our program will show a message dialog.
        else{
            JOptionPane.showMessageDialog(null, "There isn't any content with that contentID");
        }
    }

    public static void lendContent(String contentID, String userID, String issueDate, String dueDate){
        //We have to make sure that there is a content like that and our content is available to lent to someone.
        if (contentList.containsKey(contentID) && !contentIssuelist.containsKey(contentID)){
            //We create a new HashMap to store lending data
            HashMap<String, String> Data = new HashMap<>();
            Data.put("contentID", contentID);
            Data.put("userID", userID);
            Data.put("issueDate", issueDate);
            Data.put("dueDate", dueDate);
            //If our content is in contentIssuelist it means our content is already lent to someone
            contentIssuelist.put(contentID, Data);
            JOptionPane.showMessageDialog(null, "Content lent successfully");
        }
        //If our content is in contentIssuelist, it means it already lent to someone so we can't lent it to anyone else.
        else if (contentIssuelist.containsKey(contentID)){
            JOptionPane.showMessageDialog(null, "This content lent to (User ID) " + contentIssuelist.get(contentID).get("userID"));
        }
        //contentID might be invalid so we have to show a messagebox for it.
        else if (!contentList.containsKey(contentID)){
            JOptionPane.showMessageDialog(null, "There isn't any content with that contentID");
        }
    }
    
    public static void takeBackContent(String contentID, String takingbackDate){
        //We are checking if there is an any lent content with that id or not.
        if (contentIssuelist.containsKey(contentID)){
           String dueDate = contentIssuelist.get(contentID).get("dueDate");
           System.out.println(dueDate);
           JOptionPane.showMessageDialog(null, "Content returned successfully\n Return Date : " + takingbackDate + "\n Due Date : " + dueDate);
           //We are removing the content from lent list (we are basically making the content available again.
           contentIssuelist.remove(contentID);
        }
        else{
            //If there isnt any lent content then show message box.
            JOptionPane.showMessageDialog(null, "There isn't any lent content with that contentID");
        }
    }
    
    public static void queryContent(String contentID){
        //We have to be sure there is an content with that contentID
        if (contentList.containsKey(contentID)){
             /*
             * We get the content's data from outer HashMap and assign it to a new HashMap named contentData
             * That makes us to easier to get data instead of typing .get again and again
             */
            HashMap<String, String> contentData = contentList.get(contentID);
            //If our content is in contentIssuelist HashMap it means it lent to someone so we have to show that it's not available
            if (contentIssuelist.containsKey(contentID)){
                String lentuserID = contentIssuelist.get(contentID).get("userID");
                String info = "Content's contentID : " + contentData.get("contentID") + "\nContent's name : " + contentData.get("fullName") + "\nContent's publisher : " + contentData.get("publisher") + "\nContent's published year : " + contentData.get("year") + "\nIs the content available? : No" + "\nThis content lent to (userID) : " + lentuserID;
                JOptionPane.showMessageDialog(null, info);
            }
            //It's not in list so it is available we show that it is available
            else{
                String info = "Content's contentID : " + contentData.get("contentID") + "\nContent's name : " + contentData.get("fullName") + "\nContent's publisher : " + contentData.get("publisher") + "\nContent's published year : " + contentData.get("year") + "\nIs the content available? : Yes";
                JOptionPane.showMessageDialog(null, info);
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "There isn't any content with that contentID");
        }
    }
    
}