
public class KrishnaJaya {

	public KrishnaJaya() {
		// TODO Auto-generated constructor stub
	}
    
	public static String reverseString(String str)
    {
        if (str.isEmpty())
            return "Input String is Empty";
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }
	
	
	public static void main(String[] args) {
        String str = " ";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    
}
