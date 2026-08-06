package defpackage;

import android.net.Uri;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dz4 extends gz4 {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final h83 q;
    public final k95 r;
    public final k95 s;
    public final m95 t;
    public final long u;
    public final g v;
    public final k95<b> w;
    public final e x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final String a;
        public final Uri b;
        public final Uri c;
        public final long d;
        public final long e;
        public final long f;
        public final long g;
        public final List<String> h;
        public final boolean i;
        public final long j;
        public final long k;
        public final k95<String> l;
        public final k95<String> m;
        public final ul8 n;
        public final boolean o;
        public final String p;
        public final String q;
        public final long r;
        public final long s;
        public final String t;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a {
            public final String a;
            public Uri c;
            public Uri d;
            public boolean j;
            public Boolean o;
            public String p;
            public String q;
            public String t;
            public final HashMap b = new HashMap();
            public long e = -9223372036854775807L;
            public long f = -9223372036854775807L;
            public long g = -9223372036854775807L;
            public long h = -9223372036854775807L;
            public ArrayList i = new ArrayList();
            public long k = -9223372036854775807L;
            public long l = -9223372036854775807L;
            public ArrayList m = new ArrayList();
            public ArrayList n = new ArrayList();
            public long r = -9223372036854775807L;
            public long s = -9223372036854775807L;

            public a(String str) {
                this.a = str;
            }
        }

        public b(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3, long j7, long j8, String str4) {
            xl7.g((uri == null || uri2 == null) && !(uri == null && uri2 == null));
            this.a = str;
            this.b = uri;
            this.c = uri2;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = j4;
            this.h = arrayList;
            this.i = z;
            this.j = j5;
            this.k = j6;
            this.l = k95.q(arrayList2);
            this.m = k95.q(arrayList3);
            this.n = k95.B(new ez4(), arrayList4);
            this.o = z2;
            this.p = str2;
            this.q = str3;
            this.r = j7;
            this.s = j8;
            this.t = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.i == bVar.i && this.j == bVar.j && this.k == bVar.k && this.o == bVar.o && this.r == bVar.r && this.s == bVar.s && Objects.equals(this.a, bVar.a) && Objects.equals(this.b, bVar.b) && Objects.equals(this.c, bVar.c) && Objects.equals(this.h, bVar.h) && Objects.equals(this.l, bVar.l) && Objects.equals(this.m, bVar.m) && Objects.equals(this.n, bVar.n) && Objects.equals(this.p, bVar.p) && Objects.equals(this.q, bVar.q) && Objects.equals(this.t, bVar.t);
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q, Long.valueOf(this.r), Long.valueOf(this.s), this.t);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends f {
        public final boolean E;
        public final boolean F;

        public c(String str, e eVar, long j, int i, long j2, h83 h83Var, String str2, String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, eVar, j, i, j2, h83Var, str2, str3, j3, j4, z);
            this.E = z2;
            this.F = z3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public final Uri a;
        public final long b;
        public final int c;

        public d(Uri uri, long j, int i) {
            this.a = uri;
            this.b = j;
            this.c = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class f implements Comparable<Long> {
        public final String A;
        public final long B;
        public final long C;
        public final boolean D;
        public final String t;
        public final e u;
        public final long v;
        public final int w;
        public final long x;
        public final h83 y;
        public final String z;

        public f(String str, e eVar, long j, int i, long j2, h83 h83Var, String str2, String str3, long j3, long j4, boolean z) {
            this.t = str;
            this.u = eVar;
            this.v = j;
            this.w = i;
            this.x = j2;
            this.y = h83Var;
            this.z = str2;
            this.A = str3;
            this.B = j3;
            this.C = j4;
            this.D = z;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Long l) {
            Long l2 = l;
            long jLongValue = l2.longValue();
            long j = this.x;
            if (j > jLongValue) {
                return 1;
            }
            return j < l2.longValue() ? -1 : 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g {
        public final long a;
        public final boolean b;
        public final long c;
        public final long d;
        public final boolean e;

        public g(long j, boolean z, long j2, long j3, boolean z2) {
            this.a = j;
            this.b = z;
            this.c = j2;
            this.d = j3;
            this.e = z2;
        }
    }

    public dz4(int i, String str, List<String> list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, h83 h83Var, List<e> list2, List<c> list3, g gVar, Map<Uri, d> map, List<b> list4, e eVar) {
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = h83Var;
        this.r = k95.q(list2);
        this.s = k95.q(list3);
        this.t = m95.b(map);
        this.w = k95.q(list4);
        this.x = eVar;
        if (!list3.isEmpty()) {
            c cVar = (c) nr1.b(list3);
            this.u = cVar.x + cVar.v;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            e eVar2 = (e) nr1.b(list2);
            this.u = eVar2.x + eVar2.v;
        }
        long jMin = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            long j6 = this.u;
            jMin = j >= 0 ? Math.min(j6, j) : Math.max(0L, j6 + j);
        }
        this.e = jMin;
        this.f = j >= 0;
        this.v = gVar;
    }

    @Override // defpackage.gz4
    public final Object a(List list) {
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public final String a;
        public final int b;
        public final double c;
        public final String d;

        public a(int i, String str, String str2) {
            boolean z = true;
            if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
                z = false;
            }
            xl7.r(z);
            this.a = str;
            this.b = i;
            this.d = str2;
            this.c = 0.0d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && Double.compare(this.c, aVar.c) == 0 && Objects.equals(this.a, aVar.a) && Objects.equals(this.d, aVar.d);
        }

        public final int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
        }

        public a(String str, double d) {
            this.a = str;
            this.b = 2;
            this.c = d;
            this.d = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends f {
        public final String E;
        public final k95 F;

        public e(String str, e eVar, String str2, long j, int i, long j2, h83 h83Var, String str3, String str4, long j3, long j4, boolean z, List<c> list) {
            super(str, eVar, j, i, j2, h83Var, str3, str4, j3, j4, z);
            this.E = str2;
            this.F = k95.q(list);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public e(String str, long j, long j2, String str2, String str3) {
            this(str, null, BuildConfig.FLAVOR, 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, ul8.x);
            k95.b bVar = k95.u;
        }
    }
}
