public class WordReversed {
    public static void main(String[] args) {
      
        String letters = "Abigail"; 
        String r = "";
        char ch;

        for (int i = 0; i < letters.length(); i++) {
          	
          
            ch = letters.charAt(i);
          
          	
            r = ch + r; 
        }
	System.out.println(r);
  }

}      