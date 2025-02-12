package N_Backracking;

public class subsets {
    public static void  findsubsets(String str , String ans , int i){
        // BASE CASE 
        if(i == str.length()){
            if((ans.length())== 0){
                System.out.println("NULL");
            }
            System.out.println(ans);
            return ;
        }

        // RECURSION
        // YES CHOICE 
        findsubsets(str, ans+str.charAt(i), i+1);
        //NO CHOICE
        findsubsets(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        findsubsets(str, "", 0);  // ans("") - cause new String is to be print there
    }
}
