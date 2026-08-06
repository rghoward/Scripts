package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o3a extends gw2 implements g58, q84, s94 {
    public mh4<g2b> J;
    public boolean K;
    public final v6a L;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: o3a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", l = {116, 144, 182}, m = "invokeSuspend", v = 1)
        public static final class C0210a extends zu8 implements ci4<yg0, r02<? super g2b>, Object> {
            public a58 u;
            public s48 v;
            public int w;
            public /* synthetic */ Object x;
            public final /* synthetic */ o3a y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0210a(o3a o3aVar, r02<? super C0210a> r02Var) {
                super(2, r02Var);
                this.y = o3aVar;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C0210a c0210a = new C0210a(this.y, r02Var);
                c0210a.x = obj;
                return c0210a;
            }

            @Override // defpackage.ci4
            public final Object invoke(yg0 yg0Var, r02<? super g2b> r02Var) {
                return ((C0210a) create(yg0Var, r02Var)).invokeSuspend(g2b.a);
            }

            /* JADX WARN: Code duplicated, block: B:144:0x023b  */
            /* JADX WARN: Code duplicated, block: B:146:0x0248  */
            /* JADX WARN: Code duplicated, block: B:155:0x025f  */
            /* JADX WARN: Code duplicated, block: B:157:0x0262  */
            /* JADX WARN: Code duplicated, block: B:162:0x025a A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:163:0x0257 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:59:0x0112  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x022d -> B:142:0x0230). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00bf -> B:40:0x00c2). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.ak0
            public final java.lang.Object invokeSuspend(java.lang.Object r20) {
                /*
                    Method dump skipped, instruction units count: 625
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o3a.a.C0210a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(i58 i58Var, r02<? super g2b> r02Var) {
            Object objB = cc4.b(i58Var, new C0210a(o3a.this, null), r02Var);
            return objB == v72.t ? objB : g2b.a;
        }
    }

    public o3a(mh4<g2b> mh4Var) {
        this.J = mh4Var;
        z6a z6aVarA = t6a.a(new a());
        c2(z6aVarA);
        this.L = z6aVarA;
    }

    @Override // defpackage.g58
    public final long J() {
        tx2 tx2Var = ew2.f(this).R;
        n3a.a.getClass();
        int i = tra.b;
        return tra.a.b(tx2Var.n1(10.0f), tx2Var.n1(40.0f), tx2Var.n1(10.0f), tx2Var.n1(40.0f));
    }

    @Override // defpackage.g58
    public final void c0(r48 r48Var, s48 s48Var, long j) {
        this.L.c0(r48Var, s48Var, j);
    }

    @Override // defpackage.q84
    public final void m0(w94 w94Var) {
        this.K = w94Var.e();
    }

    @Override // defpackage.g58
    public final void t0() {
        this.L.t0();
    }
}
