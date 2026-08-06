package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cxc extends dgc {
    public hbc c;
    public boolean d;
    public final axc e;
    public final zwc f;
    public final swc g;

    public cxc(tkc tkcVar) {
        super(tkcVar);
        this.d = true;
        this.e = new axc(this);
        this.f = new zwc(this);
        this.g = new swc(this);
    }

    @Override // defpackage.dgc
    public final boolean j() {
        return false;
    }

    public final void k() {
        g();
        if (this.c == null) {
            this.c = new hbc(Looper.getMainLooper());
        }
    }
}
