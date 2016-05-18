import java.util.Scanner;
public class Pyramid {
	static Scanner input = new Scanner(System.in);
	private float h=0,l=0,w=0;
	void setWidth()
	{
		float w1;
		System.out.println("Enter the width for the pyramid");
		w1=input.nextFloat();
		w=w1;
	}
		void setLength()
		{
		float l1;
		System.out.println("Enter the length for the pyramid");
		l1=input.nextFloat();
		l=l1;
	}
		void setHeight()
	{
		float h1;
		System.out.println("Enter the height for the pyramid");
		h1=input.nextFloat();
		h=h1;
	}
		float vol()
		{
		float v=0;
		v=(l*w*h)/3;
		return v;
	}
		float sArea()
		{
		float s=0;
		s=(float) (l*w+l*Math.sqrt((w/2)*(w/2)+(h*h))+w*(Math.sqrt((1/2)*(1/2)+h*h)));
		return s;
	}
}
