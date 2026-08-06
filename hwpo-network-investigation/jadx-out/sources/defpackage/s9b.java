package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$editChallenge$1", f = "ValueDetailsViewModel.kt", l = {395, 396, 407}, m = "invokeSuspend", v = 2)
public final class s9b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ o9b u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$editChallenge$1$1", f = "ValueDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<m61, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ o9b u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o9b o9bVar, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = o9bVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.u, r02Var);
            aVar.t = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(m61 m61Var, r02<? super g2b> r02Var) {
            return ((a) create(m61Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            m61 m61Var = (m61) this.t;
            dv8.b(obj);
            o9b o9bVar = this.u;
            pta ptaVar = o9bVar.x;
            int i = m61Var.b;
            int i2 = m61Var.a;
            String str = m61Var.c;
            vc8 vc8Var = m61Var.d;
            ptaVar.c(i2, i, vc8Var != null ? o9bVar.J.a(vc8Var) : new tc8(0, 15, (String) null, (ArrayList) null), o9bVar.L.a(m61Var.e), str);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$editChallenge$1$2", f = "ValueDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ o9b u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o9b o9bVar, r02<? super b> r02Var) {
            super(2, r02Var);
            this.u = o9bVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = new b(this.u, r02Var);
            bVar.t = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            return ((b) create(exc, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Exception exc = (Exception) this.t;
            dv8.b(obj);
            o9b o9bVar = this.u;
            o9bVar.f(new i8b(o9bVar.M.a(exc)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9b(o9b o9bVar, r02<? super s9b> r02Var) {
        super(2, r02Var);
        this.u = o9bVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new s9b(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((s9b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r9 == r6) goto L22;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            int r0 = r8.t
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            o9b r5 = r8.u
            v72 r6 = defpackage.v72.t
            if (r0 == 0) goto L24
            if (r0 == r3) goto L20
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L16
            defpackage.dv8.b(r9)
            goto L62
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r4
        L1c:
            defpackage.dv8.b(r9)
            goto L52
        L20:
            defpackage.dv8.b(r9)
            goto L42
        L24:
            defpackage.dv8.b(r9)
            qk4 r9 = r5.C
            java.lang.Integer r0 = r5.X
            if (r0 == 0) goto L71
            int r0 = r0.intValue()
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r0)
            r8.t = r3
            r9.getClass()
            java.lang.Object r9 = defpackage.g5b.b(r9, r7, r8)
            if (r9 != r6) goto L42
            goto L61
        L42:
            xd3 r9 = (defpackage.xd3) r9
            s9b$a r0 = new s9b$a
            r0.<init>(r5, r4)
            r8.t = r2
            java.lang.Object r9 = defpackage.yd3.b(r9, r0, r8)
            if (r9 != r6) goto L52
            goto L61
        L52:
            xd3 r9 = (defpackage.xd3) r9
            s9b$b r0 = new s9b$b
            r0.<init>(r5, r4)
            r8.t = r1
            java.lang.Object r9 = defpackage.yd3.a(r9, r0, r8)
            if (r9 != r6) goto L62
        L61:
            return r6
        L62:
            xd3 r9 = (defpackage.xd3) r9
            r9.getClass()
            r5.X = r4
            d8b$k r8 = d8b.k.a
            r5.e(r8)
            g2b r8 = defpackage.g2b.a
            return r8
        L71:
            g2b r8 = defpackage.g2b.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s9b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
