package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ou7 implements xx6 {
    public final xx6 t;
    public final aq5 u = new aq5();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {61, 62}, m = "withFrameNanos", v = 1)
    public static final class a<R> extends u02 {
        public oh4 t;
        public /* synthetic */ Object u;
        public int w;

        public a(r02<? super a> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return ou7.this.u(null, this);
        }
    }

    public ou7(xx6 xx6Var) {
        this.t = xx6Var;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xx6
    public final <R> Object u(oh4<? super Long, ? extends R> oh4Var, r02<? super R> r02Var) throws Throwable {
        a aVar;
        boolean z;
        Object objR;
        if (r02Var instanceof a) {
            aVar = (a) r02Var;
            int i = aVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.w = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(r02Var);
            }
        } else {
            aVar = new a(r02Var);
        }
        Object obj = aVar.u;
        v72 v72Var = v72.t;
        int i2 = aVar.w;
        if (i2 == 0) {
            dv8.b(obj);
            aq5 aq5Var = this.u;
            aVar.t = oh4Var;
            aVar.w = 1;
            synchronized (aq5Var.a) {
                z = aq5Var.d;
            }
            if (z) {
                objR = g2b.a;
            } else {
                e41 e41Var = new e41(1, th0.e(aVar));
                e41Var.t();
                synchronized (aq5Var.a) {
                    aq5Var.b.add(e41Var);
                }
                e41Var.v(new zp5(aq5Var, e41Var));
                objR = e41Var.r();
                if (objR != v72Var) {
                    objR = g2b.a;
                }
            }
            if (objR != v72Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                dv8.b(obj);
                return obj;
            }
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oh4Var = aVar.t;
        dv8.b(obj);
        xx6 xx6Var = this.t;
        aVar.t = null;
        aVar.w = 2;
        Object objU = xx6Var.u(oh4Var, aVar);
        return objU == v72Var ? v72Var : objU;
    }
}
