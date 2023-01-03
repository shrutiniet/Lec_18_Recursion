package Lec_18;
import java.util.*;
public class Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Climb(0,n,"");

	}
public static void Climb(int curr, int des, String path)
{
	if(curr==des)
	{
		System.out.println(path);
		return;
	}
	if(curr>des)
	{
		return;
	}
	Climb(curr+1,des,path+"1 ");
	Climb(curr+2,des,path+"2 ");
}
}
