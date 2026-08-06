package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", l = {496}, m = "invokeSuspend", v = 1)
public final class lq extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ d68 v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<Long, g2b> {
        public static final a u = new a(1);

        @Override // defpackage.oh4
        public final /* bridge */ /* synthetic */ g2b invoke(Long l) {
            l.longValue();
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq(d68 d68Var, r02<? super lq> r02Var) {
        super(2, r02Var);
        this.v = d68Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        lq lqVar = new lq(this.v, r02Var);
        lqVar.u = obj;
        return lqVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((lq) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0050 -> B:18:0x0053). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.t
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 != r2) goto L10
            java.lang.Object r0 = r8.u
            t72 r0 = (defpackage.t72) r0
            defpackage.dv8.b(r9)
            goto L53
        L10:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r1
        L16:
            defpackage.dv8.b(r9)
            java.lang.Object r9 = r8.u
            t72 r9 = (defpackage.t72) r9
            r0 = r9
        L1e:
            boolean r9 = defpackage.u72.e(r0)
            if (r9 == 0) goto L74
            r8.u = r0
            r8.t = r2
            h72 r9 = r8.getContext()
            qb5$a r3 = qb5.a.t
            h72$a r9 = r9.d0(r3)
            qb5 r9 = (defpackage.qb5) r9
            if (r9 != 0) goto L45
            h72 r9 = r8.getContext()
            xx6 r9 = defpackage.zx6.a(r9)
            lq$a r3 = lq.a.u
            java.lang.Object r9 = r9.u(r3, r8)
            goto L4e
        L45:
            rb5 r3 = new rb5
            r3.<init>(r2, r1)
            java.lang.Object r9 = r9.W()
        L4e:
            v72 r3 = defpackage.v72.t
            if (r9 != r3) goto L53
            return r3
        L53:
            d68 r9 = r8.v
            int[] r3 = r9.M
            boolean r4 = r9.isAttachedToWindow()
            if (r4 != 0) goto L5e
            goto L1e
        L5e:
            r4 = 0
            r5 = r3[r4]
            r6 = r3[r2]
            android.view.View r7 = r9.w
            r7.getLocationOnScreen(r3)
            r4 = r3[r4]
            if (r5 != r4) goto L70
            r3 = r3[r2]
            if (r6 == r3) goto L1e
        L70:
            r9.f()
            goto L1e
        L74:
            g2b r8 = defpackage.g2b.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
