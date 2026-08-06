package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.exoplayer.l;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cv2 extends mi6 implements l.a {
    public static final el7<Integer> k = new vo1(new su2());
    public final Object c;
    public final Context d;
    public final ab.b e;
    public d f;
    public Thread g;
    public ix9 h;
    public q70 i;
    public Boolean j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends g<a> implements Comparable<a> {
        public final d A;
        public final boolean B;
        public final int C;
        public final int D;
        public final int E;
        public final int F;
        public final boolean G;
        public final boolean H;
        public final int I;
        public final int J;
        public final boolean K;
        public final int L;
        public final int M;
        public final int N;
        public final int O;
        public final boolean P;
        public final boolean Q;
        public final boolean R;
        public final int x;
        public final boolean y;
        public final String z;

        /* JADX WARN: Code duplicated, block: B:109:0x0179  */
        /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:85:0x0137  */
        /* JADX WARN: Code duplicated, block: B:86:0x0139  */
        /* JADX WARN: Code duplicated, block: B:89:0x0142  */
        /* JADX WARN: Code duplicated, block: B:90:0x0144  */
        public a(int i, esa esaVar, int i2, d dVar, int i3, boolean z, tu2 tu2Var, int i4) {
            int i5;
            int iN;
            boolean z2;
            int iN2;
            boolean z3;
            boolean z4;
            boolean z5;
            lsa.a aVar;
            super(i, esaVar, i2);
            this.A = dVar;
            boolean z6 = dVar.B;
            k95<String> k95Var = dVar.p;
            k95<String> k95Var2 = dVar.l;
            int i6 = z6 ? 24 : 16;
            int i7 = 0;
            this.G = false;
            this.z = cv2.p(this.w.d);
            this.B = l.m(i3, false);
            int i8 = 0;
            while (true) {
                i5 = Integer.MAX_VALUE;
                if (i8 >= k95Var2.size()) {
                    iN = 0;
                    i8 = Integer.MAX_VALUE;
                    break;
                } else {
                    iN = cv2.n(this.w, k95Var2.get(i8), false);
                    if (iN > 0) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.D = i8;
            this.C = iN;
            int i9 = this.w.f;
            this.E = (i9 == 0 || i9 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
            this.F = cv2.h(this.w, dVar.m);
            id4 id4Var = this.w;
            int i10 = id4Var.f;
            this.H = i10 == 0 || (i10 & 1) != 0;
            this.K = (id4Var.e & 1) != 0;
            String str = id4Var.o;
            if (str != null) {
                switch (str) {
                    case "audio/eac3-joc":
                    case "audio/ac4":
                    case "audio/iamf":
                        z2 = true;
                        break;
                    default:
                        z2 = false;
                        break;
                }
            } else {
                z2 = false;
            }
            this.R = z2;
            int i11 = id4Var.G;
            this.L = i11;
            this.M = id4Var.H;
            int i12 = id4Var.j;
            this.N = i12;
            this.y = (i12 == -1 || i12 <= dVar.o) && (i11 == -1 || i11 <= dVar.n) && tu2Var.apply(id4Var);
            String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
            for (int i13 = 0; i13 < strArrSplit.length; i13++) {
                strArrSplit[i13] = n6b.O(strArrSplit[i13]);
            }
            int i14 = 0;
            while (true) {
                if (i14 < strArrSplit.length) {
                    iN2 = cv2.n(this.w, strArrSplit[i14], false);
                    if (iN2 <= 0) {
                        i14++;
                    }
                } else {
                    iN2 = 0;
                    i14 = Integer.MAX_VALUE;
                }
            }
            this.I = i14;
            this.J = iN2;
            for (int i15 = 0; i15 < k95Var.size(); i15++) {
                String str2 = this.w.o;
                if (str2 != null && str2.equals(k95Var.get(i15))) {
                    i5 = i15;
                    this.O = i5;
                    if ((i3 & 384) == 128) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.P = z3;
                    if ((i3 & 64) == 64) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.Q = z4;
                    boolean z7 = this.y;
                    d dVar2 = this.A;
                    z5 = dVar2.D;
                    aVar = dVar2.q;
                    if (l.m(i3, z5) && (z7 || dVar2.A)) {
                        aVar.getClass();
                        if (l.m(i3, false) || !z7 || this.w.j == -1 || ((!dVar2.E && z) || (i6 & i3) == 0)) {
                            i7 = 1;
                        } else {
                            i7 = 2;
                        }
                    }
                    this.x = i7;
                }
            }
            this.O = i5;
            if ((i3 & 384) == 128) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.P = z3;
            if ((i3 & 64) == 64) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.Q = z4;
            boolean z8 = this.y;
            d dVar3 = this.A;
            z5 = dVar3.D;
            aVar = dVar3.q;
            if (l.m(i3, z5)) {
                aVar.getClass();
                if (l.m(i3, false)) {
                    i7 = 1;
                } else {
                    i7 = 1;
                }
            }
            this.x = i7;
        }

        @Override // cv2.g
        public final int a() {
            return this.x;
        }

        @Override // cv2.g
        public final boolean e(g gVar) {
            int i;
            String str;
            a aVar = (a) gVar;
            id4 id4Var = aVar.w;
            this.A.getClass();
            id4 id4Var2 = this.w;
            int i2 = id4Var2.G;
            if (i2 == -1 || i2 != id4Var.G) {
                return false;
            }
            return (this.G || ((str = id4Var2.o) != null && TextUtils.equals(str, id4Var.o))) && (i = id4Var2.H) != -1 && i == id4Var.H && this.P == aVar.P && this.Q == aVar.Q;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final int compareTo(a aVar) {
            boolean z = this.B;
            boolean z2 = this.y;
            Object objA = (z2 && z) ? cv2.k : cv2.k.a();
            boolean z3 = aVar.B;
            int i = aVar.N;
            yo1 yo1VarC = yo1.a.c(z, z3);
            Integer numValueOf = Integer.valueOf(this.D);
            Integer numValueOf2 = Integer.valueOf(aVar.D);
            n47.t.getClass();
            uv8 uv8Var = uv8.t;
            yo1 yo1VarB = yo1VarC.b(numValueOf, numValueOf2, uv8Var).a(this.C, aVar.C).a(this.E, aVar.E).b(Integer.valueOf(this.F), Integer.valueOf(aVar.F), uv8Var).c(this.K, aVar.K).c(this.H, aVar.H).b(Integer.valueOf(this.I), Integer.valueOf(aVar.I), uv8Var).a(this.J, aVar.J).c(z2, aVar.y).b(Integer.valueOf(this.O), Integer.valueOf(aVar.O), uv8Var);
            this.A.getClass();
            yo1 yo1VarB2 = yo1VarB.c(this.P, aVar.P).c(this.Q, aVar.Q).c(this.R, aVar.R).b(Integer.valueOf(this.L), Integer.valueOf(aVar.L), objA).b(Integer.valueOf(this.M), Integer.valueOf(aVar.M), objA);
            if (Objects.equals(this.z, aVar.z)) {
                yo1VarB2 = yo1VarB2.b(Integer.valueOf(this.N), Integer.valueOf(i), objA);
            }
            return yo1VarB2.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends g<b> implements Comparable<b> {
        public final int x;
        public final int y;

        public b(int i, esa esaVar, int i2, d dVar, int i3) {
            int i4;
            super(i, esaVar, i2);
            this.x = l.m(i3, dVar.D) ? 1 : 0;
            id4 id4Var = this.w;
            int i5 = id4Var.v;
            int i6 = -1;
            if (i5 != -1 && (i4 = id4Var.w) != -1) {
                i6 = i5 * i4;
            }
            this.y = i6;
        }

        @Override // cv2.g
        public final int a() {
            return this.x;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            return Integer.compare(this.y, bVar.y);
        }

        @Override // cv2.g
        public final /* bridge */ /* synthetic */ boolean e(g gVar) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements Comparable<c> {
        public final boolean t;
        public final boolean u;

        public c(id4 id4Var, int i) {
            this.t = (id4Var.e & 1) != 0;
            this.u = l.m(i, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            return yo1.a.c(this.u, cVar2.u).c(this.t, cVar2.t).e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e {
        static {
            n6b.H(0);
            n6b.H(1);
            n6b.H(2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            return Arrays.equals((int[]) null, (int[]) null);
        }

        public final int hashCode() {
            return Arrays.hashCode((int[]) null) * 31;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends g<f> implements Comparable<f> {
        public final boolean A;
        public final int B;
        public final int C;
        public final int D;
        public final int E;
        public final int F;
        public final boolean G;
        public final int x;
        public final boolean y;
        public final boolean z;

        public f(int i, esa esaVar, int i2, d dVar, int i3, String str, String str2) {
            int iN;
            super(i, esaVar, i2);
            int i4 = 0;
            this.y = l.m(i3, false);
            int i5 = this.w.e;
            int i6 = dVar.u;
            k95<String> k95Var = dVar.r;
            int i7 = i5 & (~i6);
            this.z = (i7 & 1) != 0;
            this.A = (i7 & 2) != 0;
            k95<String> k95VarV = str2 != null ? k95.v(str2) : k95Var.isEmpty() ? k95.v(BuildConfig.FLAVOR) : k95Var;
            int i8 = 0;
            while (true) {
                if (i8 >= k95VarV.size()) {
                    iN = 0;
                    i8 = Integer.MAX_VALUE;
                    break;
                } else {
                    iN = cv2.n(this.w, k95VarV.get(i8), false);
                    if (iN > 0) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.B = i8;
            this.C = iN;
            int i9 = str2 != null ? 1088 : 0;
            int i10 = this.w.f;
            el7<Integer> el7Var = cv2.k;
            int iBitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
            this.D = iBitCount;
            id4 id4Var = this.w;
            this.G = (1088 & id4Var.f) != 0;
            int iH = cv2.h(id4Var, dVar.s);
            this.E = iH;
            int iN2 = cv2.n(this.w, str, cv2.p(str) == null);
            this.F = iN2;
            boolean z = iN > 0 || (k95Var.isEmpty() && iBitCount > 0) || ((k95Var.isEmpty() && iH != Integer.MAX_VALUE) || this.z || (this.A && iN2 > 0));
            if (l.m(i3, dVar.D) && z) {
                i4 = 1;
            }
            this.x = i4;
        }

        @Override // cv2.g
        public final int a() {
            return this.x;
        }

        @Override // cv2.g
        public final /* bridge */ /* synthetic */ boolean e(g gVar) {
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final int compareTo(f fVar) {
            yo1 yo1VarC = yo1.a.c(this.y, fVar.y);
            Integer numValueOf = Integer.valueOf(this.B);
            Integer numValueOf2 = Integer.valueOf(fVar.B);
            el7 el7Var = n47.t;
            el7Var.getClass();
            uv8 uv8Var = uv8.t;
            yo1 yo1VarB = yo1VarC.b(numValueOf, numValueOf2, uv8Var);
            int i = fVar.C;
            int i2 = this.C;
            yo1 yo1VarA = yo1VarB.a(i2, i);
            int i3 = fVar.D;
            int i4 = this.D;
            yo1 yo1VarC2 = yo1VarA.a(i4, i3).b(Integer.valueOf(this.E), Integer.valueOf(fVar.E), uv8Var).c(this.z, fVar.z);
            Boolean boolValueOf = Boolean.valueOf(this.A);
            Boolean boolValueOf2 = Boolean.valueOf(fVar.A);
            if (i2 != 0) {
                el7Var = uv8Var;
            }
            yo1 yo1VarA2 = yo1VarC2.b(boolValueOf, boolValueOf2, el7Var).a(this.F, fVar.F);
            if (i4 == 0) {
                yo1VarA2 = yo1VarA2.d(this.G, fVar.G);
            }
            return yo1VarA2.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class g<T extends g<T>> {
        public final int t;
        public final esa u;
        public final int v;
        public final id4 w;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public interface a<T extends g<T>> {
            ul8 b(int i, esa esaVar, int[] iArr);
        }

        public g(int i, esa esaVar, int i2) {
            this.t = i;
            this.u = esaVar;
            this.v = i2;
            this.w = esaVar.d[i2];
        }

        public abstract int a();

        public abstract boolean e(T t);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h extends g<h> {
        public final boolean A;
        public final boolean B;
        public final int C;
        public final int D;
        public final int E;
        public final int F;
        public final int G;
        public final int H;
        public final int I;
        public final boolean J;
        public final int K;
        public final boolean L;
        public final int M;
        public final boolean N;
        public final boolean O;
        public final boolean P;
        public final int Q;
        public final boolean R;
        public final String S;
        public final boolean x;
        public final d y;
        public final boolean z;

        /* JADX WARN: Code duplicated, block: B:134:0x0189  */
        /* JADX WARN: Code duplicated, block: B:25:0x0044  */
        /* JADX WARN: Code duplicated, block: B:42:0x006a  */
        public h(int i, esa esaVar, int i2, d dVar, int i3, String str, int i4, boolean z) {
            boolean z2;
            boolean z3;
            int i5;
            int iN;
            int i6;
            boolean z4;
            String strC;
            int i7;
            id4 id4Var;
            int i8;
            int i9;
            int i10;
            id4 id4Var2;
            int i11;
            int i12;
            int i13;
            super(i, esaVar, i2);
            this.y = dVar;
            boolean z5 = dVar.z;
            k95<String> k95Var = dVar.i;
            k95<String> k95Var2 = dVar.k;
            int i14 = z5 ? 24 : 16;
            int i15 = 0;
            this.L = false;
            if (!z || (((i11 = (id4Var2 = this.w).v) != -1 && i11 > dVar.a) || ((i12 = id4Var2.w) != -1 && i12 > dVar.b))) {
                z2 = false;
            } else {
                float f = id4Var2.z;
                if ((f == -1.0f || f <= dVar.c) && ((i13 = id4Var2.j) == -1 || i13 <= dVar.d)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            this.x = z2;
            if (!z || (((i8 = (id4Var = this.w).v) != -1 && i8 < 0) || ((i9 = id4Var.w) != -1 && i9 < 0))) {
                z3 = false;
            } else {
                float f2 = id4Var.z;
                if ((f2 == -1.0f || f2 >= 0.0f) && ((i10 = id4Var.j) == -1 || i10 >= 0)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            this.z = z3;
            this.A = l.m(i3, false);
            id4 id4Var3 = this.w;
            float f3 = id4Var3.z;
            this.B = f3 != -1.0f && f3 >= 10.0f;
            this.C = id4Var3.j;
            int i16 = id4Var3.v;
            this.D = (i16 == -1 || (i7 = id4Var3.w) == -1) ? -1 : i16 * i7;
            int i17 = 0;
            while (true) {
                i5 = Integer.MAX_VALUE;
                if (i17 >= k95Var2.size()) {
                    iN = 0;
                    i17 = Integer.MAX_VALUE;
                    break;
                } else {
                    iN = cv2.n(this.w, k95Var2.get(i17), false);
                    if (iN > 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.F = i17;
            this.G = iN;
            int i18 = this.w.f;
            el7<Integer> el7Var = cv2.k;
            this.H = (i18 == 0 || i18 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
            int i19 = this.w.f;
            this.J = i19 == 0 || (i19 & 1) != 0;
            this.K = cv2.n(this.w, str, cv2.p(str) == null);
            id4 id4Var4 = this.w;
            String str2 = id4Var4.o;
            int i20 = i3 & 384;
            if (i20 == 256 && (strC = mn6.c(id4Var4)) != null) {
                str2 = strC;
            }
            for (int i21 = 0; i21 < k95Var.size(); i21++) {
                if (str2 != null && str2.equals(k95Var.get(i21))) {
                    i5 = i21;
                    break;
                }
            }
            this.E = i5;
            this.I = cv2.h(this.w, dVar.j);
            this.N = i20 == 128 || i20 == 256;
            boolean z6 = i20 == 128;
            this.O = z6;
            this.P = (i3 & 64) == 64;
            this.S = str2;
            if (str2 != null) {
                i6 = 4;
                switch (str2) {
                    case "video/dolby-vision":
                        i6 = 5;
                        break;
                    case "video/av01":
                        break;
                    case "video/hevc":
                        i6 = 3;
                        break;
                    case "video/avc":
                        i6 = 1;
                        break;
                    case "video/x-vnd.on2.vp9":
                        i6 = 2;
                        break;
                    default:
                        i6 = 0;
                        break;
                }
            } else {
                i6 = 0;
            }
            this.Q = i6;
            if (z6) {
                xh1 xh1Var = this.w.E;
                if (xh1Var != null) {
                    int i22 = xh1Var.c;
                    z4 = (i22 == 7 || i22 == 6) ? true : z4;
                } else {
                    xh1 xh1Var2 = xh1.h;
                }
                z4 = false;
            } else {
                z4 = false;
            }
            this.R = z4;
            boolean z7 = this.x;
            d dVar2 = this.y;
            id4 id4Var5 = this.w;
            if ((id4Var5.f & 16384) == 0 && l.m(i3, dVar2.D) && (z7 || dVar2.y)) {
                i15 = (l.m(i3, false) && this.z && z7 && id4Var5.j != -1 && (i14 & i3) != 0) ? 2 : 1;
            }
            this.M = i15;
        }

        public static int f(h hVar, h hVar2) {
            yo1 yo1VarC = yo1.a.c(hVar.A, hVar2.A);
            Integer numValueOf = Integer.valueOf(hVar.F);
            Integer numValueOf2 = Integer.valueOf(hVar2.F);
            n47.t.getClass();
            uv8 uv8Var = uv8.t;
            return yo1VarC.b(numValueOf, numValueOf2, uv8Var).a(hVar.G, hVar2.G).a(hVar.H, hVar2.H).b(Integer.valueOf(hVar.I), Integer.valueOf(hVar2.I), uv8Var).c(hVar.J, hVar2.J).a(hVar.K, hVar2.K).c(hVar.B, hVar2.B).c(hVar.x, hVar2.x).c(hVar.z, hVar2.z).b(Integer.valueOf(hVar.E), Integer.valueOf(hVar2.E), uv8Var).c(hVar.N, hVar2.N).c(hVar.P, hVar2.P).e();
        }

        @Override // cv2.g
        public final int a() {
            return this.M;
        }

        @Override // cv2.g
        public final boolean e(g gVar) {
            h hVar = (h) gVar;
            if (!this.L && !Objects.equals(this.S, hVar.S)) {
                return false;
            }
            this.y.getClass();
            return this.N == hVar.N && this.P == hVar.P;
        }
    }

    public cv2(Context context) {
        ab.b bVar = new ab.b();
        d dVar = d.H;
        this.c = new Object();
        this.d = context != null ? context.getApplicationContext() : null;
        this.e = bVar;
        if (dVar != null) {
            this.f = dVar;
        } else {
            dVar.getClass();
            d.a aVar = new d.a(dVar);
            aVar.c(dVar);
            this.f = new d(aVar);
        }
        this.i = q70.b;
        if (this.f.C && context == null) {
            md6.g("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int h(id4 id4Var, k95 k95Var) {
        for (int i = 0; i < k95Var.size(); i++) {
            for (int i2 = 0; i2 < id4Var.c.size(); i2++) {
                if (((vp5) id4Var.c.get(i2)).b.equals(k95Var.get(i))) {
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void i(mi6.a aVar, d dVar, fq3.a[] aVarArr) {
        int i = aVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            gsa gsaVar = aVar.c[i2];
            Map<gsa, e> map = dVar.F.get(i2);
            if (map != null && map.containsKey(gsaVar)) {
                Map<gsa, e> map2 = dVar.F.get(i2);
                if ((map2 != null ? map2.get(gsaVar) : null) != null) {
                    throw null;
                }
                aVarArr[i2] = null;
            }
        }
    }

    public static void j(mi6.a aVar, d dVar, fq3.a[] aVarArr) {
        for (int i = 0; i < aVar.a; i++) {
            int i2 = aVar.b[i];
            if (dVar.G.get(i) || dVar.w.contains(Integer.valueOf(i2))) {
                aVarArr[i] = null;
            }
        }
    }

    public static void k(mi6.a aVar, d dVar, fq3.a[] aVarArr) {
        int i = aVar.a;
        gsa[] gsaVarArr = aVar.c;
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            l(gsaVarArr[i2], dVar, map);
        }
        l(aVar.f, dVar, map);
        for (int i3 = 0; i3 < i; i3++) {
            ksa ksaVar = (ksa) map.get(Integer.valueOf(aVar.b[i3]));
            if (ksaVar != null) {
                esa esaVar = ksaVar.a;
                k95<Integer> k95Var = ksaVar.b;
                aVarArr[i3] = (k95Var.isEmpty() || gsaVarArr[i3].b(esaVar) == -1) ? null : new fq3.a(esaVar, ek5.m1(k95Var));
            }
        }
    }

    public static void l(gsa gsaVar, lsa lsaVar, HashMap map) {
        for (int i = 0; i < gsaVar.a; i++) {
            ksa ksaVar = lsaVar.v.get(gsaVar.a(i));
            if (ksaVar != null) {
                esa esaVar = ksaVar.a;
                ksa ksaVar2 = (ksa) map.get(Integer.valueOf(esaVar.c));
                if (ksaVar2 == null || (ksaVar2.b.isEmpty() && !ksaVar.b.isEmpty())) {
                    map.put(Integer.valueOf(esaVar.c), ksaVar);
                }
            }
        }
    }

    public static Pair<fq3.a, Integer> m(fq3.a[] aVarArr, int i) {
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            fq3.a aVar = aVarArr[i2];
            if (aVar != null && aVar.a.c == i) {
                return Pair.create(aVar, Integer.valueOf(i2));
            }
        }
        return null;
    }

    public static int n(id4 id4Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(id4Var.d)) {
            return 4;
        }
        String strP = p(str);
        String strP2 = p(id4Var.d);
        if (strP2 == null || strP == null) {
            return (z && strP2 == null) ? 1 : 0;
        }
        if (strP2.startsWith(strP) || strP.startsWith(strP2)) {
            return 3;
        }
        String str2 = n6b.a;
        return strP2.split("-", 2)[0].equals(strP.split("-", 2)[0]) ? 2 : 0;
    }

    public static String p(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    public static fq3.a q(gsa gsaVar, int[][] iArr, d dVar) {
        dVar.q.getClass();
        esa esaVar = null;
        c cVar = null;
        int i = 0;
        for (int i2 = 0; i2 < gsaVar.a; i2++) {
            esa esaVarA = gsaVar.a(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < esaVarA.a; i3++) {
                if (l.m(iArr2[i3], dVar.D)) {
                    c cVar2 = new c(esaVarA.d[i3], iArr2[i3]);
                    if (cVar != null) {
                        if (yo1.a.c(cVar2.u, cVar.u).c(cVar2.t, cVar.t).e() > 0) {
                            esaVar = esaVarA;
                            i = i3;
                            cVar = cVar2;
                        }
                    } else {
                        esaVar = esaVarA;
                        i = i3;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (esaVar == null) {
            return null;
        }
        return new fq3.a(esaVar, i);
    }

    public static Pair r(int i, mi6.a aVar, int[][][] iArr, g.a aVar2, Comparator comparator) {
        int i2;
        RandomAccess randomAccessV;
        mi6.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int i3 = aVar3.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == aVar3.b[i4]) {
                gsa gsaVar = aVar3.c[i4];
                for (int i5 = 0; i5 < gsaVar.a; i5++) {
                    esa esaVarA = gsaVar.a(i5);
                    ul8 ul8VarB = aVar2.b(i4, esaVarA, iArr[i4][i5]);
                    int i6 = esaVarA.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        g gVar = (g) ul8VarB.get(i7);
                        int iA = gVar.a();
                        if (zArr[i7] || iA == 0) {
                            i2 = i3;
                        } else {
                            if (iA == 1) {
                                randomAccessV = k95.v(gVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gVar);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    g gVar2 = (g) ul8VarB.get(i8);
                                    int i9 = i3;
                                    if (gVar2.a() == 2 && gVar.e(gVar2)) {
                                        arrayList2.add(gVar2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccessV = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccessV);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            aVar3 = aVar;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((g) list.get(i10)).v;
        }
        g gVar3 = (g) list.get(0);
        return Pair.create(new fq3.a(gVar3.u, iArr2), Integer.valueOf(gVar3.t));
    }

    @Override // defpackage.msa
    public final lsa a() {
        d dVar;
        synchronized (this.c) {
            dVar = this.f;
        }
        return dVar;
    }

    @Override // defpackage.msa
    public final void d() {
        ix9 ix9Var;
        synchronized (this.c) {
            try {
                Thread thread = this.g;
                if (thread != null) {
                    xl7.q("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (ix9Var = this.h) != null) {
            ix9Var.e();
            this.h = null;
        }
        super.d();
    }

    @Override // defpackage.msa
    public final void f(q70 q70Var) {
        if (this.i.equals(q70Var)) {
            return;
        }
        this.i = q70Var;
        o();
    }

    @Override // defpackage.msa
    public final void g(lsa lsaVar) {
        d dVar;
        if (lsaVar instanceof d) {
            s((d) lsaVar);
        }
        synchronized (this.c) {
            dVar = this.f;
        }
        d.a aVar = new d.a(dVar);
        aVar.c(lsaVar);
        s(new d(aVar));
    }

    public final void o() {
        boolean z;
        androidx.media3.exoplayer.e eVar;
        ix9 ix9Var;
        synchronized (this.c) {
            try {
                z = this.f.C && Build.VERSION.SDK_INT >= 32 && (ix9Var = this.h) != null && ix9Var.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (eVar = this.a) == null) {
            return;
        }
        eVar.A.k(10);
    }

    public final void s(d dVar) {
        boolean zEquals;
        synchronized (this.c) {
            zEquals = this.f.equals(dVar);
            this.f = dVar;
        }
        if (zEquals) {
            return;
        }
        if (dVar.C && this.d == null) {
            md6.g("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        androidx.media3.exoplayer.e eVar = this.a;
        if (eVar != null) {
            eVar.A.k(10);
        }
    }

    @Override // defpackage.msa
    public final l.a b() {
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends lsa {
        public static final d H = new d(new a());
        public final boolean A;
        public final boolean B;
        public final boolean C;
        public final boolean D;
        public final boolean E;
        public final SparseArray<Map<gsa, e>> F;
        public final SparseBooleanArray G;
        public final boolean y;
        public final boolean z;

        static {
            ra.b(1000, 1001, 1002, 1003, 1004);
            ra.b(1005, 1006, 1007, 1008, 1009);
            ra.b(1010, 1011, 1012, 1013, 1014);
            n6b.H(1015);
            n6b.H(1016);
            n6b.H(1017);
            n6b.H(1018);
        }

        public d(a aVar) {
            super(aVar);
            this.y = aVar.x;
            this.z = aVar.y;
            this.A = aVar.z;
            this.B = aVar.A;
            this.C = aVar.B;
            this.D = aVar.C;
            this.E = aVar.D;
            this.F = aVar.E;
            this.G = aVar.F;
        }

        @Override // defpackage.lsa
        public final lsa.b a() {
            return new a(this);
        }

        @Override // defpackage.lsa
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (super.equals(dVar) && this.y == dVar.y && this.z == dVar.z && this.A == dVar.A && this.B == dVar.B && this.C == dVar.C && this.D == dVar.D && this.E == dVar.E) {
                    SparseBooleanArray sparseBooleanArray = dVar.G;
                    SparseBooleanArray sparseBooleanArray2 = this.G;
                    int size = sparseBooleanArray2.size();
                    if (sparseBooleanArray.size() == size) {
                        for (int i = 0; i < size; i++) {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) >= 0) {
                            }
                        }
                        SparseArray<Map<gsa, e>> sparseArray = dVar.F;
                        SparseArray<Map<gsa, e>> sparseArray2 = this.F;
                        int size2 = sparseArray2.size();
                        if (sparseArray.size() == size2) {
                            for (int i2 = 0; i2 < size2; i2++) {
                                int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                if (iIndexOfKey >= 0) {
                                    Map<gsa, e> mapValueAt = sparseArray2.valueAt(i2);
                                    Map<gsa, e> mapValueAt2 = sparseArray.valueAt(iIndexOfKey);
                                    if (mapValueAt2.size() == mapValueAt.size()) {
                                        for (Map.Entry<gsa, e> entry : mapValueAt.entrySet()) {
                                            gsa key = entry.getKey();
                                            if (!mapValueAt2.containsKey(key) || !Objects.equals(entry.getValue(), mapValueAt2.get(key))) {
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @Override // defpackage.lsa
        public final int hashCode() {
            return (((((((((((((((super.hashCode() + 31) * 31) + (this.y ? 1 : 0)) * 961) + (this.z ? 1 : 0)) * 961) + (this.A ? 1 : 0)) * 28629151) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 961) + (this.E ? 1 : 0)) * 31;
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a extends lsa.b {
            public final boolean A;
            public final boolean B;
            public final boolean C;
            public final boolean D;
            public final SparseArray<Map<gsa, e>> E;
            public final SparseBooleanArray F;
            public final boolean x;
            public final boolean y;
            public final boolean z;

            public a(d dVar) {
                c(dVar);
                this.x = dVar.y;
                this.y = dVar.z;
                this.z = dVar.A;
                this.A = dVar.B;
                this.B = dVar.C;
                this.C = dVar.D;
                this.D = dVar.E;
                SparseArray<Map<gsa, e>> sparseArray = dVar.F;
                SparseArray<Map<gsa, e>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                this.E = sparseArray2;
                this.F = dVar.G.clone();
            }

            @Override // lsa.b
            public final lsa a() {
                return new d(this);
            }

            @Override // lsa.b
            public final lsa.b b(int i) {
                super.b(i);
                return this;
            }

            @Override // lsa.b
            public final lsa.b d(Set set) {
                super.d(set);
                return this;
            }

            @Override // lsa.b
            public final lsa.b e() {
                this.u = -3;
                return this;
            }

            @Override // lsa.b
            public final lsa.b f(ksa ksaVar) {
                super.f(ksaVar);
                return this;
            }

            @Override // lsa.b
            public final lsa.b g(String str) {
                super.g(null);
                return this;
            }

            @Override // lsa.b
            public final lsa.b h(String[] strArr) {
                super.h(strArr);
                return this;
            }

            @Override // lsa.b
            public final lsa.b i() {
                this.s = false;
                return this;
            }

            @Override // lsa.b
            public final lsa.b j(int i, boolean z) {
                super.j(i, z);
                return this;
            }

            public final void k(String str) {
                super.g(str);
            }

            public a() {
                this.E = new SparseArray<>();
                this.F = new SparseBooleanArray();
                this.x = true;
                this.y = true;
                this.z = true;
                this.A = true;
                this.B = true;
                this.C = true;
                this.D = true;
            }
        }
    }
}
