package defpackage;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface jq6 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public final int a;
        public final bq6.b b;
        public final CopyOnWriteArrayList<C0186a> c;

        /* JADX INFO: renamed from: jq6$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0186a {
            public Handler a;
            public jq6 b;
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void a(final ry1<jq6> ry1Var) {
            for (C0186a c0186a : this.c) {
                final jq6 jq6Var = c0186a.b;
                n6b.R(c0186a.a, new Runnable() { // from class: iq6
                    @Override // java.lang.Runnable
                    public final void run() {
                        ry1Var.accept(jq6Var);
                    }
                });
            }
        }

        public final void b(rb6 rb6Var, int i, int i2, id4 id4Var, int i3, Object obj, long j, long j2) {
            a(new gq6(this, rb6Var, new mp6(i, i2, id4Var, i3, obj, n6b.Z(j), n6b.Z(j2))));
        }

        public final void c(rb6 rb6Var, int i, int i2, id4 id4Var, int i3, Object obj, long j, long j2) {
            a(new eq6(this, rb6Var, new mp6(i, i2, id4Var, i3, obj, n6b.Z(j), n6b.Z(j2))));
        }

        public final void d(rb6 rb6Var, int i, int i2, id4 id4Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            a(new fq6(this, rb6Var, new mp6(i, i2, id4Var, i3, obj, n6b.Z(j), n6b.Z(j2)), iOException, z));
        }

        public final void e(rb6 rb6Var, int i, int i2, id4 id4Var, int i3, Object obj, long j, long j2, int i4) {
            a(new dq6(this, rb6Var, new mp6(i, i2, id4Var, i3, obj, n6b.Z(j), n6b.Z(j2)), i4));
        }

        public a(CopyOnWriteArrayList<C0186a> copyOnWriteArrayList, int i, bq6.b bVar) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = bVar;
        }
    }

    default void p(int i, bq6.b bVar, mp6 mp6Var) {
    }

    default void q(int i, bq6.b bVar, mp6 mp6Var) {
    }

    default void v(int i, bq6.b bVar, rb6 rb6Var, mp6 mp6Var) {
    }

    default void z(int i, bq6.b bVar, rb6 rb6Var, mp6 mp6Var) {
    }

    default void g0(int i, bq6.b bVar, rb6 rb6Var, mp6 mp6Var, int i2) {
    }

    default void D(int i, bq6.b bVar, rb6 rb6Var, mp6 mp6Var, IOException iOException, boolean z) {
    }
}
