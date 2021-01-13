package ee.bcs.valiit.tasks;

public class Lesson1 {

    public static void main(String[] args) {
        excersie1();
        excersie2();
        excersie3();
        excersie4();
    }

    // TODO
    // defineeri 3 muutujat a = 1, b = 1, c = 3
    public static void excersie1 (){
    int a=1;
    int b=2;
    int c=3;
        System.out.println(a==b);
        System.out.println(a==c);

    // Prindi välja a==b ja a==c
    a = c;
    // Lisa rida a = c
        System.out.println(a==b);
        System.out.println(a==c);
    }
    // Prindi välja a==b ja a==c, mis muutus???


    // TODO
    // Loo muutujad x1 = 10 ja x2 = 20, vali sobiv andmetüüp
    public static void excersie2(){
    int x1=10;
    int x2=20;
    int y1=++x1;
    int y2=x2++;

    // Tekita muutuja y1 = ++x1, trüki välja nii x1 kui y1

    System.out.println(x1);
        System.out.println(y1);
    // Tekita muutuja y2 = x2++, trüki välja nii x2 ja y2
        System.out.println(x2);
        System.out.println(y2);
    }
    // Analüüsi tulemusi


    // TODO
    // Loo arvulised muutujad
    // a = 18 % 3
    // b = 19 % 3
    // c = 20 % 3
    // d = 21 % 3
    // Prindi välja kõigi muutujate väärtused
    public static void excersie3(){
        int a = 18 % 3;
        int b = 19 % 3;
        int c = 20 % 3;
        int d = 21 % 3;
        System.out.println(a + " " + b + " " + c + " " + d );
    }


    // TODO
    // Defineeri String tüüpi muutuja mille sisu oleks "\"\\""
    // Trüki muutuja sisu välja
    public static void excersie4(){
        System.out.println("\"\\\"\\\\\"\"");
    }

}
