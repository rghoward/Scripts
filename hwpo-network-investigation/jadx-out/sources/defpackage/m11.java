package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", l = {61, 66}, m = "invokeSuspend", v = 1)
public final class m11 extends p6a implements ci4<s54<? super sa5<? extends oo7<Object>>>, r02<? super g2b>, Object> {
    public Iterator t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ n11<Object> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m11(n11<Object> n11Var, r02<? super m11> r02Var) {
        super(2, r02Var);
        this.w = n11Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        m11 m11Var = new m11(this.w, r02Var);
        m11Var.v = obj;
        return m11Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(s54<? super sa5<? extends oo7<Object>>> s54Var, r02<? super g2b> r02Var) {
        return ((m11) create(s54Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:14:0x0049->B:24:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r6 == r4) goto L18;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.u
            n11<java.lang.Object> r1 = r5.w
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L27
            if (r0 == r3) goto L1f
            if (r0 != r2) goto L18
            java.util.Iterator r0 = r5.t
            java.lang.Object r1 = r5.v
            s54 r1 = (defpackage.s54) r1
            defpackage.dv8.b(r6)
            goto L49
        L18:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r5)
            r5 = 0
            return r5
        L1f:
            java.lang.Object r0 = r5.v
            s54 r0 = (defpackage.s54) r0
            defpackage.dv8.b(r6)
            goto L3c
        L27:
            defpackage.dv8.b(r6)
            java.lang.Object r6 = r5.v
            r0 = r6
            s54 r0 = (defpackage.s54) r0
            b44<T> r6 = r1.a
            r5.v = r0
            r5.u = r3
            java.io.Serializable r6 = r6.a(r5)
            if (r6 != r4) goto L3c
            goto L61
        L3c:
            java.util.List r6 = (java.util.List) r6
            dz9 r1 = r1.d
            r1.start()
            java.util.Iterator r6 = r6.iterator()
            r1 = r0
            r0 = r6
        L49:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L62
            java.lang.Object r6 = r0.next()
            sa5 r6 = (defpackage.sa5) r6
            r5.v = r1
            r5.t = r0
            r5.u = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r4) goto L49
        L61:
            return r4
        L62:
            g2b r5 = defpackage.g2b.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m11.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
