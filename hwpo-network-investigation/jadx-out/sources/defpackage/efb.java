package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class efb {
    public final qv2.a a;
    public final bfb b;
    public final bfb.a c = new bfb.a();
    public final soa<tfb> d = new soa<>();
    public final soa<Long> e = new soa<>();
    public final ie6 f;
    public final cfb g;
    public long h;
    public long i;
    public long j;
    public tfb k;
    public long l;

    public efb(qv2.a aVar, bfb bfbVar, cfb cfbVar) {
        this.a = aVar;
        this.b = bfbVar;
        this.g = cfbVar;
        ie6 ie6Var = new ie6();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        ie6Var.a = 0;
        ie6Var.b = -1;
        ie6Var.c = 0;
        ie6Var.d = new long[iHighestOneBit];
        ie6Var.e = iHighestOneBit - 1;
        this.f = ie6Var;
        this.h = -9223372036854775807L;
        this.k = tfb.d;
        this.i = -9223372036854775807L;
        this.j = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        final qv2.a aVar = this.a;
        qv2 qv2Var = qv2.this;
        while (true) {
            ie6 ie6Var = this.f;
            int i = ie6Var.c;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                vl.b();
                return;
            }
            long j3 = ie6Var.d[ie6Var.a];
            Long lF = this.e.f(j3);
            bfb bfbVar = this.b;
            if (lF != null && lF.longValue() != this.l) {
                this.l = lF.longValue();
                bfbVar.e(2);
            }
            long j4 = this.l;
            bfb bfbVar2 = this.b;
            bfb.a aVar2 = this.c;
            int iA = bfbVar2.a(j3, j, j2, j4, false, false, aVar2);
            if (iA != 5 && iA != 4) {
                this.g.a(j3, aVar2.a);
            }
            if (iA == 0 || iA == 1) {
                this.i = j3;
                boolean z = iA == 0;
                long jA = ie6Var.a();
                final tfb tfbVarF = this.d.f(jA);
                if (tfbVarF != null && !tfbVarF.equals(tfb.d) && !tfbVarF.equals(this.k)) {
                    this.k = tfbVarF;
                    id4.a aVar3 = new id4.a();
                    aVar3.u = tfbVarF.a;
                    aVar3.v = tfbVarF.b;
                    aVar3.n = fv6.n("video/raw");
                    aVar.a = new id4(aVar3);
                    qv2Var.i.execute(new Runnable() { // from class: pv2
                        @Override // java.lang.Runnable
                        public final void run() {
                            qv2.this.h.b(tfbVarF);
                        }
                    });
                }
                long jNanoTime = z ? System.nanoTime() : aVar2.b;
                boolean z2 = bfbVar.e != 3;
                bfbVar.e = 3;
                bfbVar.g = n6b.N(bfbVar.l.c());
                if (z2 && qv2Var.e != null) {
                    qv2Var.i.execute(new Runnable() { // from class: nv2
                        @Override // java.lang.Runnable
                        public final void run() {
                            qv2.this.h.e();
                        }
                    });
                }
                id4 id4Var = aVar.a;
                qv2Var.j.f(jA, jNanoTime, id4Var == null ? new id4(new id4.a()) : id4Var, null);
                ((sfb.b) qv2Var.d.remove()).a(jNanoTime);
            } else if (iA == 2 || iA == 3) {
                this.i = j3;
                ie6Var.a();
                qv2Var.i.execute(new Runnable() { // from class: ov2
                    @Override // java.lang.Runnable
                    public final void run() {
                        qv2.this.h.f();
                    }
                });
                ((sfb.b) qv2Var.d.remove()).b();
            } else {
                if (iA != 4) {
                    if (iA == 5) {
                        return;
                    }
                    aa0.c(String.valueOf(iA));
                    return;
                }
                this.i = j3;
            }
        }
    }
}
