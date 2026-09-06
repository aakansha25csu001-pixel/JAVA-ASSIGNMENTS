package week5;

class Shape{
    private String label;
    public Shape(String label){
        this.label=label;
    }
    public String getlabel(){
     return label;
    }

  public  double area(){
    return 0;
  }
  public  double perimeter(){
    return 0;
  }

   void displayDetails(){
   System.out.println("Color:"+label);
  }
  
}
 class Circle extends Shape{
private double radius;
public Circle(String label,double radius){
  super(label);

if(radius<=0){
  System.out.println("INVALID");
}
this.radius=radius;
}

@Override
public double area(){
return 3.14*radius*radius;
}
@Override
public double perimeter(){
 return 2*3.14*radius;
}
@Override
 void displayDetails(){
    System.out.println("CIRCLE");
     System.out.println("Radius:"+radius);
   System.out.println("Area:"+area());
    System.out.println("Perimeter:"+perimeter());
  }

}
class Rectangle extends Shape{
  private double length;
  private double width;
  public  Rectangle(String label,double width,double length){
    super(label);
    if(length<=0 || width<=0){
      System.out.println("INVALID");
    }
    this.length=length;
    this.width=width;
  }
  @Override
  public double area(){
    return length*width;
  }
  @Override
  public double perimeter(){
    return 2*(length+width);
  }
  @Override
   void displayDetails(){
    System.out.println("RECTANGLE");
     System.out.println("Length:"+length);
     System.out.println("Width:"+width);
   System.out.println("Area:"+area());
    System.out.println("Perimeter:"+perimeter());
  }
  
}
 class Square extends Shape{
  private double side;

 
  public Square(String Label,double side){
    super(Label);
    if(side<=0){
      System.out.println("INVALID");
    }
    this.side=side;
  }
  @Override
  public double area(){
    return side*side;
  }
  @Override
  public double perimeter(){
    return 4*side;
  }
  @Override
  void displayDetails(){
    System.out.println("SQUARE");
     System.out.println("Side:"+side);
   System.out.println("Area:"+area());
    System.out.println("Perimeter:"+perimeter());
  }
}
public class ShapeManagementApp {
   public static void main(String[] args) {
       Circle c=new Circle("Red",7);
     Rectangle r=new Rectangle("Pink",7,4);
     Square s=new Square("Green",4);
     c.displayDetails();
     r.displayDetails();
     s.displayDetails();
        System.out.println("Area of square: " + s.area());
        System.out.println("Area of rectangle: " + r.area());
        System.out.println("Perimeter of square: " + s.perimeter());
        System.out.println("Perimeter of rectangle: " + r.perimeter());
double totalArea =c.area()+ r.area()+ s.area();
        System.out.println("Total Area = " + totalArea);
        double averageArea = totalArea / 3;
        System.out.println("Average Area = " + averageArea);
    
}
}
