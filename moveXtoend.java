public class moveXtoend {
    public static void moveAllX(String str, int idx, int count, String newString){
        //Base Case
        if(idx == str.length()){
            for(int i = 0 ; i <= count ; i++){
                newString += 'x'; // Append 'x' for each occurrence
            }
                System.out.print(newString);
                return;
        }
        char currentChar = str.charAt(idx);  
        if(currentChar == 'x'){
            count++; // Increment count for 'x'
            moveAllX(str, idx+1, count, newString);
        } else {
            newString += currentChar; // Append non-'x' characters to newString  
            moveAllX(str, idx + 1, count, newString);
        }
    }

    public static void main(String args[]) {
    String str = "axbcxxd" ;

    moveAllX(str, 0, 0, ""); // Calling the function

}
}

