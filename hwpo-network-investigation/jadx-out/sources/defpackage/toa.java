package defpackage;

import android.net.Uri;
import android.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class toa {
    public static final a a = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends toa {
        @Override // defpackage.toa
        public final int b(Object obj) {
            return -1;
        }

        @Override // defpackage.toa
        public final b f(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // defpackage.toa
        public final int h() {
            return 0;
        }

        @Override // defpackage.toa
        public final Object l(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // defpackage.toa
        public final c m(int i, c cVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // defpackage.toa
        public final int o() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public Object a;
        public Object b;
        public int c;
        public long d;
        public long e;
        public boolean f;
        public sa g = sa.c;

        static {
            ra.b(0, 1, 2, 3, 4);
        }

        public final long a(int i, int i2) {
            sa.a aVarA = this.g.a(i);
            if (aVarA.a != -1) {
                return aVarA.f[i2];
            }
            return -9223372036854775807L;
        }

        public final int b(long j) {
            sa.a aVarA;
            int i;
            sa saVar = this.g;
            long j2 = this.d;
            int i2 = saVar.a;
            if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
                int i3 = 0;
                while (i3 < i2) {
                    saVar.a(i3).getClass();
                    saVar.a(i3).getClass();
                    if (0 > j && ((i = (aVarA = saVar.a(i3)).a) == -1 || aVarA.a(-1) < i)) {
                        break;
                    }
                    i3++;
                }
                if (i3 < i2) {
                    if (j2 != -9223372036854775807L) {
                        saVar.a(i3).getClass();
                        if (0 <= j2) {
                        }
                    }
                    return i3;
                }
            }
            return -1;
        }

        public final int c(long j) {
            sa saVar = this.g;
            int i = saVar.a;
            int i2 = i - 1;
            if (i2 == i - 1) {
                saVar.a(i2).getClass();
            }
            while (i2 >= 0 && j != Long.MIN_VALUE) {
                saVar.a(i2).getClass();
                if (j >= 0) {
                    break;
                }
                i2--;
            }
            if (i2 >= 0) {
                sa.a aVarA = saVar.a(i2);
                int i3 = aVarA.a;
                if (i3 != -1) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = aVarA.e[i4];
                        if (i5 != 0 && i5 != 1) {
                        }
                    }
                }
                return i2;
            }
            return -1;
        }

        public final long d(int i) {
            this.g.a(i).getClass();
            return 0L;
        }

        public final int e(int i) {
            return this.g.a(i).a(-1);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.a, bVar.a) && Objects.equals(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && Objects.equals(this.g, bVar.g);
        }

        public final boolean f(int i) {
            sa saVar = this.g;
            int i2 = saVar.a;
            if (i != i2 - 1 || i != i2 - 1) {
                return false;
            }
            saVar.a(i).getClass();
            return false;
        }

        public final boolean g(int i) {
            this.g.a(i).getClass();
            return false;
        }

        public final void h(Object obj, Object obj2, int i, long j, long j2, sa saVar, boolean z) {
            this.a = obj;
            this.b = obj2;
            this.c = i;
            this.d = j;
            this.e = j2;
            this.g = saVar;
            this.f = z;
        }

        public final int hashCode() {
            Object obj = this.a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
            long j = this.d;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.e;
            return this.g.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public static final Object q = new Object();
        public static final co6 r;

        @Deprecated
        public Object b;
        public Object d;
        public long e;
        public long f;
        public long g;
        public boolean h;
        public boolean i;
        public co6.e j;
        public boolean k;
        public long l;
        public long m;
        public int n;
        public int o;
        public long p;
        public Object a = q;
        public co6 c = r;

        static {
            co6.b.a aVar = new co6.b.a();
            vl8 vl8Var = vl8.z;
            k95.b bVar = k95.u;
            ul8 ul8Var = ul8.x;
            List list = Collections.EMPTY_LIST;
            ul8 ul8Var2 = ul8.x;
            co6.e.a aVar2 = new co6.e.a();
            co6.g gVar = co6.g.a;
            Uri uri = Uri.EMPTY;
            r = new co6("androidx.media3.common.Timeline", new co6.c(aVar), uri != null ? new co6.f(uri, null, null, list, ul8Var2, null, -9223372036854775807L) : null, new co6.e(aVar2), np6.B, gVar);
            ra.b(1, 2, 3, 4, 5);
            ra.b(6, 7, 8, 9, 10);
            n6b.H(11);
            n6b.H(12);
            n6b.H(13);
        }

        public final boolean a() {
            return this.j != null;
        }

        public final void b(co6 co6Var, Object obj, long j, long j2, long j3, boolean z, boolean z2, co6.e eVar, long j4, long j5, long j6) {
            co6.f fVar;
            this.a = q;
            this.c = co6Var != null ? co6Var : r;
            this.b = (co6Var == null || (fVar = co6Var.b) == null) ? null : fVar.e;
            this.d = obj;
            this.e = j;
            this.f = j2;
            this.g = j3;
            this.h = z;
            this.i = z2;
            this.j = eVar;
            this.l = j4;
            this.m = j5;
            this.n = 0;
            this.o = 0;
            this.p = j6;
            this.k = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.a, cVar.a) && Objects.equals(this.c, cVar.c) && Objects.equals(this.d, cVar.d) && Objects.equals(this.j, cVar.j) && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && this.h == cVar.h && this.i == cVar.i && this.k == cVar.k && this.l == cVar.l && this.m == cVar.m && this.n == cVar.n && this.o == cVar.o && this.p == cVar.p;
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
            Object obj = this.d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            co6.e eVar = this.j;
            int iHashCode3 = (iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
            long j = this.e;
            int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.g;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
            long j4 = this.l;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.m;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
            long j6 = this.p;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    static {
        n6b.H(0);
        n6b.H(1);
        n6b.H(2);
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, b bVar, c cVar, int i2, boolean z) {
        int i3 = f(i, bVar, false).c;
        if (m(i3, cVar, 0L).o != i) {
            return i + 1;
        }
        int iE = e(i3, z, i2);
        if (iE == -1) {
            return -1;
        }
        return m(iE, cVar, 0L).n;
    }

    public int e(int i, boolean z, int i2) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        d43.c();
        return 0;
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof toa) {
                toa toaVar = (toa) obj;
                if (toaVar.o() == o() && toaVar.h() == h()) {
                    c cVar = new c();
                    b bVar = new b();
                    c cVar2 = new c();
                    b bVar2 = new b();
                    for (int i = 0; i < o(); i++) {
                        if (m(i, cVar, 0L).equals(toaVar.m(i, cVar2, 0L))) {
                        }
                    }
                    for (int i2 = 0; i2 < h(); i2++) {
                        if (f(i2, bVar, true).equals(toaVar.f(i2, bVar2, true))) {
                        }
                    }
                    int iA = a(true);
                    if (iA == toaVar.a(true) && (iC = c(true)) == toaVar.c(true)) {
                        while (iA != iC) {
                            int iE = e(iA, true, 0);
                            if (iE == toaVar.e(iA, true, 0)) {
                                iA = iE;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract b f(int i, b bVar, boolean z);

    public b g(Object obj, b bVar) {
        return f(b(obj), bVar, true);
    }

    public abstract int h();

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int iO = o() + 217;
        for (int i = 0; i < o(); i++) {
            iO = (iO * 31) + m(i, cVar, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            iH = (iH * 31) + f(i2, bVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, true, 0);
        }
        return iH;
    }

    public final Pair<Object, Long> i(c cVar, b bVar, int i, long j) {
        Pair<Object, Long> pairJ = j(cVar, bVar, i, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair<Object, Long> j(c cVar, b bVar, int i, long j, long j2) {
        xl7.k(i, o());
        m(i, cVar, j2);
        if (j == -9223372036854775807L) {
            j = cVar.l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.n;
        f(i2, bVar, false);
        while (i2 < cVar.o && bVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, bVar, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, bVar, true);
        long jMin = j - bVar.e;
        long j3 = bVar.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = bVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i, boolean z, int i2) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        d43.c();
        return 0;
    }

    public abstract Object l(int i);

    public abstract c m(int i, c cVar, long j);

    public final void n(int i, c cVar) {
        m(i, cVar, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
