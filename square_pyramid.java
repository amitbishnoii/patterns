
public class square_pyramid {
    public static void main(String[] args) {
        // print_pattern(10);
        print_pattern_2(5);
    }

    public static void print_pattern(int n) {
        if (n == 4) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(n);
                }
                System.out.println();
            }

        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(n);
                }
                System.out.println();
            }
        }

    }

    public static void print_pattern_2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
