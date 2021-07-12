package java11;

import java.util.Comparator;
import java.util.List;

interface MathOp{
int operation(int a ,int b);
default  int mul(int a, int b) {
    return a*b;
}
}
public class LambdaFn implements MathOp {

    @Override
    public int operation(int a, int b ){
        return  mul(a,b);
    }
    public  List<String> sortAlfa(List<String> list ){
        list.sort(Comparator.naturalOrder());
        return list;
    }
}

