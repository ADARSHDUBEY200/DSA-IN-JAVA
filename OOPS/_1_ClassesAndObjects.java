// CLASSES ARE THE  BLUEPRINT AND THE OBJECTS ARE THE INSTANCE OF THE CLASS


public class _1_ClassesAndObjects {

  public static void main(String[] args) {
    

      // THE  CREATION OF THE OBJECTS 

      Pen p1 = new Pen(); // NEW KEYWORD IS USED FOR THE ALLOCATION OF THE OBJECTS INSIDE THE MEMORY 
    
      p1.setColor("Blue");
      p1.setTip(3);

      System.out.println(p1.color);
      System.out.println(p1.tip);

      p1.color = "yellow";
      p1.tip= 5 ;

      System.out.println(p1.color);
      System.out.println(p1.tip);

  }
    


    
};

//  Intially the classes dont take the space in the heap moemory when we create the object the that particular object conatins the space inside the hdeap memory 

class Pen{
    String color ;
    int tip ;

    void setColor(String newColor){

        color = newColor;
    };

    void setTip(int newTip){

        tip = newTip;
    };
}
