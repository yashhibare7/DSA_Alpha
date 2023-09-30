public class J_StringStringBuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch); //append mhanje char eka mage ek lavne
        }
        System.out.print(sb);
    }
}
