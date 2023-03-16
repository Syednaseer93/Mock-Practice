package random;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		String str="Syed Naseer";
		int orgCount=str.length();
		int countAfterRemovalCharacter=str.replace("s", "").length();

		int count=orgCount-countAfterRemovalCharacter;
		System.out.println(count);
	}

}
