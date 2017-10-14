public class test {
  public static void main(String[] args) {
    char[] Array8 = new char[5];
    for (int i = 0; i < Array8.length; i++) {
      if (Array8[i] >= 90) Array8[i] = 'A';
      else if (Array8[i] >= 80) Array8[i] = 'B';
      else if (Array8[i] >= 70) Array8[i] = 'C';
      else if (Array8[i] >= 60) Array8[i] = 'D';
      else Array8[i] = 'F';
    }
  }
}
