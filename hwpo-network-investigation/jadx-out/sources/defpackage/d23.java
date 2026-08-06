package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d23<T> extends p9a {
    public int v;

    public d23(int i) {
        this.v = i;
    }

    public abstract r02<T> c();

    public Throwable d(Object obj) {
        jp1 jp1Var = obj instanceof jp1 ? (jp1) obj : null;
        if (jp1Var != null) {
            return jp1Var.a;
        }
        return null;
    }

    public final void g(Throwable th) {
        q72.a(c().getContext(), new y72("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            r02<T> r02VarC = c();
            r02VarC.getClass();
            a23 a23Var = (a23) r02VarC;
            u02 u02Var = a23Var.x;
            Object obj = a23Var.z;
            h72 context = u02Var.getContext();
            Object objC = cla.c(context, obj);
            el5 el5Var = null;
            x1b<?> x1bVarC = objC != cla.a ? l72.c(u02Var, context, objC) : null;
            try {
                h72 context2 = u02Var.getContext();
                Object objH = h();
                Throwable thD = d(objH);
                if (thD == null) {
                    int i = this.v;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        el5Var = (el5) context2.d0(el5.a.t);
                    }
                }
                if (el5Var != null && !el5Var.h()) {
                    CancellationException cancellationExceptionH = el5Var.H();
                    b(cancellationExceptionH);
                    u02Var.resumeWith(dv8.a(cancellationExceptionH));
                } else if (thD != null) {
                    u02Var.resumeWith(new av8.a(thD));
                } else {
                    u02Var.resumeWith(f(objH));
                }
                g2b g2bVar = g2b.a;
            } finally {
                if (x1bVarC == null || x1bVarC.F0()) {
                    cla.a(context, objC);
                }
            }
        } catch (x13 e) {
            q72.a(c().getContext(), e.t);
        } catch (Throwable th) {
            g(th);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T f(Object obj) {
        return obj;
    }
}
