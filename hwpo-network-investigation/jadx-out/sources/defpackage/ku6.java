package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ku6<T> implements w49<T> {
    public final au6 a;
    public final q2b<?, ?> b;
    public final boolean c;
    public final xr3<?> d;

    public ku6(q2b<?, ?> q2bVar, xr3<?> xr3Var, au6 au6Var) {
        this.b = q2bVar;
        this.c = xr3Var.e(au6Var);
        this.d = xr3Var;
        this.a = au6Var;
    }

    @Override // defpackage.w49
    public final void a(T t, T t2) {
        Class<?> cls = h59.a;
        q2b<?, ?> q2bVar = this.b;
        q2bVar.o(t, q2bVar.k(q2bVar.g(t), q2bVar.g(t2)));
        if (this.c) {
            h59.k(this.d, t, t2);
        }
    }

    @Override // defpackage.w49
    public final void b(T t) {
        this.b.j(t);
        this.d.f(t);
    }

    @Override // defpackage.w49
    public final boolean c(T t) {
        this.d.c(t).e();
        return true;
    }

    @Override // defpackage.w49
    public final T d() {
        au6 au6Var = this.a;
        return au6Var instanceof ek4 ? (T) ((ek4) au6Var).n() : (T) au6Var.c().f();
    }

    @Override // defpackage.w49
    public final boolean e(ek4 ek4Var, ek4 ek4Var2) {
        q2b<?, ?> q2bVar = this.b;
        if (!q2bVar.g(ek4Var).equals(q2bVar.g(ek4Var2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        xr3<?> xr3Var = this.d;
        return xr3Var.c(ek4Var).equals(xr3Var.c(ek4Var2));
    }

    @Override // defpackage.w49
    public final void f(Object obj, rg1 rg1Var, ur3 ur3Var) {
        q2b<?, ?> q2bVar = this.b;
        s2b s2bVarF = q2bVar.f(obj);
        xr3<?> xr3Var = this.d;
        su3<T> su3VarD = xr3Var.d(obj);
        while (rg1Var.a() != Integer.MAX_VALUE) {
            try {
                ku6<T> ku6Var = this;
                rg1 rg1Var2 = rg1Var;
                ur3 ur3Var2 = ur3Var;
                if (!ku6Var.j(rg1Var2, ur3Var2, xr3Var, su3VarD, q2bVar, s2bVarF)) {
                    return;
                }
                this = ku6Var;
                rg1Var = rg1Var2;
                ur3Var = ur3Var2;
            } finally {
                q2bVar.n(obj, s2bVarF);
            }
        }
    }

    @Override // defpackage.w49
    public final int g(ek4 ek4Var) {
        int iHashCode = this.b.g(ek4Var).hashCode();
        if (!this.c) {
            return iHashCode;
        }
        return this.d.c(ek4Var).a.hashCode() + (iHashCode * 53);
    }

    @Override // defpackage.w49
    public final int h(z1 z1Var) {
        q2b<?, ?> q2bVar = this.b;
        int i = q2bVar.i(q2bVar.g(z1Var));
        if (this.c) {
            gs9 gs9Var = this.d.c(z1Var).a;
            if (gs9Var.t.size() > 0) {
                su3.d(gs9Var.c(0));
                throw null;
            }
            Iterator<T> it = gs9Var.d().iterator();
            if (it.hasNext()) {
                su3.d((Map.Entry) it.next());
                throw null;
            }
        }
        return i;
    }

    @Override // defpackage.w49
    public final void i(T t, drb drbVar) {
        Iterator itG = this.d.c(t).g();
        if (itG.hasNext()) {
            ((su3.a) ((Map.Entry) itG.next()).getKey()).q();
            throw null;
        }
        q2b<?, ?> q2bVar = this.b;
        q2bVar.q(q2bVar.g(t), drbVar);
    }

    public final boolean j(rg1 rg1Var, ur3 ur3Var, xr3 xr3Var, su3 su3Var, q2b q2bVar, Object obj) throws fk5 {
        int i = rg1Var.b;
        au6 au6Var = this.a;
        if (i != 11) {
            if ((i & 7) != 2) {
                return rg1Var.x();
            }
            ek4.e eVarB = xr3Var.b(ur3Var, au6Var, i >>> 3);
            if (eVarB == null) {
                return q2bVar.l(obj, rg1Var, 0);
            }
            xr3Var.h(eVarB);
            throw null;
        }
        ek4.e eVarB2 = null;
        e01 e01VarE = null;
        int iV = 0;
        while (rg1Var.a() != Integer.MAX_VALUE) {
            int i2 = rg1Var.b;
            if (i2 == 16) {
                rg1Var.w(0);
                iV = rg1Var.a.v();
                eVarB2 = xr3Var.b(ur3Var, au6Var, iV);
            } else if (i2 == 26) {
                if (eVarB2 != null) {
                    xr3Var.h(eVarB2);
                    throw null;
                }
                e01VarE = rg1Var.e();
            } else if (!rg1Var.x()) {
                break;
            }
        }
        if (rg1Var.b != 12) {
            throw new fk5("Protocol message end-group tag did not match expected tag.");
        }
        if (e01VarE == null) {
            return true;
        }
        if (eVarB2 == null) {
            q2bVar.d(obj, iV, e01VarE);
            return true;
        }
        xr3Var.i(eVarB2);
        throw null;
    }
}
