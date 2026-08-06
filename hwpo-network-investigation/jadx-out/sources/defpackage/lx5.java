package defpackage;

import c88.a;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lx5 {
    public final g88 a;
    public final oh4<? super z87, g2b> b;
    public final d88 c;
    public c88 d;
    public int e;
    public int f;
    public int g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements z87 {
        public final int a;
        public final ArrayList b = new ArrayList();

        public a(int i) {
            this.a = i;
        }

        @Override // defpackage.z87
        public final void a(int i) {
            lx5 lx5Var = lx5.this;
            c88 c88Var = lx5Var.d;
            if (c88Var == null) {
                return;
            }
            d88 d88Var = lx5Var.c;
            g88 g88Var = c88Var.c;
            this.b.add(c88Var.new a(i, d88Var, g88Var instanceof s98 ? (s98) g88Var : null, null));
        }

        @Override // defpackage.z87
        public final int b() {
            return this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        void c();

        void cancel();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
        long a(int i);

        int b();

        int getIndex();
    }

    public lx5() {
        this.c = new d88();
        this.e = -1;
        this.f = -1;
    }

    public final b a(int i, long j, boolean z, oh4<? super c, g2b> oh4Var) {
        c88 c88Var = this.d;
        if (c88Var == null) {
            return j93.a;
        }
        g88 g88Var = c88Var.c;
        boolean z2 = g88Var instanceof s98;
        c88.a aVar = c88Var.new a(i, this.c, z2 ? (s98) g88Var : null, oh4Var);
        aVar.d = new xx1(j);
        if (!z2) {
            g88Var.a(aVar);
        } else if (z) {
            ((s98) g88Var).c(aVar);
        } else {
            ((s98) g88Var).b(aVar);
        }
        qs.a(i, "compose:lazy:schedule_prefetch:index");
        return aVar;
    }

    @gy2
    public lx5(g88 g88Var, oh4<? super z87, g2b> oh4Var) {
        this();
        this.a = g88Var;
        this.b = oh4Var;
    }
}
