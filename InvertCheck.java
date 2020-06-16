public class InvertCheck {
 
    public static void main (String[] args) {
        
        String str = "JAVA string CASE iNvErT eXaMpLe 123.";
        
        //get char array from String
        char[] charArray = str.toCharArray();
        
        //process chars one by one
        for(int i=0; i < charArray.length; i++){
            
            //if char is uppercase, make it lower case
            if( Character.isUpperCase(charArray[i]) ){
                
                charArray[i] = Character.toLowerCase( charArray[i] );
                
            }else if(Character.isLowerCase(charArray[i]) ){
                
                charArray[i] = Character.toUpperCase( charArray[i] );
            }    
            
        }
        
        //convert modified char array back to String
        str = new String(charArray);
        
        System.out.println(str);
	}
}