package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sq2 implements bb5 {
    public static final sq2 a = new sq2();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends ox6.c implements a73 {
        public final h27 H;
        public boolean I;
        public boolean J;
        public boolean K;

        /* JADX INFO: renamed from: sq2$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", l = {228}, m = "invokeSuspend", v = 1)
        public static final class C0245a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public int t;

            /* JADX INFO: renamed from: sq2$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class C0246a<T> implements s54 {
                public final /* synthetic */ el8 t;
                public final /* synthetic */ el8 u;
                public final /* synthetic */ el8 v;
                public final /* synthetic */ a w;

                public C0246a(el8 el8Var, el8 el8Var2, el8 el8Var3, a aVar) {
                    this.t = el8Var;
                    this.u = el8Var2;
                    this.v = el8Var3;
                    this.w = aVar;
                }

                @Override // defpackage.s54
                public final Object emit(Object obj, r02 r02Var) {
                    qg5 qg5Var = (qg5) obj;
                    boolean z = qg5Var instanceof n88.b;
                    el8 el8Var = this.v;
                    el8 el8Var2 = this.u;
                    el8 el8Var3 = this.t;
                    boolean z2 = true;
                    if (z) {
                        el8Var3.t++;
                    } else if ((qg5Var instanceof n88.c) || (qg5Var instanceof n88.a)) {
                        el8Var3.t--;
                    } else if (qg5Var instanceof l35) {
                        el8Var2.t++;
                    } else if (qg5Var instanceof m35) {
                        el8Var2.t--;
                    } else if (qg5Var instanceof v84) {
                        el8Var.t++;
                    } else if (qg5Var instanceof w84) {
                        el8Var.t--;
                    }
                    boolean z3 = false;
                    boolean z4 = el8Var3.t > 0;
                    boolean z5 = el8Var2.t > 0;
                    boolean z6 = el8Var.t > 0;
                    a aVar = this.w;
                    if (aVar.I != z4) {
                        aVar.I = z4;
                        z3 = true;
                    }
                    if (aVar.J != z5) {
                        aVar.J = z5;
                        z3 = true;
                    }
                    if (aVar.K != z6) {
                        aVar.K = z6;
                    } else {
                        z2 = z3;
                    }
                    if (z2) {
                        b73.a(aVar);
                    }
                    return g2b.a;
                }
            }

            public C0245a(r02<? super C0245a> r02Var) {
                super(2, r02Var);
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return a.this.new C0245a(r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((C0245a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.t;
                if (i != 0) {
                    if (i == 1) {
                        dv8.b(obj);
                        return g2b.a;
                    }
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                el8 el8Var = new el8();
                el8 el8Var2 = new el8();
                el8 el8Var3 = new el8();
                a aVar = a.this;
                am9 am9VarA = aVar.H.a();
                C0246a c0246a = new C0246a(el8Var, el8Var2, el8Var3, aVar);
                this.t = 1;
                am9VarA.collect(c0246a, this);
                return v72.t;
            }
        }

        public a(h27 h27Var) {
            this.H = h27Var;
        }

        @Override // ox6.c
        public final void U1() {
            oy0.d(Q1(), null, null, new C0245a(null), 3);
        }

        @Override // defpackage.a73
        public final void t(tr5 tr5Var) {
            s41 s41Var = tr5Var.t;
            tr5Var.K1();
            if (this.I) {
                d73.W0(tr5Var, uh1.b(0.3f, uh1.b), 0L, s41Var.c(), 0.0f, 122);
            } else if (this.J || this.K) {
                d73.W0(tr5Var, uh1.b(0.1f, uh1.b), 0L, s41Var.c(), 0.0f, 122);
            }
        }
    }

    @Override // defpackage.bb5
    public final dw2 a(h27 h27Var) {
        return new a(h27Var);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.bb5
    public final int hashCode() {
        return -1;
    }
}
