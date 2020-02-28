public static void doubleSpace(Scanner in, PrintStream out) {
	while (in.hasNextLine()) {
        out.println(in.nextLine() + " " + "\n");
    }
}
