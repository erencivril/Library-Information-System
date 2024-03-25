public class Main {
    public static void main(String args[]) {
        //We define an admin account for our library
        Accounts.createAccount("admin", "1234", null, null, null);
        //Show login form
        Login Login_form = new Login();
        Login_form.setVisible(true);
    }
}
