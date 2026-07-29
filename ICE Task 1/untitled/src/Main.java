public class Main {
    public static void main(String[] args) {
        // Sales data
        int[][] sales = {
                {100, 150, 70},   // Q1: Nike, Adidas, Reebok
                {88, 92, 103},    // Q2: Nike, Adidas, Reebok
                {75, 45, 90},     // Q3: Nike, Adidas, Reebok
                {65, 95, 175}     // Q4: Nike, Adidas, Reebok
        };

        String[] brands = {"NIKE", "ADIDAS", "REEBOK"};
        String[] quarters = {"Q1", "Q2", "Q3", "Q4"};

        // Display header
        System.out.println("ULTIMATE SHOE SALES");
        System.out.println();

        // Display table header
        System.out.printf("| %-7s | %-5s | %-7s | %-7s |%n", "QUARTER", "NIKE", "ADIDAS", "REEBOK");
        System.out.println("|---------|-------|---------|---------|");

        // Display sales data
        for (int i = 0; i < quarters.length; i++) {
            System.out.printf("| %-7s | %-5d | %-7d | %-7d |%n",
                    quarters[i], sales[i][0], sales[i][1], sales[i][2]);
        }

        // Calculate totals, averages, mins, maxs
        int[] totals = new int[3];
        int[] mins = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        int[] maxs = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 4; i++) {
                totals[j] += sales[i][j];

                if (sales[i][j] < mins[j]) {
                    mins[j] = sales[i][j];
                }
                if (sales[i][j] > maxs[j]) {
                    maxs[j] = sales[i][j];
                }
            }
        }

        // Display totals, averages, mins, maxs
        System.out.println();
        System.out.printf("TOTAL:    %-5d %-7d %-7d%n", totals[0], totals[1], totals[2]);

        double[] averages = new double[3];
        for (int j = 0; j < 3; j++) {
            averages[j] = (double) totals[j] / 4;
        }
        System.out.printf("AVERAGE:  %-5.1f %-7.1f %-7.1f%n", averages[0], averages[1], averages[2]);

        System.out.printf("MIN:      %-5d %-7d %-7d%n", mins[0], mins[1], mins[2]);
        System.out.printf("MAX:      %-5d %-7d %-7d%n", maxs[0], maxs[1], maxs[2]);
    }
}