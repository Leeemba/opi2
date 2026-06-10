class C {
  int s33;
  int s8;
  int s38;
  int s26;
  int s37;
  long s18;
  long s30;
  long s3;
  int[] s14 = {-2, 1, 3, 2, 0};
  int[] s27 = {3, -1, 0, 2, -2};
  int[] s7 = {1, -1, -1, 2};
  static int s25;
  static int s21;
  static int s12;
  static int s9;
  static int s10;
  public C() {
    s33 = 6;
    s8 = 4;
    s38 = 3;
    s26 = 9;
    s37 = 8;
    s18 = 8L;
    s30 = 6L;
    s3 = 9L;
  }
  public void s11() {
    System.out.println("метод s11 в классе C");
    System.out.println(s26);
  }
  public void s28() {
    System.out.println("метод s28 в классе C");
    System.out.println(--s37);
  }
  public void s40() {
    System.out.println("метод s40 в классе C");
    System.out.println(s33 - 5);
  }
  public void s4() {
    System.out.println("метод s4 в классе C");
    System.out.println(s9++);
  }
  public void s32() {
    System.out.println("метод s32 в классе C");
    System.out.println(s26--);
  }
  public void s2() {
    System.out.println("метод s2 в классе C");
    System.out.println(s8 << 1);
  }
  public static void s36() {
    System.out.println("метод s36 в классе C");
    System.out.println(s9);
  }
  public static void s23() {
    System.out.println("метод s23 в классе C");
    System.out.println((s9 - 4));
  }
  public static void s19() {
    System.out.println("метод s19 в классе C");
    System.out.println(s10);
  }
  public static void s20() {
    System.out.println("метод s20 в классе C");
    System.out.println((s10 + 3));
  }
  public void s6(C r) {
    r.s11();
  }
  public void s6(H r) {
    r.s28();
  }
}
