package defpackage;

import com.intercom.twig.BuildConfig;
import io.ably.lib.util.Crypto;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t0c {
    public final s0c a;
    public int b;
    public int c;
    public int d = 0;

    public t0c(s0c s0cVar) {
        this.a = s0cVar;
        s0cVar.c = this;
    }

    public static final void v(int i) throws k2c {
        if ((i & 3) == 0) {
            return;
        }
        ao2.b("Failed to parse the message.");
    }

    public static final void w(int i) throws k2c {
        if ((i & 7) == 0) {
            return;
        }
        ao2.b("Failed to parse the message.");
    }

    public final void A(i2c i2cVar) throws k2c {
        int iL;
        int iL2;
        boolean z = i2cVar instanceof m1c;
        int i = this.b;
        s0c s0cVar = this.a;
        if (z) {
            m1c m1cVar = (m1c) i2cVar;
            int i2 = i & 7;
            if (i2 == 2) {
                int iA = s0cVar.A();
                v(iA);
                int iE = s0cVar.e() + iA;
                do {
                    m1cVar.e(s0cVar.p());
                } while (s0cVar.e() < iE);
                return;
            }
            if (i2 != 5) {
                ny1.a();
                return;
            }
            do {
                m1cVar.e(s0cVar.p());
                if (s0cVar.d()) {
                    return;
                } else {
                    iL2 = s0cVar.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iA2 = s0cVar.A();
                v(iA2);
                int iE2 = s0cVar.e() + iA2;
                do {
                    i2cVar.add(Float.valueOf(s0cVar.p()));
                } while (s0cVar.e() < iE2);
                return;
            }
            if (i3 != 5) {
                ny1.a();
                return;
            }
            do {
                i2cVar.add(Float.valueOf(s0cVar.p()));
                if (s0cVar.d()) {
                    return;
                } else {
                    iL = s0cVar.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public final void B(i2c i2cVar) throws k2c {
        int iL;
        int iL2;
        boolean z = i2cVar instanceof r2c;
        int i = this.b;
        s0c s0cVar = this.a;
        if (z) {
            r2c r2cVar = (r2c) i2cVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    ny1.a();
                    return;
                }
                int iE = s0cVar.e() + s0cVar.A();
                do {
                    r2cVar.i(s0cVar.q());
                } while (s0cVar.e() < iE);
                u(iE);
                return;
            }
            do {
                r2cVar.i(s0cVar.q());
                if (s0cVar.d()) {
                    return;
                } else {
                    iL2 = s0cVar.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    ny1.a();
                    return;
                }
                int iE2 = s0cVar.e() + s0cVar.A();
                do {
                    i2cVar.add(Long.valueOf(s0cVar.q()));
                } while (s0cVar.e() < iE2);
                u(iE2);
                return;
            }
            do {
                i2cVar.add(Long.valueOf(s0cVar.q()));
                if (s0cVar.d()) {
                    return;
                } else {
                    iL = s0cVar.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public final void a(i2c i2cVar) throws k2c {
        int iL;
        int iL2;
        boolean z = i2cVar instanceof r2c;
        int i = this.b;
        s0c s0cVar = this.a;
        if (z) {
            r2c r2cVar = (r2c) i2cVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    ny1.a();
                    return;
                }
                int iE = s0cVar.e() + s0cVar.A();
                do {
                    r2cVar.i(s0cVar.r());
                } while (s0cVar.e() < iE);
                u(iE);
                return;
            }
            do {
                r2cVar.i(s0cVar.r());
                if (s0cVar.d()) {
                    return;
                } else {
                    iL2 = s0cVar.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    ny1.a();
                    return;
                }
                int iE2 = s0cVar.e() + s0cVar.A();
                do {
                    i2cVar.add(Long.valueOf(s0cVar.r()));
                } while (s0cVar.e() < iE2);
                u(iE2);
                return;
            }
            do {
                i2cVar.add(Long.valueOf(s0cVar.r()));
                if (s0cVar.d()) {
                    return;
                } else {
                    iL = s0cVar.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public final void b(i2c i2cVar) throws k2c {
        int iL;
        int iL2;
        boolean z = i2cVar instanceof v1c;
        int i = this.b;
        s0c s0cVar = this.a;
        if (z) {
            v1c v1cVar = (v1c) i2cVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    ny1.a();
                    return;
                }
                int iE = s0cVar.e() + s0cVar.A();
                do {
                    v1cVar.i(s0cVar.s());
                } while (s0cVar.e() < iE);
                u(iE);
                return;
            }
            do {
                v1cVar.i(s0cVar.s());
                if (s0cVar.d()) {
                    return;
                } else {
                    iL2 = s0cVar.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    ny1.a();
                    return;
                }
                int iE2 = s0cVar.e() + s0cVar.A();
                do {
                    i2cVar.add(Integer.valueOf(s0cVar.s()));
                } while (s0cVar.e() < iE2);
                u(iE2);
                return;
            }
            do {
                i2cVar.add(Integer.valueOf(s0cVar.s()));
                if (s0cVar.d()) {
                    return;
                } else {
                    iL = s0cVar.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public final void c(i2c i2cVar) throws k2c {
        int iL;
        int iL2;
        boolean z = i2cVar instanceof r2c;
        int i = this.b;
        s0c s0cVar = this.a;
        if (z) {
            r2c r2cVar = (r2c) i2cVar;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    ny1.a();
                    return;
                }
                int iA = s0cVar.A();
                w(iA);
                int iE = s0cVar.e() + iA;
                do {
                    r2cVar.i(s0cVar.t());
                } while (s0cVar.e() < iE);
                return;
            }
            do {
                r2cVar.i(s0cVar.t());
                if (s0cVar.d()) {
                    return;
                } else {
                    iL2 = s0cVar.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    ny1.a();
                    return;
                }
                int iA2 = s0cVar.A();
                w(iA2);
                int iE2 = s0cVar.e() + iA2;
                do {
                    i2cVar.add(Long.valueOf(s0cVar.t()));
                } while (s0cVar.e() < iE2);
                return;
            }
            do {
                i2cVar.add(Long.valueOf(s0cVar.t()));
                if (s0cVar.d()) {
                    return;
                } else {
                    iL = s0cVar.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public final void d(i2c i2cVar) throws k2c {
        int iL;
        int iL2;
        boolean z = i2cVar instanceof v1c;
        int i = this.b;
        s0c s0cVar = this.a;
        if (z) {
            v1c v1cVar = (v1c) i2cVar;
            int i2 = i & 7;
            if (i2 == 2) {
                int iA = s0cVar.A();
                v(iA);
                int iE = s0cVar.e() + iA;
                do {
                    v1cVar.i(s0cVar.u());
                } while (s0cVar.e() < iE);
                return;
            }
            if (i2 != 5) {
                ny1.a();
                return;
            }
            do {
                v1cVar.i(s0cVar.u());
                if (s0cVar.d()) {
                    return;
                } else {
                    iL2 = s0cVar.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iA2 = s0cVar.A();
                v(iA2);
                int iE2 = s0cVar.e() + iA2;
                do {
                    i2cVar.add(Integer.valueOf(s0cVar.u()));
                } while (s0cVar.e() < iE2);
                return;
            }
            if (i3 != 5) {
                ny1.a();
                return;
            }
            do {
                i2cVar.add(Integer.valueOf(s0cVar.u()));
                if (s0cVar.d()) {
                    return;
                } else {
                    iL = s0cVar.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public final void e(i2c i2cVar) throws k2c {
        int iL;
        int iL2;
        boolean z = i2cVar instanceof k0c;
        int i = this.b;
        s0c s0cVar = this.a;
        if (z) {
            k0c k0cVar = (k0c) i2cVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    ny1.a();
                    return;
                }
                int iE = s0cVar.e() + s0cVar.A();
                do {
                    k0cVar.e(s0cVar.v());
                } while (s0cVar.e() < iE);
                u(iE);
                return;
            }
            do {
                k0cVar.e(s0cVar.v());
                if (s0cVar.d()) {
                    return;
                } else {
                    iL2 = s0cVar.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    ny1.a();
                    return;
                }
                int iE2 = s0cVar.e() + s0cVar.A();
                do {
                    i2cVar.add(Boolean.valueOf(s0cVar.v()));
                } while (s0cVar.e() < iE2);
                u(iE2);
                return;
            }
            do {
                i2cVar.add(Boolean.valueOf(s0cVar.v()));
                if (s0cVar.d()) {
                    return;
                } else {
                    iL = s0cVar.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public final void f(i2c i2cVar, boolean z) throws j2c {
        String strW;
        int iL;
        int iL2;
        if ((this.b & 7) != 2) {
            ny1.a();
            return;
        }
        boolean z2 = i2cVar instanceof p2c;
        s0c s0cVar = this.a;
        if (z2 && !z) {
            p2c p2cVar = (p2c) i2cVar;
            do {
                y();
                p2cVar.b();
                if (s0cVar.d()) {
                    return;
                } else {
                    iL2 = s0cVar.l();
                }
            } while (iL2 == this.b);
        } else {
            do {
                if (z) {
                    q(2);
                    strW = s0cVar.x();
                } else {
                    q(2);
                    strW = s0cVar.w();
                }
                i2cVar.add(strW);
                if (s0cVar.d()) {
                    return;
                } else {
                    iL = s0cVar.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public final void g(i2c i2cVar, t3c t3cVar, f1c f1cVar) throws k2c {
        int iL;
        int i = this.b;
        if ((i & 7) != 2) {
            ny1.a();
            return;
        }
        do {
            u1c u1cVarA = t3cVar.a();
            r(u1cVarA, t3cVar, f1cVar);
            t3cVar.f(u1cVarA);
            i2cVar.add(u1cVarA);
            s0c s0cVar = this.a;
            if (s0cVar.d() || this.d != 0) {
                return;
            } else {
                iL = s0cVar.l();
            }
        } while (iL == i);
        this.d = iL;
    }

    @Deprecated
    public final void h(i2c i2cVar, t3c t3cVar, f1c f1cVar) throws j2c {
        int iL;
        int i = this.b;
        if ((i & 7) != 3) {
            ny1.a();
            return;
        }
        do {
            u1c u1cVarA = t3cVar.a();
            s(u1cVarA, t3cVar, f1cVar);
            t3cVar.f(u1cVarA);
            i2cVar.add(u1cVarA);
            s0c s0cVar = this.a;
            if (s0cVar.d() || this.d != 0) {
                return;
            } else {
                iL = s0cVar.l();
            }
        } while (iL == i);
        this.d = iL;
    }

    public final void i(i2c i2cVar) throws j2c {
        int iL;
        if ((this.b & 7) != 2) {
            ny1.a();
            return;
        }
        do {
            i2cVar.add(y());
            s0c s0cVar = this.a;
            if (s0cVar.d()) {
                return;
            } else {
                iL = s0cVar.l();
            }
        } while (iL == this.b);
        this.d = iL;
    }

    public final void j(i2c i2cVar) throws k2c {
        int iL;
        int iL2;
        boolean z = i2cVar instanceof v1c;
        int i = this.b;
        s0c s0cVar = this.a;
        if (z) {
            v1c v1cVar = (v1c) i2cVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    ny1.a();
                    return;
                }
                int iE = s0cVar.e() + s0cVar.A();
                do {
                    v1cVar.i(s0cVar.A());
                } while (s0cVar.e() < iE);
                u(iE);
                return;
            }
            do {
                v1cVar.i(s0cVar.A());
                if (s0cVar.d()) {
                    return;
                } else {
                    iL2 = s0cVar.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    ny1.a();
                    return;
                }
                int iE2 = s0cVar.e() + s0cVar.A();
                do {
                    i2cVar.add(Integer.valueOf(s0cVar.A()));
                } while (s0cVar.e() < iE2);
                u(iE2);
                return;
            }
            do {
                i2cVar.add(Integer.valueOf(s0cVar.A()));
                if (s0cVar.d()) {
                    return;
                } else {
                    iL = s0cVar.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public final void k(i2c i2cVar) throws k2c {
        int iL;
        int iL2;
        boolean z = i2cVar instanceof v1c;
        int i = this.b;
        s0c s0cVar = this.a;
        if (z) {
            v1c v1cVar = (v1c) i2cVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    ny1.a();
                    return;
                }
                int iE = s0cVar.e() + s0cVar.A();
                do {
                    v1cVar.i(s0cVar.B());
                } while (s0cVar.e() < iE);
                u(iE);
                return;
            }
            do {
                v1cVar.i(s0cVar.B());
                if (s0cVar.d()) {
                    return;
                } else {
                    iL2 = s0cVar.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    ny1.a();
                    return;
                }
                int iE2 = s0cVar.e() + s0cVar.A();
                do {
                    i2cVar.add(Integer.valueOf(s0cVar.B()));
                } while (s0cVar.e() < iE2);
                u(iE2);
                return;
            }
            do {
                i2cVar.add(Integer.valueOf(s0cVar.B()));
                if (s0cVar.d()) {
                    return;
                } else {
                    iL = s0cVar.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public final void l(i2c i2cVar) throws k2c {
        int iL;
        int iL2;
        boolean z = i2cVar instanceof v1c;
        int i = this.b;
        s0c s0cVar = this.a;
        if (z) {
            v1c v1cVar = (v1c) i2cVar;
            int i2 = i & 7;
            if (i2 == 2) {
                int iA = s0cVar.A();
                v(iA);
                int iE = s0cVar.e() + iA;
                do {
                    v1cVar.i(s0cVar.C());
                } while (s0cVar.e() < iE);
                return;
            }
            if (i2 != 5) {
                ny1.a();
                return;
            }
            do {
                v1cVar.i(s0cVar.C());
                if (s0cVar.d()) {
                    return;
                } else {
                    iL2 = s0cVar.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iA2 = s0cVar.A();
                v(iA2);
                int iE2 = s0cVar.e() + iA2;
                do {
                    i2cVar.add(Integer.valueOf(s0cVar.C()));
                } while (s0cVar.e() < iE2);
                return;
            }
            if (i3 != 5) {
                ny1.a();
                return;
            }
            do {
                i2cVar.add(Integer.valueOf(s0cVar.C()));
                if (s0cVar.d()) {
                    return;
                } else {
                    iL = s0cVar.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public final void m(i2c i2cVar) throws k2c {
        int iL;
        int iL2;
        boolean z = i2cVar instanceof r2c;
        int i = this.b;
        s0c s0cVar = this.a;
        if (z) {
            r2c r2cVar = (r2c) i2cVar;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    ny1.a();
                    return;
                }
                int iA = s0cVar.A();
                w(iA);
                int iE = s0cVar.e() + iA;
                do {
                    r2cVar.i(s0cVar.D());
                } while (s0cVar.e() < iE);
                return;
            }
            do {
                r2cVar.i(s0cVar.D());
                if (s0cVar.d()) {
                    return;
                } else {
                    iL2 = s0cVar.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    ny1.a();
                    return;
                }
                int iA2 = s0cVar.A();
                w(iA2);
                int iE2 = s0cVar.e() + iA2;
                do {
                    i2cVar.add(Long.valueOf(s0cVar.D()));
                } while (s0cVar.e() < iE2);
                return;
            }
            do {
                i2cVar.add(Long.valueOf(s0cVar.D()));
                if (s0cVar.d()) {
                    return;
                } else {
                    iL = s0cVar.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public final void n(i2c i2cVar) throws k2c {
        int iL;
        int iL2;
        boolean z = i2cVar instanceof v1c;
        int i = this.b;
        s0c s0cVar = this.a;
        if (z) {
            v1c v1cVar = (v1c) i2cVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    ny1.a();
                    return;
                }
                int iE = s0cVar.e() + s0cVar.A();
                do {
                    v1cVar.i(s0cVar.E());
                } while (s0cVar.e() < iE);
                u(iE);
                return;
            }
            do {
                v1cVar.i(s0cVar.E());
                if (s0cVar.d()) {
                    return;
                } else {
                    iL2 = s0cVar.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    ny1.a();
                    return;
                }
                int iE2 = s0cVar.e() + s0cVar.A();
                do {
                    i2cVar.add(Integer.valueOf(s0cVar.E()));
                } while (s0cVar.e() < iE2);
                u(iE2);
                return;
            }
            do {
                i2cVar.add(Integer.valueOf(s0cVar.E()));
                if (s0cVar.d()) {
                    return;
                } else {
                    iL = s0cVar.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public final void o(i2c i2cVar) throws k2c {
        int iL;
        int iL2;
        boolean z = i2cVar instanceof r2c;
        int i = this.b;
        s0c s0cVar = this.a;
        if (z) {
            r2c r2cVar = (r2c) i2cVar;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    ny1.a();
                    return;
                }
                int iE = s0cVar.e() + s0cVar.A();
                do {
                    r2cVar.i(s0cVar.F());
                } while (s0cVar.e() < iE);
                u(iE);
                return;
            }
            do {
                r2cVar.i(s0cVar.F());
                if (s0cVar.d()) {
                    return;
                } else {
                    iL2 = s0cVar.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    ny1.a();
                    return;
                }
                int iE2 = s0cVar.e() + s0cVar.A();
                do {
                    i2cVar.add(Long.valueOf(s0cVar.F()));
                } while (s0cVar.e() < iE2);
                u(iE2);
                return;
            }
            do {
                i2cVar.add(Long.valueOf(s0cVar.F()));
                if (s0cVar.d()) {
                    return;
                } else {
                    iL = s0cVar.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }

    public final void p(w2c w2cVar, u2c u2cVar, f1c f1cVar) throws j2c {
        int i;
        int i2;
        q(2);
        s0c s0cVar = this.a;
        int iA = s0cVar.a(s0cVar.A());
        Object obj = u2cVar.c;
        Object objT = BuildConfig.FLAVOR;
        Object objT2 = obj;
        while (true) {
            try {
                int iX = x();
                if (iX == Integer.MAX_VALUE || s0cVar.d()) {
                    break;
                }
                boolean zN = false;
                if (iX == 1) {
                    objT = t(u2cVar.a, null, null);
                } else if (iX != 2) {
                    try {
                        if (!((s0cVar.d() || (i2 = this.b) == this.c) ? false : s0cVar.n(i2))) {
                            throw new k2c("Unable to parse map entry.");
                        }
                    } catch (j2c e) {
                        if (!s0cVar.d() && (i = this.b) != this.c) {
                            zN = s0cVar.n(i);
                        }
                        if (!zN) {
                            throw new k2c("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objT2 = t(u2cVar.b, obj.getClass(), f1cVar);
                }
            } catch (Throwable th) {
                s0cVar.b(iA);
                throw th;
            }
        }
        w2cVar.put(objT, objT2);
        s0cVar.b(iA);
    }

    public final void q(int i) throws j2c {
        if ((this.b & 7) == i) {
            return;
        }
        ny1.a();
    }

    public final void r(Object obj, t3c t3cVar, f1c f1cVar) throws k2c {
        s0c s0cVar = this.a;
        int iA = s0cVar.A();
        if (s0cVar.a + s0cVar.b >= 100) {
            ao2.b("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int iA2 = s0cVar.a(iA);
        s0cVar.a++;
        t3cVar.i(obj, this, f1cVar);
        s0cVar.m(0);
        s0cVar.a--;
        s0cVar.b(iA2);
    }

    public final void s(Object obj, t3c t3cVar, f1c f1cVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            t3cVar.i(obj, this, f1cVar);
            if (this.b != this.c) {
                throw new k2c("Failed to parse the message.");
            }
            this.c = i;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public final Object t(p4c p4cVar, Class cls, f1c f1cVar) throws k2c {
        p4c p4cVar2 = p4c.v;
        int iOrdinal = p4cVar.ordinal();
        s0c s0cVar = this.a;
        switch (iOrdinal) {
            case 0:
                q(1);
                return Double.valueOf(s0cVar.o());
            case 1:
                q(5);
                return Float.valueOf(s0cVar.p());
            case 2:
                q(0);
                return Long.valueOf(s0cVar.r());
            case 3:
                q(0);
                return Long.valueOf(s0cVar.q());
            case 4:
                q(0);
                return Integer.valueOf(s0cVar.s());
            case 5:
                q(1);
                return Long.valueOf(s0cVar.t());
            case 6:
                q(5);
                return Integer.valueOf(s0cVar.u());
            case 7:
                q(0);
                return Boolean.valueOf(s0cVar.v());
            case 8:
                q(2);
                return s0cVar.x();
            case 9:
            default:
                z90.a("unsupported field type.");
                return null;
            case 10:
                q(2);
                t3c t3cVarA = q3c.c.a(cls);
                u1c u1cVarA = t3cVarA.a();
                r(u1cVarA, t3cVarA, f1cVar);
                t3cVarA.f(u1cVarA);
                return u1cVarA;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return y();
            case 12:
                q(0);
                return Integer.valueOf(s0cVar.A());
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                q(0);
                return Integer.valueOf(s0cVar.B());
            case 14:
                q(5);
                return Integer.valueOf(s0cVar.C());
            case h4c.e /* 15 */:
                q(1);
                return Long.valueOf(s0cVar.D());
            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                q(0);
                return Integer.valueOf(s0cVar.E());
            case 17:
                q(0);
                return Long.valueOf(s0cVar.F());
        }
    }

    public final void u(int i) throws k2c {
        if (this.a.e() == i) {
            return;
        }
        ao2.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final int x() {
        int iL = this.d;
        if (iL != 0) {
            this.b = iL;
            this.d = 0;
        } else {
            iL = this.a.l();
            this.b = iL;
        }
        if (iL == 0 || iL == this.c) {
            return Integer.MAX_VALUE;
        }
        return iL >>> 3;
    }

    public final p0c y() throws j2c {
        q(2);
        return this.a.y();
    }

    public final void z(i2c i2cVar) throws k2c {
        int iL;
        int iL2;
        boolean z = i2cVar instanceof d1c;
        int i = this.b;
        s0c s0cVar = this.a;
        if (z) {
            d1c d1cVar = (d1c) i2cVar;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    ny1.a();
                    return;
                }
                int iA = s0cVar.A();
                w(iA);
                int iE = s0cVar.e() + iA;
                do {
                    d1cVar.e(s0cVar.o());
                } while (s0cVar.e() < iE);
                return;
            }
            do {
                d1cVar.e(s0cVar.o());
                if (s0cVar.d()) {
                    return;
                } else {
                    iL2 = s0cVar.l();
                }
            } while (iL2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    ny1.a();
                    return;
                }
                int iA2 = s0cVar.A();
                w(iA2);
                int iE2 = s0cVar.e() + iA2;
                do {
                    i2cVar.add(Double.valueOf(s0cVar.o()));
                } while (s0cVar.e() < iE2);
                return;
            }
            do {
                i2cVar.add(Double.valueOf(s0cVar.o()));
                if (s0cVar.d()) {
                    return;
                } else {
                    iL = s0cVar.l();
                }
            } while (iL == this.b);
            iL2 = iL;
        }
        this.d = iL2;
    }
}
