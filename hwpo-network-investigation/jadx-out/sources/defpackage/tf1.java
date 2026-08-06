package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tf1 extends xqb {
    public final long l;
    public final boolean m;
    public final ArrayList<sf1> n;
    public final toa.c o;
    public b p;
    public c q;
    public long r;
    public long s;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final bq6 a;
        public long b;
        public boolean c;
        public boolean d;

        public a(bq6 bq6Var) {
            bq6Var.getClass();
            this.a = bq6Var;
            this.c = true;
            this.b = Long.MIN_VALUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends ud4 {
        public final long c;
        public final long d;
        public final long e;
        public final boolean f;

        public b(toa toaVar, long j, long j2) throws c {
            super(toaVar);
            if (j2 != Long.MIN_VALUE && j2 < j) {
                throw new c(j, 2, j2);
            }
            boolean z = false;
            if (toaVar.h() != 1) {
                throw new c(0);
            }
            toa.c cVarM = toaVar.m(0, new toa.c(), 0L);
            long jMax = Math.max(0L, j);
            if (!cVarM.k && jMax != 0 && !cVarM.h) {
                throw new c(1);
            }
            long jMax2 = j2 == Long.MIN_VALUE ? cVarM.m : Math.max(0L, j2);
            long j3 = cVarM.m;
            if (j3 != -9223372036854775807L) {
                jMax2 = jMax2 > j3 ? j3 : jMax2;
                if (jMax > jMax2) {
                    jMax = jMax2;
                }
            }
            this.c = jMax;
            this.d = jMax2;
            this.e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
            if (cVarM.i && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
                z = true;
            }
            this.f = z;
        }

        @Override // defpackage.ud4, defpackage.toa
        public final toa.b f(int i, toa.b bVar, boolean z) {
            this.b.f(0, bVar, z);
            long j = bVar.e - this.c;
            long j2 = this.e;
            bVar.h(bVar.a, bVar.b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, sa.c, false);
            return bVar;
        }

        @Override // defpackage.ud4, defpackage.toa
        public final toa.c m(int i, toa.c cVar, long j) {
            this.b.m(0, cVar, 0L);
            long j2 = cVar.p;
            long j3 = this.c;
            cVar.p = j2 + j3;
            cVar.m = this.e;
            cVar.i = this.f;
            long j4 = cVar.l;
            if (j4 != -9223372036854775807L) {
                long jMax = Math.max(j4, j3);
                cVar.l = jMax;
                long j5 = this.d;
                if (j5 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j5);
                }
                cVar.l = jMax - j3;
            }
            long jZ = n6b.Z(j3);
            long j6 = cVar.e;
            if (j6 != -9223372036854775807L) {
                cVar.e = j6 + jZ;
            }
            long j7 = cVar.f;
            if (j7 != -9223372036854775807L) {
                cVar.f = j7 + jZ;
            }
            return cVar;
        }
    }

    public tf1(a aVar) {
        super(aVar.a);
        this.l = aVar.b;
        this.m = aVar.c;
        this.n = new ArrayList<>();
        this.o = new toa.c();
    }

    @Override // defpackage.xqb
    public final void A(toa toaVar) {
        if (this.q != null) {
            return;
        }
        D(toaVar);
    }

    public final void D(toa toaVar) {
        long j;
        toa.c cVar = this.o;
        toaVar.n(0, cVar);
        long j2 = cVar.p;
        b bVar = this.p;
        long j3 = this.l;
        ArrayList<sf1> arrayList = this.n;
        if (bVar == null || arrayList.isEmpty()) {
            this.r = j2;
            this.s = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sf1 sf1Var = arrayList.get(i);
                long j4 = this.r;
                long j5 = this.s;
                sf1Var.y = j4;
                sf1Var.z = j5;
            }
            j = 0;
        } else {
            j = this.r - j2;
            j3 = j3 == Long.MIN_VALUE ? Long.MIN_VALUE : this.s - j2;
        }
        try {
            b bVar2 = new b(toaVar, j, j3);
            this.p = bVar2;
            s(bVar2);
        } catch (c e) {
            this.q = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                arrayList.get(i2).A = this.q;
            }
        }
    }

    @Override // defpackage.bq6
    public final up6 c(bq6.b bVar, ki kiVar, long j) {
        sf1 sf1Var = new sf1(this.k.c(bVar, kiVar, j), this.m, this.r, this.s, 0);
        this.n.add(sf1Var);
        return sf1Var;
    }

    @Override // defpackage.vt1, defpackage.bq6
    public final void j() throws c {
        c cVar = this.q;
        if (cVar != null) {
            throw cVar;
        }
        super.j();
    }

    @Override // defpackage.bq6
    public final void n(up6 up6Var) {
        ArrayList<sf1> arrayList = this.n;
        xl7.r(arrayList.remove(up6Var));
        this.k.n(((sf1) up6Var).t);
        if (arrayList.isEmpty()) {
            b bVar = this.p;
            bVar.getClass();
            D(bVar.b);
        }
    }

    @Override // defpackage.vt1, defpackage.qk0
    public final void t() {
        super.t();
        this.q = null;
        this.p = null;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        public c(long j, int i, long j2) {
            String str;
            if (i != 0) {
                if (i == 1) {
                    str = "not seekable to start";
                } else if (i != 2) {
                    str = "unknown";
                } else {
                    xl7.r((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
                    str = "start exceeds end. Start time: " + j + ", End time: " + j2;
                }
            } else {
                str = "invalid period count";
            }
            super("Illegal clipping: ".concat(str));
        }

        public c(int i) {
            this(-9223372036854775807L, i, -9223372036854775807L);
        }
    }
}
