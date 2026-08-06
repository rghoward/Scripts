package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cnc extends anc {
    public boolean b;

    public cnc(tkc tkcVar) {
        super(tkcVar);
        this.a.A++;
    }

    public abstract boolean h();

    public final void i() {
        if (this.b) {
            return;
        }
        aa0.c("Not initialized");
    }

    public final void j() {
        if (this.b) {
            aa0.c("Can't initialize twice");
        } else {
            if (h()) {
                return;
            }
            this.a.C.incrementAndGet();
            this.b = true;
        }
    }
}
