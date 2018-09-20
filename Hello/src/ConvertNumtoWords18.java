import java.util.ArrayList;
import java.util.List;

public class ConvertNumtoWords18 {
	static List<String> num2WordsLessThanK(int n) {
		// 1<= n <= 999
		String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eightteen", "nineteen" };
		String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		List<String> out = new ArrayList<>();
		if (n >= 100) {
			out.add(units[n / 100]);
			out.add("hundred");
		}
		n %= 100;
		if (n < 10) {
			if (n > 0)
				out.add(units[n]);
		} else if (10 <= n && n <= 19) {
			out.add(teens[n]);
		} else {
			out.add(tens[n / 10]);
			if (n % 10 > 0)
				out.add(units[n % 10]);
		}
		return out;
	}

	static List<String> num2Words(long n) {
		// 123456789
		// 123--> AAAA
		// 456--> BBBB
		// 789--> CCCC
		// AAAA million BBBB thousand CCCC

		int r = 0;
		List<String> out = new ArrayList<>();
		if (n == 0) {
			out.add("zero");
		} else {
			String[] thousands = { "", "thousand", "million", "billion", "trillion", "quadrillion" };
			while (n > 0) {
				if (n % 1000 > 0) {
					List<String> outLTK = num2WordsLessThanK((int) (n % 1000));
					if (r > 0)
						outLTK.add(thousands[r]);
					out.addAll(0, outLTK);
				}
				n /= 1000;
				r++;
			}
		}
		return out;

	}

	public static void main(String[] args) {
		long n = 1234567890;
		List<String> t = num2Words(n);
		System.out.println(String.join(" ", t));
	}

}
