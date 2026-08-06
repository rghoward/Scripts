package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend", v = 1)
public final class bd2 extends p6a implements ci4<t72, r02<? super Boolean>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ cd2 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {72, 77, 79, 81}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ el5 u;
        public final /* synthetic */ cd2 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(el5 el5Var, cd2 cd2Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = el5Var;
            this.v = cd2Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) throws Throwable {
            ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            return v72.t;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0066  */
        /* JADX WARN: Code duplicated, block: B:33:0x0067 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:8:0x001a, B:36:0x0075, B:30:0x005e, B:33:0x0067, B:14:0x0026, B:15:0x002a, B:16:0x0032, B:26:0x004f, B:28:0x0058), top: B:40:0x0010 }] */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        
            if (r13 == r11) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
        
            if (defpackage.bw2.b(500, r12) == r11) goto L35;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0072 -> B:36:0x0075). Please report as a decompilation issue!!! */
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
                r2 = 0
                r3 = 500(0x1f4, double:2.47E-321)
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 4
                r7 = 3
                r8 = 2
                r9 = 1
                cd2 r10 = r12.v
                v72 r11 = defpackage.v72.t
                if (r0 == 0) goto L37
                if (r0 == r9) goto L33
                if (r0 == r8) goto L2a
                if (r0 == r7) goto L26
                if (r0 != r6) goto L20
                defpackage.dv8.b(r13)     // Catch: java.lang.Throwable -> L1e
                goto L75
            L1e:
                r12 = move-exception
                goto L7b
            L20:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r12)
                return r1
            L26:
                defpackage.dv8.b(r13)     // Catch: java.lang.Throwable -> L1e
                goto L67
            L2a:
                defpackage.dv8.b(r13)     // Catch: java.lang.Throwable -> L1e
                qp5 r12 = new qp5     // Catch: java.lang.Throwable -> L1e
                r12.<init>()     // Catch: java.lang.Throwable -> L1e
                throw r12     // Catch: java.lang.Throwable -> L1e
            L33:
                defpackage.dv8.b(r13)
                goto L4f
            L37:
                defpackage.dv8.b(r13)
                el5 r13 = r12.u
                if (r13 == 0) goto L4f
                r12.t = r9
                r13.k(r1)
                java.lang.Object r13 = r13.p0(r12)
                if (r13 != r11) goto L4a
                goto L4c
            L4a:
                g2b r13 = defpackage.g2b.a
            L4c:
                if (r13 != r11) goto L4f
                goto L74
            L4f:
                at7 r13 = r10.c     // Catch: java.lang.Throwable -> L1e
                r13.g(r5)     // Catch: java.lang.Throwable -> L1e
                boolean r13 = r10.a     // Catch: java.lang.Throwable -> L1e
                if (r13 != 0) goto L5e
                r12.t = r8     // Catch: java.lang.Throwable -> L1e
                defpackage.bw2.a(r12)     // Catch: java.lang.Throwable -> L1e
                return r11
            L5e:
                r12.t = r7     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r13 = defpackage.bw2.b(r3, r12)     // Catch: java.lang.Throwable -> L1e
                if (r13 != r11) goto L67
                goto L74
            L67:
                at7 r13 = r10.c     // Catch: java.lang.Throwable -> L1e
                r13.g(r2)     // Catch: java.lang.Throwable -> L1e
                r12.t = r6     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r13 = defpackage.bw2.b(r3, r12)     // Catch: java.lang.Throwable -> L1e
                if (r13 != r11) goto L75
            L74:
                return r11
            L75:
                at7 r13 = r10.c     // Catch: java.lang.Throwable -> L1e
                r13.g(r5)     // Catch: java.lang.Throwable -> L1e
                goto L5e
            L7b:
                at7 r13 = r10.c
                r13.g(r2)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: bd2.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd2(cd2 cd2Var, r02<? super bd2> r02Var) {
        super(2, r02Var);
        this.u = cd2Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        bd2 bd2Var = new bd2(this.u, r02Var);
        bd2Var.t = obj;
        return bd2Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super Boolean> r02Var) {
        return ((bd2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        dv8.b(obj);
        t72 t72Var = (t72) this.t;
        cd2 cd2Var = this.u;
        el5 andSet = cd2Var.b.getAndSet(null);
        AtomicReference<el5> atomicReference = cd2Var.b;
        dz9 dz9VarD = oy0.d(t72Var, null, null, new a(andSet, cd2Var, null), 3);
        while (!atomicReference.compareAndSet(null, dz9VarD)) {
            if (atomicReference.get() != null) {
                z = false;
                return Boolean.valueOf(z);
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
