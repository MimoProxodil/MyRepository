public class User
{
  int age;//поле
  String firstName;//поле
  String lastName;//поле
  User()
  {// конструктор по умолчанию
  }
 String say() {//метод
  return "Мне "+age+" лет, я "+firstName+" "+lastName;
 }
}
