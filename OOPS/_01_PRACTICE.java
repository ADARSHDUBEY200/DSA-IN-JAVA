

public class _01_PRACTICE {

    public static void main(String[] args) {
        
        Pen p1 =new Pen();
        p1.setColor("red");
        p1.setTip(7);

        System.out.println(p1.color);
        System.out.println(p1.tip);

        BankMangement myAcc=new BankMangement();
        myAcc.username="ADARSH";
        System.out.println(myAcc.username);
       myAcc.setPassword("dubeybhai");
      myAcc.getPassword();

    }
    
}

class BankMangement{
    public String username;
    private String password;

    void setPassword(String password){
        this.password=password;
    }

    void getPassword(){
        System.out.println(password);
    }

}

class Pen {
    String color;
    int tip;

     void setColor(String color) {
        this.color = color;
    }

     void setTip(int tip) {
        this.tip = tip;
    }
}
