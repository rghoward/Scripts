package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class va9 implements PointerInputEventHandler {
    public final /* synthetic */ rfa a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", l = {94}, m = "invokeSuspend", v = 1)
    public static final class a extends zu8 implements ci4<yg0, r02<? super g2b>, Object> {
        public int u;
        public /* synthetic */ Object v;
        public final /* synthetic */ rfa w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rfa rfaVar, r02 r02Var) {
            super(2, r02Var);
            this.w = rfaVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.w, r02Var);
            aVar.v = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(yg0 yg0Var, r02<? super g2b> r02Var) throws Throwable {
            ((a) create(yg0Var, r02Var)).invokeSuspend(g2b.a);
            return v72.t;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002c A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:12:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x002c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.ak0
        public final java.lang.Object invokeSuspend(java.lang.Object r4) throws java.lang.Throwable {
            /*
                r3 = this;
                int r0 = r3.u
                r1 = 1
                if (r0 == 0) goto L16
                if (r0 != r1) goto Lf
                java.lang.Object r0 = r3.v
                yg0 r0 = (defpackage.yg0) r0
                defpackage.dv8.b(r4)
                goto L2d
            Lf:
                java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r3)
                r3 = 0
                return r3
            L16:
                defpackage.dv8.b(r4)
                java.lang.Object r4 = r3.v
                yg0 r4 = (defpackage.yg0) r4
                r0 = r4
            L1e:
                r3.v = r0
                r3.u = r1
                s48 r4 = defpackage.s48.t
                java.lang.Object r4 = r0.h1(r4, r3)
                v72 r2 = defpackage.v72.t
                if (r4 != r2) goto L2d
                return r2
            L2d:
                r48 r4 = (defpackage.r48) r4
                boolean r4 = defpackage.xa9.a(r4)
                r4 = r4 ^ r1
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                rfa r2 = r3.w
                r2.invoke(r4)
                goto L1e
            */
            throw new UnsupportedOperationException("Method not decompiled: va9.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public va9(rfa rfaVar) {
        this.a = rfaVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(i58 i58Var, r02<? super g2b> r02Var) {
        Object objO0 = i58Var.O0(new a(this.a, null), r02Var);
        return objO0 == v72.t ? objO0 : g2b.a;
    }
}
