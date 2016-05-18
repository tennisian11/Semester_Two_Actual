import java.util.*;
public class Shape_Tester {

	public static void main(String[] args) {
		System.out.println("Enter the values of the box");
		Box box=new Box();
		box.setWidth();
		box.setHeight();
		box.setLength();
		System.out.println("Volume of box:"+box.vol());
		System.out.println("Surface area of box:"+box.sArea());
		System.out.println("Enter the values of the pyramid");
		Pyramid pyramid=new Pyramid();
		pyramid.setWidth();
		pyramid.setHeight();
		pyramid.setLength();
		System.out.println("Volume of pyramid:"+pyramid.vol());
		System.out.println("Surface area of box:"+pyramid.sArea());
		System.out.println("Enter the values of the Sphere");
		Sphere sphere=new Sphere();
		sphere.setRadius();
		System.out.println("Volume of sphere:"+sphere.vol());
		System.out.println("Surface area of sphere:"+sphere.sArea());
		
		

	}

}
