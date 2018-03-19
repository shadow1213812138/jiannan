
public class Circle {
       private double radius;
       
       private static int numberOfCircles  = 0;
       
       public Circle() {
    	   this(1.0);
       }
       
      public Circle(double radius) throws IllegalArgumentException {
    	  setRadius(radius);
    	  numberOfCircles++;
      }
      public double getRadius()
      {
    	  return radius;
      }
      public void setRadius(double radius) throws IllegalArgumentException {
    	  if(radius >= 0)
    		  this.radius = radius;
    	  else
    	  {
    		  throw new IllegalArgumentException("Radius cannot be negative");
    	  }
      }
      public static int getNumberOfCircles(){
    	  return numberOfCircles;
      }
      public double findArea() {
    	  return radius * radius * 3.14159;
      }
}
