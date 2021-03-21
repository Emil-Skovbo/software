public class FiniteStateAutomaton {

     public enum alphabet  {a,b,c,d,t,

     }


    public void finiteState(alphabet x){
        String word = "";
        switch(x){
            case a:
                word += alphabet.a;
                System.out.println("works on a "+ word);
                //finiteState(alphabet.a);

            case b:
                word += alphabet.b;
                System.out.println("works on b "+ word);

            case c:
                word += alphabet.c;
                System.out.println("works on c "+ word);

            case d:
                word += alphabet.d;
                System.out.println("works on d "+ word);

            case t:
                word += alphabet.t;
                System.out.println("works on t "+ word);

            default:
                break;
        }
    }
}
