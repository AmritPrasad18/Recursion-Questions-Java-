//Question: Remove duplicates in a string. eg-'aabbcc' -> 'abc'
public class removeDuplicate {
    public static boolean arr[] = new boolean[26] ;

    public static void removeDuplicate(String str, int idx, String newString) {
        //Base Case
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(idx);
        //Check if the character is already present in the boolean array
        if(arr[currentChar - 'a'] == true) {
            removeDuplicate(str, idx + 1, newString);
        } else {
            arr[currentChar - 'a'] = true;
            newString += currentChar; // Append the character to newString
            removeDuplicate(str, idx + 1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicate(str, 0, ""); // Calling the function
    }
    
}
