void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int negative = 0;
    int zeros = 0;
    int even = 0;
    int odd = 0;
    int positive = 0;
    for (int i = 1; i <= 10; i++) {
        System.out.print("Enter number " + i + ": ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Enter an integer for number " + i + ": ");
            scanner.next();
        }
        int n = scanner.nextInt();

        if (n > 0) {
            positive++;
        } else if (n < 0) {
            negative++;
        } else {
            zeros++;
        }

        if (n % 2 == 0) {
            even++;
        } else {
            odd++;
        }
    }

    System.out.println();
    System.out.println("Результат");
    System.out.println("Positive numbers: " + positive);
    System.out.println("Negative numbers: " + negative);
    System.out.println("Zeros: " + zeros);
    System.out.println("Even numbers: " + even);
    System.out.println("Odd numbers: " + odd);

    scanner.close();


}