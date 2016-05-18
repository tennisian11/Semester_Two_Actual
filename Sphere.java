import java.util.*;
public class Sphere {
	static Scanner input = new Scanner(System.in);
	private float r=0;
	void setRadius(){
		float r1;
		System.out.println("Enter Radius");
		r1=input.nextFloat();
		r=r1;
	}
	float vol()
	{
		float v=0;
		v=(float) (Math.PI*Math.pow(r, 3)*4/3);
		return v;
	}
	float sArea()
	{
		float s=0;
		s=(float) (4*Math.PI*Math.pow(r, 2));
		return s;
	}
}


