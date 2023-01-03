package Lec_18;
import java.util.*;
public class Gen_Parenthesis {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Solve(2,2,"");
		
	}
public static void Solve(int op, int cl, String path)
{
	if(op>cl)
		return;
	if(cl==0 && op==0)
	{
		System.out.println(path);
		return;
	}
	if(op>=1)
		Solve(op-1,cl,path+"(");
	if(cl>=1)
		Solve(op,cl-1,path+")");
}
}
