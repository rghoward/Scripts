package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f9d extends i9d {
    public final /* synthetic */ i9d c;
    public final /* synthetic */ i9d d;

    public f9d(i9d i9dVar, i9d i9dVar2) {
        this.c = i9dVar;
        this.d = i9dVar2;
    }

    @Override // defpackage.i9d
    public final void a() {
        i9d i9dVar = this.d;
        try {
            this.c.a();
        } finally {
            i9dVar.a();
        }
    }
}
