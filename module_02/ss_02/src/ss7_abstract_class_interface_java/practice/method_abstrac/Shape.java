package ss7_abstract_class_interface_java.practice.method_abstrac;

 abstract public class Shape {
     public int x;
     public int y;

     public Shape(int x, int y) {
         this.x = x;
         this.y = y;
     }


     abstract public void draw();
     abstract public void erase();
     public void moveTo(int x,int y){
         erase();
         x = x;
         y = y;
         draw();
     }
 }
