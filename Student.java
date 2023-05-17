public class Student {

  private String Name;
  private int Age;
  private String Surname;
  private String Birthday;

  public Student(String name, String surname, int age, String birthday) {
    Name = name;
    Age = age;
    Surname = surname;
    Birthday = birthday;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetSurname() {return Surname;}
  public String GetBirthday() {return Birthday;}

  public String ToString() {
    return Name + " " + Surname + " " + Integer.toString(Age) + " " + Birthday;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length !=4) 
      return new Student("Parse Error", "Parse Error", -1, "Parse Error");
    return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);
  }
}