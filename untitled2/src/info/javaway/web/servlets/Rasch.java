package info.javaway.web.servlets;



public class Rasch {
  /*  int rnd1 = 0, rnd2 = 0, rnd3 = 0, rnd4 = 0;

    public int xN() {
        ButtonClass buttonClass = new ButtonClass();
        int x1 = buttonClass.x1;
        int x2 = buttonClass.x2;
        int x3 = buttonClass.x3;
        int x4 = buttonClass.x4;
        rasch(x1, x2, x3, x4);
        return x1;
    }


    public void rasch(int x1, int x2, int x3, int x4) {

        int korova = 0;
        int bik = 0;
        int A[] = new int[4];
        int B[] = new int[4];
        B[0] = x1;
        B[1] = x2;
        B[2] = x3;
        B[3] = x4;
        rnd(rnd1, rnd2, rnd3, rnd4);
        A[0] = rnd1;
        A[1] = rnd2;
        A[2] = rnd3;
        A[3] = rnd4;

        for (int i = 0; i < 4; i++) {
            if (A[i] == x1) korova++;
            if (A[i] == x2) korova++;
            if (A[i] == x3) korova++;
            if (A[i] == x4) korova++;
            if (A[i] == B[i]) bik++;
        }
        String x = bik + "B" + korova + "K";
        if (bik == 4) {
            String s = "win";
            return;
        }
    }

    void chisol1() {
        rnd1 = (int) (Math.random() * 10);
    }

    void chisol2() {
        rnd2 = (int) (Math.random() * 10);
    }

    void chisol3() {
        rnd3 = (int) (Math.random() * 10);
    }

    void chisol4() {
        rnd4 = (int) (Math.random() * 10);
    }

    void rnd(int x1, int x2, int x3, int x4) {
        chisol1();
        do {
            chisol2();
        }
        while (x2 == x1);
        do {
            do {
                chisol3();
            } while (x3 == x1);
        } while (x3 == x2);
        do {
            do {
                do {
                    chisol4();
                } while (x4 == x1);
            } while (x4 == x2);
        } while (x4 == x3);
    }
*/
}