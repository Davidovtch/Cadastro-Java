package OOP;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfPeople=0;
        Person[] people=new Person[5];
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
                    people[numberOfPeople]=new Person("", 0, "", "");
                    System.out.println("Type name:");
                    String name=sc.next();
                    //System.out.println("Type age:");
                    //int age=sc.nextInt();
                    //System.out.println("Type job:");
                    //String job=sc.next();
                    //System.out.println("Type sex:");
                    //String sex=sc.next();
                    people[numberOfPeople].nameset(name);
                    //people[numberOfPeople].ageset(age);
                    //people[numberOfPeople].jobset(job);
                    //people[numberOfPeople].sexset(sex);
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
                    people[remove-1]=null;
                    System.out.println("Person removed!");
                }
                System.out.println("======================");
                break;
            case 3:
                for (int atributes=0;atributes<numberOfPeople;atributes++ ) {
                    System.out.println("Name:"+people[atributes].nameget());
                    //System.out.println("Age:"+people[atributes].ageget());
                    //System.out.println("Job:"+people[atributes].jobget());
                    //System.out.println("Sex:"+people[atributes].sexget());
                    System.out.println("======================");
                }
                break;
            case 4:
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
