public static void flipLines(Scanner input) {
    while (input.hasNextLine()) {
        String temp = input.nextLine();
        if (!input.hasNextLine()) {
            System.out.println(temp);
            break;
        }
    System.out.println(input.nextLine());
    System.out.println(temp);
    }
}
