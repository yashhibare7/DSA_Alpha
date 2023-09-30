public class G_StringCompare {
    public static void main(String args[]){
        String s1 = "Yash";
        String s2 = "Yash";

        String s3 = new String("Yash");

        if(s1.equals(s2)){
            System.out.println("String are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("String are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
