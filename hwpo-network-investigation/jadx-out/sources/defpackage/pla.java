package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pla implements wp8, kp8 {
    public final wp8 a;
    public final Object b;
    public volatile hq9 c;
    public volatile kp8 d;
    public int e = 3;
    public int f = 3;
    public boolean g;

    public pla(Object obj, wp8 wp8Var) {
        this.b = obj;
        this.a = wp8Var;
    }

    @Override // defpackage.wp8, defpackage.kp8
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.d.a() || this.c.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.kp8
    public final void b() {
        synchronized (this.b) {
            try {
                if (!vp8.a(this.f)) {
                    this.f = 2;
                    this.d.b();
                }
                if (!vp8.a(this.e)) {
                    this.e = 2;
                    this.c.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kp8
    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 4;
        }
        return z;
    }

    @Override // defpackage.kp8
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            this.e = 3;
            this.f = 3;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // defpackage.kp8
    public final boolean d(kp8 kp8Var) {
        if (!(kp8Var instanceof pla)) {
            return false;
        }
        pla plaVar = (pla) kp8Var;
        if (this.c == null) {
            if (plaVar.c != null) {
                return false;
            }
        } else if (!this.c.d(plaVar.c)) {
            return false;
        }
        if (this.d == null) {
            return plaVar.d == null;
        }
        return this.d.d(plaVar.d);
    }

    @Override // defpackage.wp8
    public final void e(kp8 kp8Var) {
        synchronized (this.b) {
            try {
                if (!kp8Var.equals(this.c)) {
                    this.f = 5;
                    return;
                }
                this.e = 5;
                wp8 wp8Var = this.a;
                if (wp8Var != null) {
                    wp8Var.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wp8
    public final void f(kp8 kp8Var) {
        synchronized (this.b) {
            try {
                if (kp8Var.equals(this.d)) {
                    this.f = 4;
                    return;
                }
                this.e = 4;
                wp8 wp8Var = this.a;
                if (wp8Var != null) {
                    wp8Var.f(this);
                }
                if (!vp8.a(this.f)) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wp8
    public final boolean g(kp8 kp8Var) {
        boolean z;
        synchronized (this.b) {
            try {
                wp8 wp8Var = this.a;
                z = (wp8Var == null || wp8Var.g(this)) && kp8Var.equals(this.c) && this.e != 2;
            } catch (Throwable th) {
                throw th;
            }
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
        synchronized (this.b) {
            try {
                wp8 wp8Var = this.a;
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
        synchronized (this.b) {
            try {
                wp8 wp8Var = this.a;
                z = (wp8Var == null || wp8Var.h(this)) && kp8Var.equals(this.c) && !a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.wp8
    public final boolean i(kp8 kp8Var) {
        boolean z;
        synchronized (this.b) {
            try {
                wp8 wp8Var = this.a;
                z = (wp8Var == null || wp8Var.i(this)) && (kp8Var.equals(this.c) || this.e != 4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.kp8
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.e != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.kp8
    public final boolean j() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 3;
        }
        return z;
    }

    @Override // defpackage.kp8
    public final void k() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != 4 && this.f != 1) {
                        this.f = 1;
                        this.d.k();
                    }
                    if (this.g && this.e != 1) {
                        this.e = 1;
                        this.c.k();
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
