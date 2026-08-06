package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$editValue$1", f = "ValueDetailsViewModel.kt", l = {413, 414, 436}, m = "invokeSuspend", v = 2)
public final class t9b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ o9b u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$editValue$1$1", f = "ValueDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<xj3, r02<? super g2b>, Object> {
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
        public final Object invoke(xj3 xj3Var, r02<? super g2b> r02Var) {
            return ((a) create(xj3Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            xj3 xj3Var = (xj3) this.t;
            dv8.b(obj);
            o9b o9bVar = this.u;
            vn0 vn0Var = new vn0(o9bVar.N, o9bVar.R, xj3Var.d, xj3Var.e, xj3Var.f, xj3Var.g, o9bVar.P, false);
            e70 e70Var = o9bVar.I;
            List<m89> list = xj3Var.h;
            e70Var.getClass();
            ArrayList arrayListB = e70.b(list);
            o9bVar.x.h(o9bVar.O.ordinal(), xj3Var.a, vn0Var, xj3Var.b, xj3Var.c, arrayListB);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$editValue$1$2", f = "ValueDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
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
    public t9b(o9b o9bVar, r02<? super t9b> r02Var) {
        super(2, r02Var);
        this.u = o9bVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new t9b(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((t9b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
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
            o9b r4 = r8.u
            r5 = 0
            v72 r6 = defpackage.v72.t
            if (r0 == 0) goto L24
            if (r0 == r3) goto L20
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L16
            defpackage.dv8.b(r9)
            goto L64
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r5
        L1c:
            defpackage.dv8.b(r9)
            goto L54
        L20:
            defpackage.dv8.b(r9)
            goto L44
        L24:
            defpackage.dv8.b(r9)
            pl4$a r9 = new pl4$a
            ebb r0 = r4.O
            java.lang.Integer r7 = r4.X
            if (r7 == 0) goto L73
            int r7 = r7.intValue()
            r9.<init>(r0, r7)
            pl4 r0 = r4.B
            r8.t = r3
            r0.getClass()
            java.lang.Object r9 = defpackage.g5b.b(r0, r9, r8)
            if (r9 != r6) goto L44
            goto L63
        L44:
            xd3 r9 = (defpackage.xd3) r9
            t9b$a r0 = new t9b$a
            r0.<init>(r4, r5)
            r8.t = r2
            java.lang.Object r9 = defpackage.yd3.b(r9, r0, r8)
            if (r9 != r6) goto L54
            goto L63
        L54:
            xd3 r9 = (defpackage.xd3) r9
            t9b$b r0 = new t9b$b
            r0.<init>(r4, r5)
            r8.t = r1
            java.lang.Object r9 = defpackage.yd3.a(r9, r0, r8)
            if (r9 != r6) goto L64
        L63:
            return r6
        L64:
            xd3 r9 = (defpackage.xd3) r9
            r9.getClass()
            r4.X = r5
            d8b$k r8 = d8b.k.a
            r4.e(r8)
            g2b r8 = defpackage.g2b.a
            return r8
        L73:
            g2b r8 = defpackage.g2b.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
