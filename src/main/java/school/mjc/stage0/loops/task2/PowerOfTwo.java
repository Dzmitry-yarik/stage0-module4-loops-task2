package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
 int i = 0;
        if (power < i)
            System.out.println("too much power");
        while (i < power) {
            int a = (int) Math.pow(2, i);
            System.out.println(a);
            i++;
        }
    }
}
