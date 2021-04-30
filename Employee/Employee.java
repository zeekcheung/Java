import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		SeniorEnginee seniorEnginee	= new SeniorEnginee();
		System.out.print("高级工程师\n" + "工作量为：");
		Scanner X1 = new Scanner(System.in);
		int x1 = X1.nextInt();
		seniorEnginee.setY(x1);
		seniorEnginee.printY();
		
		IntermediateEngineer intermediateEngineer	= new IntermediateEngineer();
		System.out.print("中级工程师\n" + "工作量为：");
		Scanner X2 = new Scanner(System.in);
		int x2 = X2.nextInt();
		intermediateEngineer.setY(x2);
		intermediateEngineer.printY();
		
		JuniorEngineer juniorEngineer	= new JuniorEngineer();
		System.out.print("初级工程师\n" + "工作量为：");
		Scanner X3 = new Scanner(System.in);
		int x3 = X3.nextInt();
		juniorEngineer.setY(x3);
		juniorEngineer.printY();
		
		Executives executives	= new Executives();
		System.out.print("高管\n" + "工作量为：");
		Scanner X4 = new Scanner(System.in);
		int x4 = X4.nextInt();
		executives.setY(x4);
		executives.printY();
		
		MiddleManagement middleManagement	= new MiddleManagement();
		System.out.print("中层管理人员\n" + "工作量为：");
		Scanner X5 = new Scanner(System.in);
		int x5 = X5.nextInt();
		middleManagement.setY(x5);
		middleManagement.printY();
		
		GeneralManager generalManager	= new GeneralManager();
		System.out.print("普通管理人员\n" + "工作量为：");
		Scanner X6 = new Scanner(System.in);
		int x6 = X6.nextInt();
		generalManager.setY(x6);
		generalManager.printY();
			
	}
		
}

 class Technicist{
	 String number;
	 String name;
	 int x;
	 int y;
	 
	 void printY() {
		 System.out.println("奖金为：" + y);
	 }
	 
} 
 
 class SeniorEnginee extends Technicist{
	 void setY(int x) {
		 y = x*30;
	 }
 }
 
 class IntermediateEngineer extends Technicist{
	 void setY(int x) {
		 y = x*25;
	 }
 }
 
 class JuniorEngineer extends Technicist{
	 void setY(int x) {
		 y = x*20;
	 }
 }
 
 class Manager{
	 String number;
	 String name;
	 int x;
	 int y;
	 
	 void printY() {
		 System.out.println("奖金为：" + y);
	 }
}
 
 class Executives extends Manager{
	 void setY(int x) {
		 y = x*15;
	 }
 }
 
 class MiddleManagement extends Manager{
	 void setY(int x) {
		 y = (x-50)*10;
	 }	 
 }
 
class GeneralManager extends Manager{
	 void setY(int x) {
		 y = (x-100)*5;
	 }
 }
