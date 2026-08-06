package defpackage;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ke8 {
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList<je8.a> a(pt7 pt7Var) {
        char c;
        ArrayList<je8.a> arrayList;
        boolean z;
        int i;
        Object aVar;
        pt7 pt7Var2 = pt7Var;
        ArrayList<je8.a> arrayList2 = null;
        arrayList2 = null;
        arrayList2 = null;
        if (pt7Var2.z() == 0) {
            char c2 = 7;
            pt7Var2.N(7);
            int iM = pt7Var2.m();
            boolean z2 = true;
            if (iM == 1684433976) {
                pt7 pt7Var3 = new pt7();
                Inflater inflater = new Inflater(true);
                try {
                    if (!n6b.G(pt7Var2, pt7Var3, inflater)) {
                        inflater.end();
                        return null;
                    }
                    inflater.end();
                    pt7Var2 = pt7Var3;
                } catch (Throwable th) {
                    inflater.end();
                    throw th;
                }
            } else if (iM == 1918990112) {
            }
            ArrayList<je8.a> arrayList3 = new ArrayList<>();
            int i2 = pt7Var2.b;
            int i3 = pt7Var2.c;
            while (i2 < i3) {
                int iM2 = pt7Var2.m() + i2;
                if (iM2 > i2 && iM2 <= i3) {
                    if (pt7Var2.m() == 1835365224) {
                        int iM3 = pt7Var2.m();
                        if (iM3 > 10000) {
                            c = c2;
                            ArrayList<je8.a> arrayList4 = arrayList2;
                            arrayList = arrayList4;
                            z = z2;
                            i = i3;
                            aVar = arrayList4;
                        } else {
                            float[] fArr = new float[iM3];
                            for (int i4 = 0; i4 < iM3; i4++) {
                                fArr[i4] = Float.intBitsToFloat(pt7Var2.m());
                            }
                            int iM4 = pt7Var2.m();
                            if (iM4 > 32000) {
                                c = c2;
                                ArrayList<je8.a> arrayList5 = arrayList2;
                                arrayList = arrayList5;
                                z = z2;
                                i = i3;
                                aVar = arrayList5;
                            } else {
                                double dLog = Math.log(2.0d);
                                c = c2;
                                ArrayList<je8.a> arrayList6 = arrayList2;
                                int iCeil = (int) Math.ceil(Math.log(((double) iM3) * 2.0d) / dLog);
                                z = z2;
                                byte[] bArr = pt7Var2.a;
                                ot7 ot7Var = new ot7(bArr, bArr.length);
                                ot7Var.m(pt7Var2.b * 8);
                                float[] fArr2 = new float[iM4 * 5];
                                int i5 = 5;
                                int[] iArr = new int[5];
                                ArrayList<je8.a> arrayList7 = arrayList6;
                                int i6 = 0;
                                int i7 = 0;
                                while (true) {
                                    if (i6 < iM4) {
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 < i5) {
                                                int i9 = iArr[i8];
                                                int iG = ot7Var.g(iCeil);
                                                int i10 = ((iG >> 1) ^ (-(iG & 1))) + i9;
                                                if (i10 < iM3 && i10 >= 0) {
                                                    fArr2[i7] = fArr[i10];
                                                    iArr[i8] = i10;
                                                    i8++;
                                                    i7++;
                                                    i5 = 5;
                                                }
                                            } else {
                                                i6++;
                                                i5 = 5;
                                            }
                                        }
                                    } else {
                                        ot7Var.m((ot7Var.e() + 7) & (-8));
                                        int i11 = 32;
                                        int iG2 = ot7Var.g(32);
                                        je8.b[] bVarArr = new je8.b[iG2];
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 < iG2) {
                                                int iG3 = ot7Var.g(8);
                                                int iG4 = ot7Var.g(8);
                                                int iG5 = ot7Var.g(i11);
                                                if (iG5 <= 128000) {
                                                    int i13 = iG2;
                                                    float[] fArr3 = fArr2;
                                                    int iCeil2 = (int) Math.ceil(Math.log(((double) iM4) * 2.0d) / dLog);
                                                    float[] fArr4 = new float[iG5 * 3];
                                                    float[] fArr5 = new float[iG5 * 2];
                                                    i = i3;
                                                    int i14 = 0;
                                                    int i15 = 0;
                                                    while (true) {
                                                        if (i14 < iG5) {
                                                            int iG6 = ot7Var.g(iCeil2);
                                                            ot7 ot7Var2 = ot7Var;
                                                            int i16 = ((iG6 >> 1) ^ (-(iG6 & 1))) + i15;
                                                            if (i16 >= 0 && i16 < iM4) {
                                                                int i17 = i14 * 3;
                                                                int i18 = i16 * 5;
                                                                fArr4[i17] = fArr3[i18];
                                                                fArr4[i17 + 1] = fArr3[i18 + 1];
                                                                fArr4[i17 + 2] = fArr3[i18 + 2];
                                                                int i19 = i14 * 2;
                                                                fArr5[i19] = fArr3[i18 + 3];
                                                                fArr5[i19 + 1] = fArr3[i18 + 4];
                                                                i14++;
                                                                i15 = i16;
                                                                ot7Var = ot7Var2;
                                                            }
                                                        } else {
                                                            bVarArr[i12] = new je8.b(iG3, iG4, fArr4, fArr5);
                                                            i12++;
                                                            iG2 = i13;
                                                            fArr2 = fArr3;
                                                            i3 = i;
                                                            ot7Var = ot7Var;
                                                            i11 = 32;
                                                        }
                                                    }
                                                }
                                                aVar = arrayList7;
                                                arrayList = arrayList7;
                                            } else {
                                                i = i3;
                                                aVar = new je8.a(bVarArr);
                                                arrayList = arrayList7;
                                            }
                                        }
                                    }
                                    i = i3;
                                    aVar = arrayList7;
                                    arrayList = arrayList7;
                                }
                            }
                        }
                        if (aVar == null) {
                            return arrayList;
                        }
                        arrayList3.add(aVar);
                    } else {
                        c = c2;
                        arrayList = arrayList2;
                        z = z2;
                        i = i3;
                    }
                    pt7Var2.M(iM2);
                    i2 = iM2;
                    c2 = c;
                    z2 = z;
                    arrayList2 = arrayList;
                    i3 = i;
                }
            }
            return arrayList3;
        }
        return arrayList2;
    }
}
