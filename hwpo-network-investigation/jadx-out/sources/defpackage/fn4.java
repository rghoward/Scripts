package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fn4 extends g37 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements oh4<ou9, g37> {
        public final /* synthetic */ oh4<Object, g2b> t;
        public final /* synthetic */ oh4<Object, g2b> u;

        public a(oh4<Object, g2b> oh4Var, oh4<Object, g2b> oh4Var2) {
            this.t = oh4Var;
            this.u = oh4Var2;
        }

        @Override // defpackage.oh4
        public final g37 invoke(ou9 ou9Var) {
            long j;
            ou9 ou9Var2 = ou9Var;
            synchronized (qu9.c) {
                j = qu9.e;
                qu9.e = 1 + j;
            }
            return new g37(j, ou9Var2, this.t, this.u);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements oh4<ou9, ki8> {
        public final /* synthetic */ oh4<Object, g2b> t;

        public b(oh4<Object, g2b> oh4Var) {
            this.t = oh4Var;
        }

        @Override // defpackage.oh4
        public final ki8 invoke(ou9 ou9Var) {
            long j;
            ou9 ou9Var2 = ou9Var;
            synchronized (qu9.c) {
                j = qu9.e;
                qu9.e = 1 + j;
            }
            return new ki8(j, ou9Var2, this.t);
        }
    }

    @Override // defpackage.g37
    public final g37 C(oh4<Object, g2b> oh4Var, oh4<Object, g2b> oh4Var2) {
        return (g37) ((hu9) qu9.e(new xj2(2, new a(oh4Var, oh4Var2))));
    }

    @Override // defpackage.g37, defpackage.hu9
    public final void c() {
        synchronized (qu9.c) {
            o();
            g2b g2bVar = g2b.a;
        }
    }

    @Override // defpackage.g37, defpackage.hu9
    public final void k() {
        kw0.b();
        throw null;
    }

    @Override // defpackage.g37, defpackage.hu9
    public final void l() {
        kw0.b();
        throw null;
    }

    @Override // defpackage.g37, defpackage.hu9
    public final void m() {
        qu9.a();
    }

    @Override // defpackage.g37, defpackage.hu9
    public final hu9 u(oh4<Object, g2b> oh4Var) {
        return (ki8) ((hu9) qu9.e(new xj2(2, new b(oh4Var))));
    }

    @Override // defpackage.g37
    public final ju9 w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
