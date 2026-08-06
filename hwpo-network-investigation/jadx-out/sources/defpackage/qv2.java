package defpackage;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qv2 implements sfb {
    public final bfb a;
    public final cfb b;
    public final efb c;
    public final ArrayDeque d;
    public Surface e;
    public id4 f;
    public long g;
    public sfb.a h;
    public Executor i;
    public zeb j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a {
        public id4 a;

        public a() {
        }
    }

    public qv2(bfb bfbVar, cfb cfbVar, vf1 vf1Var) {
        this.a = bfbVar;
        this.b = cfbVar;
        bfbVar.l = vf1Var;
        this.c = new efb(new a(), bfbVar, cfbVar);
        this.d = new ArrayDeque();
        this.f = new id4(new id4.a());
        this.g = -9223372036854775807L;
        this.h = sfb.a.a;
        this.i = new kv2();
        this.j = new lv2();
    }

    @Override // defpackage.sfb
    public final void A() {
        bfb bfbVar = this.a;
        if (bfbVar.e == 0) {
            bfbVar.e = 1;
        }
    }

    @Override // defpackage.sfb
    public final Surface c() {
        Surface surface = this.e;
        surface.getClass();
        return surface;
    }

    @Override // defpackage.sfb
    public final boolean d() {
        efb efbVar = this.c;
        long j = efbVar.j;
        return j != -9223372036854775807L && efbVar.i == j;
    }

    @Override // defpackage.sfb
    public final void g() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sfb
    public final void h(long j, long j2) throws sfb.c {
        try {
            this.c.a(j, j2);
        } catch (lo3 e) {
            throw new sfb.c(e, this.f);
        }
    }

    @Override // defpackage.sfb
    public final void i() {
        this.b.b();
        bfb bfbVar = this.a;
        bfbVar.d = false;
        bfbVar.i = -9223372036854775807L;
        dfb dfbVar = bfbVar.b;
        dfbVar.d = false;
        dfb.b bVar = dfbVar.c;
        if (bVar != null) {
            bVar.b();
        }
        dfbVar.a();
    }

    @Override // defpackage.sfb
    public final void j() {
        this.b.b();
        this.a.d();
    }

    @Override // defpackage.sfb
    public final void k(id4 id4Var, long j, int i, List list) {
        xl7.r(list.isEmpty());
        int i2 = id4Var.v;
        int i3 = id4Var.w;
        id4 id4Var2 = this.f;
        int i4 = id4Var2.v;
        efb efbVar = this.c;
        if (i2 != i4 || i3 != id4Var2.w) {
            soa<tfb> soaVar = efbVar.d;
            long j2 = efbVar.h;
            soaVar.a(j2 == -9223372036854775807L ? 0L : j2 + 1, new tfb(i2, i3));
        }
        float f = id4Var.z;
        if (f != this.f.z) {
            this.a.f(f);
        }
        this.f = id4Var;
        if (j != this.g) {
            if (efbVar.f.c == 0) {
                efbVar.b.e(i);
                efbVar.l = j;
            } else {
                soa<Long> soaVar2 = efbVar.e;
                long j3 = efbVar.h;
                soaVar2.a(j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1, Long.valueOf(j));
            }
            this.g = j;
        }
    }

    @Override // defpackage.sfb
    public final void l(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sfb
    public final void m() {
        efb efbVar = this.c;
        if (efbVar.h == -9223372036854775807L) {
            efbVar.h = Long.MIN_VALUE;
            efbVar.i = Long.MIN_VALUE;
        }
        efbVar.j = efbVar.h;
    }

    @Override // defpackage.sfb
    public final void n(int i) {
        dfb dfbVar = this.a.b;
        if (dfbVar.j == i) {
            return;
        }
        dfbVar.j = i;
        dfbVar.d(true);
    }

    @Override // defpackage.sfb
    public final void o(float f) {
        this.a.h(f);
    }

    @Override // defpackage.sfb
    public final void p() {
        this.e = null;
        this.a.g(null);
    }

    @Override // defpackage.sfb
    public final void q(on6 on6Var) {
        this.h = on6Var;
        this.i = y03.t;
    }

    @Override // defpackage.sfb
    public final boolean r(long j, pn6.a aVar) {
        this.d.add(aVar);
        efb efbVar = this.c;
        ie6 ie6Var = efbVar.f;
        int i = ie6Var.c;
        long[] jArr = ie6Var.d;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                d43.c();
                return false;
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = ie6Var.a;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy(ie6Var.d, 0, jArr2, i3, i2);
            ie6Var.a = 0;
            ie6Var.b = ie6Var.c - 1;
            ie6Var.d = jArr2;
            ie6Var.e = length - 1;
        }
        int i4 = (ie6Var.b + 1) & ie6Var.e;
        ie6Var.b = i4;
        ie6Var.d[i4] = j;
        ie6Var.c++;
        efbVar.h = j;
        efbVar.j = -9223372036854775807L;
        this.i.execute(new Runnable() { // from class: mv2
            @Override // java.lang.Runnable
            public final void run() {
                this.t.h.a();
            }
        });
        return true;
    }

    @Override // defpackage.sfb
    public final boolean s(id4 id4Var) {
        return true;
    }

    @Override // defpackage.sfb
    public final void t(boolean z) {
        if (z) {
            bfb bfbVar = this.a;
            bfbVar.b.b();
            bfbVar.h = -9223372036854775807L;
            bfbVar.f = -9223372036854775807L;
            bfbVar.e = Math.min(bfbVar.e, 1);
            bfbVar.i = -9223372036854775807L;
            bfbVar.n = false;
        }
        this.b.b();
        efb efbVar = this.c;
        soa<tfb> soaVar = efbVar.d;
        ie6 ie6Var = efbVar.f;
        ie6Var.a = 0;
        ie6Var.b = -1;
        ie6Var.c = 0;
        efbVar.h = -9223372036854775807L;
        efbVar.i = -9223372036854775807L;
        efbVar.j = -9223372036854775807L;
        soa<Long> soaVar2 = efbVar.e;
        if (soaVar2.h() > 0) {
            xl7.g(soaVar2.h() > 0);
            while (soaVar2.h() > 1) {
                soaVar2.e();
            }
            Long lE = soaVar2.e();
            lE.getClass();
            efbVar.l = lE.longValue();
        }
        if (soaVar.h() > 0) {
            xl7.g(soaVar.h() > 0);
            while (soaVar.h() > 1) {
                soaVar.e();
            }
            tfb tfbVarE = soaVar.e();
            tfbVarE.getClass();
            soaVar.a(0L, tfbVarE);
        }
        this.d.clear();
    }

    @Override // defpackage.sfb
    public final void u(List<Object> list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sfb
    public final void v(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.sfb
    public final boolean w(boolean z) {
        return this.a.b(z);
    }

    @Override // defpackage.sfb
    public final void x(zeb zebVar) {
        this.j = zebVar;
    }

    @Override // defpackage.sfb
    public final void y(Surface surface, ar9 ar9Var) {
        this.e = surface;
        this.a.g(surface);
    }

    @Override // defpackage.sfb
    public final boolean z() {
        return true;
    }

    @Override // defpackage.sfb
    public final void a() {
    }
}
