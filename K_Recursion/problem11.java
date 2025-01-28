// REMOVE DUPLICATE

package K_Recursion;

public class problem11 {
    public static void removeduplicate(String str , int idx , StringBuilder newstr , boolean map[]){
        // base case - if indec reaches at the end of the String , then new string is created without duplicate 
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        //store the character at index
        char currchar = str.charAt(idx);
        // check for the each element in str
        if(map[currchar - 'a'] == true){
            removeduplicate(str, idx+1, newstr, map);
        }
        // remove the duplicate and the element to newstr
        else {
            map[currchar - 'a'] = true ;
            removeduplicate(str, idx+1, newstr.append(currchar), map);
        }
    }    
    public static void main(String[] args) {
        String str = "yashbhhutada";
        removeduplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
