public class D_StringcharAt {
    public static void printLetter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String firstname = "Yash";
        String lastname = "Hibare";

        String fullname = firstname + " " + lastname;
        printLetter(fullname);
    }
}
