//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        funcionCompuesta();
        printHelloWorld();
        printAny(retornaWorld());
        System.out.println(suma(54,76));

        System.out.println(opcional("Pancho","Villa"));
    }

    static int variableGloval = 10; // Variable Global

    // Funciones sin parametro ni retorno
    public static void printHelloWorld(){
        System.out.println("¡Hello World!");
    }

    // Funciones con parametro sin retorno
    public static void printAny(String arg){
        System.out.println("¡Hello " + arg + "!");
    }

    // Funciones con parametros y retorno
    public static int suma(int a, int b){
        int res = a + b + variableGloval;
        return res;
    }

    // Funciones sin parametro y con retorno
    public static String retornaWorld(){
        return "World";
    }

    /*
    En java no se pueden hacer funciones dentro
    de funciones pero se pueden hacer funciones compuestas
    */

    public static void funcionCompuesta(){
        int a = 15, b = 4; // Variables Locales
        int suma = suma(a,b);
        printHelloWorld();
        printAny(retornaWorld());
        System.out.println(suma);
    }

    public static int opcional(String a, String b){
        int cont = 0;
        for (int i = 1; i < 101; i++){
            if((i % 3) == 0 && (i % 5) == 0){
                System.out.println(a + b);
            } else if ((i % 3) == 0 ) {
                System.out.println(a);
            } else if ((i % 5) == 0){
                System.out.println(b);
            } else {
                System.out.println(i);
                cont++;
            }
        }
        return cont;
    }
}