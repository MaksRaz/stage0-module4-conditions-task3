package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if (Math.sqrt(second) == first){
            System.out.println("Aliquot");
        }
        else {
            System.out.println("Not aliquot");
        }
    }
}
