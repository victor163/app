package info.javaway.web.servlets;

public class ButtonClass {
    int x;
    int B[] = new int[4];
    int A[] = new int[4];
    int j=0;
    final int rnd1 = 1;
    final int rnd2 = 2;
    final int rnd3 = 3;
    final int rnd4 = 4;
    int x1=0,x2=0,x3=0,x4=0;
    int kollvoPopitok=0;


    public int button1() {
        x = 1;
        if (x1==0) {
            return x1=1;
        }else if (x2==0) {
            return x2=1;
        }else if (x3==0) {
            return x3=1;
        }else if (x4==0){
            return x4=1;
        }
        return 0;
    }
    public int button2() {
        x = 2;
        if (x1==0) {
            return x1=2;
        }else if (x2==0) {
            return x2=2;
        }else if (x3==0) {
            return x3=2;
        }else if (x4==0){
            return x4=2;
        }
        return 0;
    }
    public int button3() {
        x = 3;
        if (x1==0) {
            return x1=3;
        }else if (x2==0) {
            return x2=3;
        }else if (x3==0) {
            return x3=3;
        }else if (x4==0){
            return x4=3;
        }
        return 0;
    }
    public int button4() {
        x = 4;
        if (x1==0) {
            return x1=4;
        }else if (x2==0) {
            return x2=4;
        }else if (x3==0) {
            return x3=4;
        }else if (x4==0){
            return x4=4;
        }
        return 0;
    }
    public int button5() {
        x = 5;
        if (x1==0) {
            return x1=5;
        }else if (x2==0) {
            return x2=5;
        }else if (x3==0) {
            return x3=5;
        }else if (x4==0){
            return x4=5;
        }
        return 0;
    }
    public int button6() {
        x = 6;
        if (x1==0) {
            return x1=6;
        }else if (x2==0) {
            return x2=6;
        }else if (x3==0) {
            return x3=6;
        }else if (x4==0){
            return x4=6;
        }
        return 0;
    }
    public int button7() {
        x = 7;
        if (x1==0) {
            return x1=7;
        }else if (x2==0) {
            return x2=7;
        }else if (x3==0) {
            return x3=7;
        }else if (x4==0){
            return x4=7;
        }
        return 0;
    }
    public int button8() {
        x = 8;
        if (x1==0) {
            return x1=8;
        }else if (x2==0) {
            return x2=8;
        }else if (x3==0) {
            return x3=8;
        }else if (x4==0){
            return x4=8;
        }
        return 0;
    }
    public int button9() {
        x = 9;
        if (x1==0) {
            return x1=9;
        }else if (x2==0) {
            return x2=9;
        }else if (x3==0) {
            return x3=9;
        }else if (x4==0){
            return x4=9;
        }
        return 0;
    }
    public int button0() {
        x = 0;
        if (x1==0) {
            return x1=0;
        }else if (x2==0) {
            return x2=0;
        }else if (x3==0) {
            return x3=0;
        }else if (x4==0){
            return x4=0;
        }
        return 0;
    }

   public String bikKorov(){
       j=0;
       int korova=0;
       int bik=0;
       A[0] = rnd1;
       A[1] = rnd2;
       A[2] = rnd3;
       A[3] = rnd4;
       B[0] = x1;
       B[1] = x2;
       B[2] = x3;
       B[3] = x4;

        for (int i = 0; i < 4; i++) {
            if (A[i] == B[0]) korova++;
            if (A[i] == B[1]) korova++;
            if (A[i] == B[2]) korova++;
            if (A[i] == B[3]) korova++;
            if (A[i] == B[i]) bik++;
        }
        kollvoPopitok++;
        x1=0;
        x2=0;
        x3=0;
        x4=0;
        String otvet=bik+"B"+korova+"K";
        return otvet;
    }
    public String getKollvoPopitok(){
       String kp="Kol-vo popitok="+kollvoPopitok;
       return kp;
    }
}
