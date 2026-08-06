package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fyc extends sxc {
    public boolean c;

    public fyc(lzc lzcVar) {
        super(lzcVar);
        this.b.r++;
    }

    public final void h() {
        if (this.c) {
            return;
        }
        aa0.c("Not initialized");
    }

    public final void i() {
        if (this.c) {
            aa0.c("Can't initialize twice");
            return;
        }
        j();
        this.b.s++;
        this.c = true;
    }

    public abstract void j();
}
