package Soal3;

public class fibonanci_class {
    int a =0,b=0,c =1,result;

    public void fibonanci(int n){
        if(n >0){
            if (a <=1){
                result =a;
            }else{
                result=b+c;
                b=c;
                c =result;
            }
            System.out.print(result+" ");
            a++;
            fibonanci(--n);
        }
    }


}
