package UnitTest;

public class Test extends Student {
    float maths, science;

    public void Set_Marks(float science, float maths) {
        this.maths = maths;
        this.science = science;
    }

    public void display_marks() {
        System.out.println("The maths marks is: " + maths);
        System.out.println("The science's mark is: " + science);
    }
}
