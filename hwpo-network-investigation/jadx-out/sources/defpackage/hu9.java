package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hu9 {
    public ou9 a;
    public long b;
    public boolean c;
    public int d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static hu9 a() {
            return qu9.b.a();
        }

        public static hu9 b(hu9 hu9Var) {
            if (hu9Var instanceof zwa) {
                zwa zwaVar = (zwa) hu9Var;
                if (zwaVar.t == e00.a()) {
                    zwaVar.r = null;
                    return hu9Var;
                }
            }
            if (hu9Var instanceof axa) {
                axa axaVar = (axa) hu9Var;
                if (axaVar.i == e00.a()) {
                    axaVar.h = null;
                    return hu9Var;
                }
            }
            hu9 hu9VarG = qu9.g(hu9Var, null, false);
            hu9VarG.j();
            return hu9VarG;
        }

        public static Object c(ly2 ly2Var, mh4 mh4Var) {
            hu9 zwaVar;
            hu9 hu9VarA = qu9.b.a();
            if (hu9VarA instanceof zwa) {
                zwa zwaVar2 = (zwa) hu9VarA;
                if (zwaVar2.t == e00.a()) {
                    oh4<Object, g2b> oh4Var = zwaVar2.r;
                    oh4<Object, g2b> oh4Var2 = zwaVar2.s;
                    try {
                        ((zwa) hu9VarA).r = qu9.k(ly2Var, oh4Var, true);
                        ((zwa) hu9VarA).s = oh4Var2;
                        return mh4Var.invoke();
                    } finally {
                        zwaVar2.r = oh4Var;
                        zwaVar2.s = oh4Var2;
                    }
                }
            }
            if (hu9VarA == null || (hu9VarA instanceof g37)) {
                zwaVar = new zwa(hu9VarA instanceof g37 ? (g37) hu9VarA : null, ly2Var, null, true, false);
            } else {
                zwaVar = hu9VarA.u(ly2Var);
            }
            try {
                hu9 hu9VarJ = zwaVar.j();
                try {
                    Object objInvoke = mh4Var.invoke();
                    hu9.q(hu9VarJ);
                    zwaVar.c();
                    return objInvoke;
                } catch (Throwable th) {
                    hu9.q(hu9VarJ);
                    throw th;
                }
            } catch (Throwable th2) {
                zwaVar.c();
                throw th2;
            }
        }

        public static void d(hu9 hu9Var, hu9 hu9Var2, oh4 oh4Var) {
            if (hu9Var != hu9Var2) {
                hu9Var2.getClass();
                hu9.q(hu9Var);
                hu9Var2.c();
            } else if (hu9Var instanceof zwa) {
                ((zwa) hu9Var).r = oh4Var;
            } else if (hu9Var instanceof axa) {
                ((axa) hu9Var).h = oh4Var;
            } else {
                tn2.d(hu9Var, "Non-transparent snapshot was reused: ");
            }
        }
    }

    public hu9(long j, ou9 ou9Var) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = ou9Var;
        this.b = j;
        q32 q32Var = qu9.a;
        if (j != 0) {
            ou9 ou9VarD = d();
            long j2 = ou9VarD.v;
            long[] jArr = ou9VarD.w;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = ou9VarD.u;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = ou9VarD.t;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (qu9.c) {
                iA = qu9.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(hu9 hu9Var) {
        qu9.b.b(hu9Var);
    }

    public final void a() {
        synchronized (qu9.c) {
            b();
            p();
            g2b g2bVar = g2b.a;
        }
    }

    public void b() {
        qu9.d = qu9.d.e(g());
    }

    public void c() {
        this.c = true;
        synchronized (qu9.c) {
            o();
            g2b g2bVar = g2b.a;
        }
    }

    public ou9 d() {
        return this.a;
    }

    public abstract oh4<Object, g2b> e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract oh4<Object, g2b> i();

    public final hu9 j() {
        kv9<hu9> kv9Var = qu9.b;
        hu9 hu9VarA = kv9Var.a();
        kv9Var.b(this);
        return hu9VarA;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(m0a m0aVar);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            qu9.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(ou9 ou9Var) {
        this.a = ou9Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract hu9 u(oh4<Object, g2b> oh4Var);
}
