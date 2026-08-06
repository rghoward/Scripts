package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kd6<Z> implements kt8<Z>, at3.d {
    public static final at3.c x = at3.a(20, new a());
    public final p0a.a t = new p0a.a();
    public kt8<Z> u;
    public boolean v;
    public boolean w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements at3.b<kd6<?>> {
        @Override // at3.b
        public final kd6<?> a() {
            return new kd6<>();
        }
    }

    @Override // defpackage.kt8
    public final synchronized void a() {
        this.t.a();
        this.w = true;
        if (!this.v) {
            this.u.a();
            this.u = null;
            x.a(this);
        }
    }

    public final synchronized void b() {
        this.t.a();
        if (!this.v) {
            throw new IllegalStateException("Already unlocked");
        }
        this.v = false;
        if (this.w) {
            a();
        }
    }

    @Override // defpackage.kt8
    public final Class<Z> c() {
        return this.u.c();
    }

    @Override // at3.d
    public final p0a.a g() {
        return this.t;
    }

    @Override // defpackage.kt8
    public final Z get() {
        return this.u.get();
    }

    @Override // defpackage.kt8
    public final int getSize() {
        return this.u.getSize();
    }
}
