using System;

namespace Operadores
{
    class Program
    {
        static void Main(string[] args)
        {
            while(true){
                System.Console.Clear();
                Console.WriteLine(" OPERADORES BÁSICOS DE MATEMÁTICAS ");
                Console.WriteLine("===================================" + "\n" + 
                "Elije una opción: " + "\n" + 
                "1. Suma" + "\n" +
                "2. Resta" + "\n" + 
                "3. Multiplicación" + "\n" +
                "4. Divisón y Módulo" + "\n" + 
                "5. Salida" + "\n" + 
                "=================================" + "\n" + 
                "Elije una opción: ");
                int opcion = int.Parse(Console.ReadLine());

                if(opcion == 1){
                    System.Console.Clear();

		            Console.WriteLine(" Bienvenido, en ésta área puedes sumar " + "\n" +
                    "dos cantidades que desees ingresar :)" + "\n");

                    SUMA();
                    
                }

                else if(opcion == 2){
                    System.Console.Clear();

                    Console.WriteLine(" Bienvenido en ésta área puedes restar " + "\n" +
                    "dos cantidades que desees ingresar :)");

                    RESTA();

                }

                else if(opcion == 3){
                    System.Console.Clear();

                    Console.WriteLine(" Bienvenido en ésta área puedes multiplicar " + "\n" +
                    "dos cantidades que desees ingresar :)");
                    
                    MULTIPLICACION();

                }

                else if(opcion == 4){
                    System.Console.Clear();

                    Console.WriteLine(" Bienvenido en ésta área puedes Dividir y sacar " + "\n" +
                    "el módulo de dos cantidades que desees ingresar :)");
                    
                    DIVISION_MODULO();

                }

                else if(opcion == 5){
                    System.Console.Clear();

                    Console.WriteLine("\n" + "Gracias por usar el programa ;) " + "\n" +
                    "Creado por Bradley Jacinto GitHub: Bradleyivme\n");
                    break;
                    

                }
                else{
                    System.Console.Clear();
                    Console.WriteLine("=========================================\n" + 
                    "No hay ninguna opción como la que ingresó. \n" +
                    "=========================================");
                }
                Console.WriteLine("\n" + "=============================" +
                "\nPresione enter para continuar. ");
                Console.ReadKey();
            }
        }

        static void SUMA(){

            Console.WriteLine("Ingresa la primera cantidad: ");
            Double C1 = int.Parse(Console.ReadLine());
            Console.WriteLine("\n" + "Ingresa la segunda cantidad: ");
            Double C2 = int.Parse(Console.ReadLine());

            Double Respuesta = C1 + C2;

            Console.WriteLine("\n" + "La respuesta de " + C1 + " + " + C2 + " es: " + Respuesta + "\n" +
            "Gracias por usar el programa :)");

        }

        static void RESTA(){

            Console.WriteLine("\nIngresa la primera cantidad: ");
            Double C1 = int.Parse(Console.ReadLine());
            Console.WriteLine("\n" + "Ingresa la segunda cantidad: ");
            Double C2 = int.Parse(Console.ReadLine());

            Double Respuesta = C1 - C2;

            Console.WriteLine("\n" + "La respuesta de " + C1 + " - " + C2 + " es: " + Respuesta + "\n" +
            "Gracias por usar el programa :)");

        }

        static void MULTIPLICACION(){

            Console.WriteLine("\nIngresa la primera cantidad: ");
            Double C1 = int.Parse(Console.ReadLine());
            Console.WriteLine("\n" + "Ingresa la segunda cantidad: ");
            Double C2 = int.Parse(Console.ReadLine());

            Double Respuesta = C1 * C2;

            Console.WriteLine("\n" + "La respuesta de " + C1 + " * " + C2 + " es: " + Respuesta + "\n" +
            "Gracias por usar el programa :)");

        }

        static void DIVISION_MODULO(){

            Console.WriteLine("\n" + "Ingresa la primera cantidad: ");
            Double C1 = int.Parse(Console.ReadLine());
            Console.WriteLine("\n" + "Ingresa la segunda cantidad: ");
            Double C2 = int.Parse(Console.ReadLine());

            if (C2 == 0){
                Console.WriteLine("ERROR");
            }
            else{
                Double Respuesta = C1 / C2;
                Console.WriteLine("\n" + "La respuesta de " + C1 + " / " + C2 + " es: " + Respuesta + "\n" +
                "Gracias por usar el programa :)");

                Double Respuesta2 = C1 % C2;
                Console.WriteLine("\nEl módulo que surge de dividir " + C1 + " entre " + C2 + " es: " + Respuesta2);
            }

        }  
    }
}
