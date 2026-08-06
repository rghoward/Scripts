package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend", v = 1)
public final class nw0 extends p6a implements ci4<t72, r02<? super el5>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ ow0 u;
    public final /* synthetic */ mb7 v;
    public final /* synthetic */ yv0 w;
    public final /* synthetic */ mw0 x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", l = {183}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ ow0 u;
        public final /* synthetic */ mb7 v;
        public final /* synthetic */ yv0 w;

        /* JADX INFO: renamed from: nw0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final /* synthetic */ class C0207a extends pi4 implements mh4<sk8> {
            public final /* synthetic */ ow0 t;
            public final /* synthetic */ mb7 u;
            public final /* synthetic */ yv0 v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0207a(ow0 ow0Var, mb7 mb7Var, yv0 yv0Var) {
                super(0, xj5.a.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.t = ow0Var;
                this.u = mb7Var;
                this.v = yv0Var;
            }

            @Override // defpackage.mh4
            public final sk8 invoke() {
                return ow0.c2(this.t, this.u, this.v);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ow0 ow0Var, mb7 mb7Var, yv0 yv0Var, r02 r02Var) {
            super(2, r02Var);
            this.u = ow0Var;
            this.v = mb7Var;
            this.w = yv0Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, this.v, this.w, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objR;
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                ow0 ow0Var = this.u;
                dz1 dz1Var = ow0Var.H;
                C0207a c0207a = new C0207a(ow0Var, this.v, this.w);
                this.t = 1;
                dz1Var.getClass();
                sk8 sk8Var = (sk8) c0207a.invoke();
                v72 v72Var = v72.t;
                if (sk8Var == null || dz1.e2(dz1Var, sk8Var, 0L, 0L, 3)) {
                    objR = g2b.a;
                } else {
                    e41 e41Var = new e41(1, th0.e(this));
                    e41Var.t();
                    dz1.a aVar = new dz1.a(c0207a, e41Var);
                    ew0 ew0Var = dz1Var.M;
                    k37<dz1.a> k37Var = ew0Var.a;
                    sk8 sk8Var2 = (sk8) c0207a.invoke();
                    if (sk8Var2 == null) {
                        e41Var.resumeWith(g2b.a);
                    } else {
                        e41Var.v(new dw0(0, ew0Var, aVar));
                        fg5 fg5VarJ = uh8.j(0, k37Var.v);
                        int i2 = fg5VarJ.t;
                        int i3 = fg5VarJ.u;
                        if (i2 > i3) {
                            k37Var.c(0, aVar);
                            break;
                        }
                        while (true) {
                            sk8 sk8Var3 = (sk8) k37Var.t[i3].a.invoke();
                            if (sk8Var3 != null) {
                                sk8 sk8VarE = sk8Var2.e(sk8Var3);
                                if (!sk8VarE.equals(sk8Var2)) {
                                    if (!sk8VarE.equals(sk8Var3)) {
                                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                        int i4 = k37Var.v - 1;
                                        if (i4 <= i3) {
                                            while (true) {
                                                k37Var.t[i3].b.l(cancellationException);
                                                if (i4 == i3) {
                                                    break;
                                                }
                                                i4++;
                                            }
                                        }
                                    }
                                } else {
                                    k37Var.c(i3 + 1, aVar);
                                    break;
                                }
                            }
                            if (i3 == i2) {
                                k37Var.c(0, aVar);
                                break;
                            }
                            i3--;
                        }
                        if (!dz1Var.P) {
                            dz1Var.f2(0L);
                        }
                    }
                    objR = e41Var.r();
                    if (objR != v72Var) {
                        objR = g2b.a;
                    }
                }
                if (objR == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", f = "BringIntoViewResponder.kt", l = {191}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ ow0 u;
        public final /* synthetic */ mw0 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ow0 ow0Var, mw0 mw0Var, r02 r02Var) {
            super(2, r02Var);
            this.u = ow0Var;
            this.v = mw0Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new b(this.u, this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                this.t = 1;
                Object objA = zv0.a(this.u, this.v, this);
                v72 v72Var = v72.t;
                if (objA == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw0(ow0 ow0Var, mb7 mb7Var, yv0 yv0Var, mw0 mw0Var, r02 r02Var) {
        super(2, r02Var);
        this.u = ow0Var;
        this.v = mb7Var;
        this.w = yv0Var;
        this.x = mw0Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        nw0 nw0Var = new nw0(this.u, this.v, this.w, this.x, r02Var);
        nw0Var.t = obj;
        return nw0Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super el5> r02Var) {
        return ((nw0) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        t72 t72Var = (t72) this.t;
        mb7 mb7Var = this.v;
        yv0 yv0Var = this.w;
        ow0 ow0Var = this.u;
        oy0.d(t72Var, null, null, new a(ow0Var, mb7Var, yv0Var, null), 3);
        return oy0.d(t72Var, null, null, new b(ow0Var, this.x, null), 3);
    }
}
