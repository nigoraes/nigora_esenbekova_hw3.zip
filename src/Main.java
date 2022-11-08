public class Main {
    public static void main(String[] args) {

                double[] num =

                        {1.8, 3.5, 2.1, -3.9, 8.1, 1.9, 7.4, -1.8, 8.1, 7.4, -9.0, 9.5, 6.2, 8.6, 3.9};

                double num2 = 0.0;

                int num3 = 0;

                for (int a1 = 0; a1 < num.length; a1++) {

                    if (num[a1] < 0) {

                        for (int a2 = a1 + 1; a2 < num.length; a2++) {


                            if (num[a2] > 0) {

                                num2 = num2 + num[a2];

                                num3++;

                            }

                        }
                        break;

                    }

                }

                System.out.println("num2  " + num2);
                System.out.println("num3  " + num3);
                System.out.println("num2/num3 " + num2 / num3);

            }
        }

