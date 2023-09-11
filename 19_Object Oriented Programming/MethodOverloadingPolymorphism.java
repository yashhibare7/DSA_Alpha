public class MethodOverloadingPolymorphism {
    public static void main(String args[]){
        Calculator calc = new Calculator();
        System.out.println(calc.Sum((float)1.2, (float)2.3));
        System.out.println(calc.Sum(1, 3, 4));
        System.out.println(calc.Sum(3, 4));
    }
}

class Calculator{
    int Sum(int a, int b){
        return a+b;
    }

    int Sum(int a, int b,int c){
        return a+b+c;
    }

    float Sum(float a, float b){
        return a+b;
    }
}
