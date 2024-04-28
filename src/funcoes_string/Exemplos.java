package funcoes_string;

public class Exemplos {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG    ";
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(2);
		String s5 = original.substring(2, 9);
		String s6 = original.replace('a', 'x');
		String s7 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		
		System.out.println("original -> " + original + "-");
		System.out.println("lowerCase -> " + s1 + "-");
		System.out.println("upperCase -> " + s2 + "-");
		System.out.println("trim -> " + s3 + "-");
		System.out.println("substring -> " + s4 + "-");
		System.out.println("substring -> " + s5 + "-");
		System.out.println("replace -> " + s6 + "-");
		System.out.println("replace -> " + s7 + "-");
		System.out.println("Index Of -> " + i);
		System.out.println("Last Index Of -> " + j);
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}
