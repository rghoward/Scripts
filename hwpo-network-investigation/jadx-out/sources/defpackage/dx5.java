package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dx5 implements PointerInputEventHandler {
    public final /* synthetic */ dr7 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", l = {296}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ i58 u;
        public final /* synthetic */ dr7 v;

        /* JADX INFO: renamed from: dx5$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {298, 302}, m = "invokeSuspend", v = 1)
        public static final class C0073a extends zu8 implements ci4<yg0, r02<? super g2b>, Object> {
            public a58 u;
            public a58 v;
            public int w;
            public /* synthetic */ Object x;
            public final /* synthetic */ dr7 y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0073a(dr7 dr7Var, r02<? super C0073a> r02Var) {
                super(2, r02Var);
                this.y = dr7Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C0073a c0073a = new C0073a(this.y, r02Var);
                c0073a.x = obj;
                return c0073a;
            }

            @Override // defpackage.ci4
            public final Object invoke(yg0 yg0Var, r02<? super g2b> r02Var) {
                return ((C0073a) create(yg0Var, r02Var)).invokeSuspend(g2b.a);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x006e  */
            /* JADX WARN: Code duplicated, block: B:24:0x007d A[LOOP:0: B:20:0x006c->B:24:0x007d, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:28:0x0080 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:29:0x007a A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005f -> B:19:0x0063). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.ak0
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    int r0 = r13.w
                    r1 = 0
                    s48 r2 = defpackage.s48.t
                    dr7 r3 = r13.y
                    r4 = 2
                    r5 = 0
                    r6 = 1
                    v72 r7 = defpackage.v72.t
                    if (r0 == 0) goto L2c
                    if (r0 == r6) goto L24
                    if (r0 != r4) goto L1e
                    a58 r0 = r13.v
                    a58 r1 = r13.u
                    java.lang.Object r6 = r13.x
                    yg0 r6 = (defpackage.yg0) r6
                    defpackage.dv8.b(r14)
                    goto L63
                L1e:
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.aa0.c(r13)
                    return r1
                L24:
                    java.lang.Object r0 = r13.x
                    yg0 r0 = (defpackage.yg0) r0
                    defpackage.dv8.b(r14)
                    goto L3f
                L2c:
                    defpackage.dv8.b(r14)
                    java.lang.Object r14 = r13.x
                    r0 = r14
                    yg0 r0 = (defpackage.yg0) r0
                    r13.x = r0
                    r13.w = r6
                    java.lang.Object r14 = defpackage.o8a.a(r0, r5, r2, r13)
                    if (r14 != r7) goto L3f
                    goto L5e
                L3f:
                    a58 r14 = (defpackage.a58) r14
                    dt7 r6 = r3.c
                    vf7 r8 = new vf7
                    r9 = 0
                    r8.<init>(r9)
                    r6.setValue(r8)
                    r6 = r0
                L4e:
                    if (r1 != 0) goto L8c
                    r13.x = r6
                    r13.u = r14
                    r13.v = r1
                    r13.w = r4
                    java.lang.Object r0 = r6.h1(r2, r13)
                    if (r0 != r7) goto L5f
                L5e:
                    return r7
                L5f:
                    r12 = r1
                    r1 = r14
                    r14 = r0
                    r0 = r12
                L63:
                    r48 r14 = (defpackage.r48) r14
                    java.util.List<a58> r8 = r14.a
                    int r9 = r8.size()
                    r10 = r5
                L6c:
                    if (r10 >= r9) goto L80
                    java.lang.Object r11 = r8.get(r10)
                    a58 r11 = (defpackage.a58) r11
                    boolean r11 = defpackage.z69.f(r11)
                    if (r11 != 0) goto L7d
                    r14 = r1
                    r1 = r0
                    goto L4e
                L7d:
                    int r10 = r10 + 1
                    goto L6c
                L80:
                    java.util.List<a58> r14 = r14.a
                    java.lang.Object r14 = r14.get(r5)
                    a58 r14 = (defpackage.a58) r14
                    r12 = r1
                    r1 = r14
                    r14 = r12
                    goto L4e
                L8c:
                    long r0 = r1.c
                    long r13 = r14.c
                    long r13 = defpackage.vf7.d(r0, r13)
                    dt7 r0 = r3.c
                    vf7 r1 = new vf7
                    r1.<init>(r13)
                    r0.setValue(r1)
                    g2b r13 = defpackage.g2b.a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: dx5.a.C0073a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i58 i58Var, dr7 dr7Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = i58Var;
            this.v = dr7Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                C0073a c0073a = new C0073a(this.v, null);
                this.t = 1;
                Object objB = cc4.b(this.u, c0073a, this);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    public dx5(dr7 dr7Var) {
        this.a = dr7Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(i58 i58Var, r02<? super g2b> r02Var) {
        Object objD = u72.d(new a(i58Var, this.a, null), r02Var);
        return objD == v72.t ? objD : g2b.a;
    }
}
