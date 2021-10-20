package fundamentos;

// byte  > short > int > long (0implicita)
// long > int > short > byte  (Explicita)

public class CastPrimToNumerico {
    public static void main(String[] args) {
        double a =1;// implicita

        float b = (float) 1.333333; //explicita
        System.out.println(b);

        // java não considera valores mas sim os tipos (bite,int ... )
        int c =500;
        byte g=(byte) c; //explicita
        System.out.println(g);


        double e = 1.9999;
        int f = (int) e ;
        System.out.println(f);
    }
}
