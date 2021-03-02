package CadenasJava;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class operaciones {

	public static void main(String[] args) throws IOException {
		
        @SuppressWarnings("resource")
		Scanner Entrada = new Scanner(System.in);
        boolean salir = false;
        int opcion;

       while(!salir){

            System.out.println("\nBienvenido, éstos son los operadores con cadenas: ");
            System.out.println("1. Tamaño de una cadena");
            System.out.println("2. Subcadena");
            System.out.println("3. Comparación de palabras");
            System.out.println("4. comparación de tamaño");
            System.out.println("5. salir");

        try{
        	
            System.out.println("\nSeleccione una opción ");
            opcion = Entrada.nextInt();

            @SuppressWarnings("resource")
			Scanner Entrada1 = new Scanner(System.in);
            String Cadena1;
            
            @SuppressWarnings("resource")
			Scanner Entrada2 = new Scanner(System.in);
            String Cadena2;
            int Opcion2, NCade;
            
            @SuppressWarnings("resource")
			Scanner Entrada2_0 = new Scanner(System.in);
            
            @SuppressWarnings("resource")
			Scanner Entrada2_1 = new Scanner(System.in);
			int Parametro;
            String Subcadena;
            
            @SuppressWarnings("resource")
			Scanner Entrada2_2 = new Scanner(System.in);
            int Parametro2;
            
            @SuppressWarnings("resource")
			Scanner Entrada2_3 = new Scanner(System.in);
            int Parametro3;
            
            @SuppressWarnings("resource")
			Scanner Entrada3 = new Scanner(System.in);
            String Cadena3;
            String Cadena3_0;
            
            @SuppressWarnings("resource")
			Scanner Entrada3_0 = new Scanner(System.in);
            
            @SuppressWarnings("resource")
			Scanner Entrada3_1 = new Scanner(System.in);
            int Opcion3;
            
            @SuppressWarnings("resource")
			Scanner Entrada4 = new Scanner(System.in);
            String Cadena4;
            String Cadena4_0;
           
            @SuppressWarnings("resource")
			Scanner Entrada4_0 = new Scanner(System.in); 
            int Opcion4, NCade4, NCade4_0;
            
            @SuppressWarnings("resource")
			Scanner Entrada4_1 = new Scanner(System.in);
            
            switch (opcion){

                case 1:

                    System.out.println("\nTamaño de tu cadena ejemplo: Casa = 4");
                    System.out.println("Ingresa tu cadena: ");
                    Cadena1 = Entrada1.nextLine();
                    System.out.println("\nCadena Ingresada: " + Cadena1);
                    System.out.println("Tamaño de la cadena: " + Cadena1.length());

                    break;
                    
                case 2:
                	
                	System.out.println("\nSubcadena, ¿Cómo funciona?");
                	System.out.println("Necesito que ingreses los parámetros");
                	System.out.println("de la subcadena que quieras crear de ");
                	System.out.println("la cadena orginial. Recuerda que funciona así:");
                	System.out.println("Hola Mundo");
                	System.out.println("0123456789");
                	System.out.println("Necesito que ingreses la cadena orgininal");
                	System.out.println("y luego ingreses el valor inical y el final");
                	System.out.println("de la subcadena que quieras imprimir, ejemplo: ");
                	System.out.println("De Hola Mundo necesito la subcadena de los valores");
                	System.out.println("del 5 en adelante, respuesta: Mundo");
                	
                	System.out.println("\nBueno, habiendo explicado como funciona ingresa");
                	System.out.println("la cadena original: ");
                	Cadena2 = Entrada2.nextLine();
                	
                	NCade = Cadena2.length();
                	
                	System.out.println("\n¿Necesitas usar dos parámetros? Ejemplo:");
                	System.out.println("Hola Mundo quiero de 0 a 4, respuesta: Hola");
                	System.out.println("O de un solo parámetro de 0 en adelante, R/: Hola Mundo\n");
                	System.out.println("1. Un parámetro");
                	System.out.println("2. Dos parámetros");
                	System.out.println("¿Cuál?: ");
                	Opcion2 = Entrada2_0.nextInt();
                	
                	if(Opcion2 == 1) {
                		
                		System.out.println("\nIngresa tú parámetro, de 0 a " + NCade);
                		System.out.println("Tú cadena orginal es: " + Cadena2);
                		Parametro = Entrada2_1.nextInt();
                		
                		if(Parametro <= Cadena2.length()) {
                			
                    		Subcadena = Cadena2.substring(Parametro);
                    		System.out.println("\nTu Subcadena es: " + Subcadena);
                			
                		}else if(Parametro > Cadena2.length()){
                			
                			System.out.println("\nError, parametro fuera del rango.");
                		}
                		
                	}else if(Opcion2 == 2) {
                		
                		System.out.println("\nIngresa tus parámetros, de 0 a " + NCade);
                		System.out.println("Tú cadena orginal es: " + Cadena2);
                		System.out.println("Primer parámetro: ");
                		Parametro2 = Entrada2_2.nextInt();
                		System.out.println("Segundo parámetro: ");
                		Parametro3 = Entrada2_3.nextInt();
                		
                		if(Parametro2 <= Cadena2.length()) {
                			if(Parametro3 <= Cadena2.length()) {
                        		Subcadena = Cadena2.substring(Parametro2, Parametro3);
                        		System.out.println("\nTu Subcadena es: " + Subcadena);
                			}
                			
                		}else if(Parametro2 > Cadena2.length()){
                			
                			System.out.println("\nError, parametro fuera del rango.");
                			
                		}else if(Parametro3 > Cadena2.length()){
                			
                			System.out.println("\nError, parametro fuera del rango.");
                		}
                			
                	}
                				
                    break;
                    
                case 3:
                	
                	System.out.println("\nComparar dos cadenas");
                    System.out.println("Ingresa tu primera cadena: ");
                    Cadena3 = Entrada3.nextLine();
                    
                    System.out.println("\nIngresa tu segunda cadena: ");
                    Cadena3_0 = Entrada3_0.nextLine();
                    
                    System.out.println("\n¿Quieres ignorar las Mayúsculas en la comparacción?");
                    System.out.println("1. Sí");
                    System.out.println("2. No");
                    System.out.println("Elije la opción: ");
                    Opcion3 = Entrada3_1.nextInt();
                    
                    if (Opcion3 == 1){

                        if(Cadena3.equalsIgnoreCase(Cadena3_0)){
                        	
                            System.out.println("\n" + Cadena3 + " y " + Cadena3_0 + " son iguales.");
                            
                        }else{
                        	
                            System.out.println("\n" + Cadena3 + " y " + Cadena3_0 + " No son iguales.");
                        }
                        
                    }else if(Opcion3 == 2){
                    	
                        if(Cadena3.equals(Cadena3_0)){
                        	
                        	System.out.println("\n" + Cadena3 + " y " + Cadena3_0 + " son iguales.");
                            
                        }else{
                        	
                        	System.out.println("\n" + Cadena3 + " y " + Cadena3_0 + " No son iguales.");
                        }
                        
                    }else{
                    	
                        System.out.println("\nOpcion incorrecta :)");
                    }
                	           	
                    break;
                    
                case 4:
                	
                    System.out.println("\nComparar el tamaño de las cadenas");
                    System.out.println("Ingresa tu primera cadena: ");
                    Cadena4 = Entrada4.nextLine();
                    
                    System.out.println("\nIngresa tu segunda cadena: ");
                    Cadena4_0 = Entrada4_0.nextLine();
                    
                    System.out.println("\n¿Quieres ignorar los espacios sin texto?");
                    System.out.println("1. Sí");
                    System.out.println("2. No");
                    System.out.println("Elije la opción: ");
                    Opcion4 = Entrada4_1.nextInt();
                   
                    if (Opcion4 == 1){
                    	
                        NCade4 = Cadena4.replace(" ","").length();
                        NCade4_0 = Cadena4_0.replace(" ","").length();
                        
                        if(NCade4 == NCade4_0){
                        	
                            System.out.println("\n" + Cadena4 + " (" + NCade4 + ") " + " y " + Cadena4_0 + " (" + NCade4_0 + ") ");
                            System.out.println("Después de compararlas, ambas tiene la misma cantidad");
                            System.out.println("de carácteres sin contar los espacios.");
                        
                        }else{
                        	
                            System.out.println("\n" + Cadena4 + " (" + NCade4 + ") " + " y " + Cadena4_0 + " (" + NCade4_0 + ") ");
                            System.out.println("Después de compararlas, No tienen la misma cantidad");
                            System.out.println("de carácteres sin contar los espacios.");
                        }
                        
                    }else if(Opcion4 == 2){

                        if(Cadena4.length() == Cadena4_0.length()){
                        	
                            System.out.println("\n" + Cadena4 + " (" + Cadena4.length() + ") " + " y " + Cadena4_0 + " ("+ Cadena4_0.length() + ") ");
                            System.out.println("Después de compararlas, ambas tiene la misma cantidad");
                            System.out.println("de carácteres tomando en cuenta los espacios.");
                            
                        }else{
                        	
                            System.out.println("\n" + Cadena4 + " (" + Cadena4.length() + ") " + " y " + Cadena4_0 + " (" + Cadena4_0.length() + ") ");
                            System.out.println("Después de compararlas, No tienen la misma cantidad");
                            System.out.println("de carácteres tomando en cuenta los espacios.");
                        }
                        
                    }else{
                    	
                    	System.out.println("\nOpcion incorrecta :)");
                    }                	
                	
                    break;
                    
                case 5:
                	
                	System.out.println("\nGracias por usar el programa :)");
                    salir = true;
                    
                    break;
                    
                default:
                	
                    System.out.println("\nOpcion incorrecta");

            }

        }catch (InputMismatchException e) {
        	
            System.out.println("Lo que ingresaste no está en el área.");
            Entrada.next();
        }
        }

	}

}
