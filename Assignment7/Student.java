
interface Marks
{
	public abstract float getPercentage();
}
class Student_A implements Marks
{
	float phy,chem,math,percent;
	Student_A(float p,float c,float m)
	{
		phy=p;
		chem=c;
		math=m;
		System.out.println("Student A marks\n~~~~~~~~~~~~~~~~~~~\nPhysics   : "+phy+"\nChemistry : "+chem+"\nMath      : "+math);
	}
	public float getPercentage()
	{
		percent=((phy+chem+math)/300)*100;
		return percent;
	}
}
class Student_B implements Marks
{	
	float phy,chem,math,bio,percent;
	Student_B(float p,float c,float m,float b)
	{
		phy=p;
		chem=c;
		math=m;
		bio=b;
		System.out.println("\nStudent B marks\n~~~~~~~~~~~~~~~~~~\nPhysics   : "+phy+"\nChemistry : "+chem+"\nMath      : "+math+"\nBiology   : "+bio);
	}
	public float getPercentage()
	{
		percent=((phy+chem+math+bio)/400)*100;
		return percent;
	}
}
class Student
{
	public static void main(String args[])
	{
		float p1,p2;
		Student_A s1=new Student_A(70,80,90);
		p1=s1.getPercentage();
		System.out.println("\nPercentage occured by student A : "+p1+"%");
		
		Student_B s2=new Student_B(50,60,70,80);
		p2=s2.getPercentage();
		System.out.println("\nPercentage occured by student B: "+p2+"%");
		
	}
}