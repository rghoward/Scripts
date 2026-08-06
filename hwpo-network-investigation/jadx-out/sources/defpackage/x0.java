package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x0<T> extends ll5 implements r02<T>, t72 {
    public final h72 x;

    public x0(h72 h72Var, boolean z) {
        super(z);
        X((el5) h72Var.d0(el5.a.t));
        this.x = h72Var.c0(this);
    }

    @Override // defpackage.ll5
    public final String D() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public final void D0(x72 x72Var, x0 x0Var, ci4 ci4Var) {
        Object objInvoke;
        int iOrdinal = x72Var.ordinal();
        if (iOrdinal == 0) {
            try {
                b23.e(th0.e(th0.d(x0Var, this, ci4Var)), g2b.a);
                return;
            } catch (Throwable th) {
                th = th;
                if (th instanceof x13) {
                    th = ((x13) th).t;
                }
                resumeWith(dv8.a(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                ci4Var.getClass();
                th0.e(th0.d(x0Var, this, ci4Var)).resumeWith(g2b.a);
                return;
            }
            if (iOrdinal != 3) {
                u.b();
                return;
            }
            try {
                h72 h72Var = this.x;
                Object objC = cla.c(h72Var, null);
                try {
                    if (ci4Var instanceof ak0) {
                        fza.b(2, ci4Var);
                        objInvoke = ci4Var.invoke(x0Var, this);
                    } else {
                        objInvoke = th0.f(ci4Var, x0Var, this);
                    }
                    cla.a(h72Var, objC);
                    if (objInvoke != v72.t) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    cla.a(h72Var, objC);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof x13) {
                    th = ((x13) th).t;
                }
                resumeWith(dv8.a(th));
            }
        }
    }

    @Override // defpackage.ll5
    public final void V(kp1 kp1Var) {
        q72.a(this.x, kp1Var);
    }

    @Override // defpackage.r02
    public final h72 getContext() {
        return this.x;
    }

    @Override // defpackage.t72
    public final h72 getCoroutineContext() {
        return this.x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ll5
    public final void o0(Object obj) {
        if (!(obj instanceof jp1)) {
            C0(obj);
        } else {
            jp1 jp1Var = (jp1) obj;
            B0(jp1Var.a, jp1.b.get(jp1Var) == 1);
        }
    }

    @Override // defpackage.r02
    public final void resumeWith(Object obj) {
        Throwable thA = av8.a(obj);
        if (thA != null) {
            obj = new jp1(thA, false);
        }
        Object objI0 = i0(obj);
        if (objI0 == ml5.u) {
            return;
        }
        s(objI0);
    }

    public void C0(T t) {
    }

    public void B0(Throwable th, boolean z) {
    }
}
