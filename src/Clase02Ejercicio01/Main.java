package Clase02Ejercicio01;

public class Main {
    public static void main(String[] args) {

        AscendenteDescendente(2,30,17,'a');
        // Ingrese 'a' para Ascendente o 'd' para Descendente
    }

    private static void AscendenteDescendente( int num1, int num2, int num3, char letra) {
        switch (letra){
            case 'a':
                ascendente(num1,num2,num3);
                break;
            case 'd':
                descendente(num1,num2,num3);
                break;
            default:
                System.out.println("Ingrese 'a' para ascendente o 'd' para descendente...");
        }
    }


    private static void ascendente ( int num1, int num2, int num3){
        if((num1 < num2 && num1 < num3 && num2 < num3)){
            System.out.println(num1+" "+num2+" "+num3);
        }else if((num1 < num2 && num1 < num3 && num3 < num2)){
            System.out.println(num1+" "+num3+" "+num2);
        }

        if((num2 < num1 && num2 < num3 && num1 < num3)){
            System.out.println(num2+" "+num1+" "+num3);
        }else if((num2 < num1 && num2 < num3 && num3 < num1)){
            System.out.println(num2+" "+num3+" "+num1);
        }

        if((num3 < num1 && num3 < num2 && num1 < num2)){
            System.out.println(num3+" "+num1+" "+num2);
        }else if((num3 < num1 && num3 < num2 && num2 < num1)){
            System.out.println(num3+" "+num2+" "+num1);
        }
    }

    private static void descendente ( int num1, int num2, int num3){
        if((num1 > num2 && num1 > num3 && num2 > num3)){
            System.out.println(num1+" "+num2+" "+num3);
        }else if((num1 > num2 && num1 > num3 && num3 > num2)){
            System.out.println(num1+" "+num3+" "+num2);
        }

        if((num2 > num1 && num2 > num3 && num1 > num3)){
            System.out.println(num2+" "+num1+" "+num3);
        }else if((num2 > num1 && num2 > num3 && num3 > num1)){
            System.out.println(num2+" "+num3+" "+num1);
        }

        if((num3 > num1 && num3 > num2 && num1 > num2)){
            System.out.println(num3+" "+num1+" "+num2);
        }else if((num3 > num1 && num3 > num2 && num2 > num1)){
            System.out.println(num3+" "+num2+" "+num1);
        }
    }
}
