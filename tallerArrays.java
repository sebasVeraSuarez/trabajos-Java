
// import java.util.Scanner;

// public class calculadora {
//     public static void main(String[] args) {
//         String [] opcion = {"sumar","restar","dividir","multiplicar"};

//         for(int i = 0;i<opcion.length;i++){
//             System.out.println((i+1) + ". " + opcion[i]);          
//         }
//         Scanner scanner = new Scanner(System.in);
//             System.out.println("Elija una operacion: ");
//             int elegir = scanner.nextInt();
//             if(elegir < 1 || elegir > 4){
//                 System.out.println("opcion invalida");
//                 return;
//             }
//             System.out.println("Ingrese el primer numero: ");
//             int numero1 = scanner.nextInt();
//             System.out.println("Ingrese el segundo numero: ");
//             int numero2 = scanner.nextInt();
//             switch(elegir){
//                 case 1:
//                     System.out.println("El resultado es: " + (numero1 + numero2));
//                     break;
//                 case 2:
//                     System.out.println("El resultado es: " + (numero1 - numero2));
//                     break;
//                 case 3:
//                     System.out.println("El resultado es: " + (numero1 / numero2));
//                     break;
//                 case 4:
//                     System.out.println("El resultado es: " + (numero1 * numero2));
//                     break;
//         }
//         scanner.close();
//     }
// }


//ejercicio 2 y 4
// import java.util.Scanner;
// public class productos{
//     public static void main (String args[]){
//         Scanner in = new Scanner(System.in);

//         String products[] ={"papas","gaseosa","gomitas"};
//         int price []= {2000,3000,1000};
        
//         System.out.println("lista de productos");
//         for (int i = 0;i < products.length; i++) {
//             System.out.println((i + 1)+ "."+ products[i]+ "$"+ price[i]);
//         }

       

//         int[] cantidades = new int[products.length];
//         for (int i = 0; i < products.length; i++) {
//             System.out.print("¿Cuántas unidades de " + products[i] + " deseas? ");
//             cantidades[i] = in.nextInt();
//         }
//         int total = 0;
//         for (int i = 0; i < products.length; i++) {
//             total += cantidades[i] * price[i];
//         }
//         if(total >= 1000){  // ejercicio 4
//             System.out.println("su descuento es de 25%");
//         System.out.println("\nEl total de tu compra es: $" + (total-(total*25/100)));
//         }else if(total >= 500){                                                            
//             System.out.println("su descuento es de 20%");
//         System.out.println("\nEl total de tu compra es: $" + (total-(total*20/100)));
//         }else if(total >= 300){
//             System.out.println("su descuento es de 15%");
//         System.out.println("\nEl total de tu compra es: $" + (total-(total*15/100)));
//         }else if(total >= 200){
//             System.out.println("su descuento es de 10%");
//         System.out.println("\nEl total de tu compra es: $" + (total-(total*10/100)));
//         }

//     }
// }


//ejercicio 3
// import java.util.Scanner;
// public class calificacionPromedio {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double totalNotas = 8;
//         System.out.println("Ingrese la cantidad de notas obtenidas: ");
//         int cantidadNotasObtenidas = scanner.nextInt()+1;
//         if(cantidadNotasObtenidas > 8 || cantidadNotasObtenidas < 0){
//             System.out.println("La cantidad de notas debe ser entre 0 y 7");
//             return;
//         }

//         double[] notas = new double[cantidadNotasObtenidas];
//         for(int i=1;i<cantidadNotasObtenidas;i++){
//             System.out.println("Ingrese la calificacion " + (i) + ": ");
//             notas[i-1] = scanner.nextDouble();
//             if(notas[i-1] < 0 || notas[i-1] > 100){
//                 System.out.println("La calificacion debe ser entre 0 y 100");
//                 return;
//             }
//         }
//         double sumaNotas = 0;
//         for(double nota : notas){
//             sumaNotas += nota;
//         }
//         double promedio = sumaNotas / (cantidadNotasObtenidas -1);
//         double notaMinima = 76;
//         double notaNecesaria = notaMinima - promedio;
//         System.out.println("El promedio necesario en las notas restantes para aprobar es: " + notaNecesaria);
//     }
// }



// ejercicio 5
// import java.util.Scanner;
// public class buscarLetra {
//     public static void main(String[] args) {
//         String [] palabraUsuario = new String [1];
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Ingrese una palabra: ");
//         palabraUsuario[0] = scanner.nextLine();
//         System.out.println("Ingrese la letra que desea saber su posicion: ");
//         String letraUsuario = scanner.nextLine();
//         int posicion = 0;
//         for(int i = 0; i < palabraUsuario[0].length(); i++){
//             if(palabraUsuario[0].charAt(i) == letraUsuario.charAt(0)){
//                 posicion = i+1;
//                 break;
//             }
//         }
//         if(posicion == 0){
//             System.out.println("La letra no se encuentra en la palabra");
//         }else{
//             System.out.println("La letra '" + letraUsuario + "' se encuentra en la posicion " + posicion);
//         }
//     }
// }




//ejercicio 6
// import java.util.Scanner;
// import javax.swing.text.Position;
// public class nombre{
//     public static void main(String args[]) {
//         Scanner in = new Scanner (System.in);
//         String[] nombres = {"deiby","sabastian","camilo","salome"};
//         System.out.println("ingresa un nombre ");
//         String name =in.nextLine();
//         boolean encontrado = false;
//         int posicion = -1; 
//         for (int i = 0;i < nombres.length;i++) {
//             if (nombres[i].equalsIgnoreCase(name)) {
//                 encontrado = true;
//                 posicion = i;
//                 break;              
//             }        
//         }
//         if(encontrado){
//             System.out.println("el nombre "+name+" esta en la posicion "+(posicion+ 1));
//         }else{
//             System.out.println("el nombre "+name+" no se encuentra ");          
//         }    
//     }
// }



// ejercicio 7 y 8
// public class matriz {
//     public static void main(String[] args) {
//         int [][] matriz = {
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//         };
//         System.out.println("Matriz original:");
//         for (int i = 0; i < matriz.length; i++) {
//             for (int j = 0; j < matriz[0].length; j++) {
//                 System.out.print(matriz[i][j] + " ");
//             }
//             System.out.println();
//         }
//         int auxiliar;
//         for(int i=0; i<matriz.length; i++){
//             for (int j = 0;j<i;j++){
//                 auxiliar = matriz[i][j];
//                 matriz[i][j] = matriz[j][i];
//                 matriz[j][i] = auxiliar;
//             }
//         }
//         System.out.println("Matriz transpuesta:");
//         for(int i=0; i<matriz.length; i++){
//             for(int j=0; j<matriz.length; j++){
//                     System.out.print(matriz[i][j] + " ");
//             }
//             System.out.println();
//         }

//         //PUNTO 8
//         if(matriz.length != matriz[0].length){
//             System.out.println("La matriz es simetrica");
//         }else{
//             System.out.println("La matriz no es simetrica");
//         }
//     }
// }



//ejercicio 9
// public  class numeroMayor{
//     public static void main (String args []){
//         int[] array ={1,1,3,4,4};
//         int  tamañoarray = array.length;
//         int [] conteorepetidos = new int [tamañoarray];

//         for(int i = 0;i < tamañoarray; i++){
//             int elemtoActual = array[i];
//             for( int j = 0;j < tamañoarray;j++){
//                 if (array[j] == elemtoActual)
//                 conteorepetidos[i]++;
//             }

//         } 
//         for(int i = 0; i < tamañoarray ; i++){
//             int elememtos = array[i];
//             int repetidos = conteorepetidos[i];
//             System.out.println("el elemento "+ elememtos+ " esta repetido "+ repetidos);
//         }

//     }
// }




//punto 10
// public class ordenInvertido {
//     public static void main(String[] args) {
//         int [] arreglo = {1,2,3,4,5};
//         System.out.println("Arreglo original:");
//         for(int i=0; i<arreglo.length; i++){
//             System.out.print(arreglo[i] + " ");
//         }
//         System.out.println();
//         System.out.println("Arreglo invertido:");
//         for(int i=arreglo.length-1; i>=0; i--){
//             System.out.print(arreglo[i] + " ");
//         }
//         System.out.println();
//     }
// }






    



