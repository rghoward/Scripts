package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fdb implements hw {
    public final y44[] a;

    public fdb(float f, float f2, fw fwVar) {
        int iB = fwVar.b();
        y44[] y44VarArr = new y44[iB];
        for (int i = 0; i < iB; i++) {
            y44VarArr[i] = new y44(f, f2, fwVar.a(i));
        }
        this.a = y44VarArr;
    }

    @Override // defpackage.hw
    public final m44 get(int i) {
        return this.a[i];
    }
}
