package UnitTest;

public class Student {
    int roll_number;
    public void Set_Roll(int roll_number){
        this.roll_number = roll_number;
    }
    public void DisplayRoll(){
        System.out.println("The student roll number is: "+roll_number);
    }
}
