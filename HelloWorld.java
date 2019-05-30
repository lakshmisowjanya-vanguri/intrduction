public class HelloWorld {
	public static void main(String k[]) {
		String str = "abbacr";
		String str1 = "abbacr";
		StringBuilder a = new StringBuilder(str);
		StringBuilder b = new StringBuilder(str1);
		if ((a.toString()).equals(b.toString())) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Objects are not equall");
		}
	}
}