public class Power {

  public static double myPow(double x, int n) {
    if (n == 0 || x == 1) {
      return 1;
    }
    if (x == 0) {
      return 0;
    }
    if (x == -1 && n % 2 == 0) {
      return 1;
    }
    if (x == -1 && n % 2 != 0) {
      return -1;
    }

    double ans = 1;
    long binForm = n;

    if (n < 0) {
      x = 1 / x;
      binForm = -binForm;
    }
    while (binForm > 0) {
      if (binForm % 2 == 1) {
        ans *= x;
      }
      x *= x;
      binForm /= 2;
    }

    return ans;
  }

  public static void main(String[] args) {
    double x = 2;
    int n = -2;

    System.out.println(myPow(x, n));
  }
}