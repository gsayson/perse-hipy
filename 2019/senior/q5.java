class Solution {
  public static void main(String[] args) {
    String[] poem = "wibble wobble wibble wobble jelly on the plate"
      .split(" ");
    var scanner = new java.util.Scanner(System.in);
    String word = scanner.nextLine();
    int req = scanner.nextInt();
    int x = 0;
    for(int i = 0; i < poem.length; i++) {
      if(poem[x = i].equals(word)) break;
    }
    for(int j = x + 1; j < x + req; j++) {
      System.out.print(poem[j] + " ");
    }
    System.out.println(poem[x + req]);
  }
}
