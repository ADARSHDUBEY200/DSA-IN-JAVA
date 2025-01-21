import javax.swing.text.PasswordView;

public class _2_AcessModifiers {

    public static void main(String[] args) {
        
        BankManagementSystem B1 = new BankManagementSystem();
        B1.username = "ADARSH DUBEY";
        B1.setPassword("adarsh@123");
        String password = B1.getPassword();

        System.out.println(password);
    }
    
}


class BankManagementSystem{
    public String username ;
    private String Password ;
    private String AccountDetails;

    // GETTRES AND SETTERS IN THE OOPS 

    void setPassword(String Password){
        this.Password = Password;// THIS IS USED FOE THE REFRENCE OF THE VARIABLE INSIDE THE CLASS

        // THIS IS ALOS USED FOR THE REFERENCE OF THE OBJECTS INSIDE THE CLASSES FOR THE PARTICULAR FUNMC
    }

    String getPassword(){
        return Password;

    }

}
