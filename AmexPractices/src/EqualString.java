
public class EqualString {

	private String fname;
	private String lname;

	public EqualString() {
		// TODO Auto-generated constructor stub
	}

	public EqualString(String str1, String str2) {
		this.fname = str1;

		this.lname = str2;

		// TODO Auto-generated constructor stub
	}
    
	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		if (this.getClass() == obj.getClass()) {
			EqualString obj1 = (EqualString) obj;
			if (obj1.fname.equals(this.fname) && obj1.lname.equals(this.lname)) {

				isEqual = true;

			}

		}
		return isEqual;

	}

	public static void main(String args[]) {

		EqualString obj1 = new EqualString("JAYA", "kRISHNA");

		EqualString obj2 = new EqualString("JAYA", "kRISHNA");

		if (obj1.equals(obj2)) {
			System.out.println("Both the objects are equal");
		} else {
			System.out.println("Both the objects are not equal");
		}

	}

}
