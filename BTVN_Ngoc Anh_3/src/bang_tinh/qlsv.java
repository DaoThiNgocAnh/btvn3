package bang_tinh;

import java.util.Scanner;

public class qlsv {
	private String lname;
	private String fname;
	private String msv;
	private int age;
	private int m1;    //diem mon 1
	private int m2;
	private int m3;
	private int t1;    //so tin mon 1
	private int t2;
	private int t3;
	private String grade; //lop
	private float dtb;//diem trung binh
	private String xl;	//xep loai diem
	
	public qlsv(String lname, String fname, String msv, int age, int m1, int m2, int m3, int t1, int t2, int t3,
			String grade, float dtb, String xl) {
		super();
		this.lname = lname;
		this.fname = fname;
		this.msv = msv;
		this.age = age;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.grade = grade;
		this.dtb = dtb;
		this.xl = xl;
	}
	

	public qlsv() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getMsv() {
		return msv;
	}


	public void setMsv(String msv) {
		this.msv = msv;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getM1() {
		return m1;
	}


	public void setM1(int m1) {
		this.m1 = m1;
	}


	public int getM2() {
		return m2;
	}


	public void setM2(int m2) {
		this.m2 = m2;
	}


	public int getM3() {
		return m3;
	}


	public void setM3(int m3) {
		this.m3 = m3;
	}


	public int getT1() {
		return t1;
	}


	public void setT1(int t1) {
		this.t1 = t1;
	}


	public int getT2() {
		return t2;
	}


	public void setT2(int t2) {
		this.t2 = t2;
	}


	public int getT3() {
		return t3;
	}


	public void setT3(int t3) {
		this.t3 = t3;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public float getDtb() {
		return dtb;
	}


	public void setDtb(float dtb) {
		this.dtb = dtb;
	}


	public String getXl() {
		return xl;
	}


	public void setXl(String xl) {
		this.xl = xl;
	}


	public void inputQL() {
		Scanner sc = new Scanner(System.in);
		lname = sc.nextLine();
		fname = sc.nextLine();
		msv = sc.nextLine();
		age = sc.nextInt();
		m1 = sc.nextInt();
		sc.nextLine();
		m2 = sc.nextInt();
		sc.nextLine();
		m3 = sc.nextInt();
		sc.nextLine();
		t1 = sc.nextInt();
		sc.nextLine();
		t2 = sc.nextInt();
		sc.nextLine();
		t3 = sc.nextInt();
		sc.nextLine();
		grade = sc.nextLine();
		
	
	}
	
	public void outputQL() {
		System.out.println("Name : " +lname + " " + fname);
		System.out.println("MSV : " +msv);
		System.out.println("Age : " +age);
		System.out.println("M1 : " +m1);
		System.out.println("M2 : " +m2);
		System.out.println("M3 : " +m3);
		System.out.println("T1 : " +t1);
		System.out.println("T2 : " +t2);
		System.out.println("T3 : " +t3);
		System.out.println("Class : " +grade);
		dtb = (float)(m1*t1+m2*t2+m3*t3)/(t1+t2+t3);
		System.out.println("DTB : " +dtb);
		
		if(dtb>=4 && dtb<6) System.out.println("Xep loai : Trung binh");
		if(dtb<4)  System.out.println("Xep loai : Yeu");
		if(dtb>=6 && dtb<8) System.out.println("Xep loai : Kha");
		if(dtb>=8) System.out.println("Xep loai : Gioi");
		
	}

}
