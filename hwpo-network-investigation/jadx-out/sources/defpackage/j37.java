package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j37<S> extends l4c {
    public final dt7 b;
    public final dt7 c;

    public j37(S s) {
        super(5);
        this.b = bl7.i(s);
        this.c = bl7.i(s);
    }

    @Override // defpackage.l4c
    public final S b() {
        return (S) this.b.getValue();
    }

    @Override // defpackage.l4c
    public final S d() {
        return (S) this.c.getValue();
    }

    @Override // defpackage.l4c
    public final void f(S s) {
        this.b.setValue(s);
    }

    public final void u(Boolean bool) {
        this.c.setValue(bool);
    }

    @Override // defpackage.l4c
    public final void h() {
    }

    @Override // defpackage.l4c
    public final void g(tva<S> tvaVar) {
    }
}
