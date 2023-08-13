//import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class TesteArrayList {
    public static void main(String[] args) {
   //Scanner sc=new Scanner(System.in);
   List<Person>people=new ArrayList<>();
   people.add(new Person("Jorge", 20, "Delivery", "Masculino"));
   people.add(new Person("Ednaldo", 20, "Delivery", "Masculino"));
   people.add(new Person("Carlos", 20, "Delivery", "Masculino"));
   String name="Eric";
   int age=19;
   String job="desempregado";
   String sex="Masculino";
   people.add(new Person(name, age, job, sex));
   for (int i = 0; i < people.size(); i++) {
    System.out.println(i);
    System.out.println(people.get(i).nameget());
   }
   people.remove(1);
   for (int i = 0; i < people.size(); i++) {
    System.out.print(i);
    System.out.println(people.get(i).nameget());
   }

}
}