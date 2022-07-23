public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    long amount = 1000_60;
    boolean registered = true;

    long bonus = service.calculate(amount, registered);
    System.out.println("Ожидаемый результат: " + 30 + " Фактический результат: " + bonus);
  }
}

