package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hda {
    public final iw a;
    public final wja b;
    public final boolean e;
    public final tx2 g;
    public final qa4.a h;
    public m07 j;
    public tq5 k;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final int f = 1;
    public final List<iw.c<mz7>> i = hf3.t;

    public hda(iw iwVar, wja wjaVar, boolean z, tx2 tx2Var, qa4.a aVar, int i) {
        this.a = iwVar;
        this.b = wjaVar;
        this.e = z;
        this.g = tx2Var;
        this.h = aVar;
    }

    public final void a(tq5 tq5Var) {
        m07 m07Var = this.j;
        if (m07Var == null || tq5Var != this.k || m07Var.a()) {
            this.k = tq5Var;
            m07Var = new m07(this.a, zu1.d(this.b, tq5Var), this.i, this.g, this.h);
        }
        this.j = m07Var;
    }
}
