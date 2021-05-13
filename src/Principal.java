
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de provincias.");
        int op=0;
        Scanner scanner=new Scanner(System.in);
        Zona[] arrayZona=new Zona[0];
        Provincia[] arrayProvincia=new Provincia[0];
        while (op !=4) {
            System.out.println("Que desea hacer? \n 1)Crear zona geografica 2)Crear provincias 3)Mostrar datos 4)salir");
            op = scanner.nextInt();

            switch (op){

                case 1: {
                    System.out.println("Creando zona geografica:\n");
                    int n=0;
                    System.out.println("Cuantas zonas desea crear?");
                    n= scanner.nextInt();
                    arrayZona=new Zona[n];

                    for (int x=0; x<n; x++ ){

                                System.out.println("Inserte el nombre de la zona "+(x+1)+":" );
                                String name = scanner.next();
                                System.out.println("Inserte la superficia de la zona (km) "+(x+1)+":");
                                double surface = scanner.nextDouble();


                                Zona zona=new Zona(name, surface);
                                arrayZona[x]=zona;


                    }

                    break;
                }
                case 2:{
                    System.out.println("Creando provincia:\n");
                    int n=0;
                    System.out.println("Cuantas provincias desea crear?");
                    n= scanner.nextInt();
                    arrayProvincia=new Provincia[n];

                    for (int x=0; x<n; x++ ) {
                        System.out.println("Inserte el nombre de la zona de la provincia " + (x + 1)+":");
                        String name = scanner.next();
                        System.out.println("Inserte la superficie de la zona de la provincia " + (x + 1)+":");
                        double surface = scanner.nextDouble();
                        System.out.println("Inserte el idioma de la provincia " + (x + 1)+":");
                        String idioma = scanner.next();
                        System.out.println("Indique la moneda de la provincia " + (x + 1)+":");
                        String moneda = scanner.next();
                        System.out.println("Inserte el nombre del presidente de la provincia " + (x + 1)+":");
                        String presidente = scanner.next();

                        Provincia provincia = new Provincia( idioma, moneda, presidente, name, surface);
                        arrayProvincia[x] = provincia;

                    }
                        break;
                }
                case 3:{
                    System.out.println("\nDatos insertados en zonas:\n");
                    if(arrayZona.length !=0) {
                        for (int j = 0; j < arrayZona.length; j++) {
                            System.out.println("Zona " + (j + 1) + ": " + arrayZona[j].getName() + " con " + arrayZona[j].getSurface() + " km");
                        }
                    }else {
                        System.out.println("Sin datos.");
                    }
                    System.out.println("\nDatos insertados en provincias:\n");
                    if(arrayProvincia.length!=0) {
                        for (int j = 0; j < arrayProvincia.length; j++) {
                            System.out.println("Provincia " + (j + 1) + ": En este lugar se habla el idioma " + arrayProvincia[j].getIdioma() + " se utiliza el " + arrayProvincia[j].getMoneda() + " su presidente es " + arrayProvincia[j].getPreidente() + " se encuentra en la zona de " + arrayProvincia[j].getName() + " con " + arrayProvincia[j].getSurface() + " km");
                        }
                    }else {
                        System.out.println("Sin datos.\n");
                    }
                    break;
                }
                case 4:{
                    System.out.println("Gracias por utilizar el sistema.");
                    break;
                }
                default:{
                    System.out.println("Opcion no valida.");
                    break;
                }
            }

        }
    }



}
