package Main;

import java.util.Scanner;

import Singleton.singleton;

public class main {

	static boolean run = true;
	static Scanner scanner;
	static singleton member1,member2,member3,member4,member5,member6,member7,member8,member9;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(run)
		{
			newintance();
			System.out.print("Continue? Y/N: ");
			scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();
			if(tmp.equals("Y"))
			{
				run = true;
			}
			else if(tmp.equals("loop"))
			{
				System.out.print("Loop count: ");
				int count = scanner.nextInt();
				for(int i=0;i<count;i++)
				{
					newintance();
				}
			}
			else if(tmp.equals("N"))
			{
				run = false;
			}
		}
	}
	
	public static void newintance()
	{
		member1 = singleton.getInstance();
		member2 = singleton.getInstance();
		member3 = singleton.getInstance();
		member4 = singleton.getInstance();
		member5 = singleton.getInstance();
		member6 = singleton.getInstance();
		member7 = singleton.getInstance();
		member8 = singleton.getInstance();
		member9 = singleton.getInstance();
		
		System.out.println("member1 hashCode:" + member1.hashCode());
		System.out.println("member2 hashCode:" + member2.hashCode());
		System.out.println("member3 hashCode:" + member3.hashCode());
		System.out.println("member4 hashCode:" + member4.hashCode());
		System.out.println("member5 hashCode:" + member5.hashCode());
		System.out.println("member6 hashCode:" + member6.hashCode());
		System.out.println("member7 hashCode:" + member7.hashCode());
		System.out.println("member8 hashCode:" + member8.hashCode());
		System.out.println("member9 hashCode:" + member9.hashCode());
	}

}
