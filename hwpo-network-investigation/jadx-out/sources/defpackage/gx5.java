package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gx5 implements ez7, ez7.a, kx5.a {
    public final Object a;
    public final kx5 b;
    public int d;
    public ez7.a e;
    public boolean f;
    public int c = -1;
    public final dt7 g = bl7.i(null);

    public gx5(Object obj, kx5 kx5Var) {
        this.a = obj;
        this.b = kx5Var;
    }

    @Override // ez7.a
    public final void a() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            xc5.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.t.remove(this);
            ez7.a aVar = this.e;
            if (aVar != null) {
                aVar.a();
            }
            this.e = null;
        }
    }

    @Override // defpackage.ez7
    public final gx5 b() {
        if (this.f) {
            xc5.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.t.add(this);
            ez7 ez7Var = (ez7) this.g.getValue();
            this.e = ez7Var != null ? ez7Var.b() : null;
        }
        this.d++;
        return this;
    }

    @Override // kx5.a
    public final int getIndex() {
        return this.c;
    }

    @Override // kx5.a
    public final Object getKey() {
        return this.a;
    }
}
