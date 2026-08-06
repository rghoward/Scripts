package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ts implements xx6 {
    public final Choreographer t;
    public final ss u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<Throwable, g2b> {
        public final /* synthetic */ ss u;
        public final /* synthetic */ c v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ss ssVar, c cVar) {
            super(1);
            this.u = ssVar;
            this.v = cVar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(Throwable th) {
            ss ssVar = this.u;
            c cVar = this.v;
            synchronized (ssVar.x) {
                ssVar.z.remove(cVar);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements oh4<Throwable, g2b> {
        public final /* synthetic */ c v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(1);
            this.v = cVar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(Throwable th) {
            ts.this.t.removeFrameCallback(this.v);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements Choreographer.FrameCallback {
        public final /* synthetic */ e41 t;
        public final /* synthetic */ oh4<Long, R> u;

        public c(e41 e41Var, ts tsVar, oh4 oh4Var) {
            this.t = e41Var;
            this.u = oh4Var;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object aVar;
            try {
                aVar = this.u.invoke(Long.valueOf(j));
            } catch (Throwable th) {
                aVar = new av8.a(th);
            }
            this.t.resumeWith(aVar);
        }
    }

    public ts(Choreographer choreographer, ss ssVar) {
        this.t = choreographer;
        this.u = ssVar;
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
        ss ssVar = this.u;
        e41 e41Var = new e41(1, th0.e(r02Var));
        e41Var.t();
        c cVar = new c(e41Var, this, oh4Var);
        if (xj5.a(ssVar.v, this.t)) {
            synchronized (ssVar.x) {
                try {
                    ssVar.z.add(cVar);
                    if (!ssVar.C) {
                        ssVar.C = true;
                        ssVar.v.postFrameCallback(ssVar.D);
                    }
                    g2b g2bVar = g2b.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            e41Var.v(new a(ssVar, cVar));
        } else {
            this.t.postFrameCallback(cVar);
            e41Var.v(new b(cVar));
        }
        return e41Var.r();
    }
}
