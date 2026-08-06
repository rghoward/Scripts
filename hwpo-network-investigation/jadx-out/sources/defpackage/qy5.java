package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qy5 extends zy5 {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ tw5 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ di.b i;
    public final /* synthetic */ di.c j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;
    public final /* synthetic */ nz5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy5(long j, boolean z, iy5 iy5Var, tw5 tw5Var, int i, int i2, di.b bVar, di.c cVar, int i3, int i4, long j2, nz5 nz5Var) {
        super(j, z, iy5Var, tw5Var);
        this.e = z;
        this.f = tw5Var;
        this.g = i;
        this.h = i2;
        this.i = bVar;
        this.j = cVar;
        this.k = i3;
        this.l = i4;
        this.m = j2;
        this.n = nz5Var;
    }

    @Override // defpackage.zy5
    public final yy5 u(int i, Object obj, Object obj2, List<? extends jz7> list, long j) {
        return new yy5(i, list, this.e, this.i, this.j, this.f.u.getLayoutDirection(), this.k, this.l, i == this.g + (-1) ? 0 : this.h, this.m, obj, obj2, this.n.o, j);
    }
}
