package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hm8 {
    public Set<im8> a;
    public bu1 b;
    public final k37<jm8> c;
    public d37<jm8> d;
    public k37<jm8> e;
    public final k37<Object> f;
    public final k37<mh4<g2b>> g;
    public d37<ls1> h;
    public c37<xj8, qu7> i;
    public ArrayList<k37<jm8>> j;
    public d37 k;

    public hm8() {
        k37<jm8> k37Var = new k37<>(new jm8[16]);
        this.c = k37Var;
        this.d = a49.a();
        this.e = k37Var;
        this.f = new k37<>(new Object[16]);
        this.g = new k37<>(new mh4[16]);
    }

    public static final boolean f(jm8 jm8Var, k37<jm8> k37Var) {
        jm8[] jm8VarArr = k37Var.t;
        int i = k37Var.v;
        for (int i2 = 0; i2 < i; i2++) {
            im8 im8VarC = jm8VarArr[i2].c();
            if (im8VarC instanceof qu7) {
                k37<jm8> k37Var2 = ((qu7) im8VarC).u;
                if (k37Var2.n(jm8Var) || f(jm8Var, k37Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        k37<jm8> k37Var = this.c;
        k37Var.k();
        this.d.b();
        this.e = k37Var;
        this.f.k();
        this.g.k();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void b() {
        Set<im8> set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator<im8> it = set.iterator();
            while (it.hasNext()) {
                im8 next = it.next();
                it.remove();
                next.b();
            }
            g2b g2bVar = g2b.a;
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        Set<im8> set = this.a;
        if (set == null) {
            return;
        }
        this.k = null;
        k37<Object> k37Var = this.f;
        if (k37Var.v != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                d37<ls1> d37Var = this.h;
                int i = k37Var.v;
                while (true) {
                    i--;
                    if (-1 >= i) {
                        break;
                    }
                    Object obj = k37Var.t[i];
                    try {
                        if (obj instanceof jm8) {
                            im8 im8VarC = ((jm8) obj).c();
                            set.remove(im8VarC);
                            im8VarC.c();
                        }
                        if (obj instanceof ls1) {
                            if (d37Var == null || !d37Var.c(obj)) {
                                ((ls1) obj).g();
                            } else {
                                ((ls1) obj).a();
                            }
                        }
                        g2b g2bVar = g2b.a;
                    } catch (Throwable th) {
                        bu1 bu1Var = this.b;
                        if (bu1Var != null) {
                            bu1Var.b(obj, th);
                        }
                        throw th;
                    }
                }
                g2b g2bVar2 = g2b.a;
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        k37<jm8> k37Var2 = this.c;
        if (k37Var2.v != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set<im8> set2 = this.a;
                if (set2 != null) {
                    jm8[] jm8VarArr = k37Var2.t;
                    int i2 = k37Var2.v;
                    for (int i3 = 0; i3 < i2; i3++) {
                        jm8 jm8Var = jm8VarArr[i3];
                        im8 im8VarC2 = jm8Var.c();
                        set2.remove(im8VarC2);
                        try {
                            im8VarC2.d();
                            g2b g2bVar3 = g2b.a;
                        } catch (Throwable th3) {
                            bu1 bu1Var2 = this.b;
                            if (bu1Var2 != null) {
                                bu1Var2.b(jm8Var, th3);
                            }
                            throw th3;
                        }
                    }
                }
                g2b g2bVar4 = g2b.a;
                Trace.endSection();
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        }
    }

    public final void d() {
        k37<mh4<g2b>> k37Var = this.g;
        if (k37Var.v != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                mh4<g2b>[] mh4VarArr = k37Var.t;
                int i = k37Var.v;
                for (int i2 = 0; i2 < i; i2++) {
                    mh4VarArr[i2].invoke();
                }
                k37Var.k();
                g2b g2bVar = g2b.a;
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e(jm8 jm8Var) {
        if (!this.d.c(jm8Var)) {
            d37 d37Var = this.k;
            if (d37Var == null || !d37Var.c(jm8Var)) {
                this.f.d(jm8Var);
                return;
            }
            return;
        }
        this.d.l(jm8Var);
        if (!this.e.n(jm8Var)) {
            k37<jm8> k37Var = this.c;
            if (!k37Var.n(jm8Var)) {
                f(jm8Var, k37Var);
            }
        }
        Set<im8> set = this.a;
        if (set == null) {
            return;
        }
        set.add(jm8Var.c());
    }

    public final void g(Set set, du1 du1Var) {
        a();
        this.a = set;
        this.b = du1Var;
    }

    public final void h(jm8 jm8Var) {
        this.e.d(jm8Var);
        this.d.a(jm8Var);
    }
}
