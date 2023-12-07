package Soal5;

public class Calculator {
    int number1;
    int number2;
    char Symbol;
    int result;


    public int  out(int number1, int number2,char Symbol){
        this.result =0;
        this.number1 =number1;
        this.number2 =number2;
        this.Symbol =Symbol;

        if (Symbol == '*'){
            result  = number1 *number2;

        }else if(Symbol == '/'){
            result =number1 / number2;
        } else if (Symbol == '%') {
            result = number1 % number2;
        } else if (Symbol == '+') {
            result = number1 + number2;
        }else if (Symbol == '-'){
            result = number1 - number2;
        }
        System.out.println("hasil dari operasi dua bilangan tersebut adalah"+result);
        return  result;
    }

}
