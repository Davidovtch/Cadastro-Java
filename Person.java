package OOP;

public class Person {
    private String name;
    private int age;
    private String job;
    private String sex;
   Person(String name,int age,String job,String sex){
    this.name=name;
    this.age=age;
    this.job=job;
    this.sex=sex;
   }
   public void nameset(String name){
    this.name=name; 
   }
   public String nameget(){
    return name;
   }
   public void ageset(int age){
    this.age=age; 
   }
   public int ageget(){
    return age;
   }
   public void jobset(String job){
    this.job=job; 
   }
   public String jobget(){
    return job;
   }
   public void sexset(String sex){
    this.sex=sex; 
   }
   public String sexget(){
    return sex;
   }
}
