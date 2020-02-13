public class Divisible {
    public static void main(String[] args) {
        boolean flag;
        int i;
        for (i = 1; ; i++) {
            flag = true;
            for (int d = 1; d <= 20; d++) {
                if (i % d != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println(i);

    }
}
