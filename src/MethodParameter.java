public class MethodParameter {
  public static void main(String[] args) {

    sayHelloWorld("Syahrul", "Mubarok");

    luasPersegiPanjang(10, 20);

  }

  static void sayHelloWorld(String firstName, String lastName) {
    System.out.println("Hello " + firstName + " " + lastName);
  }

  static void luasPersegiPanjang(int panjang, int lebar){
    System.out.println("Luas Persegi Panjang: " + (panjang * lebar));
  }
}
