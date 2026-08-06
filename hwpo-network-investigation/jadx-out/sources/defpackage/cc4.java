package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cc4 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {102, 105, 110}, m = "invokeSuspend", v = 1)
    public static final class a extends zu8 implements ci4<yg0, r02<? super g2b>, Object> {
        public int u;
        public /* synthetic */ Object v;
        public final /* synthetic */ h72 w;
        public final /* synthetic */ ci4<yg0, r02<? super g2b>, Object> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h72 h72Var, ci4<? super yg0, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.w = h72Var;
            this.x = ci4Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.w, this.x, r02Var);
            aVar.v = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(yg0 yg0Var, r02<? super g2b> r02Var) {
            return ((a) create(yg0Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(4:40|21|(2:24|25)|34) */
        /* JADX WARN: Code duplicated, block: B:24:0x004f  */
        /* JADX WARN: Code duplicated, block: B:32:0x0065  */
        /* JADX WARN: Code duplicated, block: B:35:0x0070  */
        /* JADX WARN: Code duplicated, block: B:36:0x0071  */
        /* JADX WARN: Code duplicated, block: B:40:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        
            if (r10 == r6) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
        
            r0 = r10;
            r10 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
        
            if (defpackage.cc4.a(r0, r1, r9) == r6) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [int] */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v17 */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yg0] */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yg0] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0058 -> B:12:0x0029). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006d -> B:12:0x0029). Please report as a decompilation issue!!! */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                int r0 = r9.u
                s48 r1 = defpackage.s48.v
                h72 r2 = r9.w
                r3 = 3
                r4 = 2
                r5 = 1
                v72 r6 = defpackage.v72.t
                if (r0 == 0) goto L35
                if (r0 == r5) goto L2d
                if (r0 == r4) goto L22
                if (r0 != r3) goto L1b
                java.lang.Object r0 = r9.v
                yg0 r0 = (defpackage.yg0) r0
                defpackage.dv8.b(r10)
                goto L29
            L1b:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r9)
                r9 = 0
                return r9
            L22:
                java.lang.Object r0 = r9.v
                yg0 r0 = (defpackage.yg0) r0
                defpackage.dv8.b(r10)     // Catch: java.util.concurrent.CancellationException -> L2b
            L29:
                r10 = r0
                goto L3c
            L2b:
                r10 = move-exception
                goto L5f
            L2d:
                java.lang.Object r0 = r9.v
                yg0 r0 = (defpackage.yg0) r0
                defpackage.dv8.b(r10)     // Catch: java.util.concurrent.CancellationException -> L2b
                goto L50
            L35:
                defpackage.dv8.b(r10)
                java.lang.Object r10 = r9.v
                yg0 r10 = (defpackage.yg0) r10
            L3c:
                boolean r0 = defpackage.sd.h(r2)
                if (r0 == 0) goto L71
                ci4<yg0, r02<? super g2b>, java.lang.Object> r0 = r9.x     // Catch: java.util.concurrent.CancellationException -> L5b
                r9.v = r10     // Catch: java.util.concurrent.CancellationException -> L5b
                r9.u = r5     // Catch: java.util.concurrent.CancellationException -> L5b
                java.lang.Object r0 = r0.invoke(r10, r9)     // Catch: java.util.concurrent.CancellationException -> L5b
                if (r0 != r6) goto L4f
                goto L6f
            L4f:
                r0 = r10
            L50:
                r9.v = r0     // Catch: java.util.concurrent.CancellationException -> L2b
                r9.u = r4     // Catch: java.util.concurrent.CancellationException -> L2b
                java.lang.Object r10 = defpackage.cc4.a(r0, r1, r9)     // Catch: java.util.concurrent.CancellationException -> L2b
                if (r10 != r6) goto L29
                goto L6f
            L5b:
                r0 = move-exception
                r8 = r0
                r0 = r10
                r10 = r8
            L5f:
                boolean r7 = defpackage.sd.h(r2)
                if (r7 == 0) goto L70
                r9.v = r0
                r9.u = r3
                java.lang.Object r10 = defpackage.cc4.a(r0, r1, r9)
                if (r10 != r6) goto L29
            L6f:
                return r6
            L70:
                throw r10
            L71:
                g2b r9 = defpackage.g2b.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: cc4.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:22:0x0066->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x004e A[EDGE_INSN: B:31:0x004e->B:18:0x004e BREAK  A[LOOP:0: B:22:0x0066->B:26:0x0073], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.yg0 r7, defpackage.s48 r8, defpackage.ak0 r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.bc4
            if (r0 == 0) goto L13
            r0 = r9
            bc4 r0 = (defpackage.bc4) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            bc4 r0 = new bc4
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.v
            int r1 = r0.w
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            s48 r7 = r0.u
            yg0 r8 = r0.t
            defpackage.dv8.b(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5d
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            r7 = 0
            return r7
        L34:
            defpackage.dv8.b(r9)
            r48 r9 = r7.I()
            java.util.List<a58> r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L42:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            a58 r5 = (defpackage.a58) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L76
        L4e:
            r0.t = r7
            r0.u = r8
            r0.w = r3
            java.lang.Object r9 = r7.h1(r8, r0)
            v72 r1 = defpackage.v72.t
            if (r9 != r1) goto L5d
            return r1
        L5d:
            r48 r9 = (defpackage.r48) r9
            java.util.List<a58> r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L66:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            a58 r5 = (defpackage.a58) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L73
            goto L4e
        L73:
            int r4 = r4 + 1
            goto L66
        L76:
            int r4 = r4 + 1
            goto L42
        L79:
            g2b r7 = defpackage.g2b.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc4.a(yg0, s48, ak0):java.lang.Object");
    }

    public static final Object b(i58 i58Var, ci4<? super yg0, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super g2b> r02Var) {
        Object objO0 = i58Var.O0(new a(r02Var.getContext(), ci4Var, null), r02Var);
        return objO0 == v72.t ? objO0 : g2b.a;
    }
}
