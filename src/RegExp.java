import java.util.regex.Pattern;

public class RegExp {

	public static void main(String[] args) {

		String strPassord = "My password is: 985630";

		System.out.println(strPassord.replaceAll("\\d+", "*"));


		String str ="Hola                      4522245132";
		
		String strPattern = "(\\w+)(\\s+)([13|2|45]+)";
		
		Pattern pattern = Pattern.compile(strPattern);
		
		System.out.println(pattern.matcher(str).matches());
		
		str = str.replaceAll(strPattern, "$3");

		System.out.println(str);

		String str2 = "uno dos tres";

		System.out.println(str2.replaceAll("(\\w+)(\\s+)(\\w+)(\\s+)(\\w+)", "$5 $3 $1"));
	}	
}
