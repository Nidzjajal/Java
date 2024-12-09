class Rectangle {     double length;  double width; 
 
     
     Rectangle(double length, double width) {         this.length = length;         this.width = width; 
    } 
 
     
    public Rectangle(Rectangle other) { 
        this.length = other.length; // Copying the value of length from 'other'       
          this.width = other.width;   // Copying the value of width from 'other' 
    } 
 
    public void display() { 
        System.out.println("Length: " + length); 
        System.out.println("Width : " + width); 
    } 
} 
public class Q14 
{ 
 
    public static void main(String[] args) { 
        Rectangle rect1 = new Rectangle(145.0, 110.0);  
Rectangle rect2 = new Rectangle(rect1);     // Creating a copy of rect1 using the copy constructor 
 
        System.out.println("Rectangle 1:");         rect1.display(); 
 
        System.out.println("Rectangle 2 (Copy of Rectangle 1):");         rect2.display(); 
    } 
}