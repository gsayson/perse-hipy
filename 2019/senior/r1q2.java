class Solution {
  public static void main(String[] args) {
    var scanner = new java.util.Scanner(System.in);
    String input = scanner.nextLine();
    input = input.replaceAll("[^aeiou]", "");
    input.chars().forEach(ch -> System.out.println("" + ((char) ch)));
  }
}
