package model;

public class Student {
	String firstName;	//名
	String secondName;	//姓
	int age;    		//年龄
	int gender;       	// 0表示男生，1表示女生
	String idNum;    	//学号
	public Student(String firstName, String secondName, int age, int gender, String idNum) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.gender = gender;
		this.idNum = idNum;
	}
	public Student() {
		super();
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	/**
	 * 重写toString方法，方便打印student的各个属性
	 */
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", secondName=" + secondName + ", age=" + age + ", gender=" + gender
				+ ", idNum=" + idNum + "]";
	}
}
