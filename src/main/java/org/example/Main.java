package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //System.out.println("Comienza aca: ");

        //Diseñar un algoritmo que permita el ingreso de un usurio con correo y contraseña
        //Se permitiran 3 intentos antes de bloquearlos

        //ENTRADAS DEL ALGORITMO

        Scanner leerTeclado=new Scanner(System.in);
        String colorBlanco="\u001B[29m";
        String colorNegro="\u001B[30m";
        String colorRojo="\u001B[31m";
        String colorVerde="\u001B[32m";
        String colorAmarillo="\u001B[33m";
        String colorAzul="\u001B[34m";
        String colorMorado="\u001B[35m";

        String correoDigitadoUsuario;
        String contraseñaDigitadaUsuario;

        String correoGuardadoBaseDatos="Andrey@correo.com";
        String contraseñaGuardadaBaseDatos="Estaesunacontraseña1";

        //PROCESO

        System.out.println(colorVerde+"*****************************");
        System.out.println("🌵 GESTOR APP by AMV 2025 🌵");
        System.out.println(colorVerde+"*****************************");

        

        //Diseñar un algoritmo que permita mostrar un menu de opciones si el usuario se autentico con exito
        //El menu sera el siguiente
        //1. Registrar venta
        //2. Mostrar ventas del día
        //3. SALIR

        //Nota: una venta se considera en el sistema como una variable con los siguientes datos
        //id-->entero
        //fecha-->LocalDate
        //descripción-->Cadena
        //lista de productos-->Lista
        //total-->doble

        //Nota2: un producto tiene:
        //id
        //precio unitario
        //fotografia
        //cantidad



    }
}