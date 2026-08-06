package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dmb implements by2 {
    public int a;
    public vx1 b;
    public yy8 c;
    public vx1.a d;
    public final t03 e = new t03(this);
    public int f = 0;
    public boolean g = false;
    public final fy2 h = new fy2(this);
    public final fy2 i = new fy2(this);
    public a j = a.t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final a u;
        public static final /* synthetic */ a[] v;

        static {
            a aVar = new a("NONE", 0);
            t = aVar;
            a aVar2 = new a("START", 1);
            a aVar3 = new a("END", 2);
            a aVar4 = new a("CENTER", 3);
            u = aVar4;
            v = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) v.clone();
        }
    }

    public dmb(vx1 vx1Var) {
        this.b = vx1Var;
    }

    public static void b(fy2 fy2Var, fy2 fy2Var2, int i) {
        fy2Var.l.add(fy2Var2);
        fy2Var.f = i;
        fy2Var2.k.add(fy2Var);
    }

    public static fy2 h(sx1 sx1Var) {
        sx1 sx1Var2 = sx1Var.f;
        if (sx1Var2 == null) {
            return null;
        }
        vx1 vx1Var = sx1Var2.d;
        int iOrdinal = sx1Var2.e.ordinal();
        if (iOrdinal == 1) {
            return vx1Var.d.h;
        }
        if (iOrdinal == 2) {
            return vx1Var.e.h;
        }
        if (iOrdinal == 3) {
            return vx1Var.d.i;
        }
        if (iOrdinal == 4) {
            return vx1Var.e.i;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return vx1Var.e.k;
    }

    public static fy2 i(sx1 sx1Var, int i) {
        sx1 sx1Var2 = sx1Var.f;
        if (sx1Var2 == null) {
            return null;
        }
        vx1 vx1Var = sx1Var2.d;
        dmb dmbVar = i == 0 ? vx1Var.d : vx1Var.e;
        int iOrdinal = sx1Var2.e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return dmbVar.h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return dmbVar.i;
        }
        return null;
    }

    public final void c(fy2 fy2Var, fy2 fy2Var2, int i, t03 t03Var) {
        fy2Var.l.add(fy2Var2);
        fy2Var.l.add(this.e);
        fy2Var.h = i;
        fy2Var.i = t03Var;
        fy2Var2.k.add(fy2Var);
        t03Var.k.add(fy2Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        vx1 vx1Var = this.b;
        if (i2 == 0) {
            int i3 = vx1Var.v;
            int iMax = Math.max(vx1Var.u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = vx1Var.y;
            int iMax2 = Math.max(vx1Var.x, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        t03 t03Var = this.e;
        if (t03Var.j) {
            return t03Var.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    public final void l(sx1 sx1Var, sx1 sx1Var2, int i) {
        t03 t03Var;
        float f;
        int i2;
        int i3;
        fy2 fy2VarH = h(sx1Var);
        fy2 fy2VarH2 = h(sx1Var2);
        if (fy2VarH.j && fy2VarH2.j) {
            int iD = sx1Var.d() + fy2VarH.g;
            int iD2 = fy2VarH2.g - sx1Var2.d();
            int i4 = iD2 - iD;
            t03 t03Var2 = this.e;
            if (!t03Var2.j) {
                vx1.a aVar = this.d;
                vx1.a aVar2 = vx1.a.v;
                if (aVar == aVar2) {
                    int i5 = this.a;
                    if (i5 == 0) {
                        t03Var2.d(g(i4, i));
                    } else if (i5 == 1) {
                        t03Var2.d(Math.min(g(t03Var2.m, i), i4));
                    } else if (i5 == 2) {
                        vx1 vx1Var = this.b;
                        vx1 vx1Var2 = vx1Var.V;
                        if (vx1Var2 != null) {
                            t03 t03Var3 = (i == 0 ? vx1Var2.d : vx1Var2.e).e;
                            if (t03Var3.j) {
                                t03Var2.d(g((int) ((t03Var3.g * (i == 0 ? vx1Var.w : vx1Var.z)) + 0.5f), i));
                            }
                        }
                    } else if (i5 == 3) {
                        vx1 vx1Var3 = this.b;
                        dmb dmbVar = vx1Var3.d;
                        if (dmbVar.d == aVar2 && dmbVar.a == 3) {
                            meb mebVar = vx1Var3.e;
                            if (mebVar.d != aVar2 || mebVar.a != 3) {
                                if (i == 0) {
                                    dmbVar = vx1Var3.e;
                                }
                                t03Var = dmbVar.e;
                                if (t03Var.j) {
                                    f = vx1Var3.Y;
                                    i2 = t03Var.g;
                                    if (i == 1) {
                                        i3 = (int) ((i2 / f) + 0.5f);
                                    } else {
                                        i3 = (int) ((f * i2) + 0.5f);
                                    }
                                    t03Var2.d(i3);
                                }
                            }
                        } else {
                            if (i == 0) {
                                dmbVar = vx1Var3.e;
                            }
                            t03Var = dmbVar.e;
                            if (t03Var.j) {
                                f = vx1Var3.Y;
                                i2 = t03Var.g;
                                if (i == 1) {
                                    i3 = (int) ((i2 / f) + 0.5f);
                                } else {
                                    i3 = (int) ((f * i2) + 0.5f);
                                }
                                t03Var2.d(i3);
                            }
                        }
                    }
                }
            }
            if (t03Var2.j) {
                int i6 = t03Var2.g;
                fy2 fy2Var = this.i;
                fy2 fy2Var2 = this.h;
                if (i6 == i4) {
                    fy2Var2.d(iD);
                    fy2Var.d(iD2);
                    return;
                }
                vx1 vx1Var4 = this.b;
                float f2 = i == 0 ? vx1Var4.f0 : vx1Var4.g0;
                if (fy2VarH == fy2VarH2) {
                    iD = fy2VarH.g;
                    iD2 = fy2VarH2.g;
                    f2 = 0.5f;
                }
                fy2Var2.d((int) ((((iD2 - iD) - i6) * f2) + iD + 0.5f));
                fy2Var.d(fy2Var2.g + t03Var2.g);
            }
        }
    }

    @Override // defpackage.by2
    public void a(by2 by2Var) {
    }
}
