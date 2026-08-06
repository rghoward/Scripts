package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class w1b<T> implements s54<T> {
    public final h72 t;
    public final Object u;
    public final a v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {208}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<T, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ s54<T> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(s54<? super T> s54Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = s54Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.v, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(Object obj, r02<? super g2b> r02Var) {
            return ((a) create(obj, r02Var)).invokeSuspend(g2b.a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type r02 to w1b$a for r4v3 'this'  r02
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.ak0
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.u
                int r1 = r4.t
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                if (r1 != r3) goto Le
                defpackage.dv8.b(r5)
                goto L26
            Le:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r4)
                return r2
            L14:
                defpackage.dv8.b(r5)
                r4.u = r2
                r4.t = r3
                s54<T> r5 = r4.v
                java.lang.Object r4 = r5.emit(r0, r4)
                v72 r5 = defpackage.v72.t
                if (r4 != r5) goto L26
                return r5
            L26:
                g2b r4 = defpackage.g2b.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: w1b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public w1b(s54<? super T> s54Var, h72 h72Var) {
        this.t = h72Var;
        this.u = cla.b(h72Var);
        this.v = new a(s54Var, null);
    }

    @Override // defpackage.s54
    public final Object emit(T t, r02<? super g2b> r02Var) throws Throwable {
        Object objA = x91.a(this.t, t, this.u, this.v, r02Var);
        return objA == v72.t ? objA : g2b.a;
    }
}
