package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mn0 implements PointerInputEventHandler {
    public final /* synthetic */ fra a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1", f = "BasicTooltip.kt", l = {249}, m = "invokeSuspend")
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ i58 v;
        public final /* synthetic */ fra w;

        /* JADX INFO: renamed from: mn0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1", f = "BasicTooltip.kt", l = {253}, m = "invokeSuspend")
        public static final class C0202a extends zu8 implements ci4<yg0, r02<? super g2b>, Object> {
            public s48 u;
            public int v;
            public /* synthetic */ Object w;
            public final /* synthetic */ t72 x;
            public final /* synthetic */ fra y;

            /* JADX INFO: renamed from: mn0$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1", f = "BasicTooltip.kt", l = {258}, m = "invokeSuspend")
            public static final class C0203a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
                public int t;
                public final /* synthetic */ fra u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0203a(fra fraVar, r02<? super C0203a> r02Var) {
                    super(2, r02Var);
                    this.u = fraVar;
                }

                @Override // defpackage.ak0
                public final r02<g2b> create(Object obj, r02<?> r02Var) {
                    return new C0203a(this.u, r02Var);
                }

                @Override // defpackage.ci4
                public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                    return ((C0203a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
                }

                @Override // defpackage.ak0
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i = this.t;
                    if (i == 0) {
                        dv8.b(obj);
                        this.t = 1;
                        Object objC = this.u.c(o37.u, this);
                        v72 v72Var = v72.t;
                        if (objC == v72Var) {
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
            public C0202a(t72 t72Var, fra fraVar, r02<? super C0202a> r02Var) {
                super(2, r02Var);
                this.x = t72Var;
                this.y = fraVar;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C0202a c0202a = new C0202a(this.x, this.y, r02Var);
                c0202a.w = obj;
                return c0202a;
            }

            @Override // defpackage.ci4
            public final Object invoke(yg0 yg0Var, r02<? super g2b> r02Var) throws Throwable {
                ((C0202a) create(yg0Var, r02Var)).invokeSuspend(g2b.a);
                return v72.t;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0030 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:14:0x0041  */
            /* JADX WARN: Code duplicated, block: B:16:0x0048  */
            /* JADX WARN: Code duplicated, block: B:17:0x0054  */
            /* JADX WARN: Code duplicated, block: B:19:0x0057  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:12:0x0031). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.ak0
            public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
                /*
                    r6 = this;
                    int r0 = r6.v
                    r1 = 0
                    r2 = 1
                    if (r0 == 0) goto L18
                    if (r0 != r2) goto L12
                    s48 r0 = r6.u
                    java.lang.Object r3 = r6.w
                    yg0 r3 = (defpackage.yg0) r3
                    defpackage.dv8.b(r7)
                    goto L31
                L12:
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.aa0.c(r6)
                    return r1
                L18:
                    defpackage.dv8.b(r7)
                    java.lang.Object r7 = r6.w
                    yg0 r7 = (defpackage.yg0) r7
                    s48 r0 = defpackage.s48.u
                    r3 = r7
                L22:
                    r6.w = r3
                    r6.u = r0
                    r6.v = r2
                    java.lang.Object r7 = r3.h1(r0, r6)
                    v72 r4 = defpackage.v72.t
                    if (r7 != r4) goto L31
                    return r4
                L31:
                    r48 r7 = (defpackage.r48) r7
                    java.util.List<a58> r4 = r7.a
                    r5 = 0
                    java.lang.Object r4 = r4.get(r5)
                    a58 r4 = (defpackage.a58) r4
                    int r4 = r4.i
                    r5 = 2
                    if (r4 != r5) goto L22
                    int r7 = r7.f
                    r4 = 4
                    fra r5 = r6.y
                    if (r7 != r4) goto L54
                    mn0$a$a$a r7 = new mn0$a$a$a
                    r7.<init>(r5, r1)
                    r4 = 3
                    t72 r5 = r6.x
                    defpackage.oy0.d(r5, r1, r1, r7, r4)
                    goto L22
                L54:
                    r4 = 5
                    if (r7 != r4) goto L22
                    r5.a()
                    goto L22
                */
                throw new UnsupportedOperationException("Method not decompiled: mn0.a.C0202a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i58 i58Var, fra fraVar, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = i58Var;
            this.w = fraVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.v, this.w, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                C0202a c0202a = new C0202a((t72) this.u, this.w, null);
                this.t = 1;
                Object objO0 = this.v.O0(c0202a, this);
                v72 v72Var = v72.t;
                if (objO0 == v72Var) {
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

    public mn0(fra fraVar) {
        this.a = fraVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(i58 i58Var, r02<? super g2b> r02Var) {
        Object objD = u72.d(new a(i58Var, this.a, null), r02Var);
        return objD == v72.t ? objD : g2b.a;
    }
}
