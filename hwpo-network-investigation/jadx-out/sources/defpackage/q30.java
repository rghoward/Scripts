package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class q30 implements j86.a {
    public final a d;
    public bw9 a = null;
    public float b = 0.0f;
    public final ArrayList<bw9> c = new ArrayList<>();
    public boolean e = false;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        float a(bw9 bw9Var);

        boolean b(bw9 bw9Var);

        int c();

        void clear();

        bw9 d(int i);

        void e(bw9 bw9Var, float f, boolean z);

        void f();

        float g(int i);

        float h(bw9 bw9Var, boolean z);

        float i(q30 q30Var, boolean z);

        void j(float f);

        void k(bw9 bw9Var, float f);
    }

    public q30(m01 m01Var) {
        this.d = new k30(this, m01Var);
    }

    @Override // j86.a
    public bw9 a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(j86 j86Var, int i) {
        bw9 bw9VarJ = j86Var.j(i);
        a aVar = this.d;
        aVar.k(bw9VarJ, 1.0f);
        aVar.k(j86Var.j(i), -1.0f);
    }

    public final void c(bw9 bw9Var, bw9 bw9Var2, bw9 bw9Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        a aVar = this.d;
        if (z) {
            aVar.k(bw9Var, 1.0f);
            aVar.k(bw9Var2, -1.0f);
            aVar.k(bw9Var3, -1.0f);
        } else {
            aVar.k(bw9Var, -1.0f);
            aVar.k(bw9Var2, 1.0f);
            aVar.k(bw9Var3, 1.0f);
        }
    }

    public final void d(bw9 bw9Var, bw9 bw9Var2, bw9 bw9Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        a aVar = this.d;
        if (z) {
            aVar.k(bw9Var, 1.0f);
            aVar.k(bw9Var2, -1.0f);
            aVar.k(bw9Var3, 1.0f);
        } else {
            aVar.k(bw9Var, -1.0f);
            aVar.k(bw9Var2, 1.0f);
            aVar.k(bw9Var3, -1.0f);
        }
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.c() == 0;
    }

    public final bw9 f(boolean[] zArr, bw9 bw9Var) {
        bw9.a aVar;
        a aVar2 = this.d;
        int iC = aVar2.c();
        bw9 bw9Var2 = null;
        float f = 0.0f;
        for (int i = 0; i < iC; i++) {
            float fG = aVar2.g(i);
            if (fG < 0.0f) {
                bw9 bw9VarD = aVar2.d(i);
                if ((zArr == null || !zArr[bw9VarD.u]) && bw9VarD != bw9Var && (((aVar = bw9VarD.B) == bw9.a.u || aVar == bw9.a.v) && fG < f)) {
                    f = fG;
                    bw9Var2 = bw9VarD;
                }
            }
        }
        return bw9Var2;
    }

    public final void g(bw9 bw9Var) {
        bw9 bw9Var2 = this.a;
        a aVar = this.d;
        if (bw9Var2 != null) {
            aVar.k(bw9Var2, -1.0f);
            this.a.v = -1;
            this.a = null;
        }
        float fH = aVar.h(bw9Var, true) * (-1.0f);
        this.a = bw9Var;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        aVar.j(fH);
    }

    public final void h(j86 j86Var, bw9 bw9Var, boolean z) {
        if (bw9Var.y) {
            a aVar = this.d;
            float fA = aVar.a(bw9Var);
            this.b = (bw9Var.x * fA) + this.b;
            aVar.h(bw9Var, z);
            if (z) {
                bw9Var.e(this);
            }
            if (aVar.c() == 0) {
                this.e = true;
                j86Var.b = true;
            }
        }
    }

    public void i(j86 j86Var, q30 q30Var, boolean z) {
        a aVar = this.d;
        float fI = aVar.i(q30Var, z);
        this.b = (q30Var.b * fI) + this.b;
        if (z) {
            q30Var.a.e(this);
        }
        if (this.a == null || aVar.c() != 0) {
            return;
        }
        this.e = true;
        j86Var.b = true;
    }

    public String toString() {
        boolean z;
        String strConcat = (this.a == null ? "0" : BuildConfig.FLAVOR + this.a).concat(" = ");
        if (this.b != 0.0f) {
            StringBuilder sbA = bl2.a(strConcat);
            sbA.append(this.b);
            strConcat = sbA.toString();
            z = true;
        } else {
            z = false;
        }
        a aVar = this.d;
        int iC = aVar.c();
        for (int i = 0; i < iC; i++) {
            bw9 bw9VarD = aVar.d(i);
            if (bw9VarD != null) {
                float fG = aVar.g(i);
                if (fG != 0.0f) {
                    String string = bw9VarD.toString();
                    if (z) {
                        if (fG > 0.0f) {
                            strConcat = strConcat.concat(" + ");
                        } else {
                            strConcat = strConcat.concat(" - ");
                            fG *= -1.0f;
                        }
                    } else if (fG < 0.0f) {
                        strConcat = strConcat.concat("- ");
                        fG *= -1.0f;
                    }
                    strConcat = fG == 1.0f ? strConcat.concat(string) : strConcat + fG + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }

    public q30() {
    }
}
