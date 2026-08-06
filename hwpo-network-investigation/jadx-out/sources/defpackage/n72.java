package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n72 extends y0 implements v02 {
    public static final a u = new a(v02.a.t, new m72(0));

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @gy2
    public static final class a extends z0<v02, n72> {
    }

    public n72() {
        super(v02.a.t);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to n72 for r2v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.y0, defpackage.h72
    public final defpackage.h72 N(h72.b<?> r3) {
        /*
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof defpackage.z0
            if (r0 == 0) goto L1e
            z0 r3 = (defpackage.z0) r3
            h72$b<?> r0 = r2.t
            if (r0 == r3) goto L13
            h72$b<?> r1 = r3.u
            if (r1 != r0) goto L12
            goto L13
        L12:
            return r2
        L13:
            oh4<h72$a, E extends B> r3 = r3.t
            java.lang.Object r3 = r3.invoke(r2)
            h72$a r3 = (h72.a) r3
            if (r3 == 0) goto L24
            goto L22
        L1e:
            v02$a r0 = v02.a.t
            if (r0 != r3) goto L24
        L22:
            ff3 r2 = defpackage.ff3.t
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n72.N(h72$b):h72");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to n72 for r3v3 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.y0, defpackage.h72
    public final <E extends h72.a> E d0(h72.b<E> r4) {
        /*
            r3 = this;
            r4.getClass()
            boolean r0 = r4 instanceof defpackage.z0
            r1 = 0
            if (r0 == 0) goto L1f
            z0 r4 = (defpackage.z0) r4
            h72$b<?> r0 = r3.t
            if (r0 == r4) goto L14
            h72$b<?> r2 = r4.u
            if (r2 != r0) goto L13
            goto L14
        L13:
            return r1
        L14:
            oh4<h72$a, E extends B> r4 = r4.t
            java.lang.Object r3 = r4.invoke(r3)
            h72$a r3 = (h72.a) r3
            if (r3 == 0) goto L24
            return r3
        L1f:
            v02$a r0 = v02.a.t
            if (r0 != r4) goto L24
            return r3
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n72.d0(h72$b):h72$a");
    }

    @Override // defpackage.v02
    public final a23 t(u02 u02Var) {
        return new a23(this, u02Var);
    }

    public abstract void t0(h72 h72Var, Runnable runnable);

    public String toString() {
        return getClass().getSimpleName() + '@' + ym2.c(this);
    }

    public void u0(h72 h72Var, Runnable runnable) {
        b23.f(this, h72Var, runnable);
    }

    @Override // defpackage.v02
    public final void v(r02<?> r02Var) {
        r02Var.getClass();
        a23 a23Var = (a23) r02Var;
        a23Var.i();
        e41<?> e41VarM = a23Var.m();
        if (e41VarM != null) {
            e41VarM.n();
        }
    }

    public boolean v0(h72 h72Var) {
        return !(this instanceof v1b);
    }

    public n72 w0(int i) {
        pp0.c(i);
        return new a86(this, i);
    }
}
