/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofinal;

import java.util.Scanner;

/**
 *
 * @author Smart
 */
public class TrabajoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String facebbok;
        String whatsapp;
        String signal;
        String flickr;
        int opcion;
        String opcion2;
        String cadena;
        boolean bandera = true;
        do {
            int contador = 0;
            System.err.println("Ingrese cualquiera de las opciones para crear una cuenta:");
            System.err.println("¨Ingrese 1 para crear una cuenta en Facebook: \n"
                    + "Ingrese 2 para crear una cuenta en Twitter: \n"
                    + "Ingrese 3 para crear una cuenta en Whatsapp: \n"
                    + "Ingrese 4 para crear una cuenta en Telegram: \n"
                    + "Ingrese 5 para crear una cuenta en Signal: \n"
                    + "Ingrese 6 para crear una cuenta en Instagram: \n"
                    + "Ingrese 7 para crear una cuenta en Flickr: \n");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    facebbok = crearFacebook();
                    System.out.println(facebbok);
                    contador = contador + 1;
                    break;
                case 2:
                    crearTwitter();
                    contador = contador + 1;
                    break;
                case 3:
                    whatsapp = crearWhatsapp();
                    System.out.println(whatsapp);
                    contador = contador + 1;
                    break;
                case 4:                 
                    crearTelegram();
                    contador = contador + 1;
                    break;
                case 5:
                    signal = crearSignal();
                    System.out.println(signal);
                    contador = contador + 1;
                    break;
                case 6:
                    crearInstagram();
                    contador = contador + 1;
                    break;
                case 7:
                    flickr = crearFlickr();
                    System.out.println(flickr);
                    contador = contador + 1;
                    break;
                default:
                    System.out.println("Error, intete colocar los numero presentados");
                    contador = contador - 1;
                    break;
            }
            System.out.println("Ingrese si para seguir creando cuentas: \n"
                    + "Ingrese no para dejar de crear cuentas: \n");
            opcion2 = entrada.nextLine();
                if (opcion2.equals ("no")) {
                    bandera = false;
                    cadena = obtenerMensaje(contador);
                    System.out.println(cadena);                                      
            }
        } while (bandera);
    }

    public static String crearFacebook() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String cadena;
        int edad;
        String ciudad;
        String pais;
        String idioma;
        String correo;
        System.out.println("Creando cuenta de Facebook");
        System.out.println("Ingrese su nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su pais:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su idioma:");
        idioma = entrada.nextLine();
        System.out.println("Ingrese su correo:");
        correo = entrada.nextLine();
        cadena = String.format("Nombre: %s\nEdad: %d\nCiudad: %s\nPais: %s\n"
                + "Idioma: %s\nCorreo: %s\n", nombre, edad, ciudad, pais, idioma, correo);
        return cadena;
    }

    public static void crearTwitter() {
        Scanner entrada = new Scanner(System.in);
        String nombres;
        String apellidos;
        int edad;
        String ciudad;
        String pais;
        String idioma;
        String correo;
        System.out.println("Creando cuenta de Twitter");
        System.out.println("Ingrese su nombres:");
        nombres = entrada.nextLine();
        System.out.println("Ingrese su apellidos:");
        apellidos = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su pais:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su idioma:");
        idioma = entrada.nextLine();
        System.out.println("Ingrese su correo:");
        correo = entrada.nextLine();
        System.out.printf("Nombres: %s\nApellidos: %s\nEdad: %d\nCiudad: %s\nPais: %s\n"
                + "Idioma: %s\nCorreo: %s\n", nombres, apellidos, edad, ciudad, pais, idioma, correo);
    }

    public static String crearWhatsapp() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int celular;
        int edad;
        String ciudad;
        String pais;
        String cadena;
        System.out.println("Creando cuenta de Whatsapp");
        System.out.println("Ingrese su nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su celular:");
        celular = entrada.nextInt();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su pais:");
        pais = entrada.nextLine();
        cadena = String.format("Nombre: %s\nCelular: %d\nEdad: %d\nCiudad: %s\nPais: %s\n",
                nombre, celular, edad, ciudad, pais);
        return cadena;
    }

    public static void crearTelegram() {
        Scanner entrada = new Scanner(System.in);
        String nombres;
        int numero;
        int edad;
        String ciudad;
        String pais;
        String idioma;
        String area;
        System.out.println("Creando cuenta de Telegram");
        System.out.println("Ingrese su nombres:");
        nombres = entrada.nextLine();
        System.out.println("Ingrese su numero:");
        numero = entrada.nextInt();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su pais:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su idioma:");
        idioma = entrada.nextLine();
        System.out.println("Ingrese su area de interas:");
        area = entrada.nextLine();
        System.out.printf("Nombres: %s\nNumero: %d\nEdad: %d\nCiudad: %s\nPais: %s\n"
                + "Idioma: %s\nArea: %s\n", nombres, numero, edad, ciudad, pais, idioma, area);
    }

    public static String crearSignal() {
        Scanner entrada = new Scanner(System.in);
        String nombres;
        int celular;
        int edad;
        String ciudad;
        String pais;
        String hobby;
        String cadena;
        System.out.println("Creando cuenta de Signal");
        System.out.println("Ingrese su nombres:");
        nombres = entrada.nextLine();
        System.out.println("Ingrese su celular:");
        celular = entrada.nextInt();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su pais:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su hobby favorito:");
        hobby = entrada.nextLine();
        cadena = String.format("Nombre: %s\nCelular: %d\nEdad: %d\nCiudad: %s\nPais: %s\nHobby: %s\n",
                nombres, celular, edad, ciudad, pais, hobby);
        return cadena;
    }

    public static void crearInstagram() {
        Scanner entrada = new Scanner(System.in);
        String nombres;
        String ciudad;
        int edad;
        String correo;
        System.out.println("Creando cuenta de Instagram");
        System.out.println("Ingrese su nombres:");
        nombres = entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su correo:");
        correo = entrada.nextLine();
        System.out.printf("Nombres: %s\nCiudad: %s\nEdad: %d\nCorreo: %s\n",
                nombres, ciudad, edad, correo);
    }

    public static String crearFlickr() {
        Scanner entrada = new Scanner(System.in);
        String nombres;
        String correo;
        String cadena;
        System.out.println("Creando cuenta de Instagram");
        System.out.println("Ingrese su nombres:");
        nombres = entrada.nextLine();
        System.out.println("Ingrese su correo:");
        correo = entrada.nextLine();
        cadena = String.format("Nombre: %s\nCorreo: %s\n",
                nombres, correo);
        return cadena;
    }

    public static String obtenerMensaje(int contador) {
        String[] mensajeFinal = {"Campaña con poca afluencia",
            "Campaña moderada siga adelante", "Excelente campaña"};
        String cadena = "";
        if ((contador >= 1) && (contador <= 5)) {
            cadena = (mensajeFinal[0]);
        } else {
            if ((contador >= 6) && (contador <= 15)) {
                cadena = (mensajeFinal[1]);
            } else {
                if (contador >= 16) {
                    cadena = (mensajeFinal[2]);
                }

            }
        
        }
        return cadena;
    }

}
