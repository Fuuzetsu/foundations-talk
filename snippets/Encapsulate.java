public class Encapsulate {
    /* Assume we have (f : B -> A) and (g : A -> B) defined here */

    public static <A, C> C h(A x) {
        return f(g(x));
    }

}
