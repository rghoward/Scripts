package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tw0 implements xx6 {
    public final ak8 t;
    public final ah0<a<?>> u = new ah0<>();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<R> extends ah0.a {
        public e41 a;
        public oh4<? super Long, ? extends R> b;

        public a() {
            throw null;
        }

        @Override // ah0.a
        public final void a() {
            this.b = null;
            this.a = null;
        }

        @Override // ah0.a
        public final void b(Throwable th) {
            e41 e41Var = this.a;
            if (e41Var != null) {
                e41Var.resumeWith(dv8.a(th));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements oh4<Throwable, g2b> {
        public final /* synthetic */ i41 t;

        public b(i41 i41Var) {
            this.t = i41Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(Throwable th) {
            this.t.cancel();
            return g2b.a;
        }
    }

    public tw0(ak8 ak8Var) {
        this.t = ak8Var;
    }

    @Override // defpackage.h72
    public final Object J(ci4 ci4Var, Object obj) {
        return ci4Var.invoke(obj, this);
    }

    @Override // defpackage.h72
    public final h72 N(h72.b<?> bVar) {
        return h72.a.C0100a.b(this, bVar);
    }

    @Override // defpackage.h72
    public final h72 c0(h72 h72Var) {
        return h72.a.C0100a.c(this, h72Var);
    }

    @Override // defpackage.h72
    public final <E extends h72.a> E d0(h72.b<E> bVar) {
        return (E) h72.a.C0100a.a(this, bVar);
    }

    @Override // defpackage.xx6
    public final <R> Object u(oh4<? super Long, ? extends R> oh4Var, r02<? super R> r02Var) {
        e41 e41Var = new e41(1, th0.e(r02Var));
        e41Var.t();
        a aVar = new a();
        aVar.a = e41Var;
        aVar.b = oh4Var;
        e41Var.v(new b(this.u.a(aVar, this.t)));
        return e41Var.r();
    }
}
