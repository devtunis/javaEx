public Number input(String msg) {
    Scanner sc = new Scanner(System.in);
    System.out.print(msg);
    String v = sc.nextLine();

    return v.contains(".")
            ? Double.parseDouble(v)
            : Integer.parseInt(v);
}
