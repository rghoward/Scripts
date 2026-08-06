package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class w64<T> implements s54 {
    public final /* synthetic */ cl8 t;
    public final /* synthetic */ s54<T> u;
    public final /* synthetic */ ci4<T, r02<? super Boolean>, Object> v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {34, 35, 37}, m = "emit", v = 1)
    public static final class a extends u02 {
        public Object t;
        public /* synthetic */ Object u;
        public final /* synthetic */ w64<T> v;
        public int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(w64<? super T> w64Var, r02<? super a> r02Var) {
            super(r02Var);
            this.v = w64Var;
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return this.v.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w64(cl8 cl8Var, s54<? super T> s54Var, ci4<? super T, ? super r02<? super Boolean>, ? extends Object> ci4Var) {
        this.t = cl8Var;
        this.u = s54Var;
        this.v = ci4Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r3.emit(r10, r0) == r8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (r3.emit(r10, r0) == r8) goto L32;
     */
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
    @Override // defpackage.s54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r10, defpackage.r02<? super defpackage.g2b> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof w64.a
            if (r0 == 0) goto L13
            r0 = r11
            w64$a r0 = (w64.a) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            w64$a r0 = new w64$a
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.u
            int r1 = r0.w
            r2 = 0
            s54<T> r3 = r9.u
            cl8 r4 = r9.t
            r5 = 3
            r6 = 2
            r7 = 1
            v72 r8 = defpackage.v72.t
            if (r1 == 0) goto L42
            if (r1 == r7) goto L3e
            if (r1 == r6) goto L38
            if (r1 != r5) goto L32
            defpackage.dv8.b(r11)
            goto L79
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r9)
            return r2
        L38:
            java.lang.Object r10 = r0.t
            defpackage.dv8.b(r11)
            goto L64
        L3e:
            defpackage.dv8.b(r11)
            goto L54
        L42:
            defpackage.dv8.b(r11)
            boolean r11 = r4.t
            if (r11 == 0) goto L57
            r0.t = r2
            r0.w = r7
            java.lang.Object r9 = r3.emit(r10, r0)
            if (r9 != r8) goto L54
            goto L78
        L54:
            g2b r9 = defpackage.g2b.a
            return r9
        L57:
            r0.t = r10
            r0.w = r6
            ci4<T, r02<? super java.lang.Boolean>, java.lang.Object> r9 = r9.v
            java.lang.Object r11 = r9.invoke(r10, r0)
            if (r11 != r8) goto L64
            goto L78
        L64:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r9 = r11.booleanValue()
            if (r9 != 0) goto L7c
            r4.t = r7
            r0.t = r2
            r0.w = r5
            java.lang.Object r9 = r3.emit(r10, r0)
            if (r9 != r8) goto L79
        L78:
            return r8
        L79:
            g2b r9 = defpackage.g2b.a
            return r9
        L7c:
            g2b r9 = defpackage.g2b.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w64.emit(java.lang.Object, r02):java.lang.Object");
    }
}
