package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface kq1 {
    default <T> T a(Class<T> cls) {
        return (T) g(fg8.a(cls));
    }

    default <T> Set<T> b(fg8<T> fg8Var) {
        return d(fg8Var).get();
    }

    default <T> of8<T> c(Class<T> cls) {
        return f(fg8.a(cls));
    }

    <T> of8<Set<T>> d(fg8<T> fg8Var);

    <T> tv2<T> e(fg8<T> fg8Var);

    <T> of8<T> f(fg8<T> fg8Var);

    default <T> T g(fg8<T> fg8Var) {
        of8<T> of8VarF = f(fg8Var);
        if (of8VarF == null) {
            return null;
        }
        return of8VarF.get();
    }
}
