package chapter5.recordbook.entities;

import java.util.Scanner;

/**
 *
 * @author Sukhocheva Maryana
 */
public class RecordBook {
    public static Scanner scanner=new Scanner(System.in);
    public Info info;
    public String fioStudent;
    public RecordBook(){
        System.out.println("введите ФИО студента");
        setFioStudent(scanner.next());
        info = new Info();
    }
    public String getFioStudent(){
        return fioStudent;
    }
    public void setFioStudent(String fioStudent){
    this.fioStudent = fioStudent;
    }
    public class Info{
        int numberSession,countOfNonHandedOffsets, countOfExamsForNextSession;
        public Info(){  
        System.out.println("сессия №:");
        setNumberSession(scanner.nextInt());    
        System.out.println("количество не сданных зачётов:");
        setCountOfNonHandedOffsets(scanner.nextInt());
        System.out.println("количество экзаменов на сл. сессию:");
        setСountOfExamsForNextSession(scanner.nextInt());    
    }
    public int getNumberSession(){
    return numberSession;
    }
    public void setNumberSession(int number){
    this.numberSession = number;
    }
    public int getCountOfNonHandedOffsets(){
    return countOfNonHandedOffsets;
    }
    public void setCountOfNonHandedOffsets(int count){
    this.countOfNonHandedOffsets = count;
    }
    public int getCountOfExamsForNextSession(){
    return countOfExamsForNextSession;
    }
    public void setСountOfExamsForNextSession(int count){
    this.countOfExamsForNextSession = count;
    }
    public void print(){
        System.out.print("Студент по фамилии"+" "+getFioStudent()+" сдал сессию № "+getNumberSession()+
                ", не сданно зачетов - "+getCountOfNonHandedOffsets()+" и количество экзаменов на сл. сессию - "+getCountOfExamsForNextSession());
    }
    }
}
