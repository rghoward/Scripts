package defpackage;

import com.intercom.twig.BuildConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u65 extends ln4 {
    public static final t65 y = new t65();
    public final a x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        boolean a(int i, int i2, int i3, int i4, int i5);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final int a;
        public final boolean b;
        public final int c;

        public b(int i, boolean z, int i2) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    public u65(a aVar) {
        super(20);
        this.x = aVar;
    }

    public static int A1(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int B1(int i, pt7 pt7Var) {
        byte[] bArr = pt7Var.a;
        int i2 = pt7Var.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & MessagePack.Code.EXT_TIMESTAMP) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
      0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean C1(pt7 pt7Var, int i, int i2, boolean z) {
        int iC;
        long jC;
        int iG;
        int i3;
        int i4 = pt7Var.b;
        while (true) {
            try {
                boolean z2 = true;
                if (pt7Var.a() < i2) {
                    pt7Var.M(i4);
                    return true;
                }
                if (i >= 3) {
                    iC = pt7Var.m();
                    jC = pt7Var.B();
                    iG = pt7Var.G();
                } else {
                    iC = pt7Var.C();
                    jC = pt7Var.C();
                    iG = 0;
                }
                if (iC == 0 && jC == 0 && iG == 0) {
                    pt7Var.M(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jC) != 0) {
                        pt7Var.M(i4);
                        return false;
                    }
                    jC = (((jC >> 24) & 255) << 21) | (jC & 255) | (((jC >> 8) & 255) << 7) | (((jC >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iG & 64) != 0 ? 1 : 0;
                    if ((iG & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iG & 32) != 0 ? 1 : 0;
                    if ((iG & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jC < i3) {
                    pt7Var.M(i4);
                    return false;
                }
                if (pt7Var.a() < jC) {
                    pt7Var.M(i4);
                    return false;
                }
                pt7Var.N((int) jC);
            } catch (Throwable th) {
                pt7Var.M(i4);
                throw th;
            }
        }
    }

    public static iy i1(pt7 pt7Var, int i, int i2) {
        int iA1;
        String strConcat;
        int iZ = pt7Var.z();
        Charset charsetX1 = x1(iZ);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        pt7Var.k(bArr, 0, i3);
        if (i2 == 2) {
            strConcat = "image/" + h40.f(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iA1 = 2;
        } else {
            iA1 = A1(bArr, 0);
            String strF = h40.f(new String(bArr, 0, iA1, StandardCharsets.ISO_8859_1));
            strConcat = strF.indexOf(47) == -1 ? "image/".concat(strF) : strF;
        }
        int i4 = bArr[iA1 + 1] & MessagePack.Code.EXT_TIMESTAMP;
        int i5 = iA1 + 2;
        int iZ1 = z1(bArr, i5, iZ);
        String str = new String(bArr, i5, iZ1 - i5, charsetX1);
        int iW1 = w1(iZ) + iZ1;
        return new iy(strConcat, str, i4, i3 <= iW1 ? n6b.b : Arrays.copyOfRange(bArr, iW1, i3));
    }

    public static ja1 j1(pt7 pt7Var, int i, int i2, boolean z, int i3, a aVar) throws Throwable {
        int i4 = pt7Var.b;
        int iA1 = A1(pt7Var.a, i4);
        String str = new String(pt7Var.a, i4, iA1 - i4, StandardCharsets.ISO_8859_1);
        pt7Var.M(iA1 + 1);
        int iM = pt7Var.m();
        int iM2 = pt7Var.m();
        long jB = pt7Var.B();
        if (jB == 4294967295L) {
            jB = -1;
        }
        long jB2 = pt7Var.B();
        long j = jB2 == 4294967295L ? -1L : jB2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (pt7Var.b < i5) {
            v65 v65VarM1 = m1(i2, pt7Var, z, i3, aVar);
            if (v65VarM1 != null) {
                arrayList.add(v65VarM1);
            }
        }
        return new ja1(str, iM, iM2, jB, j, (v65[]) arrayList.toArray(new v65[0]));
    }

    public static ka1 k1(pt7 pt7Var, int i, int i2, boolean z, int i3, a aVar) throws Throwable {
        int i4 = pt7Var.b;
        int iA1 = A1(pt7Var.a, i4);
        String str = new String(pt7Var.a, i4, iA1 - i4, StandardCharsets.ISO_8859_1);
        pt7Var.M(iA1 + 1);
        int iZ = pt7Var.z();
        boolean z2 = (iZ & 2) != 0;
        boolean z3 = (iZ & 1) != 0;
        int iZ2 = pt7Var.z();
        String[] strArr = new String[iZ2];
        for (int i5 = 0; i5 < iZ2; i5++) {
            int i6 = pt7Var.b;
            int iA2 = A1(pt7Var.a, i6);
            strArr[i5] = new String(pt7Var.a, i6, iA2 - i6, StandardCharsets.ISO_8859_1);
            pt7Var.M(iA2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (pt7Var.b < i7) {
            v65 v65VarM1 = m1(i2, pt7Var, z, i3, aVar);
            if (v65VarM1 != null) {
                arrayList.add(v65VarM1);
            }
        }
        return new ka1(str, z2, z3, strArr, (v65[]) arrayList.toArray(new v65[0]));
    }

    public static fk1 l1(int i, pt7 pt7Var) {
        if (i < 4) {
            return null;
        }
        int iZ = pt7Var.z();
        Charset charsetX1 = x1(iZ);
        byte[] bArr = new byte[3];
        pt7Var.k(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        pt7Var.k(bArr2, 0, i2);
        int iZ1 = z1(bArr2, 0, iZ);
        String str2 = new String(bArr2, 0, iZ1, charsetX1);
        int iW1 = w1(iZ) + iZ1;
        return new fk1(str, str2, q1(bArr2, iW1, z1(bArr2, iW1, iZ), charsetX1));
    }

    /* JADX WARN: Code duplicated, block: B:143:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:167:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x021c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0222  */
    /* JADX WARN: Code duplicated, block: B:185:0x022f A[Catch: all -> 0x0216, Exception -> 0x0218, OutOfMemoryError -> 0x021a, TRY_LEAVE, TryCatch #8 {Exception -> 0x0218, OutOfMemoryError -> 0x021a, all -> 0x0216, blocks: (B:171:0x0211, B:184:0x022a, B:185:0x022f), top: B:199:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0251  */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x0251, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [v65] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [pt7] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [pt7] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [pt7] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static v65 m1(int i, pt7 pt7Var, boolean z, int i2, a aVar) throws Throwable {
        int iD;
        int i3;
        ?? r1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ?? r9;
        int i4;
        int i5;
        ?? r2;
        Throwable th;
        ?? r3;
        ?? r12;
        ?? r10;
        ?? r11;
        pt7 pt7Var2;
        Object aq0Var;
        int i6 = i;
        int iZ = pt7Var.z();
        int iZ2 = pt7Var.z();
        int iZ3 = pt7Var.z();
        int iZ4 = i6 >= 3 ? pt7Var.z() : 0;
        if (i6 == 4) {
            iD = pt7Var.D();
            if (!z) {
                iD = (((iD >> 24) & 255) << 21) | (iD & 255) | (((iD >> 8) & 255) << 7) | (((iD >> 16) & 255) << 14);
            }
        } else {
            iD = i6 == 3 ? pt7Var.D() : pt7Var.C();
        }
        int iB1 = iD;
        int iG = i6 >= 3 ? pt7Var.G() : 0;
        if (iZ == 0 && iZ2 == 0 && iZ3 == 0 && iZ4 == 0 && iB1 == 0 && iG == 0) {
            pt7Var.M(pt7Var.c);
            return null;
        }
        int i7 = pt7Var.b + iB1;
        if (i7 > pt7Var.c) {
            md6.g("Id3Decoder", "Frame size exceeds remaining tag data");
            pt7Var.M(pt7Var.c);
            return null;
        }
        if (aVar != null) {
            boolean zA = aVar.a(i6, iZ, iZ2, iZ3, iZ4);
            r1 = iZ;
            i3 = iZ2;
            if (!zA) {
                i6 = i6;
                pt7Var.M(i7);
                return null;
            }
        } else {
            i3 = iZ2;
            r1 = iZ;
        }
        i6 = i6;
        if (i6 == 3) {
            z2 = (iG & 128) != 0;
            z5 = (iG & 64) != 0;
            z6 = false;
            z4 = (iG & 32) != 0;
            z3 = z2;
        } else if (i6 == 4) {
            boolean z7 = (iG & 64) != 0;
            boolean z8 = (iG & 8) != 0;
            z5 = (iG & 4) != 0;
            z6 = (iG & 2) != 0;
            z3 = (iG & 1) != 0;
            boolean z9 = z8;
            z4 = z7;
            z2 = z9;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z5) {
            md6.g("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            pt7Var.M(i7);
            return null;
        }
        if (z4) {
            iB1--;
            pt7Var.N(1);
        }
        if (z3) {
            iB1 -= 4;
            pt7Var.N(4);
        }
        if (z6) {
            iB1 = B1(iB1, pt7Var);
        }
        try {
            try {
                if (r1 == 84 && i3 == 88 && iZ3 == 88 && (i6 == 2 || iZ4 == 88)) {
                    aq0Var = t1(iB1, pt7Var);
                } else if (r1 == 84) {
                    aq0Var = r1(iB1, pt7Var, y1(i6, r1, i3, iZ3, iZ4));
                } else if (r1 == 87 && i3 == 88 && iZ3 == 88 && (i6 == 2 || iZ4 == 88)) {
                    aq0Var = v1(iB1, pt7Var);
                } else {
                    if (r1 != 87) {
                        if (r1 == 80 && i3 == 82 && iZ3 == 73 && iZ4 == 86) {
                            aq0Var = p1(iB1, pt7Var);
                        } else {
                            th = null;
                            try {
                                if (r1 != 71 || i3 != 69 || iZ3 != 79 || (iZ4 != 66 && i6 != 2)) {
                                    if (i6 == 2) {
                                        if (r1 == 80 && i3 == 73 && iZ3 == 67) {
                                            aq0Var = i1(pt7Var, iB1, i6);
                                        } else if (r1 != 67 && i3 == 79 && iZ3 == 77 && (iZ4 == 77 || i6 == 2)) {
                                            aq0Var = l1(iB1, pt7Var);
                                        } else if (r1 != 67 && i3 == 72 && iZ3 == 65 && iZ4 == 80) {
                                            int i8 = iB1;
                                            iB1 = i3;
                                            i3 = i8;
                                            r11 = r1;
                                            i4 = iZ3;
                                            i5 = iZ4;
                                            try {
                                                aq0Var = j1(pt7Var, i3, i6, z, i2, aVar);
                                                i6 = i;
                                                r1 = pt7Var;
                                            } catch (Exception e) {
                                                e = e;
                                                i6 = i;
                                                r2 = pt7Var;
                                                r9 = r11;
                                                r2.M(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e2) {
                                                e = e2;
                                                i6 = i;
                                                r2 = pt7Var;
                                                r9 = r11;
                                                r2.M(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r3 = pt7Var;
                                                r3.M(i7);
                                                throw th;
                                            }
                                        } else {
                                            int i9 = iB1;
                                            iB1 = i3;
                                            i3 = i9;
                                            r11 = r1;
                                            i4 = iZ3;
                                            i5 = iZ4;
                                            try {
                                                if (r11 != 67 && iB1 == 84 && i4 == 79 && i5 == 67) {
                                                    i6 = i;
                                                    pt7 pt7Var3 = pt7Var;
                                                    aq0Var = k1(pt7Var3, i3, i6, z, i2, aVar);
                                                    r1 = pt7Var3;
                                                } else {
                                                    i6 = i;
                                                    pt7Var2 = pt7Var;
                                                    if (r11 != 77 && iB1 == 76 && i4 == 76 && i5 == 84) {
                                                        aq0Var = o1(i3, pt7Var2);
                                                        r1 = pt7Var2;
                                                    } else {
                                                        String strY1 = y1(i6, r11 == true ? 1 : 0, iB1, i4, i5);
                                                        byte[] bArr = new byte[i3];
                                                        pt7Var2.k(bArr, 0, i3);
                                                        aq0Var = new aq0(strY1, bArr);
                                                        r1 = pt7Var2;
                                                    }
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                r2 = r1;
                                                r9 = r11;
                                                r2.M(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e4) {
                                                e = e4;
                                                r2 = r1;
                                                r9 = r11;
                                                r2.M(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r3 = r1;
                                                r3.M(i7);
                                                throw th;
                                            }
                                        }
                                    } else if (r1 == 65 && i3 == 80 && iZ3 == 73 && iZ4 == 67) {
                                        aq0Var = i1(pt7Var, iB1, i6);
                                    } else {
                                        if (r1 != 67) {
                                        }
                                        if (r1 != 67) {
                                            int i10 = iB1;
                                            iB1 = i3;
                                            i3 = i10;
                                            r11 = r1;
                                            i4 = iZ3;
                                            i5 = iZ4;
                                            if (r11 != 67) {
                                                i6 = i;
                                                pt7Var2 = pt7Var;
                                                if (r11 != 77) {
                                                    String strY2 = y1(i6, r11 == true ? 1 : 0, iB1, i4, i5);
                                                    byte[] bArr2 = new byte[i3];
                                                    pt7Var2.k(bArr2, 0, i3);
                                                    aq0Var = new aq0(strY2, bArr2);
                                                    r1 = pt7Var2;
                                                } else {
                                                    String strY3 = y1(i6, r11 == true ? 1 : 0, iB1, i4, i5);
                                                    byte[] bArr3 = new byte[i3];
                                                    pt7Var2.k(bArr3, 0, i3);
                                                    aq0Var = new aq0(strY3, bArr3);
                                                    r1 = pt7Var2;
                                                }
                                            } else {
                                                i6 = i;
                                                pt7Var2 = pt7Var;
                                                if (r11 != 77) {
                                                    String strY4 = y1(i6, r11 == true ? 1 : 0, iB1, i4, i5);
                                                    byte[] bArr4 = new byte[i3];
                                                    pt7Var2.k(bArr4, 0, i3);
                                                    aq0Var = new aq0(strY4, bArr4);
                                                    r1 = pt7Var2;
                                                } else {
                                                    String strY5 = y1(i6, r11 == true ? 1 : 0, iB1, i4, i5);
                                                    byte[] bArr5 = new byte[i3];
                                                    pt7Var2.k(bArr5, 0, i3);
                                                    aq0Var = new aq0(strY5, bArr5);
                                                    r1 = pt7Var2;
                                                }
                                            }
                                        } else {
                                            int i11 = iB1;
                                            iB1 = i3;
                                            i3 = i11;
                                            r11 = r1;
                                            i4 = iZ3;
                                            i5 = iZ4;
                                            if (r11 != 67) {
                                                i6 = i;
                                                pt7Var2 = pt7Var;
                                                if (r11 != 77) {
                                                    String strY6 = y1(i6, r11 == true ? 1 : 0, iB1, i4, i5);
                                                    byte[] bArr6 = new byte[i3];
                                                    pt7Var2.k(bArr6, 0, i3);
                                                    aq0Var = new aq0(strY6, bArr6);
                                                    r1 = pt7Var2;
                                                } else {
                                                    String strY7 = y1(i6, r11 == true ? 1 : 0, iB1, i4, i5);
                                                    byte[] bArr7 = new byte[i3];
                                                    pt7Var2.k(bArr7, 0, i3);
                                                    aq0Var = new aq0(strY7, bArr7);
                                                    r1 = pt7Var2;
                                                }
                                            } else {
                                                i6 = i;
                                                pt7Var2 = pt7Var;
                                                if (r11 != 77) {
                                                    String strY8 = y1(i6, r11 == true ? 1 : 0, iB1, i4, i5);
                                                    byte[] bArr8 = new byte[i3];
                                                    pt7Var2.k(bArr8, 0, i3);
                                                    aq0Var = new aq0(strY8, bArr8);
                                                    r1 = pt7Var2;
                                                } else {
                                                    String strY9 = y1(i6, r11 == true ? 1 : 0, iB1, i4, i5);
                                                    byte[] bArr9 = new byte[i3];
                                                    pt7Var2.k(bArr9, 0, i3);
                                                    aq0Var = new aq0(strY9, bArr9);
                                                    r1 = pt7Var2;
                                                }
                                            }
                                        }
                                    }
                                    if (r12 == 0) {
                                        md6.h("Id3Decoder", "Failed to decode frame: id=" + y1(i6, r10, iB1, i4, i5) + ", frameSize=" + i3, e);
                                    }
                                    return r12;
                                }
                                aq0Var = n1(iB1, pt7Var);
                                int i12 = iB1;
                                iB1 = i3;
                                i3 = i12;
                                r11 = r1;
                                i4 = iZ3;
                                i5 = iZ4;
                                r1 = pt7Var;
                            } catch (Exception e5) {
                                e = e5;
                                int i13 = iB1;
                                iB1 = i3;
                                i3 = i13;
                                r9 = r1;
                                i4 = iZ3;
                                i5 = iZ4;
                                r2 = pt7Var;
                                r2.M(i7);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    md6.h("Id3Decoder", "Failed to decode frame: id=" + y1(i6, r10, iB1, i4, i5) + ", frameSize=" + i3, e);
                                }
                                return r12;
                            } catch (OutOfMemoryError e6) {
                                e = e6;
                                int i14 = iB1;
                                iB1 = i3;
                                i3 = i14;
                                r9 = r1;
                                i4 = iZ3;
                                i5 = iZ4;
                                r2 = pt7Var;
                                r2.M(i7);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    md6.h("Id3Decoder", "Failed to decode frame: id=" + y1(i6, r10, iB1, i4, i5) + ", frameSize=" + i3, e);
                                }
                                return r12;
                            }
                        }
                        r1.M(i7);
                        r12 = aq0Var;
                        e = th;
                        r10 = r11;
                        if (r12 == 0) {
                            md6.h("Id3Decoder", "Failed to decode frame: id=" + y1(i6, r10, iB1, i4, i5) + ", frameSize=" + i3, e);
                        }
                        return r12;
                    }
                    aq0Var = u1(iB1, pt7Var, y1(i6, r1, i3, iZ3, iZ4));
                }
                int i15 = iB1;
                iB1 = i3;
                i3 = i15;
                r11 = r1;
                i4 = iZ3;
                i5 = iZ4;
                r1 = pt7Var;
                th = null;
                r1.M(i7);
                r12 = aq0Var;
                e = th;
                r10 = r11;
            } catch (Throwable th4) {
                th = th4;
                r3 = pt7Var;
            }
        } catch (Exception e7) {
            e = e7;
            int i16 = iB1;
            iB1 = i3;
            i3 = i16;
            r9 = r1;
            i4 = iZ3;
            i5 = iZ4;
            r2 = pt7Var;
            th = null;
            r2.M(i7);
            r12 = th;
            r10 = r9;
            if (r12 == 0) {
                md6.h("Id3Decoder", "Failed to decode frame: id=" + y1(i6, r10, iB1, i4, i5) + ", frameSize=" + i3, e);
            }
            return r12;
        } catch (OutOfMemoryError e8) {
            e = e8;
            int i17 = iB1;
            iB1 = i3;
            i3 = i17;
            r9 = r1;
            i4 = iZ3;
            i5 = iZ4;
            r2 = pt7Var;
            th = null;
            r2.M(i7);
            r12 = th;
            r10 = r9;
            if (r12 == 0) {
                md6.h("Id3Decoder", "Failed to decode frame: id=" + y1(i6, r10, iB1, i4, i5) + ", frameSize=" + i3, e);
            }
            return r12;
        }
        if (r12 == 0) {
            md6.h("Id3Decoder", "Failed to decode frame: id=" + y1(i6, r10, iB1, i4, i5) + ", frameSize=" + i3, e);
        }
        return r12;
    }

    public static lk4 n1(int i, pt7 pt7Var) {
        int iZ = pt7Var.z();
        Charset charsetX1 = x1(iZ);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        pt7Var.k(bArr, 0, i2);
        int iA1 = A1(bArr, 0);
        String strN = fv6.n(new String(bArr, 0, iA1, StandardCharsets.ISO_8859_1));
        int i3 = iA1 + 1;
        int iZ1 = z1(bArr, i3, iZ);
        String strQ1 = q1(bArr, i3, iZ1, charsetX1);
        int iW1 = w1(iZ) + iZ1;
        int iZ2 = z1(bArr, iW1, iZ);
        String strQ2 = q1(bArr, iW1, iZ2, charsetX1);
        int iW2 = w1(iZ) + iZ2;
        return new lk4(strN, strQ1, strQ2, i2 <= iW2 ? n6b.b : Arrays.copyOfRange(bArr, iW2, i2));
    }

    public static nv6 o1(int i, pt7 pt7Var) {
        int iG = pt7Var.G();
        int iC = pt7Var.C();
        int iC2 = pt7Var.C();
        int iZ = pt7Var.z();
        int iZ2 = pt7Var.z();
        ot7 ot7Var = new ot7();
        ot7Var.k(pt7Var);
        int i2 = ((i - 10) * 8) / (iZ + iZ2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iG2 = ot7Var.g(iZ);
            int iG3 = ot7Var.g(iZ2);
            iArr[i3] = iG2;
            iArr2[i3] = iG3;
        }
        return new nv6(iG, iC, iC2, iArr, iArr2);
    }

    public static v98 p1(int i, pt7 pt7Var) {
        byte[] bArr = new byte[i];
        pt7Var.k(bArr, 0, i);
        int iA1 = A1(bArr, 0);
        String str = new String(bArr, 0, iA1, StandardCharsets.ISO_8859_1);
        int i2 = iA1 + 1;
        return new v98(str, i <= i2 ? n6b.b : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String q1(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? BuildConfig.FLAVOR : new String(bArr, i, i2 - i, charset);
    }

    public static rha r1(int i, pt7 pt7Var, String str) {
        if (i < 1) {
            return null;
        }
        int iZ = pt7Var.z();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        pt7Var.k(bArr, 0, i2);
        return new rha(str, null, s1(bArr, iZ, 0));
    }

    public static ul8 s1(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return k95.v(BuildConfig.FLAVOR);
        }
        k95.b bVar = k95.u;
        k95.a aVar = new k95.a();
        int iZ1 = z1(bArr, i2, i);
        while (i2 < iZ1) {
            aVar.c(new String(bArr, i2, iZ1 - i2, x1(i)));
            i2 = w1(i) + iZ1;
            iZ1 = z1(bArr, i2, i);
        }
        ul8 ul8VarG = aVar.g();
        return ul8VarG.isEmpty() ? k95.v(BuildConfig.FLAVOR) : ul8VarG;
    }

    public static rha t1(int i, pt7 pt7Var) {
        if (i < 1) {
            return null;
        }
        int iZ = pt7Var.z();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        pt7Var.k(bArr, 0, i2);
        int iZ1 = z1(bArr, 0, iZ);
        return new rha("TXXX", new String(bArr, 0, iZ1, x1(iZ)), s1(bArr, iZ, w1(iZ) + iZ1));
    }

    public static d5b u1(int i, pt7 pt7Var, String str) {
        byte[] bArr = new byte[i];
        pt7Var.k(bArr, 0, i);
        return new d5b(str, null, new String(bArr, 0, A1(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static d5b v1(int i, pt7 pt7Var) {
        if (i < 1) {
            return null;
        }
        int iZ = pt7Var.z();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        pt7Var.k(bArr, 0, i2);
        int iZ1 = z1(bArr, 0, iZ);
        String str = new String(bArr, 0, iZ1, x1(iZ));
        int iW1 = w1(iZ) + iZ1;
        return new d5b("WXXX", str, q1(bArr, iW1, A1(bArr, iW1), StandardCharsets.ISO_8859_1));
    }

    public static int w1(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset x1(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i != 2) {
            return i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    public static String y1(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int z1(byte[] bArr, int i, int i2) {
        int iA1 = A1(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iA1;
        }
        while (iA1 < bArr.length - 1) {
            if ((iA1 - i) % 2 == 0 && bArr[iA1 + 1] == 0) {
                return iA1;
            }
            iA1 = A1(bArr, iA1 + 1);
        }
        return bArr.length;
    }

    @Override // defpackage.ln4
    public final su6 C0(xu6 xu6Var, ByteBuffer byteBuffer) {
        return h1(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7 A[SYNTHETIC] */
    public final su6 h1(byte[] bArr, int i) throws Throwable {
        boolean z;
        b bVar;
        int i2;
        int i3;
        int iB1;
        v65 v65VarM1;
        ArrayList arrayList = new ArrayList();
        pt7 pt7Var = new pt7(bArr, i);
        boolean z2 = false;
        if (pt7Var.a() < 10) {
            md6.g("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iC = pt7Var.C();
            if (iC == 4801587) {
                int iZ = pt7Var.z();
                pt7Var.N(1);
                int iZ2 = pt7Var.z();
                int iY = pt7Var.y();
                if (iZ != 2) {
                    if (iZ == 3) {
                        if ((iZ2 & 64) != 0) {
                            int iM = pt7Var.m();
                            pt7Var.N(iM);
                            iY -= iM + 4;
                        }
                    } else if (iZ == 4) {
                        if ((iZ2 & 64) != 0) {
                            int iY2 = pt7Var.y();
                            pt7Var.N(iY2 - 4);
                            iY -= iY2;
                        }
                        if ((iZ2 & 16) != 0) {
                            iY -= 10;
                        }
                    } else {
                        d80.a(iZ, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    if (iZ < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    bVar = new b(iZ, z, iY);
                } else if ((iZ2 & 64) != 0) {
                    md6.g("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iZ < 4 || (iZ2 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    bVar = new b(iZ, z, iY);
                }
                if (bVar == null) {
                    return null;
                }
                i2 = bVar.a;
                int i4 = pt7Var.b;
                i3 = i2 == 2 ? 6 : 10;
                iB1 = bVar.c;
                if (bVar.b) {
                    iB1 = B1(iB1, pt7Var);
                }
                pt7Var.L(i4 + iB1);
                if (!C1(pt7Var, i2, i3, false)) {
                    if (i2 == 4 || !C1(pt7Var, 4, i3, true)) {
                        d80.a(i2, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z2 = true;
                }
                while (pt7Var.a() >= i3) {
                    v65VarM1 = m1(i2, pt7Var, z2, i3, this.x);
                    if (v65VarM1 != null) {
                        arrayList.add(v65VarM1);
                    }
                }
                return new su6(arrayList);
            }
            md6.g("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iC))));
        }
        bVar = null;
        if (bVar == null) {
            return null;
        }
        i2 = bVar.a;
        int i5 = pt7Var.b;
        if (i2 == 2) {
        }
        iB1 = bVar.c;
        if (bVar.b) {
            iB1 = B1(iB1, pt7Var);
        }
        pt7Var.L(i5 + iB1);
        if (!C1(pt7Var, i2, i3, false)) {
            if (i2 == 4) {
            }
            d80.a(i2, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
            return null;
        }
        while (pt7Var.a() >= i3) {
            v65VarM1 = m1(i2, pt7Var, z2, i3, this.x);
            if (v65VarM1 != null) {
                arrayList.add(v65VarM1);
            }
        }
        return new su6(arrayList);
    }
}
