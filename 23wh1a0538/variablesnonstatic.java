
package javapractice1;
public class variablesNonStatic {
	int student_num = 25673;
	//inside class outside method
	public static void main(String args[]) {  //static method
		variablesNonStatic obj1 = new variablesNonStatic();  //different memory locations for all the objects in heap
		obj1.student_num = 9388;
		variablesNonStatic obj2 = new variablesNonStatic();
		System.out.println(obj1.student_num);
		System.out.println(obj2.student_num);	
	}
}

package javapractice1;
