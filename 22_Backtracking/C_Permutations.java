public class C_Permutations {
    public static void findPermutation(String str,String ans){
        //Base
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++){
            char cur = str.charAt(i);
            //he NewStr i index ha tasach theun pudhache aani magche string gheti
            //substring me pahile starting index hota hai aur , ke aage ending endex hota hai par wo ending index add nahi hota
            //aur substring mai , ke baat kuch na likha ho to ending taak yani (n-1) taak jata hai
            String NewStr = str.substring(0, i) + str.substring(i+1);
            findPermutation(NewStr, ans+cur);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        findPermutation(str, "");
    }
}
