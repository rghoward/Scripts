package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gdb implements hw {
    public final y44 a;

    public gdb(float f, float f2) {
        this.a = new y44(f, f2, 0.01f);
    }

    @Override // defpackage.hw
    public final m44 get(int i) {
        return this.a;
    }
}
