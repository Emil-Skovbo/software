public class Main {

    public static void main(String[] args) {
        FiniteStateAutomaton fsa = new FiniteStateAutomaton();
        FiniteStateAutomaton.alphabet a = FiniteStateAutomaton.alphabet.a;
        FiniteStateAutomaton.alphabet b = FiniteStateAutomaton.alphabet.b;
        FiniteStateAutomaton.alphabet c = FiniteStateAutomaton.alphabet.c;
        FiniteStateAutomaton.alphabet d = FiniteStateAutomaton.alphabet.d;
        FiniteStateAutomaton.alphabet t = FiniteStateAutomaton.alphabet.t;
        fsa.finiteState(a);
        fsa.finiteState(b);
        fsa.finiteState(t);


    }
}
