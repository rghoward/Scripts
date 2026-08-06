package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rl2 implements qf7, mi4 {
    public final /* synthetic */ oh4 t;

    public rl2(oh4 oh4Var) {
        this.t = oh4Var;
    }

    @Override // defpackage.qf7
    public final /* synthetic */ void a(Object obj) {
        this.t.invoke(obj);
    }

    @Override // defpackage.mi4
    public final di4<?> b() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof qf7) && (obj instanceof mi4)) {
            return xj5.a(b(), ((mi4) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
