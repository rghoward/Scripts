package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vz6 implements js3 {
    public long A;
    public ls3 B;
    public b[] C;
    public long[][] D;
    public int E;
    public sy6 F;
    public final z4a.a a;
    public final int b;
    public final boolean c;
    public final pt7 d;
    public final pt7 e;
    public final pt7 f;
    public final pt7 g;
    public final ArrayDeque<sz6.a> h;
    public final e99 i;
    public final ArrayList j;
    public ul8 k;
    public int l;
    public int m;
    public long n;
    public int o;
    public pt7 p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public long x;
    public boolean y;
    public boolean z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements t89 {
        public final long a;
        public final b[] b;
        public final int c;

        public a(long j, b[] bVarArr, int i) {
            this.a = j;
            this.b = bVarArr;
            this.c = i;
        }

        @Override // defpackage.t89
        public final boolean b() {
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x005f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:29:0x0061  */
        /* JADX WARN: Code duplicated, block: B:31:0x0072  */
        /* JADX WARN: Code duplicated, block: B:34:0x0079  */
        /* JADX WARN: Code duplicated, block: B:37:0x0083  */
        /* JADX WARN: Code duplicated, block: B:39:0x0089  */
        /* JADX WARN: Code duplicated, block: B:42:0x0090  */
        /* JADX WARN: Code duplicated, block: B:43:0x0097  */
        /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:53:0x009c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:55:0x009c A[SYNTHETIC] */
        @Override // defpackage.t89
        public final t89.a e(long j) {
            long j2;
            long j3;
            long jMin;
            long j4;
            int i;
            long jMin2;
            isa isaVar;
            long[] jArr;
            int iA;
            int iA2;
            int iB;
            b[] bVarArr = this.b;
            int length = bVarArr.length;
            v89 v89Var = v89.c;
            if (length == 0) {
                return new t89.a(v89Var, v89Var);
            }
            int i2 = this.c;
            if (i2 != -1) {
                isa isaVar2 = bVarArr[i2].b;
                int iA3 = isaVar2.a(j);
                if (iA3 == -1) {
                    iA3 = isaVar2.b(j);
                }
                long[] jArr2 = isaVar2.c;
                long[] jArr3 = isaVar2.f;
                if (iA3 == -1) {
                    return new t89.a(v89Var, v89Var);
                }
                j3 = jArr3[iA3];
                j2 = jArr2[iA3];
                if (j3 < j && iA3 < isaVar2.b - 1 && (iB = isaVar2.b(j)) != -1 && iB != iA3) {
                    j4 = jArr3[iB];
                    jMin = jArr2[iB];
                }
                jMin2 = j2;
                for (i = 0; i < bVarArr.length; i++) {
                    if (i != i2) {
                        isaVar = bVarArr[i].b;
                        jArr = isaVar.c;
                        iA = isaVar.a(j3);
                        if (iA == -1) {
                            iA = isaVar.b(j3);
                        }
                        if (iA != -1) {
                            jMin2 = Math.min(jArr[iA], jMin2);
                        }
                        if (j4 == -9223372036854775807L) {
                            iA2 = isaVar.a(j4);
                            if (iA2 == -1) {
                                iA2 = isaVar.b(j4);
                            }
                            if (iA2 == -1) {
                                jMin = Math.min(jArr[iA2], jMin);
                            }
                        }
                    }
                }
                v89 v89Var2 = new v89(j3, jMin2);
                return j4 == -9223372036854775807L ? new t89.a(v89Var2, v89Var2) : new t89.a(v89Var2, new v89(j4, jMin));
            }
            j2 = Long.MAX_VALUE;
            j3 = j;
            jMin = -1;
            j4 = -9223372036854775807L;
            jMin2 = j2;
            while (i < bVarArr.length) {
                if (i != i2) {
                    isaVar = bVarArr[i].b;
                    jArr = isaVar.c;
                    iA = isaVar.a(j3);
                    if (iA == -1) {
                        iA = isaVar.b(j3);
                    }
                    if (iA != -1) {
                        jMin2 = Math.min(jArr[iA], jMin2);
                    }
                    if (j4 == -9223372036854775807L) {
                        iA2 = isaVar.a(j4);
                        if (iA2 == -1) {
                            iA2 = isaVar.b(j4);
                        }
                        if (iA2 == -1) {
                            jMin = Math.min(jArr[iA2], jMin);
                        }
                    }
                }
            }
            v89 v89Var3 = new v89(j3, jMin2);
            if (j4 == -9223372036854775807L) {
            }
        }

        @Override // defpackage.t89
        public final long g() {
            return this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final bsa a;
        public final isa b;
        public final hsa c;
        public final iya d;
        public int e;
        public id4 f;

        public b(bsa bsaVar, isa isaVar, hsa hsaVar) {
            this.a = bsaVar;
            this.b = isaVar;
            this.c = hsaVar;
            this.d = "audio/true-hd".equals(bsaVar.g.o) ? new iya() : null;
        }
    }

    public vz6(z4a.a aVar, int i) {
        this.a = aVar;
        this.b = i;
        this.c = (i & 256) != 0;
        k95.b bVar = k95.u;
        this.k = ul8.x;
        this.l = (i & 4) != 0 ? 3 : 0;
        this.i = new e99();
        this.j = new ArrayList();
        this.g = new pt7(16);
        this.h = new ArrayDeque<>();
        this.d = new pt7(f47.a);
        this.e = new pt7(6);
        this.f = new pt7();
        this.q = -1;
        this.B = ls3.e;
        this.C = new b[0];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:275:0x057b  */
    /* JADX WARN: Code duplicated, block: B:276:0x0587  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) throws ut7 {
        char c;
        int i;
        int i2;
        int i3;
        int iE;
        int i4;
        int i5;
        char c2;
        boolean z;
        boolean z2;
        sz6.a aVarPeek;
        if (!this.c || !this.z) {
            while (true) {
                int i6 = this.l;
                ArrayDeque<sz6.a> arrayDeque = this.h;
                int i7 = this.b;
                pt7 pt7Var = this.f;
                int i8 = 4;
                int i9 = 0;
                int i10 = 2;
                if (i6 == 0) {
                    int i11 = this.o;
                    pt7 pt7Var2 = this.g;
                    if (i11 == 0) {
                        if (ks3Var.b(pt7Var2.a, 0, 8, true)) {
                            this.o = 8;
                            pt7Var2.M(0);
                            this.n = pt7Var2.B();
                            this.m = pt7Var2.m();
                        } else if (this.E == 2 && (i7 & 2) != 0) {
                            hsa hsaVarP = this.B.p(0, 4);
                            sy6 sy6Var = this.F;
                            su6 su6Var = sy6Var == null ? null : new su6(sy6Var);
                            id4.a aVar = new id4.a();
                            aVar.k = su6Var;
                            hy1.b(aVar, hsaVarP);
                            this.B.k();
                            this.B.t(new t89.b(-9223372036854775807L));
                            return -1;
                        }
                    }
                    long j = this.n;
                    if (j == 1) {
                        ks3Var.readFully(pt7Var2.a, 8, 8);
                        this.o += 8;
                        this.n = pt7Var2.F();
                    } else if (j == 0) {
                        long jA = ks3Var.a();
                        if (jA == -1 && (aVarPeek = arrayDeque.peek()) != null) {
                            jA = aVarPeek.b;
                        }
                        if (jA != -1) {
                            this.n = (jA - ks3Var.getPosition()) + ((long) this.o);
                        }
                    }
                    long j2 = this.n;
                    int i12 = this.o;
                    long j3 = i12;
                    if (j2 < j3) {
                        if (this.m != 1718773093 || i12 != 8) {
                            throw ut7.c("Atom size less than header length (unsupported).");
                        }
                        this.n = j3;
                    }
                    int i13 = this.m;
                    if (i13 == 1836019574 || i13 == 1953653099 || i13 == 1835297121 || i13 == 1835626086 || i13 == 1937007212 || i13 == 1701082227 || i13 == 1835365473 || i13 == 1635284069) {
                        long position = ks3Var.getPosition();
                        long j4 = this.n;
                        long j5 = this.o;
                        long j6 = (position + j4) - j5;
                        if (j4 != j5 && this.m == 1835365473) {
                            pt7Var.J(8);
                            ks3Var.n(pt7Var.a, 0, 8);
                            iv0.a(pt7Var);
                            ks3Var.m(pt7Var.b);
                            ks3Var.l();
                        }
                        arrayDeque.push(new sz6.a(this.m, j6));
                        if (this.n == this.o) {
                            h(j6);
                        } else {
                            this.l = 0;
                            this.o = 0;
                        }
                    } else if (i13 == 1835296868 || i13 == 1836476516 || i13 == 1751411826 || i13 == 1937011556 || i13 == 1937011827 || i13 == 1937011571 || i13 == 1668576371 || i13 == 1701606260 || i13 == 1937011555 || i13 == 1937011578 || i13 == 1937013298 || i13 == 1937007471 || i13 == 1668232756 || i13 == 1953196132 || i13 == 1718909296 || i13 == 1969517665 || i13 == 1801812339 || i13 == 1768715124) {
                        xl7.r(i12 == 8);
                        xl7.r(this.n <= 2147483647L);
                        pt7 pt7Var3 = new pt7((int) this.n);
                        System.arraycopy(pt7Var2.a, 0, pt7Var3.a, 0, 8);
                        this.p = pt7Var3;
                        this.l = 1;
                    } else {
                        long position2 = ks3Var.getPosition();
                        long j7 = this.o;
                        long j8 = position2 - j7;
                        if (this.m == 1836086884) {
                            this.F = new sy6(0L, j8, -9223372036854775807L, j8 + j7, this.n - j7);
                        }
                        this.p = null;
                        this.l = 1;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                d43.c();
                                return 0;
                            }
                            e99 e99Var = this.i;
                            ArrayList arrayList = e99Var.a;
                            int i14 = e99Var.b;
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    short s = 2817;
                                    int i15 = 8;
                                    short s2 = 2192;
                                    if (i14 == 2) {
                                        long jA2 = ks3Var.a();
                                        int i16 = e99Var.c - 20;
                                        pt7 pt7Var4 = new pt7(i16);
                                        ks3Var.readFully(pt7Var4.a, 0, i16);
                                        int i17 = 0;
                                        while (i17 < i16 / 12) {
                                            pt7Var4.N(i10);
                                            pt7Var4.f(i10);
                                            byte[] bArr = pt7Var4.a;
                                            int i18 = pt7Var4.b;
                                            int i19 = i10;
                                            int i20 = i18 + 1;
                                            pt7Var4.b = i20;
                                            int i21 = bArr[i18] & MessagePack.Code.EXT_TIMESTAMP;
                                            pt7Var4.b = i18 + 2;
                                            short s3 = (short) (i21 | ((bArr[i20] & MessagePack.Code.EXT_TIMESTAMP) << 8));
                                            if (s3 != s2 && s3 != 2816 && s3 != s) {
                                                if (s3 != 2819 && s3 != 2820) {
                                                    pt7Var4.N(i15);
                                                }
                                                i17++;
                                                i16 = i16;
                                                i10 = i19;
                                                s = 2817;
                                                s2 = 2192;
                                                i15 = 8;
                                            }
                                            arrayList.add(new e99.a(pt7Var4.o(), (jA2 - ((long) e99Var.c)) - ((long) pt7Var4.o())));
                                            i17++;
                                            i16 = i16;
                                            i10 = i19;
                                            s = 2817;
                                            s2 = 2192;
                                            i15 = 8;
                                        }
                                        if (arrayList.isEmpty()) {
                                            o68Var.a = 0L;
                                        } else {
                                            e99Var.b = 3;
                                            o68Var.a = ((e99.a) arrayList.get(0)).a;
                                        }
                                    } else {
                                        if (i14 != 3) {
                                            d43.c();
                                            return 0;
                                        }
                                        long position3 = ks3Var.getPosition();
                                        int iA = (int) ((ks3Var.a() - ks3Var.getPosition()) - ((long) e99Var.c));
                                        pt7 pt7Var5 = new pt7(iA);
                                        ks3Var.readFully(pt7Var5.a, 0, iA);
                                        int i22 = 0;
                                        while (i22 < arrayList.size()) {
                                            e99.a aVar2 = (e99.a) arrayList.get(i22);
                                            int i23 = i9;
                                            pt7Var5.M((int) (aVar2.a - position3));
                                            pt7Var5.N(i8);
                                            int iO = pt7Var5.o();
                                            Charset charset = StandardCharsets.UTF_8;
                                            int i24 = i23;
                                            String strX = pt7Var5.x(iO, charset);
                                            switch (strX.hashCode()) {
                                                case -1711564334:
                                                    if (!strX.equals("SlowMotion_Data")) {
                                                        i5 = -1;
                                                    } else {
                                                        i5 = i24;
                                                    }
                                                    break;
                                                case -1332107749:
                                                    if (!strX.equals("Super_SlowMotion_Edit_Data")) {
                                                        i5 = -1;
                                                    } else {
                                                        i5 = 1;
                                                    }
                                                    break;
                                                case -1251387154:
                                                    if (!strX.equals("Super_SlowMotion_Data")) {
                                                        i5 = -1;
                                                    } else {
                                                        i5 = 2;
                                                    }
                                                    break;
                                                case -830665521:
                                                    if (!strX.equals("Super_SlowMotion_Deflickering_On")) {
                                                        i5 = -1;
                                                    } else {
                                                        i5 = 3;
                                                    }
                                                    break;
                                                case 1760745220:
                                                    if (!strX.equals("Super_SlowMotion_BGM")) {
                                                        i5 = -1;
                                                    } else {
                                                        i5 = 4;
                                                    }
                                                    break;
                                                default:
                                                    i5 = -1;
                                                    break;
                                            }
                                            switch (i5) {
                                                case 0:
                                                    c2 = 2192;
                                                    break;
                                                case 1:
                                                    c2 = 2819;
                                                    break;
                                                case 2:
                                                    c2 = 2816;
                                                    break;
                                                case 3:
                                                    c2 = 2820;
                                                    break;
                                                case 4:
                                                    c2 = 2817;
                                                    break;
                                                default:
                                                    throw ut7.a(null, "Invalid SEF name");
                                            }
                                            int i25 = aVar2.b - (iO + 8);
                                            if (c2 == 2192) {
                                                ArrayList arrayList2 = new ArrayList();
                                                List<String> listB = e99.e.b(pt7Var5.x(i25, charset));
                                                int i26 = i24;
                                                while (i26 < listB.size()) {
                                                    List<String> listB2 = e99.d.b(listB.get(i26));
                                                    if (listB2.size() != 3) {
                                                        throw ut7.a(null, null);
                                                    }
                                                    try {
                                                        arrayList2.add(new ds9.a(Long.parseLong(listB2.get(i24)), 1 << (Integer.parseInt(listB2.get(2)) - 1), Long.parseLong(listB2.get(1))));
                                                        i26++;
                                                        i24 = 0;
                                                    } catch (NumberFormatException e) {
                                                        throw ut7.a(e, null);
                                                    }
                                                }
                                                this.j.add(new ds9(arrayList2));
                                            } else if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != 2820) {
                                                d43.c();
                                                return i24;
                                            }
                                            i22++;
                                            i9 = 0;
                                            i8 = 4;
                                        }
                                        o68Var.a = 0L;
                                    }
                                } else {
                                    pt7 pt7Var6 = new pt7(8);
                                    ks3Var.readFully(pt7Var6.a, 0, 8);
                                    e99Var.c = pt7Var6.o() + 8;
                                    if (pt7Var6.m() != 1397048916) {
                                        o68Var.a = 0L;
                                    } else {
                                        o68Var.a = ks3Var.getPosition() - ((long) (e99Var.c - 12));
                                        e99Var.b = 2;
                                    }
                                }
                                i4 = 1;
                            } else {
                                long jA3 = ks3Var.a();
                                o68Var.a = (jA3 == -1 || jA3 < 8) ? 0L : jA3 - 8;
                                i4 = 1;
                                e99Var.b = 1;
                            }
                            if (o68Var.a != 0) {
                                return i4;
                            }
                            this.l = 0;
                            this.o = 0;
                            return i4;
                        }
                        long position4 = ks3Var.getPosition();
                        if (this.q == -1) {
                            int i27 = 0;
                            int i28 = -1;
                            int i29 = -1;
                            boolean z3 = true;
                            boolean z4 = true;
                            long j9 = Long.MAX_VALUE;
                            long j10 = Long.MAX_VALUE;
                            long j11 = Long.MAX_VALUE;
                            while (true) {
                                b[] bVarArr = this.C;
                                if (i27 >= bVarArr.length) {
                                    break;
                                }
                                b bVar = bVarArr[i27];
                                int i30 = bVar.e;
                                isa isaVar = bVar.b;
                                if (i30 != isaVar.b) {
                                    long j12 = isaVar.c[i30];
                                    long[][] jArr = this.D;
                                    jArr.getClass();
                                    long j13 = jArr[i27][i30];
                                    long j14 = j12 - position4;
                                    boolean z5 = j14 < 0 || j14 >= 262144;
                                    if ((!z5 && z4) || (z5 == z4 && j14 < j11)) {
                                        z4 = z5;
                                        i29 = i27;
                                        j11 = j14;
                                        j10 = j13;
                                    }
                                    if (j13 < j9) {
                                        z3 = z5;
                                        i28 = i27;
                                        j9 = j13;
                                    }
                                }
                                i27++;
                            }
                            if (j9 == Long.MAX_VALUE || !z3 || j10 < j9 + 10485760) {
                                i28 = i29;
                            }
                            this.q = i28;
                            if (i28 == -1) {
                                return -1;
                            }
                        }
                        b bVar2 = this.C[this.q];
                        hsa hsaVar = bVar2.c;
                        isa isaVar2 = bVar2.b;
                        bsa bsaVar = bVar2.a;
                        int i31 = bVar2.e;
                        long[] jArr2 = isaVar2.c;
                        int[] iArr = isaVar2.d;
                        long j15 = jArr2[i31] + this.A;
                        int i32 = iArr[i31];
                        iya iyaVar = bVar2.d;
                        long j16 = (j15 - position4) + ((long) this.r);
                        if (j16 < 0 || j16 >= 262144) {
                            o68Var.a = j15;
                            return 1;
                        }
                        int i33 = bsaVar.h;
                        int i34 = bsaVar.k;
                        id4 id4Var = bsaVar.g;
                        if (i33 == 1) {
                            j16 += 8;
                            i32 -= 8;
                        }
                        int i35 = i32;
                        ks3Var.m((int) j16);
                        String str = id4Var.o;
                        String str2 = id4Var.o;
                        if (!Objects.equals(str, "video/avc") ? !Objects.equals(str2, "video/hevc") || (i7 & 128) == 0 : (i7 & 32) == 0) {
                            c = 1;
                            this.u = true;
                        } else {
                            c = 1;
                        }
                        if (i34 != 0) {
                            pt7 pt7Var7 = this.e;
                            byte[] bArr2 = pt7Var7.a;
                            bArr2[0] = 0;
                            bArr2[c] = 0;
                            bArr2[2] = 0;
                            int i36 = 4 - i34;
                            int i37 = i35 + i36;
                            while (this.s < i37) {
                                int i38 = this.t;
                                if (i38 == 0) {
                                    if (this.u || f47.e(id4Var) + i34 > iArr[i31] - this.r) {
                                        i3 = i34;
                                        iE = 0;
                                    } else {
                                        iE = f47.e(id4Var);
                                        i3 = i34 + iE;
                                    }
                                    ks3Var.readFully(bArr2, i36, i3);
                                    i2 = i37;
                                    this.r += i3;
                                    pt7Var7.M(0);
                                    int iM = pt7Var7.m();
                                    if (iM < 0) {
                                        throw ut7.a(null, "Invalid NAL length");
                                    }
                                    this.t = iM - iE;
                                    pt7 pt7Var8 = this.d;
                                    pt7Var8.M(0);
                                    int i39 = iE;
                                    hsaVar.e(4, pt7Var8);
                                    this.s += 4;
                                    if (i39 > 0) {
                                        hsaVar.e(i39, pt7Var7);
                                        this.s += i39;
                                        if (f47.d(bArr2, i39, id4Var)) {
                                            this.u = true;
                                        }
                                    }
                                } else {
                                    i2 = i37;
                                    int iF = hsaVar.f(ks3Var, i38, false);
                                    this.r += iF;
                                    this.s += iF;
                                    this.t -= iF;
                                }
                                i37 = i2;
                            }
                            i = i37;
                        } else {
                            if ("audio/ac4".equals(str2)) {
                                if (this.s == 0) {
                                    j3.a(i35, pt7Var);
                                    hsaVar.e(7, pt7Var);
                                    this.s += 7;
                                }
                                i35 += 7;
                            } else if (bVar2.f != null && Objects.equals(str2, "audio/mpeg")) {
                                id4 id4Var2 = bVar2.f;
                                pt7Var.J(4);
                                ks3Var.n(pt7Var.a, 0, 4);
                                ks3Var.l();
                                a07.a aVar3 = new a07.a();
                                hsa hsaVar2 = bVar2.c;
                                if (aVar3.a(pt7Var.m()) && !Objects.equals(id4Var2.o, aVar3.b)) {
                                    id4.a aVarA = id4Var2.a();
                                    String str3 = aVar3.b;
                                    str3.getClass();
                                    aVarA.n = fv6.n(str3);
                                    id4Var2 = new id4(aVarA);
                                }
                                hsaVar2.g(id4Var2);
                                bVar2.f = null;
                            } else if (iyaVar != null) {
                                iyaVar.c(ks3Var);
                            }
                            while (true) {
                                int i40 = this.s;
                                if (i40 >= i35) {
                                    break;
                                }
                                int iF2 = hsaVar.f(ks3Var, i35 - i40, false);
                                this.r += iF2;
                                this.s += iF2;
                                this.t -= iF2;
                            }
                            i = i35;
                        }
                        long j17 = isaVar2.f[i31];
                        int i41 = isaVar2.g[i31];
                        if (!this.u) {
                            i41 |= 67108864;
                        }
                        int i42 = i41;
                        if (iyaVar != null) {
                            iyaVar.b(hsaVar, j17, i42, i, 0, null);
                            if (i31 + 1 == isaVar2.b) {
                                iyaVar.a(hsaVar, null);
                            }
                        } else {
                            hsaVar.a(j17, i42, i, 0, null);
                        }
                        bVar2.e++;
                        this.q = -1;
                        this.r = 0;
                        this.s = 0;
                        this.t = 0;
                        this.u = false;
                        return 0;
                    }
                    long j18 = this.n - ((long) this.o);
                    long position5 = ks3Var.getPosition() + j18;
                    pt7 pt7Var9 = this.p;
                    if (pt7Var9 != null) {
                        ks3Var.readFully(pt7Var9.a, this.o, (int) j18);
                        if (this.m == 1718909296) {
                            this.v = true;
                            pt7Var9.M(8);
                            int iM2 = pt7Var9.m();
                            int i43 = iM2 != 1751476579 ? iM2 != 1903435808 ? 0 : 1 : 2;
                            if (i43 == 0) {
                                pt7Var9.N(4);
                                do {
                                    if (pt7Var9.a() <= 0) {
                                        i43 = 0;
                                        break;
                                    }
                                    int iM3 = pt7Var9.m();
                                    i43 = iM3 != 1751476579 ? iM3 != 1903435808 ? 0 : 1 : 2;
                                } while (i43 == 0);
                            }
                            this.E = i43;
                        } else if (!arrayDeque.isEmpty()) {
                            arrayDeque.peek().c.add(new sz6.b(this.m, pt7Var9));
                        }
                    } else {
                        if (!this.v && this.m == 1835295092) {
                            this.E = 1;
                        }
                        if (j18 < 262144) {
                            ks3Var.m((int) j18);
                        } else {
                            o68Var.a = ks3Var.getPosition() + j18;
                            z = true;
                        }
                        h(position5);
                        if (this.w) {
                            this.y = true;
                            o68Var.a = this.x;
                            this.w = false;
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (z2 && this.l != 2) {
                            return 1;
                        }
                    }
                    z = false;
                    h(position5);
                    if (this.w) {
                        this.y = true;
                        o68Var.a = this.x;
                        this.w = false;
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        continue;
                    }
                }
            }
        }
        return -1;
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        ul8 ul8VarV;
        nv9 nv9VarI = ov9.i(ks3Var, false, (this.b & 2) != 0);
        if (nv9VarI != null) {
            ul8VarV = k95.v(nv9VarI);
        } else {
            k95.b bVar = k95.u;
            ul8VarV = ul8.x;
        }
        this.k = ul8VarV;
        return nv9VarI == null;
    }

    @Override // defpackage.js3
    public final void e(long j, long j2) {
        this.h.clear();
        this.o = 0;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.z = false;
        if (j == 0) {
            if (this.l != 3) {
                this.l = 0;
                this.o = 0;
                return;
            } else {
                e99 e99Var = this.i;
                e99Var.a.clear();
                e99Var.b = 0;
                this.j.clear();
                return;
            }
        }
        for (b bVar : this.C) {
            isa isaVar = bVar.b;
            int iA = isaVar.a(j2);
            if (iA == -1) {
                iA = isaVar.b(j2);
            }
            bVar.e = iA;
            iya iyaVar = bVar.d;
            if (iyaVar != null) {
                iyaVar.b = false;
                iyaVar.c = 0;
            }
        }
    }

    @Override // defpackage.js3
    public final List f() {
        return this.k;
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        if ((this.b & 16) == 0) {
            ls3Var = new a5a(ls3Var, this.a);
        }
        this.B = ls3Var;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0310  */
    /* JADX WARN: Code duplicated, block: B:165:0x0320  */
    /* JADX WARN: Code duplicated, block: B:174:0x033b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0341  */
    /* JADX WARN: Code duplicated, block: B:179:0x035c  */
    /* JADX WARN: Code duplicated, block: B:181:0x0365  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:264:0x0134 A[EDGE_INSN: B:264:0x0134->B:74:0x0134 BREAK  A[LOOP:9: B:62:0x0102->B:72:0x012c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x012c A[LOOP:9: B:62:0x0102->B:72:0x012c, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void h(long j) {
        int i;
        ArrayList arrayList;
        su6 su6VarF;
        boolean z;
        ArrayDeque<sz6.a> arrayDeque;
        boolean z2;
        su6 su6VarK;
        long[][] jArr;
        String str;
        int i2;
        long j2;
        int i3;
        su6 su6Var;
        ArrayList arrayList2;
        su6 su6Var2;
        su6 su6Var3;
        su6 su6Var4;
        ArrayList arrayList3;
        int i4;
        int i5;
        int i6;
        int i7;
        su6.a aVar;
        su6.a aVar2;
        su6.a aVar3;
        int i8;
        while (true) {
            ArrayDeque<sz6.a> arrayDeque2 = this.h;
            int i9 = 0;
            if (arrayDeque2.isEmpty() || arrayDeque2.peek().b != j) {
                break;
            }
            sz6.a aVarPop = arrayDeque2.pop();
            if (aVarPop.a == 1836019574) {
                sz6.a aVarB = aVarPop.b(1835365473);
                ArrayList arrayList4 = new ArrayList();
                boolean z3 = this.c;
                long j3 = 0;
                int i10 = this.b;
                if (aVarB != null) {
                    su6VarF = iv0.f(aVarB);
                    if (this.y) {
                        su6VarF.getClass();
                        su6.a[] aVarArr = su6VarF.a;
                        int length = aVarArr.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                aVar2 = null;
                                break;
                            }
                            su6.a aVar4 = aVarArr[i11];
                            if (bl6.class.isAssignableFrom(aVar4.getClass())) {
                                aVar2 = (su6.a) bl6.class.cast(aVar4);
                                if (!((bl6) aVar2).a.equals("auxiliary.tracks.interleaved")) {
                                    aVar2 = null;
                                }
                            } else {
                                aVar2 = null;
                            }
                            if (aVar2 != null) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                        bl6 bl6Var = (bl6) aVar2;
                        if (bl6Var != null && bl6Var.b[0] == 0) {
                            this.A = this.x + 16;
                        }
                        int length2 = aVarArr.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length2) {
                                aVar3 = null;
                                break;
                            }
                            su6.a aVar5 = aVarArr[i12];
                            if (bl6.class.isAssignableFrom(aVar5.getClass())) {
                                aVar3 = (su6.a) bl6.class.cast(aVar5);
                                if (!((bl6) aVar3).a.equals("auxiliary.tracks.map")) {
                                    aVar3 = null;
                                }
                            } else {
                                aVar3 = null;
                            }
                            if (aVar3 != null) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        bl6 bl6Var2 = (bl6) aVar3;
                        bl6Var2.getClass();
                        ArrayList arrayListD = bl6Var2.d();
                        ArrayList arrayList5 = new ArrayList(arrayListD.size());
                        for (int i13 = 0; i13 < arrayListD.size(); i13++) {
                            int iIntValue = ((Integer) arrayListD.get(i13)).intValue();
                            if (iIntValue == 0) {
                                i8 = 1;
                            } else if (iIntValue != 1) {
                                i8 = 3;
                                if (iIntValue != 2) {
                                    i8 = iIntValue != 3 ? 0 : 4;
                                }
                            } else {
                                i8 = 2;
                            }
                            arrayList5.add(Integer.valueOf(i8));
                        }
                        i = 0;
                        arrayList = arrayList5;
                    } else {
                        if (su6VarF == null || (i10 & 64) == 0) {
                            i = 0;
                        } else {
                            su6.a[] aVarArr2 = su6VarF.a;
                            int length3 = aVarArr2.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length3) {
                                    i = i9;
                                    aVar = null;
                                    break;
                                }
                                su6.a aVar6 = aVarArr2[i14];
                                if (bl6.class.isAssignableFrom(aVar6.getClass())) {
                                    aVar = (su6.a) bl6.class.cast(aVar6);
                                    i = i9;
                                    if (!((bl6) aVar).a.equals("auxiliary.tracks.offset")) {
                                    }
                                    if (aVar != null) {
                                        break;
                                    }
                                    i14++;
                                    i9 = i;
                                } else {
                                    i = i9;
                                }
                                aVar = null;
                                if (aVar != null) {
                                    break;
                                    break;
                                } else {
                                    i14++;
                                    i9 = i;
                                }
                            }
                            bl6 bl6Var3 = (bl6) aVar;
                            if (bl6Var3 != null) {
                                long jF = new pt7(bl6Var3.b).F();
                                if (jF > 0) {
                                    this.x = jF;
                                    this.w = true;
                                    arrayDeque = arrayDeque2;
                                    z2 = true;
                                    z = z3;
                                }
                                arrayDeque.clear();
                                this.z = z2;
                                if (this.w && !z) {
                                    this.l = 2;
                                }
                            }
                        }
                        arrayList = arrayList4;
                    }
                } else {
                    i = 0;
                    arrayList = arrayList4;
                    su6VarF = null;
                }
                ArrayList arrayList6 = new ArrayList();
                boolean z4 = this.E == 1 ? 1 : i;
                lj4 lj4Var = new lj4();
                sz6.b bVarC = aVarPop.c(1969517665);
                if (bVarC != null) {
                    su6VarK = iv0.k(bVarC);
                    lj4Var.b(su6VarK);
                } else {
                    su6VarK = null;
                }
                sz6.b bVarC2 = aVarPop.c(1836476516);
                bVarC2.getClass();
                su6.a[] aVarArr3 = new su6.a[1];
                aVarArr3[i] = iv0.g(bVarC2.b);
                su6 su6Var5 = new su6(aVarArr3);
                su6 su6Var6 = su6VarK;
                ArrayList arrayListJ = iv0.j(aVarPop, lj4Var, -9223372036854775807L, null, (i10 & 1) != 0 ? 1 : i, z4, new tz6(), this.c);
                if (this.y) {
                    boolean z5 = arrayList.size() == arrayListJ.size() ? 1 : i;
                    Locale locale = Locale.US;
                    xl7.q(a30.b("The number of auxiliary track types from metadata (", ") is not same as the number of auxiliary tracks (", ")", arrayList.size(), arrayListJ.size()), z5);
                }
                String strD = l96.d(arrayListJ);
                int i15 = i;
                int i16 = i15;
                long j4 = -9223372036854775807L;
                int size = -1;
                while (i15 < arrayListJ.size()) {
                    isa isaVar = (isa) arrayListJ.get(i15);
                    int i17 = isaVar.b;
                    ArrayDeque<sz6.a> arrayDeque3 = arrayDeque2;
                    long[] jArr2 = isaVar.f;
                    bsa bsaVar = isaVar.a;
                    if (i17 == 0) {
                        arrayList = arrayList;
                        str = strD;
                        i2 = i15;
                        arrayList3 = arrayList6;
                        su6Var3 = su6Var6;
                        su6Var4 = su6Var5;
                    } else {
                        str = strD;
                        ls3 ls3Var = this.B;
                        int i18 = i16 + 1;
                        int i19 = bsaVar.b;
                        ArrayList arrayList7 = arrayList6;
                        id4 id4Var = bsaVar.g;
                        hsa hsaVarP = ls3Var.p(i16, i19);
                        b bVar = new b(bsaVar, isaVar, hsaVarP);
                        long j5 = bsaVar.e;
                        if (j5 == -9223372036854775807L) {
                            j5 = isaVar.i;
                        }
                        hsaVarP.d(j5);
                        long jMax = Math.max(j4, j5);
                        String str2 = id4Var.o;
                        String str3 = id4Var.o;
                        boolean zEquals = "audio/true-hd".equals(str2);
                        int i20 = isaVar.e;
                        int i21 = zEquals ? i20 * 16 : i20 + 30;
                        id4.a aVarA = id4Var.a();
                        aVarA.o = i21;
                        if (i19 == 2) {
                            int i22 = id4Var.f;
                            if ((i10 & 8) != 0) {
                                i22 |= size == -1 ? 1 : 2;
                            }
                            int i23 = i22;
                            if (this.y) {
                                i7 = i23 | 32768;
                                aVarA.g = ((Integer) arrayList.get(i15)).intValue();
                            } else {
                                i7 = i23;
                            }
                            aVarA.f = i7;
                        } else {
                            arrayList = arrayList;
                        }
                        int[] iArr = isaVar.h;
                        boolean z6 = isaVar.j;
                        if (!fv6.m(str3) || jArr2.length <= 0) {
                            i2 = i15;
                        } else {
                            int iMin = Math.min(z6 ? isaVar.b : iArr.length, 20);
                            xl7.r(j5 != -9223372036854775807L ? 1 : i);
                            i2 = i15;
                            long jMin = Math.min(j5, 10000000L);
                            int i24 = i;
                            int i25 = i24;
                            int i26 = -1;
                            while (i24 < iMin) {
                                int i27 = z6 ? i24 : iArr[i24];
                                long j6 = jArr2[i27];
                                if (j6 > jMin) {
                                    break;
                                }
                                if (j6 >= 0) {
                                    i6 = iMin;
                                    int i28 = isaVar.d[i27];
                                    if (i28 > i25) {
                                        i25 = i28;
                                        i26 = i27;
                                    }
                                } else {
                                    i6 = iMin;
                                }
                                i24++;
                                iMin = i6;
                            }
                            if (i26 != -1) {
                                j2 = jArr2[i26];
                            }
                            if (j2 != -9223372036854775807L) {
                                nla nlaVar = new nla(j2);
                                i3 = 1;
                                su6.a[] aVarArr4 = new su6.a[1];
                                aVarArr4[i] = nlaVar;
                                su6Var = new su6(aVarArr4);
                            } else {
                                i3 = 1;
                                su6Var = null;
                            }
                            if (i19 == i3 && (i4 = lj4Var.a) != -1 && (i5 = lj4Var.b) != -1) {
                                aVarA.I = i4;
                                aVarA.J = i5;
                            }
                            su6 su6Var7 = id4Var.l;
                            arrayList2 = this.j;
                            if (arrayList2.isEmpty()) {
                                su6Var2 = null;
                            } else {
                                su6Var2 = new su6(arrayList2);
                            }
                            su6Var3 = su6Var6;
                            su6Var4 = su6Var5;
                            bv6.f(i19, su6VarF, aVarA, su6Var7, su6Var2, su6Var3, su6Var4, su6Var);
                            aVarA.m = fv6.n(str);
                            if (Objects.equals(str3, "audio/mpeg")) {
                                bVar.f = new id4(aVarA);
                            } else {
                                hy1.b(aVarA, bVar.c);
                            }
                            if (i19 == 2 && size == -1) {
                                size = arrayList7.size();
                            }
                            arrayList3 = arrayList7;
                            arrayList3.add(bVar);
                            i16 = i18;
                            j4 = jMax;
                        }
                        j2 = -9223372036854775807L;
                        if (j2 != -9223372036854775807L) {
                            nla nlaVar2 = new nla(j2);
                            i3 = 1;
                            su6.a[] aVarArr5 = new su6.a[1];
                            aVarArr5[i] = nlaVar2;
                            su6Var = new su6(aVarArr5);
                        } else {
                            i3 = 1;
                            su6Var = null;
                        }
                        if (i19 == i3) {
                            aVarA.I = i4;
                            aVarA.J = i5;
                        }
                        su6 su6Var8 = id4Var.l;
                        arrayList2 = this.j;
                        if (arrayList2.isEmpty()) {
                            su6Var2 = null;
                        } else {
                            su6Var2 = new su6(arrayList2);
                        }
                        su6Var3 = su6Var6;
                        su6Var4 = su6Var5;
                        bv6.f(i19, su6VarF, aVarA, su6Var8, su6Var2, su6Var3, su6Var4, su6Var);
                        aVarA.m = fv6.n(str);
                        if (Objects.equals(str3, "audio/mpeg")) {
                            bVar.f = new id4(aVarA);
                        } else {
                            hy1.b(aVarA, bVar.c);
                        }
                        if (i19 == 2) {
                            size = arrayList7.size();
                        }
                        arrayList3 = arrayList7;
                        arrayList3.add(bVar);
                        i16 = i18;
                        j4 = jMax;
                    }
                    arrayList6 = arrayList3;
                    su6Var6 = su6Var3;
                    su6Var5 = su6Var4;
                    arrayDeque2 = arrayDeque3;
                    arrayListJ = arrayListJ;
                    z3 = z3;
                    arrayList = arrayList;
                    i15 = i2 + 1;
                    strD = str;
                }
                arrayDeque = arrayDeque2;
                z = z3;
                int i29 = -1;
                boolean z7 = true;
                b[] bVarArr = (b[]) arrayList6.toArray(new b[i]);
                this.C = bVarArr;
                if (z) {
                    jArr = null;
                } else {
                    jArr = new long[bVarArr.length][];
                    int[] iArr2 = new int[bVarArr.length];
                    long[] jArr3 = new long[bVarArr.length];
                    boolean[] zArr = new boolean[bVarArr.length];
                    for (int i30 = 0; i30 < bVarArr.length; i30++) {
                        jArr[i30] = new long[bVarArr[i30].b.b];
                        jArr3[i30] = bVarArr[i30].b.f[0];
                    }
                    int i31 = 0;
                    while (i31 < bVarArr.length) {
                        long j7 = Long.MAX_VALUE;
                        int i32 = i29;
                        for (int i33 = 0; i33 < bVarArr.length; i33++) {
                            if (!zArr[i33]) {
                                long j8 = jArr3[i33];
                                if (j8 <= j7) {
                                    i32 = i33;
                                    j7 = j8;
                                }
                            }
                        }
                        int i34 = iArr2[i32];
                        long[] jArr4 = jArr[i32];
                        jArr4[i34] = j3;
                        isa isaVar2 = bVarArr[i32].b;
                        boolean z8 = z7;
                        int[] iArr3 = iArr2;
                        j3 += (long) isaVar2.d[i34];
                        int i35 = i34 + 1;
                        iArr3[i32] = i35;
                        if (i35 < jArr4.length) {
                            jArr3[i32] = isaVar2.f[i35];
                        } else {
                            zArr[i32] = z8;
                            i31++;
                        }
                        iArr2 = iArr3;
                        z7 = z8;
                        i29 = -1;
                    }
                }
                z2 = z7;
                this.D = jArr;
                this.B.k();
                this.B.t(new a(j4, this.C, size));
                arrayDeque.clear();
                this.z = z2;
                if (this.w) {
                }
            } else if (!arrayDeque2.isEmpty()) {
                arrayDeque2.peek().d.add(aVarPop);
            }
        }
        if (this.l != 2) {
            this.l = 0;
            this.o = 0;
        }
    }

    @Override // defpackage.js3
    public final void a() {
    }
}
