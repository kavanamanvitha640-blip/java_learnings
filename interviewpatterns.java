class pascalTriangle {
    public static void main(String[] args) {
        int n=5;

        for (int i=0; i<n; i++) {
            for(int j=0; j<n-i; j++) {
                System.out.print(" ");
            }
            int num=1;
            for(int j=0; j<=i; j++) {
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}

class butterflypattern {
    public static void main(String[] args) {
        int n=5;
        for (int j=1; j<=i; j++) {
            for(int j=1; j<=i; j++) {
                System.out.prin("*");
            }
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}