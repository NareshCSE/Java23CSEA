package java_practise;

public class StringComparision {
	public static void main(String[] args) {
		Character string1[] = {'a','r','m','s'};
		Character string2[] = {'a','s','m','r'};
		for(int i=0;i<string1.length;i++) {
			for(int j=0;j<string2.length;j++) {
				if(string1[i]==string2[j]) {
					System.out.println(string1[i]);
				}
			}
		}
	}
}