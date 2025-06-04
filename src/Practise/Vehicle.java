package Practise;

public interface Vehicle {
    void Accelerate();
    void applyBreak();

    //we cannot define protected data member speed_value = 0 because all the interface variables are implicit
}
