package random;

public class CountUpperCaseLetters {

	public static void main(String[] args) {
		int countU=0;
		int countL=0;

		String str="HellOJaVa";
		for(int i=0;i<=str.length()-1;i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				countU++;
			}
			else {
				countL++;
			}
		}
		System.out.println("Upper Case total: "+countU);
		System.out.println("Lower Case total: "+countL);
	}

}
