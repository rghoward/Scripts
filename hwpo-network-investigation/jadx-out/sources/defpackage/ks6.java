package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ks6 implements lc2 {
    public static final su1 u;
    public final ArrayList t = new ArrayList();

    static {
        n47 n47Var = n47.t;
        is6 is6Var = new is6();
        n47Var.getClass();
        lz0 lz0Var = new lz0(is6Var, n47Var);
        uv8 uv8Var = uv8.t;
        js6 js6Var = new js6();
        uv8Var.getClass();
        u = new su1(lz0Var, new lz0(js6Var, uv8Var));
    }

    @Override // defpackage.lc2
    public final long a(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.t;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((mc2) arrayList.get(i)).b;
            long j3 = ((mc2) arrayList.get(i)).d;
            if (j < j2) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j2);
                    break;
                }
                jMin = j2;
                break;
            }
            if (j < j3) {
                jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
            }
            i++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.lc2
    public final boolean b(mc2 mc2Var, long j) {
        long j2 = mc2Var.b;
        xl7.g(j2 != -9223372036854775807L);
        xl7.g(mc2Var.c != -9223372036854775807L);
        boolean z = j2 <= j && j < mc2Var.d;
        ArrayList arrayList = this.t;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((mc2) arrayList.get(size)).b) {
                arrayList.add(size + 1, mc2Var);
                return z;
            }
        }
        arrayList.add(0, mc2Var);
        return z;
    }

    @Override // defpackage.lc2
    public final k95<ec2> c(long j) {
        ArrayList arrayList = this.t;
        if (!arrayList.isEmpty()) {
            if (j >= ((mc2) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    mc2 mc2Var = (mc2) arrayList.get(i);
                    if (j >= mc2Var.b && j < mc2Var.d) {
                        arrayList2.add(mc2Var);
                    }
                    if (j < mc2Var.b) {
                        break;
                    }
                }
                ul8 ul8VarB = k95.B(u, arrayList2);
                k95.a aVar = new k95.a();
                for (int i2 = 0; i2 < ul8VarB.w; i2++) {
                    aVar.d(((mc2) ul8VarB.get(i2)).a);
                }
                return aVar.g();
            }
        }
        k95.b bVar = k95.u;
        return ul8.x;
    }

    @Override // defpackage.lc2
    public final void clear() {
        this.t.clear();
    }

    @Override // defpackage.lc2
    public final long d(long j) {
        ArrayList arrayList = this.t;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((mc2) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long jMax = ((mc2) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((mc2) arrayList.get(i)).b;
            long j3 = ((mc2) arrayList.get(i)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // defpackage.lc2
    public final void e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((mc2) arrayList.get(i)).b;
            if (j > j2 && j > ((mc2) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
