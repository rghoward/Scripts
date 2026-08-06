package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j16 extends p16 {
    public final /* synthetic */ k16 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j16(k16 k16Var, boolean z, x06 x06Var, tw5 tw5Var, x16 x16Var) {
        super(z, x06Var, tw5Var, x16Var);
        this.f = k16Var;
    }

    @Override // defpackage.p16
    public final s16 u(int i, int i2, int i3, Object obj, Object obj2, List<? extends jz7> list, long j) {
        k16 k16Var = this.f;
        return new s16(i, obj, list, k16Var.f, k16Var.l, i2, i3, k16Var.j, k16Var.k, obj2, k16Var.a.t, j);
    }
}
