import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfPeople=0;
        List<Person>people=new ArrayList<>();
        int keepRunning=1;
        while (keepRunning==1) {
        System.out.println("What you want to do?\n1-Register a person\n2-Remove a person\n3-Show registred people\n4-Leave");
        int choice=sc.nextInt();
        System.out.println("======================");
        switch (choice) {
            case 1:
                if(numberOfPeople==5){
                    System.out.println("The system is full!\nYou can no longer register people...");
                }
                else{
                    clear();
                    System.out.println("Type name:");
                    String name=sc.next();
                    System.out.println("Type age:");
                    int age=sc.nextInt();
                    System.out.println("Type job:");
                    String job=sc.next();
                    System.out.println("Type sex:");
                    String sex=sc.next();
                    people.add(new Person(name,age,job,sex));
                    numberOfPeople++;
                }
                System.out.println("======================");
                break;
            case 2:
                if (numberOfPeople==0) {
                    System.out.println("The system is empty!\nThere is no one to remove...");
                }
                else{
                    clear();
                    System.out.println("Type the number of the person you want to remove:");
                    int remove=sc.nextInt();
                    people.remove(remove-1);
                    System.out.println("Person removed!");
                    numberOfPeople--;
                }
                System.out.println("======================");
                break;
            case 3:
                if(numberOfPeople==0){
                    System.out.println("The system is empty!\nThere is no one to show...");
                    System.out.println("======================");
                }
                else{
                    for (int i=0;i<people.size();i++ ) {
                        System.out.println("Number:"+(i+1));
                        System.out.println("Name:"+people.get(i).nameget());
                        System.out.println("Age:"+people.get(i).ageget());
                        System.out.println("Job:"+people.get(i).jobget());
                        System.out.println("Sex:"+people.get(i).sexget());
                        System.out.println("======================");
                    }
                }
                break;
            case 4:
                System.out.println("Farewell");
                keepRunning=0;
                break;
            default:
                clear();
                System.out.println("Invalid...\nTry again!");
                System.out.println("======================");
                break;
       }
    }
}
    public static void clear(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
