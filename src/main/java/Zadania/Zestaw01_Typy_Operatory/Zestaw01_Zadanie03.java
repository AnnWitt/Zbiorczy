package Zadania.Zestaw01_Typy_Operatory;

public class Zestaw01_Zadanie03 {

    public static void main(String[] args) {

        System.out.println("a "+ (false==false));
        System.out.println("b "+ (false!=true));
        System.out.println("c "+ (!false));
        System.out.println("d "+ (2>4));
        System.out.println("e "+ (3<5));
        System.out.println("f "+ (3==3 && 3==4)); //i
        System.out.println("g "+ (3!=5 || 3==5)); //lub
        System.out.println("h "+ ((2+4)>(1+3)));
        System.out.println("i "+ ("cos".equals("cos")));
        System.out.println("j "+ ("cos"=="cos"));
    }
}
