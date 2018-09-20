import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CharacterFrequency15 {

	public static void main(String[] args) {
		System.out.println(">>");
		Scanner kb = new Scanner(System.in);
		String t = kb.nextLine();
		Map<Character, Integer> wc = new HashMap<>();
		for (Character c : t.toCharArray()) {
			if (wc.containsKey(c))
				wc.put(c, wc.get(c) + 1);
			else
				wc.put(c, 1);
		}
		System.out.println(wc);
		Set<Character> keyset = wc.keySet();
		List<Character> keylist = new ArrayList<>(keyset);
		Collections.sort(keylist);
		for (Character c: keylist) {
			System.out.println(c+" --> "+wc.get(c));
		}
		
		//using array
		System.out.println(">>");
		Scanner kb2 = new Scanner(System.in);
		String t2 = kb2.nextLine();
		int[] wd = new int[26];  // auto initialized to zero
		t = t.toUpperCase();
		for (char c : t.toCharArray()) {
			if('A' <= c && c <= 'Z') {
				wd[c - 'A']++;
			}
		}
		for (int c='a'; c<'z'; c++) {
			if (wd[c-'a'] != 0) {
				System.out.println(c +" --> "+wd[c-'a']);
			}
		}
		
		
		
		
	}

}
