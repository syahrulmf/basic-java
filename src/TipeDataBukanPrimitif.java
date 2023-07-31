public class TipeDataBukanPrimitif {
  public static void main(String[] args) {
    Integer iniInteger = 100;
    Long iniLong = 10000L;

    Byte iniByte = null;
    System.out.println(iniByte);

    iniByte = 100;
    System.out.println(iniByte);

//    Konfersi Tipe Data Bukan Primitif
    int iniInt = 100;
    Integer iniObject = iniInt;

    System.out.println(iniObject.toString() + 100);

    short iniShort = iniObject.shortValue();
    long iniLong2 = iniObject.longValue();
    float iniFloat = iniObject.floatValue();

    Long amount = 100000L;
    amount.shortValue();
  }
}
