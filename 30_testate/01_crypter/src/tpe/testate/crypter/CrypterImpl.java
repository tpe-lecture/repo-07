package tpe.testate.crypter;
/**
 * Diese Klasse ver- und entschlüsselt Strings mit vorgegebenem Schlüssel.
 * @author Asus
 *
 */
public class CrypterImpl implements Crypter {
	/**
	 * Das originale Zeichenalphabeth.
	 */
	static String a = "abcdefghijklmnopqrstuvwxyz0123456789";
	/**
	 * Das verschlüsselte Alphabeth
	 */
	static String b = "4bcd3fghijk1mn0pqrs7uvwxyzol2ea56t89";

	/**
	 * Methode verschlüsselt den übergebenen String und gibt neuen zurück.
	 * @param input Der übergebene String
	 */
	@Override
	public String encrypt(String input) {
		char[] result = new char[input.length()];
		input = input.toLowerCase();
		int j = 0;

		//Verschlüsselt zu verschüsselnde Zeichen
		for (int i = 0; i < input.length(); i++) {
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

		//Array ohne endenden null-Zellen
		char[] arrayWhichGetsReturned = new char[j];
		int i = 0;
		for(char temp : result) {
			arrayWhichGetsReturned[i++] = temp;
		}
		return new String(arrayWhichGetsReturned);
	}
	/**
	 * Methode entschlüsselt den übergebenen String und gibt neuen zurück.
	 * @param input Der übergebene String
	 */
	@Override
	public String decrypt(String input) throws IllegalArgumentException {

		char[] result = new char[input.length()];

		//Ersetze verschlüsselte Zeichen
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
