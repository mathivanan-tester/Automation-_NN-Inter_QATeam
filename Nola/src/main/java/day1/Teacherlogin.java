package day1;

public class Teacherlogin {
	public static void main(String[] args) {
		
		Login dashboard = new Login();
		String typeoflogin = dashboard.overviewmenu();
		
		boolean loginstatus = dashboard.adminlogin();
		
		System.out.println(typeoflogin);
		System.out.println(loginstatus);
	}

}
