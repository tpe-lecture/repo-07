package tpe.testate.crypter;

public class CrypterImpl implements Crypter {

	static String a = "abcdefghijklmnopqrstuvwxyz0123456789";
	static String b = "4bcd3fghijk1mn0pqrs7uvwxyzol2ea56t89";

	@Override
	public String encrypt(String input) {
		char[] result = new char[input.length()];
		input = input.toLowerCase();
		for (int i = 0, j = 0; i < input.length(); i++) {
			char temp = input.charAt(i);
			int x = a.indexOf(temp);
			if(x >= 0) {
				result[j] = b.charAt(x);
				j++;
			}
			else if (input.charAt(i) == ' ') {
				result[j] = ' ';
				j++;
			}
		}
		return new String(result);
	}

	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		char[] result = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			char temp = input.charAt(i);
			int x = b.indexOf(temp);
			if (x == -1) {
				throw new IllegalArgumentException();
			}
			result[i] = a.charAt(x);
		}
		return new String(result);
	}

}
