package Tema2;

public class PerecheNumere {
    private int a;
    private int b;
    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }
    public PerecheNumere(){}
    public PerecheNumere(int a, int b){
        super();
        this.a = a;
        this.b = b;
    }
    private boolean esteFib(int n) {
        int a = 0, b = 1, c;
        if (n == a || n == b)
            return true;
        while (true) {
            c = a + b;
            if (c == n)
                return true;
            if (c > n)
                return false;
            a = b;
            b = c;
        }
    }
    public boolean suntConsecutive() {
        return esteFib(a) && esteFib(b);
    }

    public int cmmmc() {
        return (a* b) / cmmdc(a, b);
    }

    private int cmmdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    @Override
    public String toString(){
        return a+" , "+b;
    }
}
