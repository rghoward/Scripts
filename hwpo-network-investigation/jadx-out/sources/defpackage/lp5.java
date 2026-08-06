package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class lp5 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<Throwable, g2b> {
        public final /* synthetic */ p21<T> u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p21<T> p21Var) {
            super(1);
            this.u = p21Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(Throwable th) {
            this.u.cancel();
            return g2b.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<T> implements u21<T> {
        public final /* synthetic */ e41 a;

        public b(e41 e41Var) {
            this.a = e41Var;
        }

        @Override // defpackage.u21
        public final void onFailure(p21<T> p21Var, Throwable th) {
            this.a.resumeWith(new av8.a(th));
        }

        @Override // defpackage.u21
        public final void onResponse(p21<T> p21Var, ru8<T> ru8Var) {
            p21Var.getClass();
            boolean z = ru8Var.a.J;
            e41 e41Var = this.a;
            if (!z) {
                e41Var.resumeWith(new av8.a(new q45(ru8Var)));
                return;
            }
            T t = ru8Var.b;
            if (t != null) {
                e41Var.resumeWith(t);
                return;
            }
            jp8 jp8VarRequest = p21Var.request();
            jp8VarRequest.getClass();
            sd1 sd1VarA = ll8.a(mk5.class);
            Object objCast = me3.b(sd1VarA).cast(jp8VarRequest.e.G0(sd1VarA));
            objCast.getClass();
            mk5 mk5Var = (mk5) objCast;
            e41Var.resumeWith(new av8.a(new rp5("Response from " + mk5Var.a.getName() + '.' + mk5Var.c.getName() + " was null but response body type was declared as non-null")));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements oh4<Throwable, g2b> {
        public final /* synthetic */ p21<T> u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p21<T> p21Var) {
            super(1);
            this.u = p21Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(Throwable th) {
            this.u.cancel();
            return g2b.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d<T> implements u21<T> {
        public final /* synthetic */ e41 a;

        public d(e41 e41Var) {
            this.a = e41Var;
        }

        @Override // defpackage.u21
        public final void onFailure(p21<T> p21Var, Throwable th) {
            this.a.resumeWith(new av8.a(th));
        }

        @Override // defpackage.u21
        public final void onResponse(p21<T> p21Var, ru8<T> ru8Var) {
            p21Var.getClass();
            boolean z = ru8Var.a.J;
            e41 e41Var = this.a;
            if (z) {
                e41Var.resumeWith(ru8Var.b);
            } else {
                e41Var.resumeWith(new av8.a(new q45(ru8Var)));
            }
        }
    }

    public static final <T> Object a(p21<T> p21Var, r02<? super T> r02Var) {
        e41 e41Var = new e41(1, th0.e(r02Var));
        e41Var.t();
        e41Var.v(new a(p21Var));
        p21Var.enqueue(new b(e41Var));
        return e41Var.r();
    }

    public static final <T> Object b(p21<T> p21Var, r02<? super T> r02Var) {
        e41 e41Var = new e41(1, th0.e(r02Var));
        e41Var.t();
        e41Var.v(new c(p21Var));
        p21Var.enqueue(new d(e41Var));
        return e41Var.r();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void c(Throwable th, r02 r02Var) {
        op5 op5Var;
        if (r02Var instanceof op5) {
            op5Var = (op5) r02Var;
            int i = op5Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                op5Var.u = i - Integer.MIN_VALUE;
            } else {
                op5Var = new op5(r02Var);
            }
        } else {
            op5Var = new op5(r02Var);
        }
        Object obj = op5Var.t;
        int i2 = op5Var.u;
        if (i2 == 0) {
            dv8.b(obj);
            op5Var.u = 1;
            i23.a.t0(op5Var.getContext(), new pp5(op5Var, th));
        } else if (i2 != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
        } else {
            dv8.b(obj);
            fl.a();
        }
    }
}
