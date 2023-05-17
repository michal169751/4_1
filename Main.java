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
      Scanner scanner = new Scanner(System.in);
      Service s = new Service();
      System.out.println("Podaj numer: ");
      int liczba = scanner.nextInt(); scanner.nextLine();
      switch (liczba) {
      case 1:  
        System.out.println("Podaj imie: ");
        String imie = scanner.nextLine();
        System.out.println("Podaj wiek: ");
        int wiek = scanner.nextInt();
        System.out.println("\n" + imie + " " + wiek);
        s.addStudent(new Student(imie, wiek));
      break;

      case 2:
      var students = s.getStudents();
      for(Student current : students) {
      System.out.println(current.ToString());  }
      break;

      case 3:
      }
      }  catch (IOException e) {
      
      }
  }
}