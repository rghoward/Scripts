package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class v9a extends p9a {
    public final Runnable v;

    public v9a(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.v = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.v.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.v;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(ym2.c(runnable));
        sb.append(", ");
        sb.append(this.t);
        sb.append(", ");
        return wu0.a(sb, this.u ? "Blocking" : "Non-blocking", ']');
    }
}
