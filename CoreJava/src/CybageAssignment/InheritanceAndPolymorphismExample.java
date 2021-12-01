package CybageAssignment;

public class InheritanceAndPolymorphismExample {

		  public static void main(String[] args) {

		    
		    Circle solid = new Circle();
  
		    solid.color = "Red";
		    solid.numberOfSides();
		    
		    solid.draw();
		    
		    // polymorphism
		    Shape obj= new Circle();
		    
		    obj.same();

		  }
		
}
