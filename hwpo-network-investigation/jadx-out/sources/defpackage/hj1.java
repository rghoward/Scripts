package defpackage;

import com.intercom.twig.BuildConfig;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hj1 implements h72, Serializable {
    public final h72 t;
    public final h72.a u;

    public hj1(h72.a aVar, h72 h72Var) {
        h72Var.getClass();
        aVar.getClass();
        this.t = h72Var;
        this.u = aVar;
    }

    @Override // defpackage.h72
    public final Object J(ci4 ci4Var, Object obj) {
        return ci4Var.invoke(this.t.J(ci4Var, obj), this.u);
    }

    @Override // defpackage.h72
    public final h72 N(h72.b<?> bVar) {
        bVar.getClass();
        h72.a aVar = this.u;
        h72.a aVarD0 = aVar.d0(bVar);
        h72 h72Var = this.t;
        if (aVarD0 != null) {
            return h72Var;
        }
        h72 h72VarN = h72Var.N(bVar);
        if (h72VarN == h72Var) {
            return this;
        }
        return h72VarN == ff3.t ? aVar : new hj1(aVar, h72VarN);
    }

    @Override // defpackage.h72
    public final h72 c0(h72 h72Var) {
        h72Var.getClass();
        return h72Var == ff3.t ? this : (h72) h72Var.J(new g72(), this);
    }

    @Override // defpackage.h72
    public final <E extends h72.a> E d0(h72.b<E> bVar) {
        bVar.getClass();
        while (true) {
            E e = (E) this.u.d0(bVar);
            if (e != null) {
                return e;
            }
            h72 h72Var = this.t;
            if (!(h72Var instanceof hj1)) {
                return (E) h72Var.d0(bVar);
            }
            this = (hj1) h72Var;
        }
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof hj1) {
            hj1 hj1Var = (hj1) obj;
            int i = 2;
            hj1 hj1Var2 = hj1Var;
            int i2 = 2;
            while (true) {
                h72 h72Var = hj1Var2.t;
                hj1Var2 = h72Var instanceof hj1 ? (hj1) h72Var : null;
                if (hj1Var2 == null) {
                    break;
                }
                i2++;
            }
            hj1 hj1Var3 = this;
            while (true) {
                h72 h72Var2 = hj1Var3.t;
                hj1Var3 = h72Var2 instanceof hj1 ? (hj1) h72Var2 : null;
                if (hj1Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    h72.a aVar = this.u;
                    if (!xj5.a(hj1Var.d0(aVar.getKey()), aVar)) {
                        zA = false;
                        break;
                    }
                    h72 h72Var3 = this.t;
                    if (!(h72Var3 instanceof hj1)) {
                        h72Var3.getClass();
                        h72.a aVar2 = (h72.a) h72Var3;
                        zA = xj5.a(hj1Var.d0(aVar2.getKey()), aVar2);
                        break;
                    }
                    this = (hj1) h72Var3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.u.hashCode() + this.t.hashCode();
    }

    public final String toString() {
        return wu0.a(new StringBuilder("["), (String) J(new gj1(), BuildConfig.FLAVOR), ']');
    }
}
