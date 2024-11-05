package interfaces;
public class Rectangle implements Relatable {
    private int width;
    private int height;
    private int x,y;

    public Rectangle(){
      this(0,0,0,0);
    }
    public Rectangle(int x, int y, int width, int height) {
        this.width = width;
        this.height = height;
        this.x =x;
        this.y =y;
    }
   
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getArea() {
        return width * height;
    }
    
    // a method required to implement the Relatable interface
    @Override
    //TODO: Add the IsLargerThan method here
    public int isLargerThan(Relatable other){
      Rectangle rect = (Rectangle)other;
      if (this.getArea() < rect.getArea()){
        return 1;
      }else if(this.getArea()>rect.getArea()){
        return -1;
      }else{
        return 0;
      }
    }
  
    @Override
    public String toString(){
      return "area: " + getArea();    
    }
}