package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", l = {307, 309, 310}, m = "invokeSuspend", v = 1)
public final class i64 extends p6a implements ci4<ua8<? super g2b>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        i64 i64Var = new i64(2, r02Var);
        i64Var.u = obj;
        return i64Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(ua8<? super g2b> ua8Var, r02<? super g2b> r02Var) throws Throwable {
        ((i64) create(ua8Var, r02Var)).invokeSuspend(g2b.a);
        return v72.t;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004e -> B:15:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.u
            ua8 r0 = (defpackage.ua8) r0
            int r1 = r8.t
            r2 = 200(0xc8, double:9.9E-322)
            r4 = 3
            r5 = 2
            r6 = 1
            v72 r7 = defpackage.v72.t
            if (r1 == 0) goto L25
            if (r1 == r6) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L16
            goto L21
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            r8 = 0
            return r8
        L1d:
            defpackage.dv8.b(r9)
            goto L46
        L21:
            defpackage.dv8.b(r9)
            goto L33
        L25:
            defpackage.dv8.b(r9)
            r8.u = r0
            r8.t = r6
            java.lang.Object r9 = defpackage.bw2.b(r2, r8)
            if (r9 != r7) goto L33
            goto L50
        L33:
            ta8 r9 = r0.m()
            g2b r1 = defpackage.g2b.a
            r8.u = r0
            r8.t = r5
            zx0 r9 = r9.y
            java.lang.Object r9 = r9.a(r8, r1)
            if (r9 != r7) goto L46
            goto L50
        L46:
            r8.u = r0
            r8.t = r4
            java.lang.Object r9 = defpackage.bw2.b(r2, r8)
            if (r9 != r7) goto L33
        L50:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i64.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
