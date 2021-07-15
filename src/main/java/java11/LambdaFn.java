package java11;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

interface MathOp {
    int operation(int a, int b);

    default int mul(int a, int b) {
        return a * b;
    }
}

class Alpha {

    public static String Caps(String str) {
        return str.toUpperCase();
    }
}

public class LambdaFn implements MathOp {

    @Override
    public int operation(int a, int b) {
        return mul(a, b);
    }

    public List<String> sortAlfa(List<String> list) {
        list.sort(Comparator.naturalOrder());
        return list;
    }

    public List<String> CallStatic(List<String> list) {

        list.forEach(new Consumer<>() {
            @Override
            public void accept(String s) {Alpha.Caps(s);
            }
        });
        return list;
    }
}

