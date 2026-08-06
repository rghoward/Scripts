package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m90 extends Exception {
    public final int t;
    public final boolean u;
    public final id4 v;

    public m90(int i, id4 id4Var, boolean z) {
        super(pp2.a(i, "AudioTrack write failed: "));
        this.u = z;
        this.t = i;
        this.v = id4Var;
    }
}
