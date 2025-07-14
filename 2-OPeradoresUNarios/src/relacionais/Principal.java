package relacionais;

public class Principal {
    public static void main(String[] args) {

        //operador de ==
//        int numero1 = 10;
//        int numero2 = 10;
//
//        boolean simNao = numero1 == numero2;
//        System.out.println("O numero " + numero1 + " é igual ao " + numero2  + "? " + simNao);
//
//        //Operador de diferente
//         simNao = numero1 != numero2;
//        System.out.println(simNao);
//
//        //Operador MAIOR
//        simNao = numero1 > numero2;
//        System.out.println("O numero " + numero1 + " é MAIOR que o número " + numero2 + " ? " +  simNao);
//
//        //Operador MAIOR OU IGUAL
//        simNao = numero1 >= numero2;
//        System.out.println("O numero " + numero1 + " é MAIOR ou IGUAL ao número " + numero2 + " ? " +  simNao);
//
//        //Operador MENOR
//        simNao = numero1 < numero2;
//        System.out.println("O numero " + numero1 + " é MENOR que o número " + numero2 + " ? " +  simNao);
//
//        //Operador MENOR ou IGUAL
//        simNao = numero1 <= numero2;
//        System.out.println("O numero " + numero1 + " é MENOR ou IGUAL ao número " + numero2 + " ? " +  simNao);


        double temperatura = 4.0;
        boolean estaFrio = (temperatura < 5.0);
        if(estaFrio) {
            System.out.println("Hoje está frio.");
        }else {
            System.out.println("Hoje está um dia quente.");
        }

        

    }
}
