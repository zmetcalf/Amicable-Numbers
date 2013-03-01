import java.util.ArrayList;

public class AmicableNumbers {
    
    private int maxNum;
    ArrayList<Integer> amicableNumbers = new ArrayList<Integer>();
    
    public AmicableNumbers(int maxNum) {
        this.maxNum = maxNum;
    } //End Constructor
    
    private static ArrayList<Integer> divisorList (int divisor) {
        
        ArrayList<Integer> dList = new ArrayList<Integer>();
        
        for(int i = 2; i <= divisor; i++) {
            if(divisor % i == 0) {
                dList.add(divisor / i);
            }
        }
        
        return dList;
        
    } //End divisorList method
    
    private static int getListTotal (ArrayList<Integer> divisorList) {
        int total = 0;      
        
        for(int divisor : divisorList){
            total += divisor;
        }
        
        return total;
    }
    
    public void findAmicableNumbers() {
        clearAmicableNumbers();
        int iTest = 0;
        int rTest = 0;
        for(int i = 2; i <= maxNum; i++) {
            iTest = getListTotal(divisorList(i));
            rTest = getListTotal(divisorList(iTest));
            if(rTest == i && i != iTest) {
                if(amicableNumbers.contains(i) != true) {
                    amicableNumbers.add(i);
                }
                if(amicableNumbers.contains(rTest) != true) {
                    amicableNumbers.add(rTest);
                }
            }
        }
    }
    
    public int getSumOfAmicableNumbers() {
        int total = 0;
        for(int i : amicableNumbers) {
            total += i;
        }
        return total;
    }
    
    private void clearAmicableNumbers() {
        amicableNumbers.clear();
    }
    
    public ArrayList<Integer> getAmicableNumbers() {
        return amicableNumbers;
    }

}