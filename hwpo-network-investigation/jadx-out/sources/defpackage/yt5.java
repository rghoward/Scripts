package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yt5 extends l4c {
    public final lt5 b;
    public final tw5 c;
    public final int d;
    public final /* synthetic */ tw5 e;
    public final /* synthetic */ zu5 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt5(lt5 lt5Var, tw5 tw5Var, int i, zu5 zu5Var, int i2, int i3, long j) {
        super(2);
        this.e = tw5Var;
        this.f = zu5Var;
        this.g = i2;
        this.h = i3;
        this.i = j;
        this.b = lt5Var;
        this.c = tw5Var;
        this.d = i;
    }

    @Override // defpackage.l4c
    public final uw5 a(int i, int i2, int i3, long j) {
        return u(i, i2, i3, this.d, j);
    }

    public final hu5 u(int i, int i2, int i3, int i4, long j) {
        int i5;
        lt5 lt5Var = this.b;
        Object objF = lt5Var.f(i);
        Object objG = lt5Var.g(i);
        List listC = c(this.c, i, j);
        if (xx1.f(j)) {
            i5 = xx1.j(j);
        } else {
            if (!xx1.e(j)) {
                xc5.a("does not have fixed height");
            }
            i5 = xx1.i(j);
        }
        tq5 layoutDirection = this.e.u.getLayoutDirection();
        vv5<hu5> vv5Var = this.f.m;
        return new hu5(i, objF, i5, i4, layoutDirection, this.g, this.h, listC, this.i, objG, vv5Var, j, i2, i3);
    }
}
