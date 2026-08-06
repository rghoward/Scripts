package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b44<T> {
    public final c44<T> a = new c44<>();
    public final a47 b = new a47();
    public int c = -1;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(u02 u02Var) {
        z34 z34Var;
        a47 a47Var;
        if (u02Var instanceof z34) {
            z34Var = (z34) u02Var;
            int i = z34Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                z34Var.w = i - Integer.MIN_VALUE;
            } else {
                z34Var = new z34(this, u02Var);
            }
        } else {
            z34Var = new z34(this, u02Var);
        }
        Object obj = z34Var.u;
        int i2 = z34Var.w;
        if (i2 == 0) {
            dv8.b(obj);
            a47 a47Var2 = this.b;
            z34Var.t = a47Var2;
            z34Var.w = 1;
            Object objB = a47Var2.b(z34Var);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
            a47Var = a47Var2;
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a47Var = z34Var.t;
            dv8.b(obj);
        }
        try {
            List<oo7<T>> listB = this.a.b();
            int size = (this.c - listB.size()) + 1;
            ArrayList arrayList = new ArrayList(ph1.n(listB, 10));
            int i3 = 0;
            for (T t : listB) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    ws0.m();
                    throw null;
                }
                arrayList.add(new sa5(i3 + size, (oo7) t));
                i3 = i4;
            }
            a47Var.c(null);
            return arrayList;
        } catch (Throwable th) {
            a47Var.c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(sa5 sa5Var, u02 u02Var) throws Throwable {
        a44 a44Var;
        a47 a47Var;
        if (u02Var instanceof a44) {
            a44Var = (a44) u02Var;
            int i = a44Var.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                a44Var.x = i - Integer.MIN_VALUE;
            } else {
                a44Var = new a44(this, u02Var);
            }
        } else {
            a44Var = new a44(this, u02Var);
        }
        Object obj = a44Var.v;
        int i2 = a44Var.x;
        if (i2 == 0) {
            dv8.b(obj);
            a44Var.t = sa5Var;
            a47Var = this.b;
            a44Var.u = a47Var;
            a44Var.x = 1;
            Object objB = a47Var.b(a44Var);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a47 a47Var2 = a44Var.u;
            sa5 sa5Var2 = a44Var.t;
            dv8.b(obj);
            a47Var = a47Var2;
            sa5Var = sa5Var2;
        }
        try {
            this.c = sa5Var.a;
            this.a.a((oo7) sa5Var.b);
            g2b g2bVar = g2b.a;
            return g2b.a;
        } finally {
            a47Var.c(null);
        }
    }
}
