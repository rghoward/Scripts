package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q98 extends q30 {
    public bw9[] f;
    public bw9[] g;
    public int h;
    public b i;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Comparator<bw9> {
        @Override // java.util.Comparator
        public final int compare(bw9 bw9Var, bw9 bw9Var2) {
            return bw9Var.u - bw9Var2.u;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b {
        public bw9 a;

        public b() {
        }

        public final String toString() {
            String string = "[ ";
            if (this.a != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder sbA = bl2.a(string);
                    sbA.append(this.a.A[i]);
                    sbA.append(" ");
                    string = sbA.toString();
                }
            }
            StringBuilder sbB = tn2.b(string, "] ");
            sbB.append(this.a);
            return sbB.toString();
        }
    }

    @Override // defpackage.q30, j86.a
    public final bw9 a(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            bw9[] bw9VarArr = this.f;
            bw9 bw9Var = bw9VarArr[i2];
            if (!zArr[bw9Var.u]) {
                b bVar = this.i;
                bVar.a = bw9Var;
                int i3 = 8;
                if (i != -1) {
                    bw9 bw9Var2 = bw9VarArr[i];
                    while (i3 >= 0) {
                        float f = bw9Var2.A[i3];
                        float f2 = bVar.a.A[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = bVar.a.A[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.q30
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.q30
    public final void i(j86 j86Var, q30 q30Var, boolean z) {
        bw9 bw9Var = q30Var.a;
        if (bw9Var == null) {
            return;
        }
        float[] fArr = bw9Var.A;
        q30.a aVar = q30Var.d;
        int iC = aVar.c();
        for (int i = 0; i < iC; i++) {
            bw9 bw9VarD = aVar.d(i);
            float fG = aVar.g(i);
            b bVar = this.i;
            bVar.a = bw9VarD;
            if (bw9VarD.t) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = bVar.a.A;
                    float f = (fArr[i2] * fG) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        bVar.a.A[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    q98.this.k(bVar.a);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fG;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        bVar.a.A[i3] = f3;
                    } else {
                        bVar.a.A[i3] = 0.0f;
                    }
                }
                j(bw9VarD);
            }
            this.b = (q30Var.b * fG) + this.b;
        }
        k(bw9Var);
    }

    public final void j(bw9 bw9Var) {
        int i;
        bw9[] bw9VarArr;
        int i2 = this.h + 1;
        bw9[] bw9VarArr2 = this.f;
        if (i2 > bw9VarArr2.length) {
            bw9[] bw9VarArr3 = (bw9[]) Arrays.copyOf(bw9VarArr2, bw9VarArr2.length * 2);
            this.f = bw9VarArr3;
            this.g = (bw9[]) Arrays.copyOf(bw9VarArr3, bw9VarArr3.length * 2);
        }
        bw9[] bw9VarArr4 = this.f;
        int i3 = this.h;
        bw9VarArr4[i3] = bw9Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && bw9VarArr4[i3].u > bw9Var.u) {
            int i5 = 0;
            while (true) {
                i = this.h;
                bw9VarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                bw9VarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(bw9VarArr, 0, i, new a());
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        bw9Var.t = true;
        bw9Var.a(this);
    }

    public final void k(bw9 bw9Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == bw9Var) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        bw9Var.t = false;
                        return;
                    } else {
                        bw9[] bw9VarArr = this.f;
                        int i3 = i + 1;
                        bw9VarArr[i] = bw9VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.q30
    public final String toString() {
        b bVar = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            bVar.a = this.f[i];
            str = str + bVar + " ";
        }
        return str;
    }
}
