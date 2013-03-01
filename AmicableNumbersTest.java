public class AmicableNumbersTest {
    
    public static void main(String [] args) {
        AmicableNumbers checkNum = new AmicableNumbers(10000);
        checkNum.findAmicableNumbers();
        System.out.println(checkNum.getSumOfAmicableNumbers());
        System.out.println(checkNum.getAmicableNumbers());
    }
}