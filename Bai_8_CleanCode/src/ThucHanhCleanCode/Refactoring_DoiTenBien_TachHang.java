package ThucHanhCleanCode;

public class Refactoring_DoiTenBien_TachHang {
    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand != 0){
                    return firstOperand / secondOperand;
                }else {
                    throw new RuntimeException("Khong chia het cho 0");
                }
            default: throw new RuntimeException("no support");
        }
    }
    //doi ten bien a,b va o trong lop calculatorTest;
}