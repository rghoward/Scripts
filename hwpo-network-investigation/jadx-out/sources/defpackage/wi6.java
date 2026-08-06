package defpackage;

import android.util.Pair;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wi6 extends xqb {
    public final boolean l;
    public final toa.c m;
    public final toa.b n;
    public a o;
    public vi6 p;
    public boolean q;
    public boolean r;
    public boolean s;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends ud4 {
        public static final Object e = new Object();
        public final Object c;
        public final Object d;

        public a(toa toaVar, Object obj, Object obj2) {
            super(toaVar);
            this.c = obj;
            this.d = obj2;
        }

        @Override // defpackage.ud4, defpackage.toa
        public final int b(Object obj) {
            Object obj2;
            if (e == obj && (obj2 = this.d) != null) {
                obj = obj2;
            }
            return this.b.b(obj);
        }

        @Override // defpackage.ud4, defpackage.toa
        public final toa.b f(int i, toa.b bVar, boolean z) {
            this.b.f(i, bVar, z);
            if (Objects.equals(bVar.b, this.d) && z) {
                bVar.b = e;
            }
            return bVar;
        }

        @Override // defpackage.ud4, defpackage.toa
        public final Object l(int i) {
            Object objL = this.b.l(i);
            return Objects.equals(objL, this.d) ? e : objL;
        }

        @Override // defpackage.ud4, defpackage.toa
        public final toa.c m(int i, toa.c cVar, long j) {
            this.b.m(i, cVar, j);
            if (Objects.equals(cVar.a, this.c)) {
                cVar.a = toa.c.q;
            }
            return cVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends toa {
        public final co6 b;

        public b(co6 co6Var) {
            this.b = co6Var;
        }

        @Override // defpackage.toa
        public final int b(Object obj) {
            return obj == a.e ? 0 : -1;
        }

        @Override // defpackage.toa
        public final toa.b f(int i, toa.b bVar, boolean z) {
            bVar.h(z ? 0 : null, z ? a.e : null, 0, -9223372036854775807L, 0L, sa.c, true);
            return bVar;
        }

        @Override // defpackage.toa
        public final int h() {
            return 1;
        }

        @Override // defpackage.toa
        public final Object l(int i) {
            return a.e;
        }

        @Override // defpackage.toa
        public final toa.c m(int i, toa.c cVar, long j) {
            Object obj = toa.c.q;
            cVar.b(this.b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0L);
            cVar.k = true;
            return cVar;
        }

        @Override // defpackage.toa
        public final int o() {
            return 1;
        }
    }

    public wi6(bq6 bq6Var, boolean z) {
        super(bq6Var);
        this.l = z && bq6Var.k();
        this.m = new toa.c();
        this.n = new toa.b();
        toa toaVarL = bq6Var.l();
        if (toaVarL == null) {
            this.o = new a(new b(bq6Var.h()), toa.c.q, a.e);
        } else {
            this.o = new a(toaVarL, null, null);
            this.s = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.xqb
    public final void A(toa toaVar) {
        long j;
        a aVar;
        bq6.b bVarA;
        a aVar2;
        if (this.r) {
            a aVar3 = this.o;
            this.o = new a(toaVar, aVar3.c, aVar3.d);
            vi6 vi6Var = this.p;
            if (vi6Var != null) {
                E(vi6Var.A);
            }
        } else {
            if (!toaVar.p()) {
                toa.c cVar = this.m;
                toaVar.n(0, cVar);
                long j2 = cVar.l;
                Object obj = cVar.a;
                vi6 vi6Var2 = this.p;
                if (vi6Var2 != null) {
                    long j3 = vi6Var2.u;
                    a aVar4 = this.o;
                    Object obj2 = vi6Var2.t.a;
                    toa.b bVar = this.n;
                    aVar4.g(obj2, bVar);
                    long j4 = bVar.e + j3;
                    this.o.m(0, cVar, 0L);
                    if (j4 != cVar.l) {
                        j = j4;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Pair<Object, Long> pairI = toaVar.i(this.m, this.n, 0, j);
                Object obj3 = pairI.first;
                long jLongValue = ((Long) pairI.second).longValue();
                if (this.s) {
                    a aVar5 = this.o;
                    aVar = new a(toaVar, aVar5.c, aVar5.d);
                } else {
                    aVar = new a(toaVar, obj, obj3);
                }
                this.o = aVar;
                vi6 vi6Var3 = this.p;
                if (vi6Var3 != null && E(jLongValue)) {
                    bq6.b bVar2 = vi6Var3.t;
                    Object obj4 = bVar2.a;
                    if (this.o.d != null && obj4.equals(a.e)) {
                        obj4 = this.o.d;
                    }
                    bVarA = bVar2.a(obj4);
                }
                this.s = true;
                this.r = true;
                s(this.o);
                if (bVarA != null) {
                    vi6 vi6Var4 = this.p;
                    vi6Var4.getClass();
                    vi6Var4.h(bVarA);
                }
            }
            if (this.s) {
                a aVar6 = this.o;
                aVar2 = new a(toaVar, aVar6.c, aVar6.d);
            } else {
                aVar2 = new a(toaVar, toa.c.q, a.e);
            }
            this.o = aVar2;
        }
        bVarA = null;
        this.s = true;
        this.r = true;
        s(this.o);
        if (bVarA != null) {
            vi6 vi6Var5 = this.p;
            vi6Var5.getClass();
            vi6Var5.h(bVarA);
        }
    }

    @Override // defpackage.xqb
    public final void C() {
        if (this.l) {
            return;
        }
        this.q = true;
        B();
    }

    @Override // defpackage.bq6
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final vi6 c(bq6.b bVar, ki kiVar, long j) {
        vi6 vi6Var = new vi6(bVar, kiVar, j);
        xl7.r(vi6Var.w == null);
        vi6Var.w = this.k;
        if (!this.r) {
            this.p = vi6Var;
            if (!this.q) {
                this.q = true;
                B();
            }
            return vi6Var;
        }
        Object obj = bVar.a;
        if (this.o.d != null && obj.equals(a.e)) {
            obj = this.o.d;
        }
        vi6Var.h(bVar.a(obj));
        return vi6Var;
    }

    public final boolean E(long j) {
        vi6 vi6Var = this.p;
        int iB = this.o.b(vi6Var.t.a);
        if (iB == -1) {
            return false;
        }
        a aVar = this.o;
        toa.b bVar = this.n;
        aVar.f(iB, bVar, false);
        long j2 = bVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        vi6Var.A = j;
        return true;
    }

    @Override // defpackage.xqb, defpackage.bq6
    public final void m(co6 co6Var) {
        if (this.s) {
            a aVar = this.o;
            toa toaVar = aVar.b;
            this.o = new a(toaVar instanceof uoa ? new uoa(((uoa) toaVar).b, co6Var) : new uoa(toaVar, co6Var), aVar.c, aVar.d);
        } else {
            this.o = new a(new b(co6Var), toa.c.q, a.e);
        }
        this.k.m(co6Var);
    }

    @Override // defpackage.bq6
    public final void n(up6 up6Var) {
        vi6 vi6Var = (vi6) up6Var;
        if (vi6Var.x != null) {
            bq6 bq6Var = vi6Var.w;
            bq6Var.getClass();
            bq6Var.n(vi6Var.x);
        }
        if (up6Var == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.vt1, defpackage.qk0
    public final void t() {
        this.r = false;
        this.q = false;
        super.t();
    }

    @Override // defpackage.xqb
    public final bq6.b z(bq6.b bVar) {
        Object obj = bVar.a;
        Object obj2 = this.o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.e;
        }
        return bVar.a(obj);
    }
}
