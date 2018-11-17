public class User
{
  int age;//поле
  String firstName;//поле
  String lastName;//поле
  User()// конструктор по умолчанию
  {
  }
  public User(int age, String firstName, String lastName) {//конструктор с тремя параметрами
  { 
    this.age = age;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  public User(String firstName, String lastName) {//конструктор с двумя параметрами
    this.firstName = firstName;
    this.lastName = lastName;
 }
}
