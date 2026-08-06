package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ir3 implements PointerInputEventHandler {
    public final /* synthetic */ fr3 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1", f = "ExposedDropdownMenu.kt", l = {1426, 1430}, m = "invokeSuspend")
    public static final class a extends zu8 implements ci4<yg0, r02<? super g2b>, Object> {
        public int u;
        public /* synthetic */ Object v;
        public final /* synthetic */ fr3 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fr3 fr3Var, r02 r02Var) {
            super(2, r02Var);
            this.w = fr3Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.w, r02Var);
            aVar.v = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(yg0 yg0Var, r02<? super g2b> r02Var) {
            return ((a) create(yg0Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (r6 == r4) goto L15;
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
                r1 = 0
                r2 = 2
                r3 = 1
                v72 r4 = defpackage.v72.t
                if (r0 == 0) goto L1f
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.dv8.b(r6)
                goto L41
            L11:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r5)
                return r1
            L17:
                java.lang.Object r0 = r5.v
                yg0 r0 = (defpackage.yg0) r0
                defpackage.dv8.b(r6)
                goto L32
            L1f:
                defpackage.dv8.b(r6)
                java.lang.Object r6 = r5.v
                r0 = r6
                yg0 r0 = (defpackage.yg0) r0
                r5.v = r0
                r5.u = r3
                java.lang.Object r6 = defpackage.o8a.b(r0, r5, r3)
                if (r6 != r4) goto L32
                goto L40
            L32:
                a58 r6 = (defpackage.a58) r6
                r5.v = r1
                r5.u = r2
                s48 r6 = defpackage.s48.t
                java.lang.Object r6 = defpackage.o8a.i(r0, r6, r5)
                if (r6 != r4) goto L41
            L40:
                return r4
            L41:
                a58 r6 = (defpackage.a58) r6
                if (r6 == 0) goto L4a
                fr3 r5 = r5.w
                r5.invoke()
            L4a:
                g2b r5 = defpackage.g2b.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ir3.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ir3(fr3 fr3Var) {
        this.a = fr3Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(i58 i58Var, r02<? super g2b> r02Var) {
        Object objB = cc4.b(i58Var, new a(this.a, null), r02Var);
        return objB == v72.t ? objB : g2b.a;
    }
}
