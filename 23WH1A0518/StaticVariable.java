package practicepack;

public class SaticVariable {
	static String classRoomNumber = "DB304";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable object1 = new StaticVariable();
		StaticVariable object2 = new StaticVariable();
		object1.classRoomNumber = "newStone304";
		System.out.println(object1.classRoomNumber);
		System.out.println(object2.classRoomNumber);
	}
	public String getAttendence(String rollNumber) {
		System.out.println(classRoomNumber);
		return rollNumber;
	}

}
