//Napisz program, który sumuje elementy nieparzyste tablicy jednowymiarowej:
//Program powinien wczytać tablicę liczb całkowitych wprowadzoną przez użytkownika.
//Obliczyć sumę tylko elementów nieparzystych.
//Wyświetlić wynik.

import java.util.Scanner;
public class Main
  {
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Podaj rozmiar tablicy:");
        {
        int n = scanner.nextInt();
        int[] tablica = new int[n];
        for(int i = 0; i < n; i++) 
          {
            System.out.println("Podaj element " + (i + 1) + ":");
            tablica[i] = scanner.nextInt();
          }
        int suma = 0;
        for(int i = 0; i < n; i++)
          {
            if(tablica[i] % 2 != 0)
            {
              suma += tablica[i];
            }
            
          }
        System.out.println("suma elementow nieparzystych wynosi: " + suma);
          
        }
      
    }
    
  }
