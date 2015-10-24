package com.jacky.contest.topcoder;

/*
 * 
 Let's say you have a binary string such as the following:
 011100011
 One way to encrypt this string is to add to each digit the sum of its adjacent digits. For example, the above string would become:
 123210122
 In particular, if P is the original string, and Q is the encrypted string, then Q[i] = P[i-1] + P[i] + P[i+1] for all digit positions i. Characters off the left and right edges of the string are treated as zeroes.
 An encrypted string given to you in this format can be decoded as follows (using 123210122 as an example):
 Assume P[0] = 0.
 Because Q[0] = P[0] + P[1] = 0 + P[1] = 1, we know that P[1] = 1.
 Because Q[1] = P[0] + P[1] + P[2] = 0 + 1 + P[2] = 2, we know that P[2] = 1.
 Because Q[2] = P[1] + P[2] + P[3] = 1 + 1 + P[3] = 3, we know that P[3] = 1.
 Repeating these steps gives us P[4] = 0, P[5] = 0, P[6] = 0, P[7] = 1, and P[8] = 1.
 We check our work by noting that Q[8] = P[7] + P[8] = 1 + 1 = 2. Since this equation works out, we are finished, and we have recovered one possible original string.
 Now we repeat the process, assuming the opposite about P[0]:
 Assume P[0] = 1.
 Because Q[0] = P[0] + P[1] = 1 + P[1] = 1, we know that P[1] = 0.
 Because Q[1] = P[0] + P[1] + P[2] = 1 + 0 + P[2] = 2, we know that P[2] = 1.
 Now note that Q[2] = P[1] + P[2] + P[3] = 0 + 1 + P[3] = 3, which leads us to the conclusion that P[3] = 2. However, this violates the fact that each character in the original string must be '0' or '1'. Therefore, there exists no such original string P where the first digit is '1'.
 Note that this algorithm produces at most two decodings for any given encrypted string. There can never be more than one possible way to decode a string once the first binary digit is set.
 Given a String message, containing the encrypted string, return a String[] with exactly two elements. The first element should contain the decrypted string assuming the first character is '0'; the second element should assume the first character is '1'. If one of the tests fails, return the string "NONE" in its place. For the above example, you should return {"011100011", "NONE"}.
 */

//115.76 points
public class BinaryCode {

	public String[] decode(String message) {
		String[] result = new String[2];
		if (message.length() == 2) {
			if (message.charAt(0) == '1' && message.charAt(1) == '1')
				return new String[] { "01", "10" };
		}
		StringBuilder s = new StringBuilder();
		s.append(0);
		int qfirst = Character.getNumericValue(message.charAt(0));
		int pfirst = Character.getNumericValue(s.charAt(0));
		s.append(qfirst - pfirst);
		for (int i = 1; i < message.length() - 1; i++) {
			int q = Character.getNumericValue(message.charAt(i));
			int p1 = Character.getNumericValue(s.charAt(i - 1));
			int p2 = Character.getNumericValue(s.charAt(i));
			int value = q - p1 - p2;
			if(value > 2 || value < 0){
				s = null;
				s = new StringBuilder();
				s.append("NONE");
				result[0] = s.toString();
				break;
			}
			s.append(value);
		}
		
		StringBuilder s2 = new StringBuilder();
		s2.append(1);
		int qfirst2 = Character.getNumericValue(message.charAt(0));
		int pfirst2 = Character.getNumericValue(s2.charAt(0));
		s2.append(qfirst2 - pfirst2);
		for (int i = 1; i < message.length() - 1; i++) {
			int q = Character.getNumericValue(message.charAt(i));
			int p1 = Character.getNumericValue(s2.charAt(i - 1));
			int p2 = Character.getNumericValue(s2.charAt(i));
			int value = q - p1 - p2;
			if(value > 2 || value < 0){
				s2 = null;
				s2 = new StringBuilder();
				s2.append("NONE");
				result[1] = s2.toString();
				break;
			}
			s2.append(value);
		}

		result[0] =  s.toString();
		result[1] = s2.toString();
		return result;
	}

	public static void main(String[] args) {
		BinaryCode b = new BinaryCode();
		String[] result = b.decode("123210120");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
