package Lec_18;
import java.util.*;
public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int des_r=sc.nextInt();
		int des_c=sc.nextInt();
		Maze(0,0,des_r,des_c,"");

	}
public static void Maze(int curr_r, int curr_c, int des_r, int des_c,String path)
{
	if(curr_r==des_r && curr_c==des_c)
	{
		System.out.println(path);
		return;
	}
	if(curr_r>des_r || curr_c>des_c)
	{
		return;
	}
	
	Maze(curr_r+1,curr_c,des_r, des_c,path+"D");
	Maze(curr_r,curr_c+1,des_r, des_c,path+"R");
}
}
