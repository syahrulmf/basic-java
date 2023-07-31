public class Array {
  public static void main(String[] args) {

    String[] stringArray;
    stringArray = new String[3];

    stringArray[0] = "Syahrul";
    stringArray[1] = "Mubarok";
    stringArray[2] = "Nur";

    System.out.println(stringArray[0]);
    System.out.println(stringArray[1]);
    System.out.println(stringArray[2]);

    stringArray[0] = "Budi";

    System.out.println(stringArray[0]);

    String[] stringArray2 = new String[3];

    String[] namaNama = {
            "Syahrul", " Mubarok", "Nur"
    };

    int[] arrayInt = new int[] {
            1, 2, 3, 4, 5
    };

    long[] arrayLong = {
            10L, 20L, 30L
    };

    System.out.println(arrayLong.length);

    String[][] members = {
            {"Syahrul", "Mubarok"},
            {"Nanda", "Aliyya"}
    };

    System.out.println(members[0][1]);
  }
}
