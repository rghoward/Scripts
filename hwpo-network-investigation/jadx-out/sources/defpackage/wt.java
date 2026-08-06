package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {430}, m = "invokeSuspend", v = 1)
public final class wt extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public ca1 t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ p91<Object> w;
    public final /* synthetic */ qt<Object, Object> x;
    public final /* synthetic */ h37 y;
    public final /* synthetic */ h37 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", l = {439}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ Object u;
        public final /* synthetic */ qt<Object, Object> v;
        public final /* synthetic */ h37 w;
        public final /* synthetic */ h37 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, qt qtVar, h37 h37Var, h37 h37Var2, r02 r02Var) {
            super(2, r02Var);
            this.u = obj;
            this.v = qtVar;
            this.w = h37Var;
            this.x = h37Var2;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, this.v, this.w, this.x, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            int i = this.t;
            qt<Object, Object> qtVar = this.v;
            if (i == 0) {
                dv8.b(obj);
                if (!xj5.a(this.u, qtVar.e.getValue())) {
                    ty9<Float> ty9Var = xt.a;
                    wv wvVar = (wv) this.w.getValue();
                    this.t = 1;
                    aVar = this;
                    Object objC = qt.c(this.v, this.u, wvVar, null, aVar, 12);
                    v72 v72Var = v72.t;
                    if (objC == v72Var) {
                        return v72Var;
                    }
                }
                return g2b.a;
            }
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            aVar = this;
            ty9<Float> ty9Var2 = xt.a;
            oh4 oh4Var = (oh4) aVar.x.getValue();
            if (oh4Var != null) {
                oh4Var.invoke(qtVar.d());
            }
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt(p91 p91Var, qt qtVar, h37 h37Var, h37 h37Var2, r02 r02Var) {
        super(2, r02Var);
        this.w = p91Var;
        this.x = qtVar;
        this.y = h37Var;
        this.z = h37Var2;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        wt wtVar = new wt(this.w, this.x, this.y, this.z, r02Var);
        wtVar.v = obj;
        return wtVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((wt) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0032 -> B:12:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0034
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.u
            r1 = 0
            p91<java.lang.Object> r2 = r12.w
            r3 = 1
            if (r0 == 0) goto L1a
            if (r0 != r3) goto L14
            ca1 r0 = r12.t
            java.lang.Object r4 = r12.v
            t72 r4 = (defpackage.t72) r4
            defpackage.dv8.b(r13)
            goto L35
        L14:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r12)
            return r1
        L1a:
            defpackage.dv8.b(r13)
            java.lang.Object r13 = r12.v
            t72 r13 = (defpackage.t72) r13
            ca1 r0 = r2.iterator()
            r4 = r13
        L26:
            r12.v = r4
            r12.t = r0
            r12.u = r3
            java.lang.Object r13 = r0.b(r12)
            v72 r5 = defpackage.v72.t
            if (r13 != r5) goto L35
            return r5
        L35:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L5f
            java.lang.Object r13 = r0.next()
            java.lang.Object r5 = r2.d()
            java.lang.Object r5 = defpackage.ga1.a(r5)
            if (r5 != 0) goto L4d
            r7 = r13
            goto L4e
        L4d:
            r7 = r5
        L4e:
            wt$a r6 = new wt$a
            h37 r10 = r12.z
            r11 = 0
            qt<java.lang.Object, java.lang.Object> r8 = r12.x
            h37 r9 = r12.y
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = 3
            defpackage.oy0.d(r4, r1, r1, r6, r13)
            goto L26
        L5f:
            g2b r12 = defpackage.g2b.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
