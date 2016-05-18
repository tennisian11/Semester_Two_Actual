import java.util.*;
public class Box {
	static Scanner input = new Scanner(System.in);
	private float w=0,h=0,l=0;
	void setWidth()
	{
		float w1;
		System.out.println("Enter the width for the box");
		w1=input.nextFloat();
		w=w1;
	}
		void setLength()
		{
		float l1;
		System.out.println("Enter the length for the box");
		l1=input.nextFloat();
		l=l1;
	}
		void setHeight()
	{
		float h1;
		System.out.println("Enter the height for the box");
		h1=input.nextFloat();
		h=h1;
	}
		float vol()
		{
		float v=0;
		v=l*w*h;
		return v;
	}
		float sArea()
		{
		float s=0;
		s=(h*l*2)+(w*h*2)+(w*l*2);
		return s;
	}
}
