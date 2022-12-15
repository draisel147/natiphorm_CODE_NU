public class Lab1Task5 {
    public static void main(String[] args) {
        int firstArg = 0;
        if (args.length == 2) {
            try {
                firstArg = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.err.println("Argument " + args[0] + " must be an integer.");
                System.exit(1);
            }
        } else {
            System.err.println("You must have 2 argument.");
            System.exit(1);
        }

        // Do some work
        for (int i = 0; i < firstArg; i++) {
            System.out.println(args[0] + " ");
        }
    }
}
