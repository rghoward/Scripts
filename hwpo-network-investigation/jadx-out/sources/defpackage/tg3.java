package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tg3<Z> implements kt8<Z> {
    public final boolean t;
    public final boolean u;
    public final kt8<Z> v;
    public final a w;
    public final ko5 x;
    public int y;
    public boolean z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        void a(ko5 ko5Var, tg3<?> tg3Var);
    }

    public tg3(kt8<Z> kt8Var, boolean z, boolean z2, ko5 ko5Var, a aVar) {
        ov9.d(kt8Var, "Argument must not be null");
        this.v = kt8Var;
        this.t = z;
        this.u = z2;
        this.x = ko5Var;
        ov9.d(aVar, "Argument must not be null");
        this.w = aVar;
    }

    @Override // defpackage.kt8
    public final synchronized void a() {
        if (this.y > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.z) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.z = true;
        if (this.u) {
            this.v.a();
        }
    }

    public final synchronized void b() {
        if (this.z) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.y++;
    }

    @Override // defpackage.kt8
    public final Class<Z> c() {
        return this.v.c();
    }

    public final void d() {
        boolean z;
        synchronized (this) {
            int i = this.y;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.y = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.w.a(this.x, this);
        }
    }

    @Override // defpackage.kt8
    public final Z get() {
        return this.v.get();
    }

    @Override // defpackage.kt8
    public final int getSize() {
        return this.v.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.t + ", listener=" + this.w + ", key=" + this.x + ", acquired=" + this.y + ", isRecycled=" + this.z + ", resource=" + this.v + '}';
    }
}
