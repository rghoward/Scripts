package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$6", f = "TapGestureDetector.kt", l = {184, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 1)
public final class a9a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ el5 u;
    public final /* synthetic */ m88 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9a(el5 el5Var, m88 m88Var, r02<? super a9a> r02Var) {
        super(2, r02Var);
        this.u = el5Var;
        this.v = m88Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new a9a(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((a9a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r4.v.g(r4) == r3) goto L15;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            int r0 = r4.t
            r1 = 2
            r2 = 1
            v72 r3 = defpackage.v72.t
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.dv8.b(r5)
            goto L34
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r4)
            r4 = 0
            return r4
        L17:
            defpackage.dv8.b(r5)
            goto L29
        L1b:
            defpackage.dv8.b(r5)
            r4.t = r2
            el5 r5 = r4.u
            java.lang.Object r5 = r5.p0(r4)
            if (r5 != r3) goto L29
            goto L33
        L29:
            r4.t = r1
            m88 r5 = r4.v
            java.lang.Object r4 = r5.g(r4)
            if (r4 != r3) goto L34
        L33:
            return r3
        L34:
            g2b r4 = defpackage.g2b.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a9a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
