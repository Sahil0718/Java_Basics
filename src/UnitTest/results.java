package UnitTest;

public class results extends Test implements sports {

    public void Total_Marks() {
        System.out.println("The total sport weightage  is: " + sport_wt);
        System.out.println("The total obtained marks together with sport weightage " + (science + maths + sport_wt));

    }

    public static void main(String[] args) {
        results r1 = new results();
        r1.DisplayRoll();
        r1.Set_Roll(19);
        r1.Set_Marks(100, 100);
        r1.display_marks();
        r1.Total_Marks();
    }
}

