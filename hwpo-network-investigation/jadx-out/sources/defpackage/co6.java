package defpackage;

import android.net.Uri;
import com.intercom.twig.BuildConfig;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class co6 {
    public final String a;
    public final f b;
    public final e c;
    public final np6 d;
    public final c e;
    public final g f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public String a;
        public Uri b;
        public String c;
        public b.a d;
        public d.a e;
        public List<r1a> f;
        public k95<i> g;
        public Object h;
        public long i;
        public np6 j;
        public e.a k;
        public g l;

        public final co6 a() {
            f fVar;
            this.e.getClass();
            Uri uri = this.b;
            if (uri != null) {
                String str = this.c;
                this.e.getClass();
                fVar = new f(uri, str, null, this.f, this.g, this.h, this.i);
            } else {
                fVar = null;
            }
            String str2 = this.a;
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            String str3 = str2;
            b.a aVar = this.d;
            aVar.getClass();
            c cVar = new c(aVar);
            e.a aVar2 = this.k;
            aVar2.getClass();
            e eVar = new e(aVar2);
            np6 np6Var = this.j;
            if (np6Var == null) {
                np6Var = np6.B;
            }
            return new co6(str3, cVar, fVar, eVar, np6Var, this.l);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public final long a;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a {
            public long a = Long.MIN_VALUE;

            @Deprecated
            public final c a() {
                return new c(this);
            }
        }

        static {
            new b(new a());
            n6b.H(0);
            n6b.H(1);
            n6b.H(2);
            n6b.H(3);
            n6b.H(4);
            n6b.H(5);
            n6b.H(6);
            n6b.H(7);
        }

        public b(a aVar) {
            String str = n6b.a;
            this.a = aVar.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            long j = this.a;
            return ((int) (j ^ (j >>> 32))) * 923521;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @Deprecated
    public static final class c extends b {
        static {
            new b.a().a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a {
            public a() {
                vl8 vl8Var = vl8.z;
                k95.b bVar = k95.u;
                ul8 ul8Var = ul8.x;
            }
        }

        public final boolean equals(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e {
        public final long a;
        public final long b;
        public final long c;
        public final float d;
        public final float e;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a {
            public long a = -9223372036854775807L;
            public long b = -9223372036854775807L;
            public long c = -9223372036854775807L;
            public float d = -3.4028235E38f;
            public float e = -3.4028235E38f;

            public final e a() {
                return new e(this);
            }
        }

        static {
            new a().a();
            n6b.H(0);
            n6b.H(1);
            n6b.H(2);
            n6b.H(3);
            n6b.H(4);
        }

        public e(a aVar) {
            long j = aVar.a;
            long j2 = aVar.b;
            long j3 = aVar.c;
            float f = aVar.d;
            float f2 = aVar.e;
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = f;
            this.e = f2;
        }

        public final a a() {
            a aVar = new a();
            aVar.a = this.a;
            aVar.b = this.b;
            aVar.c = this.c;
            aVar.d = this.d;
            aVar.e = this.e;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e;
        }

        public final int hashCode() {
            long j = this.a;
            long j2 = this.b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.c;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.d;
            int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.e;
            return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f {
        public final Uri a;
        public final String b;
        public final List<r1a> c;
        public final k95<i> d;
        public final Object e;
        public final long f;

        static {
            ra.b(0, 1, 2, 3, 4);
            n6b.H(5);
            n6b.H(6);
            n6b.H(7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Uri uri, String str, d dVar, List list, k95 k95Var, Object obj, long j) {
            this.a = uri;
            this.b = fv6.n(str);
            this.c = list;
            this.d = k95Var;
            k95.b bVar = k95.u;
            k95.a aVar = new k95.a();
            for (int i = 0; i < k95Var.size(); i++) {
                ((i) k95Var.get(i)).getClass();
                aVar.c(new h());
            }
            aVar.g();
            this.e = obj;
            this.f = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && Objects.equals(this.b, fVar.b) && Objects.equals(null, null) && this.c.equals(fVar.c) && this.d.equals(fVar.d) && Objects.equals(this.e, fVar.e) && this.f == fVar.f;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31;
            Object obj = this.e;
            return (int) ((((long) (iHashCode2 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g {
        public static final g a = new g();

        static {
            n6b.H(0);
            n6b.H(1);
            n6b.H(2);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @Deprecated
    public static final class h extends i {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class i {
        static {
            ra.b(0, 1, 2, 3, 4);
            n6b.H(5);
            n6b.H(6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    static {
        b.a aVar = new b.a();
        vl8 vl8Var = vl8.z;
        k95.b bVar = k95.u;
        ul8 ul8Var = ul8.x;
        List list = Collections.EMPTY_LIST;
        ul8 ul8Var2 = ul8.x;
        e.a aVar2 = new e.a();
        g gVar = g.a;
        aVar.a();
        aVar2.a();
        np6 np6Var = np6.B;
        ra.b(0, 1, 2, 3, 4);
        n6b.H(5);
    }

    public co6(String str, c cVar, f fVar, e eVar, np6 np6Var, g gVar) {
        this.a = str;
        this.b = fVar;
        this.c = eVar;
        this.d = np6Var;
        this.e = cVar;
        this.f = gVar;
    }

    public static co6 b(Uri uri) {
        b.a aVar = new b.a();
        vl8 vl8Var = vl8.z;
        k95.b bVar = k95.u;
        ul8 ul8Var = ul8.x;
        List list = Collections.EMPTY_LIST;
        ul8 ul8Var2 = ul8.x;
        e.a aVar2 = new e.a();
        return new co6(BuildConfig.FLAVOR, new c(aVar), uri != null ? new f(uri, null, null, list, ul8Var2, null, -9223372036854775807L) : null, new e(aVar2), np6.B, g.a);
    }

    public static co6 c(String str) {
        b.a aVar = new b.a();
        vl8 vl8Var = vl8.z;
        k95.b bVar = k95.u;
        ul8 ul8Var = ul8.x;
        List list = Collections.EMPTY_LIST;
        ul8 ul8Var2 = ul8.x;
        e.a aVar2 = new e.a();
        g gVar = g.a;
        Uri uri = str == null ? null : Uri.parse(str);
        return new co6(BuildConfig.FLAVOR, new c(aVar), uri != null ? new f(uri, null, null, list, ul8Var2, null, -9223372036854775807L) : null, new e(aVar2), np6.B, gVar);
    }

    public final a a() {
        a aVar = new a();
        aVar.d = new b.a();
        aVar.e = new d.a();
        aVar.f = Collections.EMPTY_LIST;
        aVar.g = ul8.x;
        aVar.k = new e.a();
        aVar.l = g.a;
        aVar.i = -9223372036854775807L;
        b.a aVar2 = new b.a();
        aVar2.a = this.e.a;
        aVar.d = aVar2;
        aVar.a = this.a;
        aVar.j = this.d;
        aVar.k = this.c.a();
        aVar.l = this.f;
        f fVar = this.b;
        if (fVar != null) {
            aVar.c = fVar.b;
            aVar.b = fVar.a;
            aVar.f = fVar.c;
            aVar.g = fVar.d;
            aVar.h = fVar.e;
            aVar.e = new d.a();
            aVar.i = fVar.f;
        }
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co6)) {
            return false;
        }
        co6 co6Var = (co6) obj;
        return Objects.equals(this.a, co6Var.a) && this.e.equals(co6Var.e) && Objects.equals(this.b, co6Var.b) && this.c.equals(co6Var.c) && Objects.equals(this.d, co6Var.d) && Objects.equals(this.f, co6Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        f fVar = this.b;
        int iHashCode2 = (this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f.getClass();
        return iHashCode2;
    }
}
