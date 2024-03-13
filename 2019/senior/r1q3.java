class Solution {
  public static void main(String[] args) {
    var scanner = new java.util.Scanner(System.in);
    String list = scanner.nextLine() + ", " + scanner.nextLine() + ", " + scanner.nextLine() + ", " + scanner.nextLine();
    System.out.println(list);
    System.out.println(list.replaceAll("[a-zA-Z,\\s]", "-"));
  }
}
