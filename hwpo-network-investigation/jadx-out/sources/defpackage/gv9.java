package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gv9 {
    public static final Object a = new Object();

    public static final void a(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public static final boolean b(k0a k0aVar, int i, j2 j2Var, boolean z) {
        boolean z2;
        synchronized (a) {
            try {
                int i2 = k0aVar.d;
                if (i2 == i) {
                    k0aVar.c = j2Var;
                    z2 = true;
                    if (z) {
                        k0aVar.e++;
                    }
                    k0aVar.d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final k0a c(fv9 fv9Var) {
        k0a k0aVar = fv9Var.t;
        k0aVar.getClass();
        return (k0a) qu9.t(k0aVar, fv9Var);
    }

    public static final int d(fv9 fv9Var) {
        k0a k0aVar = fv9Var.t;
        k0aVar.getClass();
        return ((k0a) qu9.h(k0aVar)).e;
    }

    public static final boolean e(fv9 fv9Var, oh4 oh4Var) {
        int i;
        j2 j2Var;
        Object objInvoke;
        hu9 hu9VarJ;
        boolean zB;
        do {
            synchronized (a) {
                k0a k0aVar = fv9Var.t;
                k0aVar.getClass();
                k0a k0aVar2 = (k0a) qu9.h(k0aVar);
                i = k0aVar2.d;
                j2Var = k0aVar2.c;
                g2b g2bVar = g2b.a;
            }
            j2Var.getClass();
            lx7 lx7VarJ = j2Var.j();
            objInvoke = oh4Var.invoke(lx7VarJ);
            j2 j2VarF = lx7VarJ.f();
            if (xj5.a(j2VarF, j2Var)) {
                break;
            }
            k0a k0aVar3 = fv9Var.t;
            k0aVar3.getClass();
            synchronized (qu9.c) {
                hu9VarJ = qu9.j();
                zB = b((k0a) qu9.w(k0aVar3, fv9Var, hu9VarJ), i, j2VarF, true);
            }
            qu9.n(hu9VarJ, fv9Var);
        } while (!zB);
        return ((Boolean) objInvoke).booleanValue();
    }
}
