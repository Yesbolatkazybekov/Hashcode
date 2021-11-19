package Hash;

public class Hashfunction {
    int k, m;
    float A;

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public float getA() {
        return A;
    }

    public void setA(float a) {
        A = a;
    }

    void hash_multiply(int k, int m) {
        int h1, h2;
        h1 = k % m;
        System.out.println("h1(" + k + ")=" + h1 + "mod(" + m + ")");
        int m2 = m - 1;
        h2 = k % m2;
        System.out.println("h2(" + k + ")=" + h2 + "mod(" + m + ")");
    }
}
