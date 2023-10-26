public class Patter_Print {
    public static void main(String[] args) {
        // Question 1 (Inverted Half pyramid)
        int n = 4;
        for (int i=n; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Question 2 (Solid Rectangle)
        int n = 4;
        int m = 5;

        // outer loop
        for (int i=1; i<=n; i++){
            // inner loop
            for (int j=1; j<=5; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        // Question 3 (Hollow Rectangle)
        int n = 4;
        int m = 5;
        // outer loop
        for (int i=1; i<=n; i++){
            // inner loop
            for (int j=1; j<=m; j++){
                // cell -> (i, j)
                if(i == 1 || j ==1 || i==n || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Question 4 (Half Pyramid)
        int n=4;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        // Question 5 (Inverted Half pyramid)
        int n=4;
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        // Question 6 (Inverted Hlf pyramid) Rotated by 180 degree
        int n=4;
        for (int i=1; i<=n; i++){
            // inner loop -> space print
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // inner loop -> star print
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Question 7 (Half pyramid with Numbers)
        int n=5;
        for (int i=1; i<=n; i++){
            // inner loop
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Question 8 (Inverted Half pyramid with Numbers)
        int n=5;
        for (int i=1; i<=n; i++){
            // inner loop
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        // Question 9 (Floyd's Triangle)
        int n=5;
        int number = 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(number+ " ");
                number++; //number = number + 1
            }
            System.out.println();
        }

        // Question 10 (0-1 Triangle)
        int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                int sum = i+j;
                if (sum % 2 == 0){ //even
                    System.out.print("1 ");
                }else{ //odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
