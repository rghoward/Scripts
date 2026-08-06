package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public final class oy0 implements jac {
    public static final /* synthetic */ int t = 0;
    public static final /* synthetic */ oy0 u = new oy0();

    public static vv2 b(t72 t72Var, ht4 ht4Var, ci4 ci4Var, int i) {
        h72 h72Var = ht4Var;
        if ((i & 1) != 0) {
            h72Var = ff3.t;
        }
        vv2 vv2Var = new vv2(l72.b(t72Var, h72Var), true);
        vv2Var.D0(x72.t, vv2Var, ci4Var);
        return vv2Var;
    }

    public static final dz9 c(t72 t72Var, h72 h72Var, x72 x72Var, ci4 ci4Var) {
        h72 h72VarB = l72.b(t72Var, h72Var);
        x72Var.getClass();
        dz9 f26Var = x72Var == x72.u ? new f26(h72VarB, ci4Var) : new dz9(h72VarB, true);
        f26Var.D0(x72Var, f26Var, ci4Var);
        return f26Var;
    }

    public static /* synthetic */ dz9 d(t72 t72Var, h72 h72Var, x72 x72Var, ci4 ci4Var, int i) {
        if ((i & 1) != 0) {
            h72Var = ff3.t;
        }
        if ((i & 2) != 0) {
            x72Var = x72.t;
        }
        return c(t72Var, h72Var, x72Var, ci4Var);
    }

    public static Object e(ci4 ci4Var) {
        return f(ff3.t, ci4Var);
    }

    public static final Object f(h72 h72Var, ci4 ci4Var) throws Throwable {
        pm3 pm3VarA;
        h72 h72VarA;
        long jA0;
        v02.a aVar = v02.a.t;
        v02 v02Var = (v02) h72Var.d0(aVar);
        ff3 ff3Var = ff3.t;
        if (v02Var == null) {
            pm3VarA = dla.a();
            h72VarA = l72.a(ff3Var, h72Var.c0(pm3VarA), true);
            et2 et2Var = i23.a;
            if (h72VarA != et2Var && h72VarA.d0(aVar) == null) {
                h72VarA = h72VarA.c0(et2Var);
            }
        } else {
            pm3VarA = dla.a.get();
            h72VarA = l72.a(ff3Var, h72Var, true);
            et2 et2Var2 = i23.a;
            if (h72VarA != et2Var2 && h72VarA.d0(aVar) == null) {
                h72VarA = h72VarA.c0(et2Var2);
            }
        }
        jr0 jr0Var = new jr0(h72VarA, Thread.currentThread(), pm3VarA);
        jr0Var.D0(x72.t, jr0Var, ci4Var);
        pm3 pm3Var = jr0Var.z;
        if (pm3Var != null) {
            int i = pm3.y;
            pm3Var.z0(false);
        }
        while (true) {
            if (pm3Var != null) {
                try {
                    jA0 = pm3Var.A0();
                } catch (Throwable th) {
                    if (pm3Var != null) {
                        int i2 = pm3.y;
                        pm3Var.x0(false);
                    }
                    throw th;
                }
            } else {
                jA0 = Long.MAX_VALUE;
            }
            if (jr0Var.a0()) {
                break;
            }
            LockSupport.parkNanos(jr0Var, jA0);
            if (Thread.interrupted()) {
                jr0Var.z(new InterruptedException());
            }
        }
        if (pm3Var != null) {
            int i3 = pm3.y;
            pm3Var.x0(false);
        }
        Object objD = ml5.d(jr0Var.S());
        jp1 jp1Var = objD instanceof jp1 ? (jp1) objD : null;
        if (jp1Var == null) {
            return objD;
        }
        throw jp1Var.a;
    }

    public static final Object g(h72 h72Var, ci4 ci4Var, r02 r02Var) throws Throwable {
        h72 context = r02Var.getContext();
        h72 h72VarC0 = !((Boolean) h72Var.J(new i72(), Boolean.FALSE)).booleanValue() ? context.c0(h72Var) : l72.a(context, h72Var, false);
        sd.d(h72VarC0);
        if (h72VarC0 == context) {
            i59 i59Var = new i59(r02Var, h72VarC0);
            return wx7.d(i59Var, true, i59Var, ci4Var);
        }
        v02.a aVar = v02.a.t;
        if (xj5.a(h72VarC0.d0(aVar), context.d0(aVar))) {
            x1b x1bVar = new x1b(r02Var, h72VarC0);
            h72 h72Var2 = x1bVar.x;
            Object objC = cla.c(h72Var2, null);
            try {
                return wx7.d(x1bVar, true, x1bVar, ci4Var);
            } finally {
                cla.a(h72Var2, objC);
            }
        }
        c23 c23Var = new c23(r02Var, h72VarC0);
        try {
            b23.e(th0.e(th0.d(c23Var, c23Var, ci4Var)), g2b.a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c23.z;
            do {
                int i = atomicIntegerFieldUpdater.get(c23Var);
                if (i != 0) {
                    if (i != 2) {
                        aa0.c("Already suspended");
                        return null;
                    }
                    Object objD = ml5.d(c23Var.S());
                    if (objD instanceof jp1) {
                        throw ((jp1) objD).a;
                    }
                    return objD;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c23Var, 0, 1));
            return v72.t;
        } catch (Throwable th) {
            th = th;
            if (th instanceof x13) {
                th = ((x13) th).t;
            }
            c23Var.resumeWith(dv8.a(th));
            throw th;
        }
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(u4c.u.get().S());
    }
}
