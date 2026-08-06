package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ew4 {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final f47.k o;

    public ew4(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, f47.k kVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = kVar;
    }

    public static ew4 a(pt7 pt7Var, boolean z, f47.k kVar) {
        boolean z2;
        f47.g gVarH;
        int i = 4;
        try {
            if (z) {
                pt7Var.N(4);
            } else {
                pt7Var.N(21);
            }
            int iZ = pt7Var.z() & 3;
            int iZ2 = pt7Var.z();
            int i2 = pt7Var.b;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                z2 = true;
                if (i4 >= iZ2) {
                    break;
                }
                pt7Var.N(1);
                int iG = pt7Var.G();
                for (int i6 = 0; i6 < iG; i6++) {
                    int iG2 = pt7Var.G();
                    i5 += iG2 + 4;
                    pt7Var.N(iG2);
                }
                i4++;
            }
            pt7Var.M(i2);
            byte[] bArr = new byte[i5];
            f47.k kVar2 = kVar;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            float f = 1.0f;
            String strA = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 < iZ2) {
                int iZ3 = pt7Var.z() & 63;
                int iG3 = pt7Var.G();
                int i19 = i3;
                f47.k kVarJ = kVar2;
                while (i19 < iG3) {
                    boolean z3 = z2;
                    int iG4 = pt7Var.G();
                    int i20 = iZ;
                    System.arraycopy(f47.a, i3, bArr, i18, i);
                    int i21 = i18 + 4;
                    System.arraycopy(pt7Var.a, pt7Var.b, bArr, i21, iG4);
                    if (iZ3 == 32 && i19 == 0) {
                        kVarJ = f47.j(bArr, i21, i21 + iG4);
                    } else {
                        if (iZ3 == 33 && i19 == 0) {
                            f47.h hVarI = f47.i(bArr, i21, i21 + iG4, kVarJ);
                            i7 = hVarI.a + 1;
                            i8 = hVarI.g;
                            int i22 = hVarI.h;
                            i10 = hVarI.c + 8;
                            i11 = hVarI.d + 8;
                            int i23 = hVarI.k;
                            i9 = i22;
                            int i24 = hVarI.l;
                            int i25 = hVarI.m;
                            float f2 = hVarI.i;
                            int i26 = hVarI.j;
                            f47.c cVar = hVarI.b;
                            if (cVar != null) {
                                strA = og1.a(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f);
                            }
                            i16 = i26;
                            f = f2;
                            i14 = i25;
                            i13 = i24;
                            i12 = i23;
                        } else if (iZ3 == 39 && i19 == 0 && (gVarH = f47.h(bArr, i21, i21 + iG4)) != null && kVarJ != null) {
                            i3 = 0;
                            i15 = gVarH.a == kVarJ.a.get(0).b ? 4 : 5;
                        }
                        i3 = 0;
                    }
                    i18 = i21 + iG4;
                    pt7Var.N(iG4);
                    i19++;
                    z2 = z3;
                    iZ = i20;
                    i = 4;
                }
                i17++;
                kVar2 = kVarJ;
                i = 4;
            }
            return new ew4(i5 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iZ + 1, i7, i8, i9, i10, i11, i12, i13, i14, i15, f, i16, strA, kVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ut7.a(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
