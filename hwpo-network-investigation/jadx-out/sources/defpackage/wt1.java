package defpackage;

import androidx.media3.exoplayer.g;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wt1 implements bd9 {
    public final ul8 t;
    public long u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements bd9 {
        public final bd9 t;
        public final k95<Integer> u;

        public a(bd9 bd9Var, List<Integer> list) {
            this.t = bd9Var;
            this.u = k95.q(list);
        }

        @Override // defpackage.bd9
        public final boolean c(g gVar) {
            return this.t.c(gVar);
        }

        @Override // defpackage.bd9
        public final long e() {
            return this.t.e();
        }

        @Override // defpackage.bd9
        public final boolean j() {
            return this.t.j();
        }

        @Override // defpackage.bd9
        public final long q() {
            return this.t.q();
        }

        @Override // defpackage.bd9
        public final void v(long j) {
            this.t.v(j);
        }
    }

    public wt1(List<? extends bd9> list, List<List<Integer>> list2) {
        k95.b bVar = k95.u;
        k95.a aVar = new k95.a();
        xl7.g(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            aVar.c(new a(list.get(i), list2.get(i)));
        }
        this.t = aVar.g();
        this.u = -9223372036854775807L;
    }

    @Override // defpackage.bd9
    public final boolean c(g gVar) {
        boolean zC;
        boolean z = false;
        do {
            long jE = e();
            if (jE == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zC = false;
            while (true) {
                ul8 ul8Var = this.t;
                if (i >= ul8Var.w) {
                    break;
                }
                long jE2 = ((a) ul8Var.get(i)).t.e();
                boolean z2 = jE2 != Long.MIN_VALUE && jE2 <= gVar.a;
                if (jE2 == jE || z2) {
                    zC |= ((a) ul8Var.get(i)).t.c(gVar);
                }
                i++;
            }
            z |= zC;
        } while (zC);
        return z;
    }

    @Override // defpackage.bd9
    public final long e() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            ul8 ul8Var = this.t;
            if (i >= ul8Var.w) {
                break;
            }
            long jE = ((a) ul8Var.get(i)).t.e();
            if (jE != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jE);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.bd9
    public final boolean j() {
        int i = 0;
        while (true) {
            ul8 ul8Var = this.t;
            if (i >= ul8Var.w) {
                return false;
            }
            if (((a) ul8Var.get(i)).t.j()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.bd9
    public final long q() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            ul8 ul8Var = this.t;
            if (i >= ul8Var.w) {
                break;
            }
            a aVar = (a) ul8Var.get(i);
            long jQ = aVar.t.q();
            k95<Integer> k95Var = aVar.u;
            if ((k95Var.contains(1) || k95Var.contains(2) || k95Var.contains(4)) && jQ != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jQ);
            }
            if (jQ != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jQ);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.u = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.u;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // defpackage.bd9
    public final void v(long j) {
        int i = 0;
        while (true) {
            ul8 ul8Var = this.t;
            if (i >= ul8Var.w) {
                return;
            }
            ((a) ul8Var.get(i)).v(j);
            i++;
        }
    }
}
