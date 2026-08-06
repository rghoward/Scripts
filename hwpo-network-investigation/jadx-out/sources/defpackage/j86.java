package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import q98.b;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j86 {
    public static boolean q = false;
    public final q98 d;
    public final m01 m;
    public q30 p;
    public int a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public bw9[] n = new bw9[1000];
    public int o = 0;
    public q30[] g = new q30[32];

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        bw9 a(boolean[] zArr);
    }

    public j86() {
        s();
        m01 m01Var = new m01();
        m01Var.a = new y58();
        m01Var.b = new y58();
        m01Var.c = new bw9[32];
        this.m = m01Var;
        q98 q98Var = new q98(m01Var);
        q98Var.f = new bw9[128];
        q98Var.g = new bw9[128];
        q98Var.h = 0;
        q98Var.i = q98Var.new b();
        this.d = q98Var;
        this.p = new q30(m01Var);
    }

    public static int n(Object obj) {
        bw9 bw9Var = ((sx1) obj).i;
        if (bw9Var != null) {
            return (int) (bw9Var.x + 0.5f);
        }
        return 0;
    }

    public final bw9 a(bw9.a aVar) {
        y58 y58Var = (y58) this.m.b;
        int i = y58Var.b;
        Object obj = null;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = y58Var.a;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            y58Var.b = i2;
            obj = obj2;
        }
        bw9 bw9Var = (bw9) obj;
        if (bw9Var == null) {
            bw9Var = new bw9(aVar);
            bw9Var.B = aVar;
        } else {
            bw9Var.f();
            bw9Var.B = aVar;
        }
        int i3 = this.o;
        int i4 = this.a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.a = i5;
            this.n = (bw9[]) Arrays.copyOf(this.n, i5);
        }
        bw9[] bw9VarArr = this.n;
        int i6 = this.o;
        this.o = i6 + 1;
        bw9VarArr[i6] = bw9Var;
        return bw9Var;
    }

    public final void b(bw9 bw9Var, bw9 bw9Var2, int i, float f, bw9 bw9Var3, bw9 bw9Var4, int i2, int i3) {
        q30 q30VarL = l();
        if (bw9Var2 == bw9Var3) {
            q30VarL.d.k(bw9Var, 1.0f);
            q30VarL.d.k(bw9Var4, 1.0f);
            q30VarL.d.k(bw9Var2, -2.0f);
        } else {
            q30.a aVar = q30VarL.d;
            if (f == 0.5f) {
                aVar.k(bw9Var, 1.0f);
                q30VarL.d.k(bw9Var2, -1.0f);
                q30VarL.d.k(bw9Var3, -1.0f);
                q30VarL.d.k(bw9Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    q30VarL.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                aVar.k(bw9Var, -1.0f);
                q30VarL.d.k(bw9Var2, 1.0f);
                q30VarL.b = i;
            } else if (f >= 1.0f) {
                aVar.k(bw9Var4, -1.0f);
                q30VarL.d.k(bw9Var3, 1.0f);
                q30VarL.b = -i2;
            } else {
                float f2 = 1.0f - f;
                aVar.k(bw9Var, f2 * 1.0f);
                q30VarL.d.k(bw9Var2, f2 * (-1.0f));
                q30VarL.d.k(bw9Var3, (-1.0f) * f);
                q30VarL.d.k(bw9Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    q30VarL.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            q30VarL.b(this, i3);
        }
        c(q30VarL);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x019b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e3  */
    public final void c(q30 q30Var) {
        boolean z;
        bw9.a aVar;
        boolean z2;
        bw9 bw9VarF;
        boolean z3 = true;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f) {
            o();
        }
        if (q30Var.e) {
            z = false;
        } else {
            ArrayList<bw9> arrayList = q30Var.c;
            if (this.g.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int iC = q30Var.d.c();
                    for (int i = 0; i < iC; i++) {
                        bw9 bw9VarD = q30Var.d.d(i);
                        if (bw9VarD.v != -1 || bw9VarD.y) {
                            arrayList.add(bw9VarD);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            bw9 bw9Var = arrayList.get(i2);
                            if (bw9Var.y) {
                                q30Var.h(this, bw9Var, true);
                            } else {
                                q30Var.i(this, this.g[bw9Var.v], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (q30Var.a != null && q30Var.d.c() == 0) {
                    q30Var.e = true;
                    this.b = true;
                }
            }
            if (q30Var.e()) {
                return;
            }
            float f = q30Var.b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                q30Var.b = f * (-1.0f);
                q30Var.d.f();
            }
            int iC2 = q30Var.d.c();
            float f3 = 0.0f;
            float f4 = 0.0f;
            bw9 bw9Var2 = null;
            bw9 bw9Var3 = null;
            int i3 = 0;
            boolean z5 = false;
            boolean z6 = false;
            while (true) {
                aVar = bw9.a.t;
                if (i3 >= iC2) {
                    break;
                }
                float fG = q30Var.d.g(i3);
                float f5 = f2;
                bw9 bw9VarD2 = q30Var.d.d(i3);
                if (bw9VarD2.B == aVar) {
                    if (bw9Var2 == null) {
                        if (bw9VarD2.E <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        f3 = fG;
                        bw9Var2 = bw9VarD2;
                    } else {
                        if (f3 > fG) {
                            if (bw9VarD2.E > 1) {
                                z5 = false;
                            }
                            f3 = fG;
                            bw9Var2 = bw9VarD2;
                        } else if (z5 || bw9VarD2.E > 1) {
                        }
                        z5 = true;
                        f3 = fG;
                        bw9Var2 = bw9VarD2;
                    }
                } else if (bw9Var2 == null && fG < f5) {
                    if (bw9Var3 == null) {
                        if (bw9VarD2.E <= 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        f4 = fG;
                        bw9Var3 = bw9VarD2;
                    } else {
                        if (f4 > fG) {
                            if (bw9VarD2.E > 1) {
                                z6 = false;
                            }
                            f4 = fG;
                            bw9Var3 = bw9VarD2;
                        } else if (z6 || bw9VarD2.E > 1) {
                        }
                        z6 = true;
                        f4 = fG;
                        bw9Var3 = bw9VarD2;
                    }
                }
                i3++;
                f2 = f5;
            }
            float f6 = f2;
            if (bw9Var2 == null) {
                bw9Var2 = bw9Var3;
            }
            if (bw9Var2 == null) {
                z2 = true;
            } else {
                q30Var.g(bw9Var2);
                z2 = false;
            }
            if (q30Var.d.c() == 0) {
                q30Var.e = true;
            }
            if (z2) {
                if (this.j + 1 >= this.f) {
                    o();
                }
                bw9 bw9VarA = a(bw9.a.u);
                int i4 = this.c + 1;
                this.c = i4;
                this.j++;
                bw9VarA.u = i4;
                m01 m01Var = this.m;
                ((bw9[]) m01Var.c)[i4] = bw9VarA;
                q30Var.a = bw9VarA;
                int i5 = this.k;
                h(q30Var);
                if (this.k == i5 + 1) {
                    q30 q30Var2 = this.p;
                    q30Var2.a = null;
                    q30Var2.d.clear();
                    for (int i6 = 0; i6 < q30Var.d.c(); i6++) {
                        q30Var2.d.e(q30Var.d.d(i6), q30Var.d.g(i6), true);
                    }
                    r(this.p);
                    if (bw9VarA.v == -1) {
                        if (q30Var.a == bw9VarA && (bw9VarF = q30Var.f(null, bw9VarA)) != null) {
                            q30Var.g(bw9VarF);
                        }
                        if (!q30Var.e) {
                            q30Var.a.h(this, q30Var);
                        }
                        ((y58) m01Var.a).a(q30Var);
                        this.k--;
                    }
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            bw9 bw9Var4 = q30Var.a;
            if (bw9Var4 == null) {
                return;
            }
            if (bw9Var4.B != aVar && q30Var.b < f6) {
                return;
            } else {
                z = z3;
            }
        }
        if (z) {
            return;
        }
        h(q30Var);
    }

    public final void d(bw9 bw9Var, int i) {
        int i2 = bw9Var.v;
        if (i2 == -1) {
            bw9Var.g(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                bw9 bw9Var2 = ((bw9[]) this.m.c)[i3];
            }
            return;
        }
        if (i2 == -1) {
            q30 q30VarL = l();
            q30VarL.a = bw9Var;
            float f = i;
            bw9Var.x = f;
            q30VarL.b = f;
            q30VarL.e = true;
            c(q30VarL);
            return;
        }
        q30 q30Var = this.g[i2];
        if (q30Var.e) {
            q30Var.b = i;
            return;
        }
        if (q30Var.d.c() == 0) {
            q30Var.e = true;
            q30Var.b = i;
            return;
        }
        q30 q30VarL2 = l();
        if (i < 0) {
            q30VarL2.b = i * (-1);
            q30VarL2.d.k(bw9Var, 1.0f);
        } else {
            q30VarL2.b = i;
            q30VarL2.d.k(bw9Var, -1.0f);
        }
        c(q30VarL2);
    }

    public final void e(bw9 bw9Var, bw9 bw9Var2, int i, int i2) {
        if (i2 == 8 && bw9Var2.y && bw9Var.v == -1) {
            bw9Var.g(this, bw9Var2.x + i);
            return;
        }
        q30 q30VarL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            q30VarL.b = i;
        }
        q30.a aVar = q30VarL.d;
        if (z) {
            aVar.k(bw9Var, 1.0f);
            q30VarL.d.k(bw9Var2, -1.0f);
        } else {
            aVar.k(bw9Var, -1.0f);
            q30VarL.d.k(bw9Var2, 1.0f);
        }
        if (i2 != 8) {
            q30VarL.b(this, i2);
        }
        c(q30VarL);
    }

    public final void f(bw9 bw9Var, bw9 bw9Var2, int i, int i2) {
        q30 q30VarL = l();
        bw9 bw9VarM = m();
        bw9VarM.w = 0;
        q30VarL.c(bw9Var, bw9Var2, bw9VarM, i);
        if (i2 != 8) {
            q30VarL.d.k(j(i2), (int) (q30VarL.d.a(bw9VarM) * (-1.0f)));
        }
        c(q30VarL);
    }

    public final void g(bw9 bw9Var, bw9 bw9Var2, int i, int i2) {
        q30 q30VarL = l();
        bw9 bw9VarM = m();
        bw9VarM.w = 0;
        q30VarL.d(bw9Var, bw9Var2, bw9VarM, i);
        if (i2 != 8) {
            q30VarL.d.k(j(i2), (int) (q30VarL.d.a(bw9VarM) * (-1.0f)));
        }
        c(q30VarL);
    }

    public final void h(q30 q30Var) {
        int i;
        if (q30Var.e) {
            q30Var.a.g(this, q30Var.b);
        } else {
            q30[] q30VarArr = this.g;
            int i2 = this.k;
            q30VarArr[i2] = q30Var;
            bw9 bw9Var = q30Var.a;
            bw9Var.v = i2;
            this.k = i2 + 1;
            bw9Var.h(this, q30Var);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                q30 q30Var2 = this.g[i3];
                if (q30Var2 != null && q30Var2.e) {
                    q30Var2.a.g(this, q30Var2.b);
                    ((y58) this.m.a).a(q30Var2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        q30[] q30VarArr2 = this.g;
                        int i6 = i4 - 1;
                        q30 q30Var3 = q30VarArr2[i4];
                        q30VarArr2[i6] = q30Var3;
                        bw9 bw9Var2 = q30Var3.a;
                        if (bw9Var2.v == i4) {
                            bw9Var2.v = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            q30 q30Var = this.g[i];
            q30Var.a.x = q30Var.b;
        }
    }

    public final bw9 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        bw9 bw9VarA = a(bw9.a.v);
        float[] fArr = bw9VarA.A;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        bw9VarA.u = i2;
        bw9VarA.w = i;
        ((bw9[]) this.m.c)[i2] = bw9VarA;
        q98 q98Var = this.d;
        q98Var.i.a = bw9VarA;
        Arrays.fill(fArr, 0.0f);
        fArr[bw9VarA.w] = 1.0f;
        q98Var.j(bw9VarA);
        return bw9VarA;
    }

    public final bw9 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof sx1)) {
            return null;
        }
        sx1 sx1Var = (sx1) obj;
        bw9 bw9Var = sx1Var.i;
        if (bw9Var == null) {
            sx1Var.h();
            bw9Var = sx1Var.i;
        }
        int i = bw9Var.u;
        m01 m01Var = this.m;
        if (i != -1 && i <= this.c && ((bw9[]) m01Var.c)[i] != null) {
            return bw9Var;
        }
        if (i != -1) {
            bw9Var.f();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        bw9Var.u = i2;
        bw9Var.B = bw9.a.t;
        ((bw9[]) m01Var.c)[i2] = bw9Var;
        return bw9Var;
    }

    public final q30 l() {
        Object obj;
        m01 m01Var = this.m;
        y58 y58Var = (y58) m01Var.a;
        int i = y58Var.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = y58Var.a;
            obj = objArr[i2];
            objArr[i2] = null;
            y58Var.b = i2;
        } else {
            obj = null;
        }
        q30 q30Var = (q30) obj;
        if (q30Var == null) {
            return new q30(m01Var);
        }
        q30Var.a = null;
        q30Var.d.clear();
        q30Var.b = 0.0f;
        q30Var.e = false;
        return q30Var;
    }

    public final bw9 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        bw9 bw9VarA = a(bw9.a.u);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        bw9VarA.u = i;
        ((bw9[]) this.m.c)[i] = bw9VarA;
        return bw9VarA;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (q30[]) Arrays.copyOf(this.g, i);
        m01 m01Var = this.m;
        m01Var.c = (bw9[]) Arrays.copyOf((bw9[]) m01Var.c, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        q98 q98Var = this.d;
        if (q98Var.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(q98Var);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(q98Var);
                return;
            }
        }
        i();
    }

    public final void q(q98 q98Var) {
        for (int i = 0; i < this.k; i++) {
            q30 q30Var = this.g[i];
            bw9.a aVar = q30Var.a.B;
            bw9.a aVar2 = bw9.a.t;
            if (aVar != aVar2) {
                float f = 0.0f;
                if (q30Var.b < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.k) {
                            q30 q30Var2 = this.g[i3];
                            if (q30Var2.a.B != aVar2 && !q30Var2.e && q30Var2.b < f) {
                                int iC = q30Var2.d.c();
                                int i7 = 0;
                                while (i7 < iC) {
                                    bw9 bw9VarD = q30Var2.d.d(i7);
                                    float f3 = f;
                                    float fA = q30Var2.d.a(bw9VarD);
                                    if (fA > f3) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f4 = bw9VarD.z[i8] / fA;
                                            if ((f4 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i5 = bw9VarD.u;
                                                i4 = i3;
                                                f2 = f4;
                                            }
                                        }
                                    }
                                    i7++;
                                    f = f3;
                                }
                            }
                            i3++;
                            f = f;
                        }
                        float f5 = f;
                        if (i4 != -1) {
                            q30 q30Var3 = this.g[i4];
                            q30Var3.a.v = -1;
                            q30Var3.g(((bw9[]) this.m.c)[i5]);
                            bw9 bw9Var = q30Var3.a;
                            bw9Var.v = i4;
                            bw9Var.h(this, q30Var3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.j / 2) {
                            z = true;
                        }
                        f = f5;
                    }
                    break;
                }
            }
        }
        r(q98Var);
        i();
    }

    public final void r(a aVar) {
        for (int i = 0; i < this.j; i++) {
            this.i[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.j * 2) {
                return;
            }
            if (((q30) aVar).a != null) {
                this.i[((q30) aVar).a.u] = true;
            }
            bw9 bw9VarA = aVar.a(this.i);
            if (bw9VarA != null) {
                boolean[] zArr = this.i;
                int i3 = bw9VarA.u;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (bw9VarA != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.k; i5++) {
                    q30 q30Var = this.g[i5];
                    if (q30Var.a.B != bw9.a.t && !q30Var.e && q30Var.d.b(bw9VarA)) {
                        float fA = q30Var.d.a(bw9VarA);
                        if (fA < 0.0f) {
                            float f2 = (-q30Var.b) / fA;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    q30 q30Var2 = this.g[i4];
                    q30Var2.a.v = -1;
                    q30Var2.g(bw9VarA);
                    bw9 bw9Var = q30Var2.a;
                    bw9Var.v = i4;
                    bw9Var.h(this, q30Var2);
                }
            } else {
                z = true;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            q30 q30Var = this.g[i];
            if (q30Var != null) {
                ((y58) this.m.a).a(q30Var);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        m01 m01Var;
        int i = 0;
        while (true) {
            m01Var = this.m;
            bw9[] bw9VarArr = (bw9[]) m01Var.c;
            if (i >= bw9VarArr.length) {
                break;
            }
            bw9 bw9Var = bw9VarArr[i];
            if (bw9Var != null) {
                bw9Var.f();
            }
            i++;
        }
        y58 y58Var = (y58) m01Var.b;
        bw9[] bw9VarArr2 = this.n;
        int length = this.o;
        y58Var.getClass();
        if (length > bw9VarArr2.length) {
            length = bw9VarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            bw9 bw9Var2 = bw9VarArr2[i2];
            int i3 = y58Var.b;
            Object[] objArr = y58Var.a;
            if (i3 < objArr.length) {
                objArr[i3] = bw9Var2;
                y58Var.b = i3 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((bw9[]) m01Var.c, (Object) null);
        this.c = 0;
        q98 q98Var = this.d;
        q98Var.h = 0;
        q98Var.b = 0.0f;
        this.j = 1;
        for (int i4 = 0; i4 < this.k; i4++) {
            q30 q30Var = this.g[i4];
        }
        s();
        this.k = 0;
        this.p = new q30(m01Var);
    }
}
