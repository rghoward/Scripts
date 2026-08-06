package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sq9 extends mu9 {
    public Object b;
    public Object c;
    public d37<Object> d;
    public d37<Object> e;
    public sc9<? super g2b> f;
    public final ew6 g = new ew6(2, this);
    public final gu9 h;

    public sq9() {
        km8 km8Var = new km8(1, this);
        qu9.e(qu9.a);
        synchronized (qu9.c) {
            qu9.h = th1.L(qu9.h, km8Var);
            g2b g2bVar = g2b.a;
        }
        this.h = new gu9(km8Var);
    }

    @Override // defpackage.mu9
    public final void a(sc9<? super g2b> sc9Var) {
        this.c = null;
        this.e = null;
    }

    @Override // defpackage.mu9
    public final void b() {
        synchronized (this.a) {
            try {
                this.b = this.c;
                if (this.e == null) {
                    this.d = null;
                } else {
                    if (this.d == null) {
                        this.d = a49.a();
                    }
                    d37<Object> d37Var = this.d;
                    this.d = this.e;
                    this.e = d37Var;
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mu9
    public final void c() {
        this.h.a();
        this.c = null;
        this.e = null;
        synchronized (this.a) {
            this.f = null;
            this.b = null;
            this.d = null;
            g2b g2bVar = g2b.a;
        }
    }

    @Override // defpackage.mu9
    public final oh4<Object, g2b> d(sc9<? super g2b> sc9Var) {
        sc9<? super g2b> sc9Var2 = this.f;
        if (sc9Var2 != null && !sc9Var2.equals(sc9Var)) {
            c78.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f = sc9Var;
        return this.g;
    }

    @Override // defpackage.mu9
    public final void e(p91 p91Var) {
        this.f = null;
        this.c = null;
        this.e = null;
        b();
    }
}
