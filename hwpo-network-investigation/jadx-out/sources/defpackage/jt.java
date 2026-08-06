package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jt extends wp5 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ oh4<Context, Object> u;
    public final /* synthetic */ ox6 v;
    public final /* synthetic */ oh4<Object, g2b> w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt(oh4 oh4Var, ox6 ox6Var, oh4 oh4Var2, int i) {
        super(2);
        this.u = oh4Var;
        this.v = ox6Var;
        this.w = oh4Var2;
        this.x = i;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        num.intValue();
        int iS = gz3.s(this.x | 1);
        ft.a(this.u, this.v, this.w, jt1Var, iS);
        return g2b.a;
    }
}
