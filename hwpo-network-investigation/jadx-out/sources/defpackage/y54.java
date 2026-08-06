package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", l = {63}, m = "invokeSuspend", v = 1)
public final class y54 extends p6a implements ci4<s54<Object>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ r54<Object> v;
    public final /* synthetic */ ei4<Object, Object, r02<Object>, Object> w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ gl8<Object> t;
        public final /* synthetic */ ei4<T, T, r02<? super T>, Object> u;
        public final /* synthetic */ s54<T> v;

        /* JADX INFO: renamed from: y54$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$1", f = "FlowExt.kt", l = {68, 70}, m = "emit", v = 1)
        public static final class C0282a extends u02 {
            public gl8 t;
            public /* synthetic */ Object u;
            public final /* synthetic */ a<T> v;
            public int w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0282a(a<? super T> aVar, r02<? super C0282a> r02Var) {
                super(r02Var);
                this.v = aVar;
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.u = obj;
                this.w |= Integer.MIN_VALUE;
                return this.v.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(gl8<Object> gl8Var, ei4<? super T, ? super T, ? super r02<? super T>, ? extends Object> ei4Var, s54<? super T> s54Var) {
            this.t = gl8Var;
            this.u = ei4Var;
            this.v = s54Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        
            if (r8 == r6) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        
            if (r7.v.emit(r8, r0) == r6) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        
            return r6;
         */
        /* JADX WARN: Multi-variable type inference failed */
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
        public final java.lang.Object emit(T r8, defpackage.r02<? super defpackage.g2b> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof y54.a.C0282a
                if (r0 == 0) goto L13
                r0 = r9
                y54$a$a r0 = (y54.a.C0282a) r0
                int r1 = r0.w
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.w = r1
                goto L18
            L13:
                y54$a$a r0 = new y54$a$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.u
                int r1 = r0.w
                r2 = 0
                gl8<java.lang.Object> r3 = r7.t
                r4 = 2
                r5 = 1
                v72 r6 = defpackage.v72.t
                if (r1 == 0) goto L39
                if (r1 == r5) goto L33
                if (r1 != r4) goto L2d
                defpackage.dv8.b(r9)
                goto L63
            L2d:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r7)
                return r2
            L33:
                gl8 r8 = r0.t
                defpackage.dv8.b(r9)
                goto L52
            L39:
                defpackage.dv8.b(r9)
                T r9 = r3.t
                java.lang.Object r1 = defpackage.b64.t
                if (r9 != r1) goto L45
            L42:
                r9 = r8
                r8 = r3
                goto L52
            L45:
                r0.t = r3
                r0.w = r5
                ei4<T, T, r02<? super T>, java.lang.Object> r1 = r7.u
                java.lang.Object r8 = r1.invoke(r9, r8, r0)
                if (r8 != r6) goto L42
                goto L62
            L52:
                r8.t = r9
                T r8 = r3.t
                r0.t = r2
                r0.w = r4
                s54<T> r7 = r7.v
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r6) goto L63
            L62:
                return r6
            L63:
                g2b r7 = defpackage.g2b.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: y54.a.emit(java.lang.Object, r02):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y54(r54<Object> r54Var, ei4<Object, Object, ? super r02<Object>, ? extends Object> ei4Var, r02<? super y54> r02Var) {
        super(2, r02Var);
        this.v = r54Var;
        this.w = ei4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        y54 y54Var = new y54(this.v, this.w, r02Var);
        y54Var.u = obj;
        return y54Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(s54<Object> s54Var, r02<? super g2b> r02Var) {
        return ((y54) create(s54Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            s54 s54Var = (s54) this.u;
            gl8 gl8Var = new gl8();
            gl8Var.t = b64.t;
            a aVar = new a(gl8Var, this.w, s54Var);
            this.t = 1;
            Object objCollect = this.v.collect(aVar, this);
            v72 v72Var = v72.t;
            if (objCollect == v72Var) {
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
