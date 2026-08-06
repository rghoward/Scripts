package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13", f = "DragGestureDetector.kt", l = {248, 249}, m = "invokeSuspend", v = 1)
public final class u53 extends zu8 implements ci4<yg0, r02<? super g2b>, Object> {
    public final /* synthetic */ qr A;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ p53 w;
    public final /* synthetic */ o53 x;
    public final /* synthetic */ ci4<a58, vf7, g2b> y;
    public final /* synthetic */ mh4<g2b> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u53(p53 p53Var, o53 o53Var, ci4 ci4Var, mh4 mh4Var, qr qrVar, r02 r02Var) {
        super(2, r02Var);
        this.w = p53Var;
        this.x = o53Var;
        this.y = ci4Var;
        this.z = mh4Var;
        this.A = qrVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        u53 u53Var = new u53(this.w, this.x, this.y, this.z, this.A, r02Var);
        u53Var.v = obj;
        return u53Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(yg0 yg0Var, r02<? super g2b> r02Var) {
        return ((u53) create(yg0Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (defpackage.x53.h(r5, (defpackage.a58) r14, r13.w, r13.x, r13.y, r13.z, r13.A, r13) == r4) goto L16;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            int r0 = r13.u
            r1 = 0
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L20
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.dv8.b(r14)
            goto L4f
        L11:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r13)
            return r1
        L17:
            java.lang.Object r0 = r13.v
            yg0 r0 = (defpackage.yg0) r0
            defpackage.dv8.b(r14)
        L1e:
            r5 = r0
            goto L36
        L20:
            defpackage.dv8.b(r14)
            java.lang.Object r14 = r13.v
            r0 = r14
            yg0 r0 = (defpackage.yg0) r0
            r13.v = r0
            r13.u = r3
            r14 = 0
            s48 r3 = defpackage.s48.t
            java.lang.Object r14 = defpackage.o8a.a(r0, r14, r3, r13)
            if (r14 != r4) goto L1e
            goto L4e
        L36:
            r6 = r14
            a58 r6 = (defpackage.a58) r6
            r13.v = r1
            r13.u = r2
            p53 r7 = r13.w
            o53 r8 = r13.x
            ci4<a58, vf7, g2b> r9 = r13.y
            mh4<g2b> r10 = r13.z
            qr r11 = r13.A
            r12 = r13
            java.lang.Object r13 = defpackage.x53.h(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r4) goto L4f
        L4e:
            return r4
        L4f:
            g2b r13 = defpackage.g2b.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u53.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
