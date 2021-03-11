package Math;
import java.util.*;

class MyIterable<T> implements Iterable<T> {

    private List<T> list;

    public MyIterable(T [] t) {

        list = Arrays.asList(t);
        Collections.reverse(list);
    }

    @Override
    public Iterator<T> iterator() {

        return list.iterator();
    }
}

public class Rationals {

    public String rational(long n){


        return null;

    }

    public static void main(String[] args) {

    }
}
