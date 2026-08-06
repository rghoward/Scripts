package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {882, 883}, m = "invokeSuspend", v = 1)
public final class x6a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ long u;
    public final /* synthetic */ z6a.a<Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6a(long j, z6a.a<Object> aVar, r02<? super x6a> r02Var) {
        super(2, r02Var);
        this.u = j;
        this.v = aVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new x6a(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((x6a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (defpackage.bw2.b(8, r10) == r7) goto L15;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            int r0 = r10.t
            r1 = 8
            long r3 = r10.u
            r5 = 2
            r6 = 1
            v72 r7 = defpackage.v72.t
            if (r0 == 0) goto L1f
            if (r0 == r6) goto L1b
            if (r0 != r5) goto L14
            defpackage.dv8.b(r11)
            goto L36
        L14:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r10)
            r10 = 0
            return r10
        L1b:
            defpackage.dv8.b(r11)
            goto L2d
        L1f:
            defpackage.dv8.b(r11)
            long r8 = r3 - r1
            r10.t = r6
            java.lang.Object r11 = defpackage.bw2.b(r8, r10)
            if (r11 != r7) goto L2d
            goto L35
        L2d:
            r10.t = r5
            java.lang.Object r11 = defpackage.bw2.b(r1, r10)
            if (r11 != r7) goto L36
        L35:
            return r7
        L36:
            z6a$a<java.lang.Object> r10 = r10.v
            e41 r10 = r10.v
            if (r10 == 0) goto L49
            t48 r11 = new t48
            r11.<init>(r3)
            av8$a r0 = new av8$a
            r0.<init>(r11)
            r10.resumeWith(r0)
        L49:
            g2b r10 = defpackage.g2b.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x6a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
