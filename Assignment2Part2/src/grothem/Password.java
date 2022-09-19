package grothem;

public class Password {
	private String password;
	private String answer;
	private String suggestion;
	private String decent;
	private String weak;

	public Password(String str) {
		password = str;
		decent = " This is a decent password";
		weak = " Make strong by reducing block by ";
	}

	public String blockSize() {
		// input validation
		if (password.length() < 8 || password.length() > 12) {
			return "Invalid Input. Must be larger than 8 and smaller than 12";
		}

		int count = 1;
		int temp = 1;

		for (int i = 1; i < password.length(); i++) {
			// increase temp if same char (case sensitive)
			if (password.charAt(i) == password.charAt(i - 1)) {
				temp++;
			} else {
				// count is our answer and we make it the bigger num between
				// temp and count
				count = Math.max(count, temp);
				temp = 1;
			}
		}
		count = Math.max(count, temp);

		if (count <= 2) {
			suggestion = decent;
		}
		if (count > 2) {
			suggestion = weak + (count - 2);
		}
		answer = "The largest block is " + count + "," + suggestion;
		return answer;
	}
}
