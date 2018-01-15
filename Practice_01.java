//William Purucker 1-14-2018

public class Practice_01 {
    public static void main(String[] args) {
        double[] arrayData = new double[] {2683.00, 2654.00, 3090.00, 3325.00, 4881.00, 3300.00, 7456.00, 3780.00, 3232.00, 7270.00, 7773.00, 5553.00, 2850.00, 7619.00, 2762.00, 6965.00, 4539.00, 3131.00, 6066.00, 5404.00, 4183.00, 6830.00, 2424.00, 4517.00, 6599.00, 3714.00, 7351.00, 4243.00, 6688.00, 7819.00, 6449.00, 3781.00, 5565.0, 3283.00, 7427.00};

        double maxi = 1.00;
        for (int length1 = 0; length1 < arrayData.length; length1++) {
            if (arrayData[length1] > maxi) {
                maxi = arrayData[length1];
            }
        }
        System.out.println("Max value: " + maxi);

        double mini = 99999.00;
        for (int length2 = 0; length2 < arrayData.length; length2++) {
            if (arrayData[length2] < mini) {
                mini = arrayData[length2];
            }
        }
        System.out.println("Min value: " + mini);

        double total = 0.00;
        for (int length3 = 0; length3 < arrayData.length; length3++) {
            total = total + arrayData[length3];
        }
        System.out.println("Total: " + total);

        double average = total / 35;
        System.out.println("Average: " + average);
    }
}
