package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        int sum = 0;
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        }
        for (int i = 1; i < lastInRow; i++) {
            if (numberToSkip > lastInRow) {
                System.out.println("number to skip is bigger then the last");
            } else {
                System.out.println("skipped sum is " + sum);
                System.out.println("counted sum is " + sum);
            }
            if (i == numberToSkip) {
                continue;
            }
            sum += i;
        }
    }
}
