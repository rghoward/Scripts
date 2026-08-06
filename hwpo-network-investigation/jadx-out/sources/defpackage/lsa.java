package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class lsa {
    public static final lsa x = new lsa(new b());
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final k95<String> i;
    public final k95<String> j;
    public final k95<String> k;
    public final k95<String> l;
    public final k95<String> m;
    public final int n;
    public final int o;
    public final k95<String> p;
    public final a q;
    public final k95<String> r;
    public final k95<String> s;
    public final boolean t;
    public final int u;
    public final m95<esa, ksa> v;
    public final q95<Integer> w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a a = new a();

        static {
            n6b.H(1);
            n6b.H(2);
            n6b.H(3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return 29791;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public int a = Integer.MAX_VALUE;
        public int b = Integer.MAX_VALUE;
        public int c = Integer.MAX_VALUE;
        public int d = Integer.MAX_VALUE;
        public int e = Integer.MAX_VALUE;
        public int f = Integer.MAX_VALUE;
        public boolean g = true;
        public boolean h = true;
        public k95<String> i;
        public k95<String> j;
        public k95<String> k;
        public k95<String> l;
        public k95<String> m;
        public int n;
        public int o;
        public k95<String> p;
        public a q;
        public k95<String> r;
        public boolean s;
        public k95<String> t;
        public int u;
        public HashMap<esa, ksa> v;
        public HashSet<Integer> w;

        public b() {
            k95.b bVar = k95.u;
            ul8 ul8Var = ul8.x;
            this.i = ul8Var;
            this.j = ul8Var;
            this.k = ul8Var;
            this.l = ul8Var;
            this.m = ul8Var;
            this.n = Integer.MAX_VALUE;
            this.o = Integer.MAX_VALUE;
            this.p = ul8Var;
            this.q = a.a;
            this.r = ul8Var;
            this.s = true;
            this.t = ul8Var;
            this.u = 0;
            this.v = new HashMap<>();
            this.w = new HashSet<>();
        }

        public lsa a() {
            return new lsa(this);
        }

        public b b(int i) {
            Iterator<ksa> it = this.v.values().iterator();
            while (it.hasNext()) {
                if (it.next().a.c == i) {
                    it.remove();
                }
            }
            return this;
        }

        public final void c(lsa lsaVar) {
            this.a = lsaVar.a;
            this.b = lsaVar.b;
            this.c = lsaVar.c;
            this.d = lsaVar.d;
            this.e = lsaVar.e;
            this.f = lsaVar.f;
            this.g = lsaVar.g;
            this.h = lsaVar.h;
            this.j = lsaVar.j;
            this.i = lsaVar.i;
            this.k = lsaVar.k;
            this.l = lsaVar.l;
            this.m = lsaVar.m;
            this.n = lsaVar.n;
            this.o = lsaVar.o;
            this.p = lsaVar.p;
            this.q = lsaVar.q;
            this.r = lsaVar.r;
            this.s = lsaVar.t;
            this.t = lsaVar.s;
            this.u = lsaVar.u;
            this.w = new HashSet<>(lsaVar.w);
            this.v = new HashMap<>(lsaVar.v);
        }

        public b d(Set<Integer> set) {
            this.w.clear();
            this.w.addAll(set);
            return this;
        }

        public b e() {
            this.u = -3;
            return this;
        }

        public b f(ksa ksaVar) {
            esa esaVar = ksaVar.a;
            b(esaVar.c);
            this.v.put(esaVar, ksaVar);
            return this;
        }

        public b g(String str) {
            return str == null ? h(new String[0]) : h(str);
        }

        public b h(String... strArr) {
            k95.b bVar = k95.u;
            k95.a aVar = new k95.a();
            for (String str : strArr) {
                str.getClass();
                aVar.c(n6b.O(str));
            }
            this.r = aVar.g();
            this.s = false;
            return this;
        }

        public b i() {
            this.s = false;
            return this;
        }

        public b j(int i, boolean z) {
            HashSet<Integer> hashSet = this.w;
            if (z) {
                hashSet.add(Integer.valueOf(i));
                return this;
            }
            hashSet.remove(Integer.valueOf(i));
            return this;
        }
    }

    static {
        ra.b(1, 2, 3, 4, 5);
        ra.b(6, 7, 8, 9, 10);
        ra.b(11, 12, 13, 14, 15);
        ra.b(16, 17, 18, 19, 20);
        ra.b(21, 22, 23, 24, 25);
        ra.b(26, 27, 28, 29, 30);
        ra.b(31, 32, 33, 34, 35);
        n6b.H(36);
        n6b.H(37);
        n6b.H(38);
    }

    public lsa(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.n = bVar.n;
        this.m = bVar.m;
        this.o = bVar.o;
        this.p = bVar.p;
        this.q = bVar.q;
        this.r = bVar.r;
        this.t = bVar.s;
        this.s = bVar.t;
        this.u = bVar.u;
        this.v = m95.b(bVar.v);
        this.w = q95.p(bVar.w);
    }

    public b a() {
        b bVar = new b();
        bVar.c(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lsa lsaVar = (lsa) obj;
        if (this.a != lsaVar.a || this.b != lsaVar.b || this.c != lsaVar.c || this.d != lsaVar.d || this.h != lsaVar.h || this.e != lsaVar.e || this.f != lsaVar.f || this.g != lsaVar.g || !this.i.equals(lsaVar.i) || !this.j.equals(lsaVar.j) || !this.k.equals(lsaVar.k) || !this.l.equals(lsaVar.l) || this.n != lsaVar.n || !this.m.equals(lsaVar.m) || this.o != lsaVar.o || !this.p.equals(lsaVar.p) || !this.q.equals(lsaVar.q) || !this.s.equals(lsaVar.s) || !this.r.equals(lsaVar.r) || this.t != lsaVar.t || this.u != lsaVar.u) {
            return false;
        }
        m95<esa, ksa> m95Var = lsaVar.v;
        m95<esa, ksa> m95Var2 = this.v;
        m95Var2.getClass();
        return oi6.a(m95Var, m95Var2) && this.w.equals(lsaVar.w);
    }

    public int hashCode() {
        int iHashCode = (this.p.hashCode() + ((((this.m.hashCode() + ((((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.h ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + (this.g ? 1 : 0)) * 31)) * 31)) * 31)) * 961)) * 961) + this.n) * 31)) * 31) + this.o) * 31)) * 31;
        this.q.getClass();
        return this.w.hashCode() + ((this.v.hashCode() + ((((this.s.hashCode() + ((((this.r.hashCode() + ((iHashCode + 29791) * 961)) * 961) + (this.t ? 1 : 0)) * 31)) * 31) + this.u) * 28629151)) * 31);
    }
}
