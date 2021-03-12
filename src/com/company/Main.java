package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// afisarea numarului maxim din 3 variabile introduse de la tastatura
        Scanner scan=new Scanner(System.in);
        System.out.println("introduceti variabila nr 1: ");
        int a=scan.nextInt();
        System.out.println("introduceti variabila nr 2: ");
        int b=scan.nextInt();
        System.out.println("introduceti variabila nr 3: ");
        int c=scan.nextInt();
        int nrMaxim=a;
        if(a<b)
            if(b<c)
                nrMaxim=c;
            else
                nrMaxim=b;
         else
             if(a<c)
                 nrMaxim=c;
        System.out.println("Cel mai mare nr este: "+nrMaxim);

    }
}
