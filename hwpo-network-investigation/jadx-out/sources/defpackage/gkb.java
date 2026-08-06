package defpackage;

import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gkb implements js3 {
    public ls3 a;
    public hsa b;
    public b e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements b {
        public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        public final ls3 a;
        public final hsa b;
        public final hkb c;
        public final int d;
        public final byte[] e;
        public final pt7 f;
        public final int g;
        public final id4 h;
        public int i;
        public long j;
        public int k;
        public long l;

        public a(ls3 ls3Var, hsa hsaVar, hkb hkbVar) throws ut7 {
            this.a = ls3Var;
            this.b = hsaVar;
            this.c = hkbVar;
            int i = hkbVar.b;
            int iMax = Math.max(1, i / 10);
            this.g = iMax;
            pt7 pt7Var = new pt7(hkbVar.e);
            pt7Var.s();
            int iS = pt7Var.s();
            this.d = iS;
            int i2 = hkbVar.a;
            int i3 = hkbVar.c;
            int i4 = (((i3 - (i2 * 4)) * 8) / (hkbVar.d * i2)) + 1;
            if (iS != i4) {
                throw ut7.a(null, "Expected frames per block: " + i4 + "; got: " + iS);
            }
            int iG = n6b.g(iMax, iS);
            this.e = new byte[iG * i3];
            this.f = new pt7(iS * 2 * i2 * iG);
            int i5 = ((i3 * i) * 8) / iS;
            id4.a aVar = new id4.a();
            aVar.n = fv6.n("audio/raw");
            aVar.h = i5;
            aVar.i = i5;
            aVar.o = iMax * 2 * i2;
            aVar.F = i2;
            aVar.G = i;
            aVar.H = 2;
            this.h = new id4(aVar);
        }

        @Override // gkb.b
        public final void a(long j) {
            this.i = 0;
            this.j = j;
            this.k = 0;
            this.l = 0L;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004a  */
        /* JADX WARN: Code duplicated, block: B:19:0x004f  */
        /* JADX WARN: Code duplicated, block: B:22:0x0054  */
        /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:37:0x0135  */
        /* JADX WARN: Code duplicated, block: B:43:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:47:0x010b A[EDGE_INSN: B:47:0x010b->B:35:0x010b BREAK  A[LOOP:1: B:17:0x004b->B:34:0x0101], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:51:0x00cd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:8:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
        @Override // gkb.b
        public final boolean b(ks3 ks3Var, long j) {
            byte[] bArr;
            int i;
            int i2;
            int i3;
            pt7 pt7Var;
            int i4;
            int i5;
            int i6;
            byte[] bArr2;
            int i7;
            int i8;
            int i9;
            int iMin;
            int[] iArr;
            int i10;
            int i11;
            int i12;
            byte b;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19 = this.k;
            hkb hkbVar = this.c;
            int i20 = i19 / (hkbVar.a * 2);
            int i21 = this.g;
            int i22 = this.d;
            int iG = n6b.g(i21 - i20, i22);
            int i23 = hkbVar.c;
            int i24 = iG * i23;
            boolean z = j == 0;
            while (true) {
                bArr = this.e;
                if (z && (i17 = this.i) < i24) {
                    i18 = ks3Var.read(bArr, this.i, (int) Math.min(i24 - i17, j));
                    if (i18 == -1) {
                        break;
                    }
                    this.i += i18;
                    bArr = this.e;
                    if (z) {
                    }
                }
                i = this.i / i23;
                if (i > 0) {
                    i3 = 0;
                    while (true) {
                        pt7Var = this.f;
                        if (i3 < i) {
                            break;
                        }
                        i5 = 0;
                        while (true) {
                            i6 = hkbVar.a;
                            if (i5 < i6) {
                                bArr2 = pt7Var.a;
                                int i25 = (i5 * 4) + (i3 * i23);
                                i7 = (i6 * 4) + i25;
                                i8 = (i23 / i6) - 4;
                                i9 = (short) ((bArr[i25] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i25 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8));
                                int i26 = i;
                                iMin = Math.min(bArr[i25 + 2] & MessagePack.Code.EXT_TIMESTAMP, 88);
                                iArr = n;
                                i10 = iArr[iMin];
                                i11 = ((i3 * i22 * i6) + i5) * 2;
                                bArr2[i11] = (byte) (i9 & 255);
                                bArr2[i11 + 1] = (byte) (i9 >> 8);
                                int i27 = i3;
                                i12 = 0;
                                while (i12 < i8 * 2) {
                                    b = bArr[((i12 / 8) * i6 * 4) + i7 + ((i12 / 2) % 4)];
                                    i13 = i12;
                                    i14 = b & MessagePack.Code.EXT_TIMESTAMP;
                                    if (i13 % 2 == 0) {
                                        i15 = b & 15;
                                    } else {
                                        i15 = i14 >> 4;
                                    }
                                    i16 = ((((i15 & 7) * 2) + 1) * i10) >> 3;
                                    if ((i15 & 8) != 0) {
                                        i16 = -i16;
                                    }
                                    i9 = n6b.i(i9 + i16, -32768, 32767);
                                    i11 = (i6 * 2) + i11;
                                    bArr2[i11] = (byte) (i9 & 255);
                                    bArr2[i11 + 1] = (byte) (i9 >> 8);
                                    iMin = n6b.i(iMin + m[i15], 0, 88);
                                    i10 = iArr[iMin];
                                    i12 = i13 + 1;
                                }
                                i5++;
                                i = i26;
                                i3 = i27;
                            }
                        }
                        i3++;
                    }
                    int i28 = i;
                    int i29 = i22 * i28 * 2 * hkbVar.a;
                    pt7Var.M(0);
                    pt7Var.L(i29);
                    this.i -= i28 * i23;
                    int i30 = pt7Var.c;
                    this.b.e(i30, pt7Var);
                    i4 = this.k + i30;
                    this.k = i4;
                    if (i4 / (hkbVar.a * 2) >= i21) {
                        d(i21);
                    }
                }
                if (z && (i2 = this.k / (hkbVar.a * 2)) > 0) {
                    d(i2);
                }
                return z;
            }
            while (true) {
                bArr = this.e;
                if (z) {
                }
                i = this.i / i23;
                if (i > 0) {
                    i3 = 0;
                    while (true) {
                        pt7Var = this.f;
                        if (i3 < i) {
                            break;
                            break;
                        }
                        i5 = 0;
                        while (true) {
                            i6 = hkbVar.a;
                            if (i5 < i6) {
                                bArr2 = pt7Var.a;
                                int i210 = (i5 * 4) + (i3 * i23);
                                i7 = (i6 * 4) + i210;
                                i8 = (i23 / i6) - 4;
                                i9 = (short) ((bArr[i210] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i210 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8));
                                int i211 = i;
                                iMin = Math.min(bArr[i210 + 2] & MessagePack.Code.EXT_TIMESTAMP, 88);
                                iArr = n;
                                i10 = iArr[iMin];
                                i11 = ((i3 * i22 * i6) + i5) * 2;
                                bArr2[i11] = (byte) (i9 & 255);
                                bArr2[i11 + 1] = (byte) (i9 >> 8);
                                int i212 = i3;
                                i12 = 0;
                                while (i12 < i8 * 2) {
                                    b = bArr[((i12 / 8) * i6 * 4) + i7 + ((i12 / 2) % 4)];
                                    i13 = i12;
                                    i14 = b & MessagePack.Code.EXT_TIMESTAMP;
                                    if (i13 % 2 == 0) {
                                        i15 = b & 15;
                                    } else {
                                        i15 = i14 >> 4;
                                    }
                                    i16 = ((((i15 & 7) * 2) + 1) * i10) >> 3;
                                    if ((i15 & 8) != 0) {
                                        i16 = -i16;
                                    }
                                    i9 = n6b.i(i9 + i16, -32768, 32767);
                                    i11 = (i6 * 2) + i11;
                                    bArr2[i11] = (byte) (i9 & 255);
                                    bArr2[i11 + 1] = (byte) (i9 >> 8);
                                    iMin = n6b.i(iMin + m[i15], 0, 88);
                                    i10 = iArr[iMin];
                                    i12 = i13 + 1;
                                }
                                i5++;
                                i = i211;
                                i3 = i212;
                            }
                        }
                        i3++;
                    }
                    int i213 = i;
                    int i214 = i22 * i213 * 2 * hkbVar.a;
                    pt7Var.M(0);
                    pt7Var.L(i214);
                    this.i -= i213 * i23;
                    int i31 = pt7Var.c;
                    this.b.e(i31, pt7Var);
                    i4 = this.k + i31;
                    this.k = i4;
                    if (i4 / (hkbVar.a * 2) >= i21) {
                        d(i21);
                    }
                }
                if (z) {
                    d(i2);
                }
                return z;
                this.i += i18;
            }
        }

        @Override // gkb.b
        public final void c(int i, long j) {
            jkb jkbVar = new jkb(this.c, this.d, i, j);
            this.a.t(jkbVar);
            id4 id4Var = this.h;
            hsa hsaVar = this.b;
            hsaVar.g(id4Var);
            hsaVar.d(jkbVar.e);
        }

        public final void d(int i) {
            long j = this.j;
            long j2 = this.l;
            hkb hkbVar = this.c;
            long j3 = hkbVar.b;
            String str = n6b.a;
            long jU = j + n6b.U(j2, 1000000L, j3, RoundingMode.DOWN);
            int i2 = i * 2 * hkbVar.a;
            this.b.a(jU, 1, i2, this.k - i2, null);
            this.l += (long) i;
            this.k -= i2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        void a(long j);

        boolean b(ks3 ks3Var, long j);

        void c(int i, long j);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements b {
        public final ls3 a;
        public final hsa b;
        public final hkb c;
        public final id4 d;
        public final int e;
        public long f;
        public int g;
        public long h;

        public c(ls3 ls3Var, hsa hsaVar, hkb hkbVar, String str, int i) throws ut7 {
            this.a = ls3Var;
            this.b = hsaVar;
            this.c = hkbVar;
            int i2 = hkbVar.a;
            int i3 = hkbVar.b;
            int i4 = (hkbVar.d * i2) / 8;
            int i5 = hkbVar.c;
            if (i5 != i4) {
                throw ut7.a(null, "Expected block size: " + i4 + "; got: " + i5);
            }
            int i6 = i3 * i4;
            int i7 = i6 * 8;
            int iMax = Math.max(i4, i6 / 10);
            this.e = iMax;
            id4.a aVar = new id4.a();
            aVar.m = fv6.n("audio/wav");
            aVar.n = fv6.n(str);
            aVar.h = i7;
            aVar.i = i7;
            aVar.o = iMax;
            aVar.F = i2;
            aVar.G = i3;
            aVar.H = i;
            this.d = new id4(aVar);
        }

        @Override // gkb.b
        public final void a(long j) {
            this.f = j;
            this.g = 0;
            this.h = 0L;
        }

        @Override // gkb.b
        public final boolean b(ks3 ks3Var, long j) {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
                int iF = this.b.f(ks3Var, (int) Math.min(i2 - i, j2), true);
                if (iF == -1) {
                    j2 = 0;
                } else {
                    this.g += iF;
                    j2 -= (long) iF;
                }
            }
            hkb hkbVar = this.c;
            int i3 = hkbVar.c;
            int i4 = this.g / i3;
            if (i4 > 0) {
                long j3 = this.f;
                long j4 = this.h;
                long j5 = hkbVar.b;
                String str = n6b.a;
                long jU = j3 + n6b.U(j4, 1000000L, j5, RoundingMode.DOWN);
                int i5 = i4 * i3;
                int i6 = this.g - i5;
                this.b.a(jU, 1, i5, i6, null);
                this.h += (long) i4;
                this.g = i6;
            }
            return j2 <= 0;
        }

        @Override // gkb.b
        public final void c(int i, long j) {
            jkb jkbVar = new jkb(this.c, 1, i, j);
            this.a.t(jkbVar);
            id4 id4Var = this.d;
            hsa hsaVar = this.b;
            hsaVar.g(id4Var);
            hsaVar.d(jkbVar.e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0226  */
    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) throws ut7 {
        byte[] bArr;
        int i;
        this.b.getClass();
        String str = n6b.a;
        int i2 = this.c;
        int iZ = 4;
        if (i2 == 0) {
            xl7.r(ks3Var.getPosition() == 0);
            int i3 = this.f;
            if (i3 != -1) {
                ks3Var.m(i3);
                this.c = 4;
                return 0;
            }
            if (!ikb.a(ks3Var)) {
                throw ut7.a(null, "Unsupported or unrecognized wav file type.");
            }
            ks3Var.m((int) (ks3Var.g() - ks3Var.getPosition()));
            this.c = 1;
            return 0;
        }
        long jP = -1;
        if (i2 == 1) {
            pt7 pt7Var = new pt7(8);
            ikb.a aVarA = ikb.a.a(ks3Var, pt7Var);
            if (aVarA.a != 1685272116) {
                ks3Var.l();
            } else {
                ks3Var.h(8);
                pt7Var.M(0);
                ks3Var.n(pt7Var.a, 0, 8);
                jP = pt7Var.p();
                ks3Var.m(((int) aVarA.b) + 8);
            }
            this.d = jP;
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    d43.c();
                    return 0;
                }
                xl7.r(this.g != -1);
                long position = this.g - ks3Var.getPosition();
                b bVar = this.e;
                bVar.getClass();
                return bVar.b(ks3Var, position) ? -1 : 0;
            }
            ks3Var.l();
            ikb.a aVarB = ikb.b(1684108385, ks3Var, new pt7(8));
            ks3Var.m(8);
            Pair pairCreate = Pair.create(Long.valueOf(ks3Var.getPosition()), Long.valueOf(aVarB.b));
            this.f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j = this.d;
            if (j != -1 && jLongValue == 4294967295L) {
                jLongValue = j;
            }
            this.g = ((long) this.f) + jLongValue;
            long jA = ks3Var.a();
            if (jA != -1 && this.g > jA) {
                md6.g("WavExtractor", "Data exceeds input length: " + this.g + ", " + jA);
                this.g = jA;
            }
            b bVar2 = this.e;
            bVar2.getClass();
            bVar2.c(this.f, this.g);
            this.c = 4;
            return 0;
        }
        pt7 pt7Var2 = new pt7(16);
        long j2 = ikb.b(1718449184, ks3Var, pt7Var2).b;
        xl7.r(j2 >= 16);
        ks3Var.n(pt7Var2.a, 0, 16);
        pt7Var2.M(0);
        int iS = pt7Var2.s();
        int iS2 = pt7Var2.s();
        int iR = pt7Var2.r();
        pt7Var2.r();
        int iS3 = pt7Var2.s();
        int iS4 = pt7Var2.s();
        int i4 = ((int) j2) - 16;
        if (i4 > 0) {
            bArr = new byte[i4];
            ks3Var.n(bArr, 0, i4);
            if (iS == 65534 && i4 == 24) {
                pt7 pt7Var3 = new pt7(bArr);
                pt7Var3.s();
                int iS5 = pt7Var3.s();
                if (iS5 != 0 && iS5 != iS4) {
                    throw ut7.c("validBits ( " + iS5 + ")  != bitsPerSample( " + iS4 + ") are not supported");
                }
                int iR2 = pt7Var3.r();
                if ((iR2 >> 18) != 0) {
                    throw ut7.c("invalid channel mask " + iR2);
                }
                if (iR2 != 0 && Integer.bitCount(iR2) != iS2) {
                    throw ut7.c("invalid number of channels (" + Integer.bitCount(iR2) + ") in channel mask " + iR2);
                }
                iS = pt7Var3.s();
                byte[] bArr2 = new byte[14];
                pt7Var3.k(bArr2, 0, 14);
                if (!Arrays.equals(bArr2, ikb.a) && !Arrays.equals(bArr2, ikb.b)) {
                    throw ut7.c("invalid wav format extension guid");
                }
            }
        } else {
            bArr = n6b.b;
        }
        byte[] bArr3 = bArr;
        int i5 = iS;
        ks3Var.m((int) (ks3Var.g() - ks3Var.getPosition()));
        hkb hkbVar = new hkb(i5, iS2, iR, iS3, iS4, bArr3);
        if (i5 == 17) {
            this.e = new a(this.a, this.b, hkbVar);
        } else if (i5 == 6) {
            this.e = new c(this.a, this.b, hkbVar, "audio/g711-alaw", -1);
        } else if (i5 == 7) {
            this.e = new c(this.a, this.b, hkbVar, "audio/g711-mlaw", -1);
        } else {
            if (i5 == 1) {
                iZ = n6b.z(iS4, ByteOrder.LITTLE_ENDIAN);
                i = iZ;
            } else {
                if (i5 != 3) {
                    if (i5 == 65534) {
                        iZ = n6b.z(iS4, ByteOrder.LITTLE_ENDIAN);
                        i = iZ;
                    }
                } else if (iS4 == 32) {
                    i = iZ;
                }
                i = 0;
            }
            if (i == 0) {
                throw ut7.c("Unsupported WAV format type: " + i5);
            }
            this.e = new c(this.a, this.b, hkbVar, "audio/raw", i);
        }
        this.c = 3;
        return 0;
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        return ikb.a(ks3Var);
    }

    @Override // defpackage.js3
    public final void e(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(j2);
        }
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        this.a = ls3Var;
        this.b = ls3Var.p(0, 1);
        ls3Var.k();
    }

    @Override // defpackage.js3
    public final void a() {
    }
}
