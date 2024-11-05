package interfaces;
import org.w3c.dom.css.Rect;

/**
 * Demonstrate the use of abstract classes
 * @Author  Elizabeth Sanford
 *
 * Do the following steps:
 *
 * Step 0: Add YOUR NAME above
 *
 * Step 1: Examine the code and notce the TODO's
 *
 * Step 2:  In Relatable.java, implement the isLargerThan method in the Relatable Interface
 *
 * Step 3:  In Main.java's main method. add the test cases described in the exploration and test.  It should print that rectangle 1 is the largest.
 *
 * Step 4: In Main.java's main method, create two more rectangles. This time, make the rectangle passed in as the argument the bigger one. Test.  
 * 
 * Step 5: In Main.java's main method, create two more rectangles. This time, make the rectangles the same size. Test. 
 * 
 * */

class Main {
  
  public static void main(String[] args) {
    //TODO: Add the main method test code here


    Rectangle rect1 = new Rectangle(1,2,3,4);
    Rectangle rect2 = new Rectangle(3,4,1,2);

    if(rect1.isLargerThan(rect2)>0){
      System.out.println("rectangle 2 is bigger than rectangle 1"); }
    else if(rect1.isLargerThan(rect2)<0){
      System.out.println("rectangle 1 is bigger than rectangle 2"); }
    else{System.out.println("rectangle 1 and rectangle 2 are of equal size");}

    // larger rectangle
    Rectangle rect3 = new Rectangle(1,2,5,4);
    //smaller rectangle
    Rectangle rect4 = new Rectangle(3,4,1,1);

    if(rect4.isLargerThan(rect3)>0){
      System.out.println("rectangle 2 is bigger than rectangle 1"); }
    else if(rect4.isLargerThan(rect3)<0){
      System.out.println("rectangle 1 is bigger than rectangle 2"); }
    else{System.out.println("rectangle 1 and rectangle 2 are of equal size");}

    Rectangle rect5 = new Rectangle(1,2,3,4);
    Rectangle rect6 = new Rectangle(3,4,3,4);

    if(rect5.isLargerThan(rect6)>0){
      System.out.println("rectangle 2 is bigger than rectangle 1"); }
    else if(rect5.isLargerThan(rect6)<0){
      System.out.println("rectangle 1 is bigger than rectangle 2"); }
    else{System.out.println("rectangle 1 and rectangle 2 are of equal size");}
  }
}