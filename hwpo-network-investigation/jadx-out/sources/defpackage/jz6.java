package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingEvents$1", f = "MouseWheelScrollingLogic.kt", l = {109, 112}, m = "invokeSuspend", v = 1)
public final class jz6 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ dz6 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz6(dz6 dz6Var, r02<? super jz6> r02Var) {
        super(2, r02Var);
        this.v = dz6Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        jz6 jz6Var = new jz6(this.v, r02Var);
        jz6Var.u = obj;
        return jz6Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((jz6) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0013, B:18:0x0031, B:20:0x003b, B:24:0x004e, B:15:0x0026), top: B:32:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (defpackage.dz6.c(r4, r5, r6, r7, r8, r9) == r10) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006c -> B:9:0x0017). Please report as a decompilation issue!!! */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            int r0 = r12.t
            r1 = 0
            r2 = 2
            r3 = 1
            dz6 r4 = r12.v
            v72 r10 = defpackage.v72.t
            if (r0 == 0) goto L2a
            if (r0 == r3) goto L22
            if (r0 != r2) goto L1c
            java.lang.Object r0 = r12.u
            t72 r0 = (defpackage.t72) r0
            defpackage.dv8.b(r13)     // Catch: java.lang.Throwable -> L19
            r9 = r12
        L17:
            r13 = r0
            goto L6f
        L19:
            r0 = move-exception
            r12 = r0
            goto L76
        L1c:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r12)
            return r1
        L22:
            java.lang.Object r0 = r12.u
            t72 r0 = (defpackage.t72) r0
            defpackage.dv8.b(r13)     // Catch: java.lang.Throwable -> L19
            goto L4e
        L2a:
            defpackage.dv8.b(r13)
            java.lang.Object r13 = r12.u
            t72 r13 = (defpackage.t72) r13
        L31:
            h72 r0 = r13.getCoroutineContext()     // Catch: java.lang.Throwable -> L19
            boolean r0 = defpackage.sd.h(r0)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L71
            zx0 r0 = r4.g     // Catch: java.lang.Throwable -> L19
            r12.u = r13     // Catch: java.lang.Throwable -> L19
            r12.t = r3     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = defpackage.zx0.K(r0, r12)     // Catch: java.lang.Throwable -> L19
            if (r0 != r10) goto L4b
            goto L6e
        L4b:
            r11 = r0
            r0 = r13
            r13 = r11
        L4e:
            r6 = r13
            dz6$a r6 = (dz6.a) r6     // Catch: java.lang.Throwable -> L19
            tx2 r13 = r4.c     // Catch: java.lang.Throwable -> L19
            r5 = 1086324736(0x40c00000, float:6.0)
            float r7 = r13.U0(r5)     // Catch: java.lang.Throwable -> L19
            tx2 r13 = r4.c     // Catch: java.lang.Throwable -> L19
            r5 = 1065353216(0x3f800000, float:1.0)
            float r8 = r13.U0(r5)     // Catch: java.lang.Throwable -> L19
            z79 r5 = r4.a     // Catch: java.lang.Throwable -> L19
            r12.u = r0     // Catch: java.lang.Throwable -> L19
            r12.t = r2     // Catch: java.lang.Throwable -> L19
            r9 = r12
            java.lang.Object r12 = defpackage.dz6.c(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L19
            if (r12 != r10) goto L17
        L6e:
            return r10
        L6f:
            r12 = r9
            goto L31
        L71:
            r4.h = r1
            g2b r12 = defpackage.g2b.a
            return r12
        L76:
            r4.h = r1
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
