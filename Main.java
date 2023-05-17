/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      while (true){
      Scanner scanner = new Scanner(System.in);
      Service s = new Service();
      System.out.println("\nPodaj numer: ");
      int liczba = scanner.nextInt(); scanner.nextLine();
      switch (liczba) {
      case 1:  
        System.out.println("Podaj imie: ");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj date urodzenia: ");
        String urodziny = scanner.nextLine();
        System.out.println("Podaj wiek: ");
        int wiek = scanner.nextInt();
        s.addStudent(new Student(imie, nazwisko, wiek, urodziny));
      break;

      case 2:
      var students = s.getStudents();
      for(Student current : students) {
      System.out.println(current.ToString());  }
      break;

      case 0:
      return;
      }
      }
      }  catch (IOException e) {
      }
}
}