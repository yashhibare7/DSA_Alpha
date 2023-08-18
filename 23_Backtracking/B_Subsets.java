public class B_Subsets {
    public static void findSubset(String str,String ans,int i){
        //Base
        if(i==str.length()){
            if(ans.length()==0){
             System.out.println("null");
            }else{
             System.out.println(ans);
            }
            return;
        }

        //Jaab string add hona chahata hai taab
        findSubset(str, ans+str.charAt(i), i+1);
        //Jaab string add na hona chahata hai taab
        findSubset(str,ans,i+1);

    }
    public static void main(String args[]){
        String str = "abc";
        findSubset(str,"",0);
    }
}
