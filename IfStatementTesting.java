public class IfStatementTesting {
  public static void main(String[] args) {
    int numOne = 2;
    int numTwo = 4;
    if (numTwo == numOne * 2) {
      if (numTwo == numOne * numOne) {
        System.out.println("Number Two is both two times Number One and the square of Number One.");
      } else {
        System.out.println("Number Two is two times Number One.");
      }
    } else if (numTwo == numOne * numOne) {
      System.out.println("Number Two is the square of Number One.");
    } else {
      System.out.println("Number Two is neither two times Number One or the square of Number One.");
    }
  }
}
