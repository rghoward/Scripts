package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1", f = "SnapshotFlow.kt", l = {476, 479, 484}, m = "invokeSuspend", v = 1)
public final class cv9 extends p6a implements ci4<s54<Object>, r02<? super g2b>, Object> {
    public lu9 t;
    public p91 u;
    public Object v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ mh4<Object> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv9(mh4 mh4Var, r02 r02Var) {
        super(2, r02Var);
        this.y = mh4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        cv9 cv9Var = new cv9(this.y, r02Var);
        cv9Var.x = obj;
        return cv9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(s54<Object> s54Var, r02<? super g2b> r02Var) throws Throwable {
        ((cv9) create(s54Var, r02Var)).invokeSuspend(g2b.a);
        return v72.t;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077 A[Catch: all -> 0x0020, PHI: r0 r4 r7 r8
      0x0077: PHI (r0v4 java.lang.Object) = (r0v3 java.lang.Object), (r0v8 java.lang.Object) binds: [B:23:0x0074, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r4v7 ??) = (r4v10 ??), (r4v11 ??) binds: [B:23:0x0074, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r7v4 ??) = (r7v7 ??), (r7v8 ??) binds: [B:23:0x0074, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r8v3 s54) = (r8v2 s54), (r8v7 s54) binds: [B:23:0x0074, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0020, blocks: (B:15:0x0033, B:25:0x0077, B:22:0x0066, B:27:0x0081, B:8:0x001c), top: B:42:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:15:0x0033, B:25:0x0077, B:22:0x0066, B:27:0x0081, B:8:0x001c), top: B:42:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [mu9] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [p91] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [p91, tj8] */
    /* JADX WARN: Type inference failed for: r4v7, types: [p91] */
    /* JADX WARN: Type inference failed for: r7v1, types: [lu9] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, lu9] */
    /* JADX WARN: Type inference failed for: r7v3, types: [lu9] */
    /* JADX WARN: Type inference failed for: r7v4, types: [lu9] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007f -> B:22:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0092 -> B:22:0x0066). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            int r0 = r10.w
            mh4<java.lang.Object> r1 = r10.y
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            v72 r6 = defpackage.v72.t
            if (r0 == 0) goto L37
            if (r0 == r4) goto L12
            if (r0 == r3) goto L29
            if (r0 != r2) goto L23
        L12:
            java.lang.Object r0 = r10.v
            p91 r4 = r10.u
            lu9 r7 = r10.t
            java.lang.Object r8 = r10.x
            s54 r8 = (defpackage.s54) r8
            defpackage.dv8.b(r11)     // Catch: java.lang.Throwable -> L20
            goto L66
        L20:
            r10 = move-exception
            goto L96
        L23:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r10)
            return r5
        L29:
            java.lang.Object r0 = r10.v
            p91 r4 = r10.u
            lu9 r7 = r10.t
            java.lang.Object r8 = r10.x
            s54 r8 = (defpackage.s54) r8
            defpackage.dv8.b(r11)     // Catch: java.lang.Throwable -> L20
            goto L77
        L37:
            defpackage.dv8.b(r11)
            java.lang.Object r11 = r10.x
            r8 = r11
            s54 r8 = (defpackage.s54) r8
            lu9 r7 = new lu9
            r7.<init>()
            sq9 r11 = new sq9
            r11.<init>()
            r7.a = r11
            r11 = 6
            zx0 r11 = defpackage.da1.a(r4, r11, r5)
            java.lang.Object r0 = r7.a(r11, r1)     // Catch: java.lang.Throwable -> L94
            r10.x = r8     // Catch: java.lang.Throwable -> L94
            r10.t = r7     // Catch: java.lang.Throwable -> L94
            r10.u = r11     // Catch: java.lang.Throwable -> L94
            r10.v = r0     // Catch: java.lang.Throwable -> L94
            r10.w = r4     // Catch: java.lang.Throwable -> L94
            java.lang.Object r4 = r8.emit(r0, r10)     // Catch: java.lang.Throwable -> L94
            if (r4 != r6) goto L65
            goto L91
        L65:
            r4 = r11
        L66:
            r10.x = r8     // Catch: java.lang.Throwable -> L20
            r10.t = r7     // Catch: java.lang.Throwable -> L20
            r10.u = r4     // Catch: java.lang.Throwable -> L20
            r10.v = r0     // Catch: java.lang.Throwable -> L20
            r10.w = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Object r11 = r4.i(r10)     // Catch: java.lang.Throwable -> L20
            if (r11 != r6) goto L77
            goto L91
        L77:
            java.lang.Object r11 = r7.a(r4, r1)     // Catch: java.lang.Throwable -> L20
            boolean r9 = defpackage.xj5.a(r11, r0)     // Catch: java.lang.Throwable -> L20
            if (r9 != 0) goto L66
            r10.x = r8     // Catch: java.lang.Throwable -> L20
            r10.t = r7     // Catch: java.lang.Throwable -> L20
            r10.u = r4     // Catch: java.lang.Throwable -> L20
            r10.v = r11     // Catch: java.lang.Throwable -> L20
            r10.w = r2     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r8.emit(r11, r10)     // Catch: java.lang.Throwable -> L20
            if (r0 != r6) goto L92
        L91:
            return r6
        L92:
            r0 = r11
            goto L66
        L94:
            r10 = move-exception
            r4 = r11
        L96:
            mu9 r11 = r7.a
            if (r11 == 0) goto L9d
            r11.e(r4)
        L9d:
            mu9 r11 = r7.a
            if (r11 == 0) goto La2
            goto La7
        La2:
            java.lang.String r0 = "Called dispose on a manager that has been disposed of"
            defpackage.c78.b(r0)
        La7:
            r11.c()
            r7.a = r5
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
