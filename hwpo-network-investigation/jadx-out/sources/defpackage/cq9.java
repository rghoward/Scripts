package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cq9<T> extends k27<T> {
    public final AtomicBoolean k = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements qf7, mi4 {
        public final /* synthetic */ dw6 t;

        public a(dw6 dw6Var) {
            this.t = dw6Var;
        }

        @Override // defpackage.qf7
        public final /* synthetic */ void a(Object obj) {
            this.t.invoke(obj);
        }

        @Override // defpackage.mi4
        public final di4<?> b() {
            return this.t;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof qf7) && (obj instanceof mi4)) {
                return xj5.a(b(), ((mi4) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @Override // defpackage.kb6
    public final void e(m76 m76Var, qf7<? super T> qf7Var) {
        if (this.c > 0) {
            rma.a.f(new Object[0]);
        }
        super.e(m76Var, new a(new dw6(1, this, (dl0.a) qf7Var)));
    }

    @Override // defpackage.k27
    public final void j(T t) {
        this.k.set(true);
        super.j(t);
    }
}
