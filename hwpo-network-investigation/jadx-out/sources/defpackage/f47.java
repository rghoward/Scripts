package defpackage;

import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f47 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int[] e;
        public final int f;

        public c(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = iArr;
            this.f = i4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public final k95<c> a;
        public final int[] b;

        public d(ul8 ul8Var, int[] iArr) {
            this.a = k95.q(ul8Var);
            this.b = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public e(int i, int i2, int i3, int i4, int i5) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f {
        public final k95<e> a;
        public final int[] b;

        public f(ul8 ul8Var, int[] iArr) {
            this.a = k95.q(ul8Var);
            this.b = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g {
        public final int a;

        public g(int i) {
            this.a = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h {
        public final int a;
        public final c b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final float i;
        public final int j;
        public final int k;
        public final int l;
        public final int m;

        public h(int i, c cVar, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, int i10, int i11) {
            this.a = i;
            this.b = cVar;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.i = f;
            this.j = i8;
            this.k = i9;
            this.l = i10;
            this.m = i11;
            this.g = i6;
            this.h = i7;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i {
        public final int a;
        public final int b;
        public final int c;

        public i(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j {
        public final k95<i> a;
        public final int[] b;

        public j(ul8 ul8Var, int[] iArr) {
            this.a = k95.q(ul8Var);
            this.b = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k {
        public final k95<a> a;
        public final d b;
        public final f c;
        public final j d;

        public k(ul8 ul8Var, d dVar, f fVar, j jVar) {
            k95<a> k95VarQ;
            if (ul8Var != null) {
                k95VarQ = k95.q(ul8Var);
            } else {
                k95.b bVar = k95.u;
                k95VarQ = ul8.x;
            }
            this.a = k95VarQ;
            this.b = dVar;
            this.c = fVar;
            this.d = jVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class l {
        public final int a;
        public final boolean b;

        public l(int i, boolean z, int i2) {
            this.a = i2;
            this.b = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class m {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final float g;
        public final int h;
        public final int i;
        public final boolean j;
        public final boolean k;
        public final int l;
        public final int m;
        public final int n;
        public final boolean o;
        public final int p;
        public final int q;
        public final int r;
        public final int s;

        public m(int i, int i2, int i3, int i4, int i5, int i6, float f, int i7, int i8, boolean z, boolean z2, int i9, int i10, int i11, boolean z3, int i12, int i13, int i14, int i15) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = f;
            this.h = i7;
            this.i = i8;
            this.j = z;
            this.k = z2;
            this.l = i9;
            this.m = i10;
            this.n = i11;
            this.o = z3;
            this.p = i12;
            this.q = i13;
            this.r = i14;
            this.s = i15;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        xl7.r(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            a(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            a(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            a(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    public static String c(id4 id4Var) {
        String str = id4Var.o;
        String str2 = id4Var.k;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return id4Var.o;
    }

    public static boolean d(byte[] bArr, int i2, id4 id4Var) {
        int i3;
        if (Objects.equals(id4Var.o, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i3 = b2 & 31) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (Objects.equals(id4Var.o, "video/hevc")) {
            b bVarF = f(new qt7(bArr, 4, i2 + 4));
            int i4 = bVarF.a;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && bVarF.c == id4Var.F - 1) {
                return false;
            }
        }
        return true;
    }

    public static int e(id4 id4Var) {
        String strC = c(id4Var);
        if (Objects.equals(strC, "video/avc")) {
            return 1;
        }
        return (Objects.equals(strC, "video/hevc") || Objects.equals(strC, "video/vvc")) ? 2 : 0;
    }

    public static b f(qt7 qt7Var) {
        qt7Var.i();
        return new b(qt7Var.e(6), qt7Var.e(6), qt7Var.e(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    public static c g(qt7 qt7Var, boolean z, int i2, c cVar) {
        int[] iArr;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean zD;
        int iE;
        int i6;
        int i7;
        int[] iArr2 = new int[6];
        if (!z) {
            if (cVar != null) {
                int i8 = cVar.a;
                zD = cVar.b;
                iE = cVar.c;
                i6 = cVar.d;
                iArr2 = cVar.e;
                i3 = i8;
            } else {
                iArr = iArr2;
                i3 = 0;
                z2 = false;
                i4 = 0;
                i5 = 0;
            }
            int iE2 = qt7Var.e(8);
            i7 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                if (qt7Var.d()) {
                    i7 += 88;
                }
                if (qt7Var.d()) {
                    i7 += 8;
                }
            }
            qt7Var.j(i7);
            if (i2 > 0) {
                qt7Var.j((8 - i2) * 2);
            }
            return new c(i3, z2, i4, i5, iArr, iE2);
        }
        int iE3 = qt7Var.e(2);
        zD = qt7Var.d();
        iE = qt7Var.e(5);
        i6 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            if (qt7Var.d()) {
                i6 |= 1 << i10;
            }
        }
        for (int i11 = 0; i11 < 6; i11++) {
            iArr2[i11] = qt7Var.e(8);
        }
        i3 = iE3;
        iArr = iArr2;
        z2 = zD;
        i4 = iE;
        i5 = i6;
        int iE4 = qt7Var.e(8);
        i7 = 0;
        while (i9 < i2) {
            if (qt7Var.d()) {
                i7 += 88;
            }
            if (qt7Var.d()) {
                i7 += 8;
            }
        }
        qt7Var.j(i7);
        if (i2 > 0) {
            qt7Var.j((8 - i2) * 2);
        }
        return new c(i3, z2, i4, i5, iArr, iE4);
    }

    public static g h(byte[] bArr, int i2, int i3) {
        byte b2;
        int i4 = i2 + 2;
        do {
            i3--;
            b2 = bArr[i3];
            if (b2 != 0) {
                break;
            }
        } while (i3 > i4);
        if (b2 == 0 || i3 <= i4) {
            return null;
        }
        qt7 qt7Var = new qt7(bArr, i4, i3 + 1);
        while (qt7Var.b(16)) {
            int iE = qt7Var.e(8);
            int i5 = 0;
            while (iE == 255) {
                i5 += 255;
                iE = qt7Var.e(8);
            }
            int i6 = i5 + iE;
            int iE2 = qt7Var.e(8);
            int i7 = 0;
            while (iE2 == 255) {
                i7 += 255;
                iE2 = qt7Var.e(8);
            }
            int i8 = i7 + iE2;
            if (i8 == 0 || !qt7Var.b(i8)) {
                return null;
            }
            if (i6 == 176) {
                int iF = qt7Var.f();
                boolean zD = qt7Var.d();
                int iF2 = zD ? qt7Var.f() : 0;
                int iF3 = qt7Var.f();
                int iF4 = -1;
                for (int i9 = 0; i9 <= iF3; i9++) {
                    iF4 = qt7Var.f();
                    qt7Var.f();
                    int iE3 = qt7Var.e(6);
                    if (iE3 == 63) {
                        return null;
                    }
                    qt7Var.e(iE3 == 0 ? Math.max(0, iF - 30) : Math.max(0, (iE3 + iF) - 31));
                    if (zD) {
                        int iE4 = qt7Var.e(6);
                        if (iE4 == 63) {
                            return null;
                        }
                        qt7Var.e(iE4 == 0 ? Math.max(0, iF2 - 30) : Math.max(0, (iE4 + iF2) - 31));
                    }
                    if (qt7Var.d()) {
                        qt7Var.j(10);
                    }
                }
                return new g(iF4);
            }
            qt7Var.j(i8 * 8);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:202:0x039e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    public static h i(byte[] bArr, int i2, int i3, k kVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        int iF;
        int i8;
        int iF2;
        int i9;
        int i10;
        int iMax;
        int i11;
        int i12;
        int i13;
        int iF3;
        int iG;
        int i14;
        j jVar;
        f fVar;
        b bVarF = f(new qt7(bArr, i2, i3));
        qt7 qt7Var = new qt7(bArr, i2 + 2, i3);
        int i15 = 4;
        qt7Var.j(4);
        int iE = qt7Var.e(3);
        int i16 = bVarF.b;
        boolean z = i16 != 0 && iE == 7;
        if (kVar != null) {
            k95<a> k95Var = kVar.a;
            if (k95Var.isEmpty()) {
                i4 = 0;
            } else {
                i4 = k95Var.get(Math.min(i16, k95Var.size() - 1)).a;
            }
        } else {
            i4 = 0;
        }
        c cVarG = null;
        if (!z) {
            qt7Var.i();
            cVarG = g(qt7Var, true, iE, null);
        } else if (kVar != null) {
            d dVar = kVar.b;
            int[] iArr = dVar.b;
            k95<c> k95Var2 = dVar.a;
            int i17 = iArr[i4];
            if (k95Var2.size() > i17) {
                cVarG = k95Var2.get(i17);
            }
        }
        qt7Var.f();
        if (z) {
            int iE2 = qt7Var.d() ? qt7Var.e(8) : -1;
            if (kVar == null || (fVar = kVar.c) == null) {
                iF = 0;
                iF2 = 0;
                i8 = 0;
                i10 = 0;
                i7 = 0;
                i9 = 0;
            } else {
                k95<e> k95Var3 = fVar.a;
                if (iE2 == -1) {
                    iE2 = fVar.b[i4];
                }
                if (iE2 == -1 || k95Var3.size() <= iE2) {
                    iF = 0;
                    iF2 = 0;
                    i8 = 0;
                    i10 = 0;
                    i7 = 0;
                    i9 = 0;
                } else {
                    e eVar = k95Var3.get(iE2);
                    int i18 = eVar.a;
                    i8 = eVar.d;
                    int i19 = eVar.e;
                    iF = eVar.b;
                    iF2 = eVar.c;
                    i7 = i19;
                    i9 = i7;
                    i10 = i8;
                }
            }
        } else {
            int iF4 = qt7Var.f();
            if (iF4 == 3) {
                qt7Var.i();
            }
            int iF5 = qt7Var.f();
            int iF6 = qt7Var.f();
            if (qt7Var.d()) {
                int iF7 = qt7Var.f();
                int iF8 = qt7Var.f();
                int iF9 = qt7Var.f();
                int iF10 = qt7Var.f();
                i5 = iF5 - ((iF7 + iF8) * ((iF4 == 1 || iF4 == 2) ? 2 : 1));
                i6 = iF6 - ((iF9 + iF10) * (iF4 == 1 ? 2 : 1));
            } else {
                i5 = iF5;
                i6 = iF6;
            }
            i7 = i6;
            iF = qt7Var.f();
            i8 = i5;
            iF2 = qt7Var.f();
            i9 = iF6;
            i10 = iF5;
        }
        int iF11 = qt7Var.f();
        if (z) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i20 = qt7Var.d() ? 0 : iE; i20 <= iE; i20++) {
                qt7Var.f();
                iMax = Math.max(qt7Var.f(), iMax);
                qt7Var.f();
            }
        }
        qt7Var.f();
        qt7Var.f();
        qt7Var.f();
        qt7Var.f();
        qt7Var.f();
        qt7Var.f();
        if (qt7Var.d()) {
            int i21 = 6;
            if (z ? qt7Var.d() : false) {
                qt7Var.j(6);
            } else if (qt7Var.d()) {
                int i22 = 0;
                while (i22 < i15) {
                    int i23 = 0;
                    while (i23 < i21) {
                        if (qt7Var.d()) {
                            int iMin = Math.min(64, 1 << ((i22 << 1) + 4));
                            if (i22 > 1) {
                                qt7Var.g();
                            }
                            for (int i24 = 0; i24 < iMin; i24++) {
                                qt7Var.g();
                            }
                        } else {
                            qt7Var.f();
                        }
                        i23 += i22 == 3 ? 3 : 1;
                        i21 = 6;
                    }
                    i22++;
                    i15 = 4;
                    i21 = 6;
                }
            }
        }
        qt7Var.j(2);
        if (qt7Var.d()) {
            qt7Var.j(8);
            qt7Var.f();
            qt7Var.f();
            qt7Var.i();
        }
        int iF12 = qt7Var.f();
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i25 = 0;
        int iF13 = -1;
        int i26 = -1;
        while (i25 < iF12) {
            if (i25 == 0 || !qt7Var.d()) {
                int iF14 = qt7Var.f();
                iF13 = qt7Var.f();
                int[] iArr3 = new int[iF14];
                int i27 = 0;
                while (i27 < iF14) {
                    iArr3[i27] = (i27 > 0 ? iArr3[i27 - 1] : 0) - (qt7Var.f() + 1);
                    qt7Var.i();
                    i27++;
                }
                int[] iArr4 = new int[iF13];
                int i28 = 0;
                while (i28 < iF13) {
                    iArr4[i28] = qt7Var.f() + 1 + (i28 > 0 ? iArr4[i28 - 1] : 0);
                    qt7Var.i();
                    i28++;
                }
                i26 = iF14;
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
            } else {
                int i29 = i26 + iF13;
                int iF15 = (1 - ((qt7Var.d() ? 1 : 0) * 2)) * (qt7Var.f() + 1);
                int i30 = i29 + 1;
                boolean[] zArr = new boolean[i30];
                for (int i31 = 0; i31 <= i29; i31++) {
                    if (qt7Var.d()) {
                        zArr[i31] = true;
                    } else {
                        zArr[i31] = qt7Var.d();
                    }
                }
                int[] iArr5 = new int[i30];
                int[] iArr6 = new int[i30];
                int i32 = 0;
                for (int i33 = iF13 - 1; i33 >= 0; i33--) {
                    int i34 = iArrCopyOf[i33] + iF15;
                    if (i34 < 0 && zArr[i26 + i33]) {
                        iArr5[i32] = i34;
                        i32++;
                    }
                }
                if (iF15 < 0 && zArr[i29]) {
                    iArr5[i32] = iF15;
                    i32++;
                }
                int i35 = i32;
                int[] iArr7 = iArr2;
                for (int i36 = 0; i36 < i26; i36++) {
                    int i37 = iArr7[i36] + iF15;
                    if (i37 < 0 && zArr[i36]) {
                        iArr5[i35] = i37;
                        i35++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i35);
                int i38 = 0;
                for (int i39 = i26 - 1; i39 >= 0; i39--) {
                    int i40 = iArr7[i39] + iF15;
                    if (i40 > 0 && zArr[i39]) {
                        iArr6[i38] = i40;
                        i38++;
                    }
                }
                if (iF15 > 0 && zArr[i29]) {
                    iArr6[i38] = iF15;
                    i38++;
                }
                int i41 = i35;
                int i42 = i38;
                for (int i43 = 0; i43 < iF13; i43++) {
                    int i44 = iArrCopyOf[i43] + iF15;
                    if (i44 > 0 && zArr[i26 + i43]) {
                        iArr6[i42] = i44;
                        i42++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i42);
                iF13 = i42;
                i26 = i41;
                iArr2 = iArrCopyOf2;
            }
            i25++;
            iF12 = iF12;
            i4 = i4;
        }
        int i45 = i4;
        if (qt7Var.d()) {
            int iF16 = qt7Var.f();
            for (int i46 = 0; i46 < iF16; i46++) {
                qt7Var.j(iF11 + 5);
            }
        }
        qt7Var.j(2);
        float f2 = 1.0f;
        if (qt7Var.d()) {
            if (qt7Var.d()) {
                int iE3 = qt7Var.e(8);
                if (iE3 == 255) {
                    int iE4 = qt7Var.e(16);
                    int iE5 = qt7Var.e(16);
                    if (iE4 != 0 && iE5 != 0) {
                        f2 = iE4 / iE5;
                    }
                } else if (iE3 < 17) {
                    f2 = b[iE3];
                } else {
                    d80.a(iE3, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (qt7Var.d()) {
                qt7Var.i();
            }
            if (qt7Var.d()) {
                qt7Var.j(3);
                i14 = qt7Var.d() ? 1 : 2;
                if (qt7Var.d()) {
                    int iE6 = qt7Var.e(8);
                    int iE7 = qt7Var.e(8);
                    qt7Var.j(8);
                    iF3 = xh1.f(iE6);
                    iG = xh1.g(iE7);
                } else {
                    iF3 = -1;
                    iG = -1;
                }
            } else if (kVar == null || (jVar = kVar.d) == null) {
                iF3 = -1;
                iG = -1;
                i14 = -1;
            } else {
                k95<i> k95Var4 = jVar.a;
                int i47 = jVar.b[i45];
                if (k95Var4.size() > i47) {
                    i iVar = k95Var4.get(i47);
                    int i48 = iVar.a;
                    int i49 = iVar.b;
                    iG = iVar.c;
                    iF3 = i48;
                    i14 = i49;
                } else {
                    iF3 = -1;
                    iG = -1;
                    i14 = -1;
                }
            }
            if (qt7Var.d()) {
                qt7Var.f();
                qt7Var.f();
            }
            qt7Var.i();
            if (qt7Var.d()) {
                i7 *= 2;
            }
            i11 = iF3;
            i13 = iG;
            i12 = i14;
        } else {
            i11 = -1;
            i12 = -1;
            i13 = -1;
        }
        return new h(iE, cVarG, iF, iF2, i8, i7, i10, i9, f2, iMax, i11, i12, i13);
    }

    /* JADX WARN: Code duplicated, block: B:473:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    public static k j(byte[] bArr, int i2, int i3) {
        int[] iArr;
        j jVar;
        int iE;
        int iE2;
        int iE3;
        int i4;
        ul8 ul8Var;
        boolean[][] zArr;
        int i5;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        int i6;
        boolean zD;
        int i7;
        int i8;
        int i9;
        boolean zD2;
        boolean zD3;
        int iF;
        int i10;
        int i11;
        int i12;
        boolean z;
        boolean z2;
        qt7 qt7Var = new qt7(bArr, i2, i3);
        f(qt7Var);
        qt7Var.j(4);
        boolean zD4 = qt7Var.d();
        boolean zD5 = qt7Var.d();
        int iE4 = qt7Var.e(6);
        int i13 = iE4 + 1;
        int iE5 = qt7Var.e(3);
        qt7Var.j(17);
        c cVarG = g(qt7Var, true, iE5, null);
        for (int i14 = qt7Var.d() ? 0 : iE5; i14 <= iE5; i14++) {
            qt7Var.f();
            qt7Var.f();
            qt7Var.f();
        }
        int iE6 = qt7Var.e(6);
        int iF2 = qt7Var.f() + 1;
        int i15 = 6;
        d dVar = new d(k95.v(cVarG), new int[1]);
        boolean z3 = i13 >= 2 && iF2 >= 2;
        boolean z4 = zD4 && zD5;
        int i16 = iE6 + 1;
        boolean z5 = i16 >= i13;
        if (!z3 || !z4 || !z5) {
            return new k(null, dVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iF2, i16);
        int i17 = 1;
        int[] iArr5 = new int[iF2];
        int[] iArr6 = new int[iF2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i18 = 1; i18 < iF2; i18++) {
            int i19 = 0;
            for (int i20 = 0; i20 <= iE6; i20++) {
                if (qt7Var.d()) {
                    iArr4[i18][i19] = i20;
                    iArr6[i18] = i20;
                    i19++;
                }
                iArr5[i18] = i19;
            }
        }
        if (qt7Var.d()) {
            qt7Var.j(64);
            if (qt7Var.d()) {
                qt7Var.f();
            }
            int iF3 = qt7Var.f();
            int i21 = 0;
            while (i21 < iF3) {
                qt7Var.f();
                if (i21 == 0 || qt7Var.d()) {
                    boolean zD6 = qt7Var.d();
                    boolean zD7 = qt7Var.d();
                    z2 = zD6;
                    z = zD7;
                    if (zD6 || zD7) {
                        zD = qt7Var.d();
                        if (zD) {
                            qt7Var.j(19);
                        }
                        qt7Var.j(8);
                        if (zD) {
                            qt7Var.j(4);
                        }
                        qt7Var.j(15);
                        i8 = zD6;
                        i7 = zD7;
                    }
                    i9 = 0;
                    while (i9 <= iE5) {
                        zD2 = qt7Var.d();
                        if (!zD2) {
                            zD2 = qt7Var.d();
                        }
                        if (zD2) {
                            qt7Var.f();
                            zD3 = false;
                        } else {
                            zD3 = qt7Var.d();
                        }
                        if (zD3) {
                            iF = 0;
                        } else {
                            iF = qt7Var.f();
                        }
                        int[][] iArr7 = iArr4;
                        i10 = i8 + i7;
                        int[] iArr8 = iArr6;
                        i11 = 0;
                        while (i11 < i10) {
                            int i22 = i10;
                            for (i12 = 0; i12 <= iF; i12++) {
                                qt7Var.f();
                                qt7Var.f();
                                if (zD) {
                                    qt7Var.f();
                                    qt7Var.f();
                                }
                                qt7Var.i();
                            }
                            i11++;
                            i10 = i22;
                        }
                        i9++;
                        i21 = i21;
                        iArr4 = iArr7;
                        iArr6 = iArr8;
                    }
                    i21++;
                } else {
                    z2 = false;
                    z = false;
                }
                zD = false;
                i8 = z2;
                i7 = z;
                i9 = 0;
                while (i9 <= iE5) {
                    zD2 = qt7Var.d();
                    if (!zD2) {
                        zD2 = qt7Var.d();
                    }
                    if (zD2) {
                        qt7Var.f();
                        zD3 = false;
                    } else {
                        zD3 = qt7Var.d();
                    }
                    if (zD3) {
                        iF = qt7Var.f();
                    } else {
                        iF = 0;
                    }
                    int[][] iArr9 = iArr4;
                    i10 = i8 + i7;
                    int[] iArr10 = iArr6;
                    i11 = 0;
                    while (i11 < i10) {
                        int i23 = i10;
                        while (i12 <= iF) {
                            qt7Var.f();
                            qt7Var.f();
                            if (zD) {
                                qt7Var.f();
                                qt7Var.f();
                            }
                            qt7Var.i();
                        }
                        i11++;
                        i10 = i23;
                    }
                    i9++;
                    i21 = i21;
                    iArr4 = iArr9;
                    iArr6 = iArr10;
                }
                i21++;
            }
        }
        int[][] iArr11 = iArr4;
        int[] iArr12 = iArr6;
        if (!qt7Var.d()) {
            return new k(null, dVar, null, null);
        }
        int i24 = qt7Var.e;
        if (i24 > 0) {
            qt7Var.j(8 - i24);
        }
        c cVarG2 = g(qt7Var, false, iE5, cVarG);
        boolean zD8 = qt7Var.d();
        boolean[] zArr3 = new boolean[16];
        int i25 = 0;
        for (int i26 = 0; i26 < 16; i26++) {
            boolean zD9 = qt7Var.d();
            zArr3[i26] = zD9;
            if (zD9) {
                i25++;
            }
        }
        if (i25 == 0 || !zArr3[1]) {
            return new k(null, dVar, null, null);
        }
        int[] iArr13 = new int[i25];
        for (int i27 = 0; i27 < i25 - (zD8 ? 1 : 0); i27++) {
            iArr13[i27] = qt7Var.e(3);
        }
        int[] iArr14 = new int[i25 + 1];
        if (zD8) {
            int i28 = 1;
            while (i28 < i25) {
                int[] iArr15 = iArr14;
                for (int i29 = 0; i29 < i28; i29++) {
                    iArr15[i28] = iArr13[i29] + 1 + iArr15[i28];
                }
                i28++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i25] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i13, i25);
        int[] iArr17 = new int[i13];
        iArr17[0] = 0;
        boolean zD10 = qt7Var.d();
        int i30 = 1;
        while (i30 < i13) {
            if (zD10) {
                i6 = i30;
                iArr17[i6] = qt7Var.e(i15);
            } else {
                i6 = i30;
                iArr17[i6] = i6;
            }
            if (zD8) {
                int i31 = 0;
                while (i31 < i25) {
                    int i32 = i31 + 1;
                    iArr16[i6][i31] = (iArr17[i6] & ((1 << iArr[i32]) - 1)) >> iArr[i31];
                    i31 = i32;
                }
            } else {
                int i33 = 0;
                while (i33 < i25) {
                    int i34 = i33;
                    iArr16[i6][i34] = qt7Var.e(iArr13[i33] + 1);
                    i33 = i34 + 1;
                }
            }
            i30 = i6 + 1;
            i15 = 6;
        }
        int[] iArr18 = new int[i16];
        int i35 = 1;
        int i36 = 0;
        while (i36 < i13) {
            iArr18[iArr17[i36]] = -1;
            int[] iArr19 = iArr18;
            int i37 = 0;
            int i38 = 0;
            while (i37 < 16) {
                if (zArr3[i37]) {
                    if (i37 == i17) {
                        iArr19[iArr17[i36]] = iArr16[i36][i38];
                    }
                    i38++;
                }
                i37++;
                i17 = 1;
            }
            if (i36 > 0) {
                int i39 = 0;
                while (true) {
                    if (i39 >= i36) {
                        i35++;
                        break;
                    }
                    int i40 = i39;
                    if (iArr19[iArr17[i36]] == iArr19[iArr17[i39]]) {
                        break;
                    }
                    i39 = i40 + 1;
                }
            }
            i36++;
            iArr18 = iArr19;
            i17 = 1;
        }
        int[] iArr20 = iArr18;
        int iE7 = qt7Var.e(4);
        if (i35 < 2 || iE7 == 0) {
            return new k(null, dVar, null, null);
        }
        int[] iArr21 = new int[i35];
        for (int i41 = 0; i41 < i35; i41++) {
            iArr21[i41] = qt7Var.e(iE7);
        }
        int[] iArr22 = new int[i16];
        for (int i42 = 0; i42 < i13; i42++) {
            iArr22[Math.min(iArr17[i42], iE6)] = i42;
        }
        k95.a aVar = new k95.a();
        int i43 = 0;
        while (i43 <= iE6) {
            int[] iArr23 = iArr22;
            int i44 = i35;
            int iMin = Math.min(iArr20[i43], i44 - 1);
            aVar.c(new a(iArr23[i43], iMin >= 0 ? iArr21[iMin] : -1));
            i43++;
            iArr22 = iArr23;
            iArr17 = iArr17;
            i35 = i44;
        }
        int[] iArr24 = iArr17;
        ul8 ul8VarG = aVar.g();
        if (((a) ul8VarG.get(0)).b == -1) {
            return new k(null, dVar, null, null);
        }
        int i45 = 1;
        while (true) {
            if (i45 > iE6) {
                i45 = -1;
                break;
            }
            if (((a) ul8VarG.get(i45)).b != -1) {
                break;
            }
            i45++;
        }
        if (i45 == -1) {
            return new k(null, dVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i13, i13);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i13, i13);
        for (int i46 = 1; i46 < i13; i46++) {
            for (int i47 = 0; i47 < i46; i47++) {
                boolean[] zArr6 = zArr4[i46];
                boolean[] zArr7 = zArr5[i46];
                boolean zD11 = qt7Var.d();
                zArr7[i47] = zD11;
                zArr6[i47] = zD11;
            }
        }
        for (int i48 = 1; i48 < i13; i48++) {
            int i49 = 0;
            while (i49 < iE4) {
                boolean[][] zArr8 = zArr4;
                for (int i50 = 0; i50 < i48; i50++) {
                    boolean[] zArr9 = zArr5[i48];
                    if (zArr9[i50] && zArr5[i50][i49]) {
                        zArr9[i49] = true;
                        break;
                    }
                }
                i49++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr25 = new int[i16];
        for (int i51 = 0; i51 < i13; i51++) {
            int i52 = 0;
            for (int i53 = 0; i53 < i51; i53++) {
                i52 += zArr10[i51][i53] ? 1 : 0;
            }
            iArr25[iArr24[i51]] = i52;
        }
        int i54 = 0;
        for (int i55 = 0; i55 < i13; i55++) {
            if (iArr25[iArr24[i55]] == 0) {
                i54++;
            }
        }
        if (i54 > 1) {
            return new k(null, dVar, null, null);
        }
        int[] iArr26 = new int[i13];
        int[] iArr27 = new int[iF2];
        if (qt7Var.d()) {
            int i56 = 0;
            while (i56 < i13) {
                int i57 = i56;
                iArr26[i57] = qt7Var.e(3);
                i56 = i57 + 1;
            }
        } else {
            Arrays.fill(iArr26, 0, i13, iE5);
        }
        int i58 = 0;
        while (i58 < iF2) {
            int i59 = i58;
            boolean[][] zArr11 = zArr5;
            int[] iArr28 = iArr26;
            int iMax = 0;
            for (int i60 = 0; i60 < iArr5[i59]; i60++) {
                iMax = Math.max(iMax, iArr28[((a) ul8VarG.get(iArr11[i59][i60])).a]);
            }
            iArr27[i59] = iMax + 1;
            i58 = i59 + 1;
            zArr5 = zArr11;
            iArr26 = iArr28;
        }
        boolean[][] zArr12 = zArr5;
        if (qt7Var.d()) {
            int i61 = 0;
            while (i61 < iE4) {
                int i62 = i61 + 1;
                int i63 = i62;
                while (i63 < i13) {
                    if (zArr10[i63][i61]) {
                        qt7Var.j(3);
                    }
                    i63++;
                    iE4 = iE4;
                }
                i61 = i62;
            }
        }
        qt7Var.i();
        int iF4 = qt7Var.f() + 1;
        k95.a aVar2 = new k95.a();
        aVar2.c(cVarG);
        if (iF4 > 1) {
            aVar2.c(cVarG2);
            for (int i64 = 2; i64 < iF4; i64++) {
                cVarG2 = g(qt7Var, qt7Var.d(), iE5, cVarG2);
                aVar2.c(cVarG2);
            }
        }
        ul8 ul8VarG2 = aVar2.g();
        int iF5 = qt7Var.f() + iF2;
        if (iF5 > iF2) {
            return new k(null, dVar, null, null);
        }
        int iE8 = qt7Var.e(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iF5, i16);
        int[] iArr29 = new int[iF5];
        int i65 = 0;
        int[] iArr30 = new int[iF5];
        int i66 = 0;
        while (i66 < iF2) {
            iArr29[i66] = i65;
            iArr30[i66] = iArr12[i66];
            if (iE8 == 0) {
                i5 = i66;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                Arrays.fill(zArr13[i5], i65, iArr5[i5], true);
                iArr2[i5] = iArr5[i5];
            } else {
                i5 = i66;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                if (iE8 == 1) {
                    int i67 = iArr12[i5];
                    for (int i68 = 0; i68 < iArr5[i5]; i68++) {
                        zArr2[i5][i68] = iArr11[i5][i68] == i67;
                    }
                    iArr2[i5] = 1;
                } else {
                    i65 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i66 = i5 + 1;
                zArr13 = zArr2;
                iArr29 = iArr2;
                iArr27 = iArr3;
            }
            i65 = 0;
            i66 = i5 + 1;
            zArr13 = zArr2;
            iArr29 = iArr2;
            iArr27 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = iArr27;
        int[] iArr33 = new int[i16];
        int i69 = 2;
        int[] iArr34 = new int[2];
        iArr34[1] = i16;
        iArr34[i65] = iF5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr34);
        int i70 = 1;
        int i71 = 0;
        while (i70 < iF5) {
            if (iE8 == i69) {
                for (int i72 = 0; i72 < iArr5[i70]; i72++) {
                    zArr14[i70][i72] = qt7Var.d();
                    int i73 = iArr31[i70];
                    boolean z6 = zArr14[i70][i72];
                    iArr31[i70] = i73 + (z6 ? 1 : 0);
                    if (z6) {
                        iArr30[i70] = iArr11[i70][i72];
                    }
                }
            }
            if (i71 == 0) {
                i4 = 0;
                if (iArr11[i70][0] == 0 && zArr14[i70][0]) {
                    for (int i74 = 1; i74 < iArr5[i70]; i74++) {
                        if (iArr11[i70][i74] == i45 && zArr14[i70][i45]) {
                            i71 = i70;
                        }
                    }
                }
            } else {
                i4 = 0;
            }
            int i75 = i4;
            while (i75 < iArr5[i70]) {
                if (iF4 > 1) {
                    zArr15[i70][i75] = zArr14[i70][i75];
                    ul8Var = ul8VarG2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iC = m43.c(iF4);
                    if (!zArr[i70][i75]) {
                        int i76 = ((a) ul8VarG.get(iArr11[i70][i75])).a;
                        int i77 = i4;
                        while (i77 < i75) {
                            int i78 = i77;
                            if (zArr12[i76][((a) ul8VarG.get(iArr11[i70][i78])).a]) {
                                zArr[i70][i75] = true;
                                break;
                            }
                            i77 = i78 + 1;
                        }
                    }
                    if (zArr[i70][i75]) {
                        if (i71 <= 0 || i70 != i71) {
                            qt7Var.j(iC);
                        } else {
                            iArr33[i75] = qt7Var.e(iC);
                        }
                    }
                } else {
                    ul8Var = ul8VarG2;
                    zArr = zArr15;
                }
                i75++;
                ul8VarG2 = ul8Var;
                zArr15 = zArr;
            }
            ul8 ul8Var2 = ul8VarG2;
            boolean[][] zArr16 = zArr15;
            if (iArr31[i70] == 1 && iArr25[iArr30[i70]] > 0) {
                qt7Var.i();
            }
            i70++;
            ul8VarG2 = ul8Var2;
            zArr15 = zArr16;
            i69 = 2;
        }
        ul8 ul8Var3 = ul8VarG2;
        boolean[][] zArr17 = zArr15;
        if (i71 == 0) {
            return new k(null, dVar, null, null);
        }
        int iF6 = qt7Var.f();
        int i79 = iF6 + 1;
        k95.a aVarO = k95.o(i79);
        int[] iArr35 = new int[i13];
        for (int i80 = 0; i80 < i79; i80++) {
            int iE9 = qt7Var.e(16);
            int iE10 = qt7Var.e(16);
            if (qt7Var.d()) {
                iE = qt7Var.e(2);
                if (iE == 3) {
                    qt7Var.i();
                }
                iE2 = qt7Var.e(4);
                iE3 = qt7Var.e(4);
            } else {
                iE = 0;
                iE2 = 0;
                iE3 = 0;
            }
            if (qt7Var.d()) {
                int iF7 = qt7Var.f();
                int iF8 = qt7Var.f();
                int iF9 = qt7Var.f();
                int iF10 = qt7Var.f();
                iE9 -= (iF7 + iF8) * ((iE == 1 || iE == 2) ? 2 : 1);
                iE10 -= (iF9 + iF10) * (iE == 1 ? 2 : 1);
            }
            aVarO.c(new e(iE, iE2, iE3, iE9, iE10));
        }
        if (i79 <= 1 || !qt7Var.d()) {
            for (int i81 = 1; i81 < i13; i81++) {
                iArr35[i81] = Math.min(i81, iF6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iC2 = m43.c(i79);
            for (int i82 = 1; i82 < i13; i82++) {
                iArr35[i82] = qt7Var.e(iC2);
            }
        }
        f fVar = new f(aVarO.g(), iArr35);
        qt7Var.j(2);
        for (int i83 = 1; i83 < i13; i83++) {
            if (iArr25[iArr24[i83]] == 0) {
                qt7Var.i();
            }
        }
        for (int i84 = 1; i84 < iF5; i84++) {
            boolean zD12 = qt7Var.d();
            int i85 = 0;
            while (i85 < iArr32[i84]) {
                if ((i85 <= 0 || !zD12) ? i85 == 0 : qt7Var.d()) {
                    for (int i86 = 0; i86 < iArr5[i84]; i86++) {
                        if (zArr17[i84][i86]) {
                            qt7Var.f();
                        }
                    }
                    qt7Var.f();
                    qt7Var.f();
                }
                i85++;
            }
        }
        int iF11 = qt7Var.f() + 2;
        if (qt7Var.d()) {
            qt7Var.j(iF11);
        } else {
            for (int i87 = 1; i87 < i13; i87++) {
                for (int i88 = 0; i88 < i87; i88++) {
                    if (zArr10[i87][i88]) {
                        qt7Var.j(iF11);
                    }
                }
            }
        }
        int iF12 = qt7Var.f();
        for (int i89 = 1; i89 <= iF12; i89++) {
            qt7Var.j(8);
        }
        if (qt7Var.d()) {
            int i90 = qt7Var.e;
            if (i90 > 0) {
                qt7Var.j(8 - i90);
            }
            if (!qt7Var.d() ? qt7Var.d() : true) {
                qt7Var.i();
            }
            boolean zD13 = qt7Var.d();
            boolean zD14 = qt7Var.d();
            if (zD13 || zD14) {
                for (int i91 = 0; i91 < iF2; i91++) {
                    for (int i92 = 0; i92 < iArr32[i91]; i92++) {
                        boolean zD15 = zD13 ? qt7Var.d() : false;
                        boolean zD16 = zD14 ? qt7Var.d() : false;
                        if (zD15) {
                            qt7Var.j(32);
                        }
                        if (zD16) {
                            qt7Var.j(18);
                        }
                    }
                }
            }
            boolean zD17 = qt7Var.d();
            int iE11 = zD17 ? qt7Var.e(4) + 1 : i13;
            k95.a aVarO2 = k95.o(iE11);
            int[] iArr36 = new int[i13];
            for (int i93 = 0; i93 < iE11; i93++) {
                qt7Var.j(3);
                int i94 = qt7Var.d() ? 1 : 2;
                int iF13 = xh1.f(qt7Var.e(8));
                int iG = xh1.g(qt7Var.e(8));
                qt7Var.j(8);
                aVarO2.c(new i(iF13, i94, iG));
            }
            if (zD17 && iE11 > 1) {
                for (int i95 = 0; i95 < i13; i95++) {
                    iArr36[i95] = qt7Var.e(4);
                }
            }
            jVar = new j(aVarO2.g(), iArr36);
        } else {
            jVar = null;
        }
        return new k(ul8VarG, new d(ul8Var3, iArr33), fVar, jVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ae A[PHI: r19
      0x01ae: PHI (r19v6 float) = (r19v3 float), (r19v9 float), (r19v3 float), (r19v3 float), (r19v10 float) binds: [B:94:0x0190, B:104:0x01b5, B:98:0x01a6, B:99:0x01a8, B:100:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01de  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:122:0x0208  */
    /* JADX WARN: Code duplicated, block: B:125:0x0214  */
    /* JADX WARN: Code duplicated, block: B:128:0x021f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0228  */
    /* JADX WARN: Code duplicated, block: B:134:0x022f  */
    /* JADX WARN: Code duplicated, block: B:137:0x023b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0261  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    public static m k(byte[] bArr, int i2, int i3) {
        int iF;
        int iF2;
        int i4;
        boolean z;
        int i5;
        int iF3;
        boolean z2;
        boolean zD;
        int i6;
        int i7;
        int i8;
        int iF4;
        int iF5;
        float f2;
        int i9;
        int i10;
        int i11;
        float f3;
        int i12;
        int i13;
        int iG;
        boolean zD2;
        boolean zD3;
        int iE;
        int iE2;
        int iE3;
        int i14;
        int i15;
        qt7 qt7Var = new qt7(bArr, i2 + 1, i3);
        int iE4 = qt7Var.e(8);
        int iE5 = qt7Var.e(8);
        int iE6 = qt7Var.e(8);
        int iF6 = qt7Var.f();
        if (iE4 == 100 || iE4 == 110 || iE4 == 122 || iE4 == 244 || iE4 == 44 || iE4 == 83 || iE4 == 86 || iE4 == 118 || iE4 == 128 || iE4 == 138) {
            iF = qt7Var.f();
            boolean zD4 = iF == 3 ? qt7Var.d() : false;
            int iF7 = qt7Var.f();
            iF2 = qt7Var.f();
            qt7Var.i();
            if (qt7Var.d()) {
                int i16 = iF != 3 ? 8 : 12;
                i4 = 16;
                int i17 = 0;
                while (i17 < i16) {
                    if (qt7Var.d()) {
                        int i18 = i17 < 6 ? 16 : 64;
                        int iG2 = 8;
                        int i19 = 8;
                        for (int i20 = 0; i20 < i18; i20++) {
                            if (iG2 != 0) {
                                iG2 = ((qt7Var.g() + i19) + 256) % 256;
                            }
                            if (iG2 != 0) {
                                i19 = iG2;
                            }
                        }
                    }
                    i17++;
                }
            } else {
                i4 = 16;
            }
            z = zD4;
            i5 = iF7;
        } else {
            iF = 1;
            i4 = 16;
            i5 = 0;
            z = false;
            iF2 = 0;
        }
        int iF8 = qt7Var.f() + 4;
        int iF9 = qt7Var.f();
        if (iF9 != 0) {
            if (iF9 == 1) {
                boolean zD5 = qt7Var.d();
                qt7Var.g();
                qt7Var.g();
                iE4 = iE4;
                long jF = qt7Var.f();
                iF9 = iF9;
                for (int i21 = 0; i21 < jF; i21++) {
                    qt7Var.f();
                }
                iF2 = iF2;
                z2 = zD5;
                iF3 = 0;
            } else {
                iF3 = 0;
            }
            qt7Var.f();
            qt7Var.i();
            int iF10 = qt7Var.f() + 1;
            int iF11 = qt7Var.f() + 1;
            zD = qt7Var.d();
            i6 = 2 - (zD ? 1 : 0);
            int i22 = iF11 * i6;
            if (!zD) {
                qt7Var.i();
            }
            qt7Var.i();
            i7 = iF10 * 16;
            i8 = i22 * 16;
            if (qt7Var.d()) {
                int iF12 = qt7Var.f();
                int iF13 = qt7Var.f();
                int iF14 = qt7Var.f();
                int iF15 = qt7Var.f();
                if (iF == 0) {
                    i14 = 1;
                } else {
                    if (iF == 3) {
                        i14 = 1;
                    } else {
                        i14 = 2;
                    }
                    if (iF == 1) {
                        i15 = 2;
                    } else {
                        i15 = 1;
                    }
                    i6 *= i15;
                }
                i7 -= (iF12 + iF13) * i14;
                i8 -= (iF14 + iF15) * i6;
            }
            int i23 = i8;
            int i24 = i7;
            int i25 = iE4;
            iF4 = ((i25 != 44 || i25 == 86 || i25 == 100 || i25 == 110 || i25 == 122 || i25 == 244) && (iE5 & 16) != 0) ? 0 : i4;
            iF5 = -1;
            f2 = 1.0f;
            if (qt7Var.d()) {
                if (!qt7Var.d()) {
                    iE = qt7Var.e(8);
                    if (iE == 255) {
                        int i26 = i4;
                        iE2 = qt7Var.e(i26);
                        iE3 = qt7Var.e(i26);
                        if (iE2 != 0 && iE3 != 0) {
                            f2 = iE2 / iE3;
                        }
                    } else if (iE < 17) {
                        f2 = b[iE];
                    } else {
                        d80.a(iE, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                if (qt7Var.d()) {
                    qt7Var.i();
                }
                if (qt7Var.d()) {
                    qt7Var.j(3);
                    if (qt7Var.d()) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    if (qt7Var.d()) {
                        int iE7 = qt7Var.e(8);
                        int iE8 = qt7Var.e(8);
                        qt7Var.j(8);
                        iF5 = xh1.f(iE7);
                        iG = xh1.g(iE8);
                    } else {
                        iG = -1;
                    }
                } else {
                    i13 = -1;
                    iG = -1;
                }
                if (qt7Var.d()) {
                    qt7Var.f();
                    qt7Var.f();
                }
                if (qt7Var.d()) {
                    qt7Var.j(65);
                }
                zD2 = qt7Var.d();
                if (zD2) {
                    l(qt7Var);
                }
                zD3 = qt7Var.d();
                if (zD3) {
                    l(qt7Var);
                }
                if (zD2 || zD3) {
                    qt7Var.i();
                }
                qt7Var.i();
                if (qt7Var.d()) {
                    qt7Var.i();
                    qt7Var.f();
                    qt7Var.f();
                    qt7Var.f();
                    qt7Var.f();
                    iF4 = qt7Var.f();
                    qt7Var.f();
                }
                f3 = f2;
                i12 = iF5;
                i10 = i13;
                i11 = iG;
                i9 = iF4;
            } else {
                iF8 = iF8;
                i9 = iF4;
                i10 = -1;
                i11 = -1;
                f3 = 1.0f;
                i12 = -1;
            }
            return new m(i25, iE5, iE6, iF6, i24, i23, f3, i5, iF2, z, zD, iF8, iF9, iF3, z2, i12, i10, i11, i9);
        }
        iF3 = qt7Var.f() + 4;
        z2 = false;
        qt7Var.f();
        qt7Var.i();
        int iF16 = qt7Var.f() + 1;
        int iF17 = qt7Var.f() + 1;
        zD = qt7Var.d();
        i6 = 2 - (zD ? 1 : 0);
        int i27 = iF17 * i6;
        if (!zD) {
            qt7Var.i();
        }
        qt7Var.i();
        i7 = iF16 * 16;
        i8 = i27 * 16;
        if (qt7Var.d()) {
            int iF18 = qt7Var.f();
            int iF19 = qt7Var.f();
            int iF110 = qt7Var.f();
            int iF111 = qt7Var.f();
            if (iF == 0) {
                i14 = 1;
            } else {
                if (iF == 3) {
                    i14 = 1;
                } else {
                    i14 = 2;
                }
                if (iF == 1) {
                    i15 = 2;
                } else {
                    i15 = 1;
                }
                i6 *= i15;
            }
            i7 -= (iF18 + iF19) * i14;
            i8 -= (iF110 + iF111) * i6;
        }
        int i28 = i8;
        int i29 = i7;
        int i210 = iE4;
        if (i210 != 44) {
        }
        iF5 = -1;
        f2 = 1.0f;
        if (qt7Var.d()) {
            if (!qt7Var.d()) {
                iE = qt7Var.e(8);
                if (iE == 255) {
                    int i211 = i4;
                    iE2 = qt7Var.e(i211);
                    iE3 = qt7Var.e(i211);
                    if (iE2 != 0) {
                        f2 = iE2 / iE3;
                    }
                } else if (iE < 17) {
                    f2 = b[iE];
                } else {
                    d80.a(iE, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (qt7Var.d()) {
                qt7Var.i();
            }
            if (qt7Var.d()) {
                qt7Var.j(3);
                if (qt7Var.d()) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                if (qt7Var.d()) {
                    int iE9 = qt7Var.e(8);
                    int iE10 = qt7Var.e(8);
                    qt7Var.j(8);
                    iF5 = xh1.f(iE9);
                    iG = xh1.g(iE10);
                } else {
                    iG = -1;
                }
            } else {
                i13 = -1;
                iG = -1;
            }
            if (qt7Var.d()) {
                qt7Var.f();
                qt7Var.f();
            }
            if (qt7Var.d()) {
                qt7Var.j(65);
            }
            zD2 = qt7Var.d();
            if (zD2) {
                l(qt7Var);
            }
            zD3 = qt7Var.d();
            if (zD3) {
                l(qt7Var);
            }
            if (zD2) {
                qt7Var.i();
            } else {
                qt7Var.i();
            }
            qt7Var.i();
            if (qt7Var.d()) {
                qt7Var.i();
                qt7Var.f();
                qt7Var.f();
                qt7Var.f();
                qt7Var.f();
                iF4 = qt7Var.f();
                qt7Var.f();
            }
            f3 = f2;
            i12 = iF5;
            i10 = i13;
            i11 = iG;
            i9 = iF4;
        } else {
            iF8 = iF8;
            i9 = iF4;
            i10 = -1;
            i11 = -1;
            f3 = 1.0f;
            i12 = -1;
        }
        return new m(i210, iE5, iE6, iF6, i29, i28, f3, i5, iF2, z, zD, iF8, iF9, iF3, z2, i12, i10, i11, i9);
    }

    public static void l(qt7 qt7Var) {
        int iF = qt7Var.f() + 1;
        qt7Var.j(8);
        for (int i2 = 0; i2 < iF; i2++) {
            qt7Var.f();
            qt7Var.f();
            qt7Var.i();
        }
        qt7Var.j(20);
    }

    public static int m(byte[] bArr, int i2) {
        int i3;
        synchronized (c) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = d;
                    if (iArr.length <= i5) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = d[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }
}
