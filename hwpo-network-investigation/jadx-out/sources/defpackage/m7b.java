package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m7b implements ag7 {
    public final ag7 a;
    public final int b;
    public final int c;

    public m7b(ag7 ag7Var, int i, int i2) {
        this.a = ag7Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ag7
    public final int a(int i) {
        int iA = this.a.a(i);
        if (i >= 0 && i <= this.c) {
            n7b.c(iA, this.b, i);
        }
        return iA;
    }

    @Override // defpackage.ag7
    public final int b(int i) {
        int iB = this.a.b(i);
        if (i >= 0 && i <= this.b) {
            n7b.b(iB, this.c, i);
        }
        return iB;
    }
}
