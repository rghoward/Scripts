package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uqb implements s76.a, mi4 {
    public final /* synthetic */ yt1 t;

    public uqb(yt1 yt1Var) {
        this.t = yt1Var;
    }

    @Override // s76.a
    public final i41 a(t76 t76Var) {
        return this.t.u(t76Var);
    }

    @Override // defpackage.mi4
    public final di4<?> b() {
        return new pi4(1, this.t, yt1.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof s76.a) && (obj instanceof mi4)) {
            return xj5.a(b(), ((mi4) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
