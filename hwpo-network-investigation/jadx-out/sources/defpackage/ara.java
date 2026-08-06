package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ara implements l68 {
    public final int a;

    public ara(int i) {
        this.a = i;
    }

    @Override // defpackage.l68
    public final long a(gg5 gg5Var, long j, tq5 tq5Var, long j2) {
        int i = (int) (j2 >> 32);
        int iD = ((gg5Var.d() - i) / 2) + gg5Var.a;
        if (iD < 0) {
            iD = gg5Var.a;
        } else if (iD + i > ((int) (j >> 32))) {
            iD = gg5Var.c - i;
        }
        int i2 = gg5Var.b - ((int) (j2 & 4294967295L));
        int i3 = this.a;
        int i4 = i2 - i3;
        if (i4 < 0) {
            i4 = gg5Var.d + i3;
        }
        return (((long) iD) << 32) | (((long) i4) & 4294967295L);
    }
}
