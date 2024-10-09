package restart;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Shamrao", revstr="";
        char ch;
      
      System.out.println("Original word: " + str);
      
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i);
        revstr= ch+revstr; 
      }
      System.out.println("Reversed word: "+ revstr);
		
	}

}
