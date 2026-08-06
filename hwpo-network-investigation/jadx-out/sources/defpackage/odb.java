package defpackage;

import com.intercom.twig.BuildConfig;
import defpackage.fw;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class odb<V extends fw> implements idb<V> {
    public V A;
    public V B;
    public V C;
    public float[] D;
    public float[] E;
    public v20 F;
    public final d27 t;
    public final zf5<ndb<V>> u;
    public final int v;
    public final aa3 w;
    public int[] x = hdb.a;
    public float[] y;
    public V z;

    public odb(d27 d27Var, zf5 zf5Var, int i, aa3 aa3Var) {
        this.t = d27Var;
        this.u = zf5Var;
        this.v = i;
        this.w = aa3Var;
        float[] fArr = hdb.b;
        this.y = fArr;
        this.D = fArr;
        this.E = fArr;
        this.F = hdb.c;
    }

    public final float a(int i, boolean z, int i2) {
        aa3 aa3Var;
        float f;
        d27 d27Var = this.t;
        if (i >= d27Var.b - 1) {
            f = i2;
        } else {
            int iA = d27Var.a(i);
            int iA2 = d27Var.a(i + 1);
            if (i2 != iA) {
                int i3 = iA2 - iA;
                ndb<V> ndbVarB = this.u.b(iA);
                if (ndbVarB == null || (aa3Var = ndbVarB.b) == null) {
                    aa3Var = this.w;
                }
                float f2 = i3;
                float fA = aa3Var.a((i2 - iA) / f2);
                return z ? fA : ((f2 * fA) + iA) / 1000.0f;
            }
            f = iA;
        }
        return f / 1000.0f;
    }

    @Override // defpackage.idb
    public final int c() {
        return this.v;
    }

    @Override // defpackage.edb
    public final V e(long j, V v, V v2, V v3) {
        int i;
        long jA = hdb.a(this, j / 1000000);
        if (jA < 0) {
            return v3;
        }
        i(v, v2, v3);
        V v4 = this.A;
        v4.getClass();
        int i2 = 0;
        if (this.F != hdb.c) {
            int i3 = (int) jA;
            d27 d27Var = this.t;
            int i4 = d27Var.b;
            if (i4 <= 0) {
                r.b(BuildConfig.FLAVOR);
                return null;
            }
            int i5 = i4 - 1;
            int i6 = 0;
            while (true) {
                if (i6 > i5) {
                    i = -(i6 + 1);
                    break;
                }
                i = (i6 + i5) >>> 1;
                int i7 = d27Var.a[i];
                if (i7 >= i3) {
                    if (i7 <= i3) {
                        break;
                    }
                    i5 = i - 1;
                } else {
                    i6 = i + 1;
                }
            }
            if (i < -1) {
                i = -(i + 2);
            }
            float fA = a(i, false, i3);
            float[] fArr = this.E;
            v20.a[][] aVarArr = this.F.a;
            float f = aVarArr[0][0].a;
            float f2 = aVarArr[aVarArr.length - 1][0].b;
            if (fA < f) {
                fA = f;
            }
            if (fA <= f2) {
                f2 = fA;
            }
            int length = fArr.length;
            boolean z = false;
            for (v20.a[] aVarArr2 : aVarArr) {
                int i8 = 0;
                int i9 = 0;
                while (i8 < length - 1) {
                    v20.a aVar = aVarArr2[i9];
                    if (f2 <= aVar.b) {
                        if (aVar.p) {
                            fArr[i8] = aVar.q;
                            fArr[i8 + 1] = aVar.r;
                        } else {
                            aVar.c(f2);
                            fArr[i8] = aVar.a();
                            fArr[i8 + 1] = aVar.b();
                        }
                        z = true;
                    }
                    i8 += 2;
                    i9++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i2 < length2) {
                v4.e(fArr[i2], i2);
                i2++;
            }
        } else {
            fw fwVarG = g((jA - 1) * 1000000, v, v2, v3);
            fw fwVarG2 = g(jA * 1000000, v, v2, v3);
            int iB = fwVarG.b();
            while (i2 < iB) {
                v4.e((fwVarG.a(i2) - fwVarG2.a(i2)) * 1000.0f, i2);
                i2++;
            }
        }
        return v4;
    }

    @Override // defpackage.idb
    public final int f() {
        return 0;
    }

    @Override // defpackage.edb
    public final V g(long j, V v, V v2, V v3) {
        int i;
        V v4;
        V v5;
        int i2;
        V v6 = v;
        V v7 = v2;
        int iA = (int) hdb.a(this, j / 1000000);
        zf5<ndb<V>> zf5Var = this.u;
        ndb<V> ndbVarB = zf5Var.b(iA);
        if (ndbVarB != null) {
            return ndbVarB.a;
        }
        if (iA >= this.v) {
            return v7;
        }
        if (iA <= 0) {
            return v6;
        }
        i(v6, v7, v3);
        V v8 = this.z;
        v8.getClass();
        v20 v20Var = this.F;
        v20 v20Var2 = hdb.c;
        d27 d27Var = this.t;
        int i3 = 0;
        boolean z = true;
        if (v20Var != v20Var2) {
            int i4 = d27Var.b;
            if (i4 <= 0) {
                r.b(BuildConfig.FLAVOR);
                return null;
            }
            int i5 = i4 - 1;
            int i6 = 0;
            while (true) {
                if (i6 > i5) {
                    i2 = -(i6 + 1);
                    break;
                }
                i2 = (i6 + i5) >>> 1;
                int i7 = d27Var.a[i2];
                if (i7 >= iA) {
                    if (i7 <= iA) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i6 = i2 + 1;
                }
            }
            if (i2 < -1) {
                i2 = -(i2 + 2);
            }
            float fA = a(i2, false, iA);
            float[] fArr = this.D;
            v20.a[][] aVarArr = this.F.a;
            int length = aVarArr.length - 1;
            float f = aVarArr[0][0].a;
            float f2 = aVarArr[length][0].b;
            int length2 = fArr.length;
            if (fA < f || fA > f2) {
                if (fA > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fA - f;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length2 - 1) {
                    v20.a aVar = aVarArr[length][i9];
                    boolean z2 = aVar.p;
                    float f4 = aVar.r;
                    float f5 = aVar.q;
                    if (z2) {
                        float f6 = aVar.a;
                        float f7 = aVar.k;
                        float f8 = aVar.c;
                        fArr[i8] = (f5 * f3) + go.a(aVar.e, f8, (f - f6) * f7, f8);
                        float f9 = aVar.d;
                        fArr[i8 + 1] = (f4 * f3) + go.a(aVar.f, f9, (f - f6) * f7, f9);
                    } else {
                        aVar.c(f);
                        fArr[i8] = (aVar.a() * f3) + (aVar.n * aVar.h) + f5;
                        fArr[i8 + 1] = (aVar.b() * f3) + (aVar.o * aVar.i) + f4;
                    }
                    i8 += 2;
                    i9++;
                    aVarArr = aVarArr;
                    z = z;
                }
            } else {
                int length3 = aVarArr.length;
                int i10 = 0;
                boolean z3 = false;
                while (i10 < length3) {
                    int i11 = i3;
                    int i12 = i11;
                    while (i11 < length2 - 1) {
                        v20.a aVar2 = aVarArr[i10][i12];
                        if (fA <= aVar2.b) {
                            if (aVar2.p) {
                                float f10 = aVar2.a;
                                float f11 = aVar2.k;
                                float f12 = aVar2.c;
                                fArr[i11] = go.a(aVar2.e, f12, (fA - f10) * f11, f12);
                                float f13 = aVar2.d;
                                fArr[i11 + 1] = go.a(aVar2.f, f13, (fA - f10) * f11, f13);
                            } else {
                                aVar2.c(fA);
                                fArr[i11] = (aVar2.n * aVar2.h) + aVar2.q;
                                fArr[i11 + 1] = (aVar2.o * aVar2.i) + aVar2.r;
                            }
                            z3 = true;
                        }
                        i11 += 2;
                        i12++;
                    }
                    if (z3) {
                        break;
                    }
                    i10++;
                    i3 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i13 = 0; i13 < length4; i13++) {
                v8.e(fArr[i13], i13);
            }
        } else {
            int i14 = d27Var.b;
            if (i14 <= 0) {
                r.b(BuildConfig.FLAVOR);
                return null;
            }
            int i15 = i14 - 1;
            int i16 = 0;
            while (true) {
                if (i16 > i15) {
                    i = -(i16 + 1);
                    break;
                }
                i = (i16 + i15) >>> 1;
                int i17 = d27Var.a[i];
                if (i17 >= iA) {
                    if (i17 <= iA) {
                        break;
                    }
                    i15 = i - 1;
                } else {
                    i16 = i + 1;
                }
            }
            if (i < -1) {
                i = -(i + 2);
            }
            float fA2 = a(i, true, iA);
            ndb<V> ndbVarB2 = zf5Var.b(d27Var.a(i));
            if (ndbVarB2 != null && (v5 = ndbVarB2.a) != null) {
                v6 = v5;
            }
            ndb<V> ndbVarB3 = zf5Var.b(d27Var.a(i + 1));
            if (ndbVarB3 != null && (v4 = ndbVarB3.a) != null) {
                v7 = v4;
            }
            int iB = v8.b();
            for (int i18 = 0; i18 < iB; i18++) {
                v8.e((v7.a(i18) * fA2) + ((1.0f - fA2) * v6.a(i18)), i18);
            }
        }
        return v8;
    }

    public final void i(V v, V v2, V v3) {
        float[] fArr;
        boolean z = this.F != hdb.c;
        V v4 = this.z;
        zf5<ndb<V>> zf5Var = this.u;
        d27 d27Var = this.t;
        if (v4 == null) {
            this.z = (V) v.c();
            this.A = (V) v3.c();
            int i = d27Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = d27Var.a(i2) / 1000.0f;
            }
            this.y = fArr2;
            int i3 = d27Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                zf5Var.b(d27Var.a(i4));
                iArr[i4] = 0;
            }
            this.x = iArr;
        }
        if (z) {
            if (this.F != hdb.c && xj5.a(this.B, v) && xj5.a(this.C, v2)) {
                return;
            }
            this.B = v;
            this.C = v2;
            int iB = v.b() + (v.b() % 2);
            this.D = new float[iB];
            this.E = new float[iB];
            int i5 = d27Var.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iA = d27Var.a(i6);
                ndb<V> ndbVarB = zf5Var.b(iA);
                if (iA == 0 && ndbVarB == null) {
                    fArr = new float[iB];
                    for (int i7 = 0; i7 < iB; i7++) {
                        fArr[i7] = v.a(i7);
                    }
                } else if (iA == this.v && ndbVarB == null) {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = v2.a(i8);
                    }
                } else {
                    ndbVarB.getClass();
                    V v5 = ndbVarB.a;
                    float[] fArr4 = new float[iB];
                    for (int i9 = 0; i9 < iB; i9++) {
                        fArr4[i9] = v5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.F = new v20(this.x, this.y, fArr3);
        }
    }
}
