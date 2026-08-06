package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class loa implements ioa {
    public final boolean a;
    public final dt7 b;
    public final bt7 c;
    public final bt7 d;

    public loa(int i, boolean z, int i2) {
        if (i < 0 || i >= 24) {
            z90.a("initialHour should in [0..23] range");
            throw null;
        }
        if (i2 < 0 || i2 >= 60) {
            z90.a("initialMinute should be in [0..59] range");
            throw null;
        }
        this.a = z;
        this.b = bl7.i(new hoa(0));
        this.c = new bt7(i);
        this.d = new bt7(i2);
    }

    @Override // defpackage.ioa
    public final void a(int i) {
        this.c.j(i);
    }

    @Override // defpackage.ioa
    public final void b(int i) {
        this.d.j(i);
    }

    @Override // defpackage.ioa
    public final int c() {
        return this.d.k();
    }

    @Override // defpackage.ioa
    public final void d(int i) {
        this.b.setValue(new hoa(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ioa
    public final int e() {
        return ((hoa) this.b.getValue()).a;
    }

    @Override // defpackage.ioa
    public final boolean f() {
        return this.a;
    }

    @Override // defpackage.ioa
    public final int g() {
        return this.c.k();
    }
}
