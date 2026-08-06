package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w4b implements zs3<v4b> {
    public final nf8<Context> a;
    public final nf8<ai0> b;
    public final nf8<an3> c;
    public final u49 d;
    public final nf8<Executor> e;
    public final nf8<n7a> f;
    public final nf8<kf1> g;

    public w4b(nf8 nf8Var, nf8 nf8Var2, nf8 nf8Var3, u49 u49Var, nf8 nf8Var4, nf8 nf8Var5, nf8 nf8Var6) {
        this.a = nf8Var;
        this.b = nf8Var2;
        this.c = nf8Var3;
        this.d = u49Var;
        this.e = nf8Var4;
        this.f = nf8Var5;
        this.g = nf8Var6;
    }

    @Override // defpackage.nf8
    public final Object get() {
        return new v4b(this.a.get(), this.b.get(), this.c.get(), (vob) this.d.get(), this.e.get(), this.f.get(), new xo5(), new gz3(), this.g.get());
    }
}
