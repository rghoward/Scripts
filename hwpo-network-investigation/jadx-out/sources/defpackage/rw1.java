package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rw1 implements r54<Object> {
    public final /* synthetic */ a0a t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ s54 t;

        /* JADX INFO: renamed from: rw1$a$a, reason: collision with other inner class name */
        @xm2(c = "androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2", f = "ConflatedEventBus.kt", l = {52}, m = "emit", v = 1)
        public static final class C0237a extends u02 {
            public /* synthetic */ Object t;
            public int u;

            public C0237a(r02 r02Var) {
                super(r02Var);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.t = obj;
                this.u |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(s54 s54Var) {
            this.t = s54Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
        public final Object emit(Object obj, r02 r02Var) throws Throwable {
            C0237a c0237a;
            if (r02Var instanceof C0237a) {
                c0237a = (C0237a) r02Var;
                int i = c0237a.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0237a.u = i - Integer.MIN_VALUE;
                } else {
                    c0237a = new C0237a(r02Var);
                }
            } else {
                c0237a = new C0237a(r02Var);
            }
            Object obj2 = c0237a.t;
            int i2 = c0237a.u;
            if (i2 == 0) {
                dv8.b(obj2);
                B b = ((js7) obj).u;
                if (b != 0) {
                    c0237a.u = 1;
                    Object objEmit = this.t.emit(b, c0237a);
                    Object obj3 = v72.t;
                    if (objEmit == obj3) {
                        return obj3;
                    }
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj2);
            }
            return g2b.a;
        }
    }

    public rw1(a0a a0aVar) {
        this.t = a0aVar;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super Object> s54Var, r02 r02Var) throws Throwable {
        this.t.collect(new a(s54Var), r02Var);
        return v72.t;
    }
}
