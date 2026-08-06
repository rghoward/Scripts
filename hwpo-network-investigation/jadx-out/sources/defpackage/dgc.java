package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dgc extends tec {
    public boolean b;

    public dgc(tkc tkcVar) {
        super(tkcVar);
        this.a.A++;
    }

    public final void h() {
        if (this.b) {
            return;
        }
        aa0.c("Not initialized");
    }

    public final void i() {
        if (this.b) {
            aa0.c("Can't initialize twice");
        } else {
            if (j()) {
                return;
            }
            this.a.C.incrementAndGet();
            this.b = true;
        }
    }

    public abstract boolean j();
}
