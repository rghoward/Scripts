package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bm3 implements wp8, kp8 {
    public final Object a;
    public final wp8 b;
    public volatile kp8 c;
    public volatile kp8 d;
    public int e = 3;
    public int f = 3;

    public bm3(Object obj, wp8 wp8Var) {
        this.a = obj;
        this.b = wp8Var;
    }

    @Override // defpackage.wp8, defpackage.kp8
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.c.a() || this.d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.kp8
    public final void b() {
        synchronized (this.a) {
            try {
                if (this.e == 1) {
                    this.e = 2;
                    this.c.b();
                }
                if (this.f == 1) {
                    this.f = 2;
                    this.d.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kp8
    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 4 || this.f == 4;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.kp8
    public final void clear() {
        synchronized (this.a) {
            try {
                this.e = 3;
                this.c.clear();
                if (this.f != 3) {
                    this.f = 3;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kp8
    public final boolean d(kp8 kp8Var) {
        if (kp8Var instanceof bm3) {
            bm3 bm3Var = (bm3) kp8Var;
            if (this.c.d(bm3Var.c) && this.d.d(bm3Var.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wp8
    public final void e(kp8 kp8Var) {
        synchronized (this.a) {
            try {
                if (kp8Var.equals(this.d)) {
                    this.f = 5;
                    wp8 wp8Var = this.b;
                    if (wp8Var != null) {
                        wp8Var.e(this);
                    }
                    return;
                }
                this.e = 5;
                if (this.f != 1) {
                    this.f = 1;
                    this.d.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wp8
    public final void f(kp8 kp8Var) {
        synchronized (this.a) {
            try {
                if (kp8Var.equals(this.c)) {
                    this.e = 4;
                } else if (kp8Var.equals(this.d)) {
                    this.f = 4;
                }
                wp8 wp8Var = this.b;
                if (wp8Var != null) {
                    wp8Var.f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wp8
    public final boolean g(kp8 kp8Var) {
        boolean z;
        synchronized (this.a) {
            wp8 wp8Var = this.b;
            z = (wp8Var == null || wp8Var.g(this)) && kp8Var.equals(this.c);
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [wp8] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.wp8
    public final wp8 getRoot() {
        ?? root;
        synchronized (this.a) {
            try {
                wp8 wp8Var = this.b;
                this = this;
                if (wp8Var != null) {
                    root = wp8Var.getRoot();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // defpackage.wp8
    public final boolean h(kp8 kp8Var) {
        boolean z;
        boolean zEquals;
        int i;
        synchronized (this.a) {
            wp8 wp8Var = this.b;
            z = false;
            if (wp8Var == null || wp8Var.h(this)) {
                if (this.e != 5) {
                    zEquals = kp8Var.equals(this.c);
                } else {
                    zEquals = kp8Var.equals(this.d) && ((i = this.f) == 4 || i == 5);
                }
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.wp8
    public final boolean i(kp8 kp8Var) {
        boolean z;
        synchronized (this.a) {
            wp8 wp8Var = this.b;
            z = wp8Var == null || wp8Var.i(this);
        }
        return z;
    }

    @Override // defpackage.kp8
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                z = true;
                if (this.e != 1 && this.f != 1) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.kp8
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 3 && this.f == 3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.kp8
    public final void k() {
        synchronized (this.a) {
            try {
                if (this.e != 1) {
                    this.e = 1;
                    this.c.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
