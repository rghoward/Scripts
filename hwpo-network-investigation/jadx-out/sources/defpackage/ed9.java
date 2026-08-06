package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ed9 extends xs {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements yc9<T> {
        public final /* synthetic */ Iterator a;

        public a(Iterator it) {
            this.a = it;
        }

        @Override // defpackage.yc9
        public final Iterator<T> iterator() {
            return this.a;
        }
    }

    public static <T> yc9<T> c(Iterator<? extends T> it) {
        it.getClass();
        return new rx1(new a(it));
    }

    public static <T> yc9<T> d(T t, oh4<? super T, ? extends T> oh4Var) {
        oh4Var.getClass();
        return t == null ? nf3.a : new ik4(new q83(1, t), oh4Var);
    }
}
