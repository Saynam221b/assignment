package ques1_2_3_4;

public class EmpItf7 implements Employeee, Runnable{

	public int id1() {
		// TODO Auto-generated method stub
		return 7777;
	}

	public String name1() {
		// TODO Auto-generated method stub
		return "Rupali";
	}

	public int age1() {
		// TODO Auto-generated method stub
		return 24;
	}

	public int salary1() {
		// TODO Auto-generated method stub
		return 6542;
	}

	public int experience1() {
		// TODO Auto-generated method stub
		return 1;
	}

	public boolean goodFeedback1() {
		// TODO Auto-generated method stub
		return true;
	}

	public String fathersName1() {
		// TODO Auto-generated method stub
		return "CYX";
	}

	public String designation1() {
		// TODO Auto-generated method stub
		return "Data Engineer";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running for emp7");
		
	}

	
}
