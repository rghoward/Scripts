package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class og0 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public og0(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static og0 a(pt7 pt7Var) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            pt7Var.N(4);
            int iZ = (pt7Var.z() & 3) + 1;
            if (iZ == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZ2 = pt7Var.z() & 31;
            for (int i9 = 0; i9 < iZ2; i9++) {
                int iG = pt7Var.G();
                int i10 = pt7Var.b;
                pt7Var.N(iG);
                byte[] bArr = pt7Var.a;
                byte[] bArr2 = new byte[iG + 4];
                System.arraycopy(og1.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, iG);
                arrayList.add(bArr2);
            }
            int iZ3 = pt7Var.z();
            for (int i11 = 0; i11 < iZ3; i11++) {
                int iG2 = pt7Var.G();
                int i12 = pt7Var.b;
                pt7Var.N(iG2);
                byte[] bArr3 = pt7Var.a;
                byte[] bArr4 = new byte[iG2 + 4];
                System.arraycopy(og1.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, iG2);
                arrayList.add(bArr4);
            }
            if (iZ2 > 0) {
                f47.m mVarK = f47.k((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                int i13 = mVarK.e;
                int i14 = mVarK.f;
                int i15 = mVarK.h + 8;
                int i16 = mVarK.i + 8;
                int i17 = mVarK.p;
                int i18 = mVarK.q;
                int i19 = mVarK.r;
                int i20 = mVarK.s;
                float f2 = mVarK.g;
                int i21 = mVarK.a;
                int i22 = mVarK.b;
                int i23 = mVarK.c;
                byte[] bArr5 = og1.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new og0(arrayList, iZ, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ut7.a(e, "Error parsing AVC config");
        }
    }
}
