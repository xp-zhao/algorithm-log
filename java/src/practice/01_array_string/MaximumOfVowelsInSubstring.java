/**
 * Given a string s and an integer k, return the maximum number of vowel letters in any substring of
 * s with length k.
 *
 * <p>Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 *
 * @author zhaoxiaoping
 * @date 2026-01-16
 */
public class MaximumOfVowelsInSubstring {
  public int maxVowels(String s, int k) {
    char[] ch = s.toCharArray();
    int result = 0;
    int vowel = 0;
    for (int i = 0; i < ch.length; i++) {
      if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
        vowel++;
      }
      int left = i - k + 1;
      if (left < 0) {
        continue;
      }
      result = Math.max(result, vowel);
      char out = ch[left];
      if (out == 'a' || out == 'e' || out == 'i' || out == 'o' || out == 'u') {
        vowel--;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    MaximumOfVowelsInSubstring client = new MaximumOfVowelsInSubstring();
    System.out.println(client.maxVowels("abcdefg", 3));
  }
}
