public class NestingLoops {

    public static void main(String[] args) {

        // this is #1 - I'll call it "CN"
        for (int n = 1; n <= 3; n++) {
            for (char c = 'A'; c <= 'E'; c++)

            // 1. This Variable changes faster because it is only executed 3 times and is
            // ran inside the other loop
            {
                System.out.println(c + " " + n);
            }
        }
        // 2. The Letters went through each letter A-E once per loop and printed the
        // numbers 1 for each letter, then 2 for each letter, and then 3 for each letter

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print(a + "-" + b + " ");
                // 3. The "println()" made the numbers print on their own separate lines, rather
                // than on the same line

            }
            // * You will add a line of code here.

            // 4. After each line of iterrated numbers, the statement below prints, then
            // starts a new line for next round of itteration
            System.out.println("This is number 4 of assignment");
        }

        System.out.println("\n");
    }
}