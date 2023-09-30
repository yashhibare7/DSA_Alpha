public class L_FriendsPairingProblem {
    public static int Paire(int n){
        if(n == 1 || n == 2){
            return n;
        }

        //single
        int fnm1 = Paire(n-1);

        //Paire
        int fnm2 = (n-1)*Paire(n-2);

        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String args[]){
        System.out.println(Paire(3));
    }
}
