package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {179, 103}, m = "invokeSuspend")
public final class hj5 extends p6a implements ci4<t72, r02<Object>, Object> {
    public final /* synthetic */ oh4<r02<Object>, Object> A;
    public x37 t;
    public Object u;
    public gj5 v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ o37 y;
    public final /* synthetic */ gj5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hj5(o37 o37Var, gj5 gj5Var, oh4<? super r02<Object>, ? extends Object> oh4Var, r02<? super hj5> r02Var) {
        super(2, r02Var);
        this.y = o37Var;
        this.z = gj5Var;
        this.A = oh4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        hj5 hj5Var = new hj5(this.y, this.z, this.A, r02Var);
        hj5Var.x = obj;
        return hj5Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<Object> r02Var) {
        return ((hj5) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
