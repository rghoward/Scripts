package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oc2 implements r4a {
    public static final lz0 v;
    public final k95<k95<ec2>> t;
    public final long[] u;

    static {
        n47 n47Var = n47.t;
        nc2 nc2Var = new nc2();
        n47Var.getClass();
        v = new lz0(nc2Var, n47Var);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    public oc2(ul8 ul8Var) {
        int i = ul8Var.w;
        long j = -9223372036854775807L;
        int i2 = 0;
        if (i == 1) {
            k95.b bVarListIterator = ul8Var.listIterator(0);
            Object next = bVarListIterator.next();
            if (bVarListIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i2 < 4 && bVarListIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(bVarListIterator.next());
                    i2++;
                }
                if (bVarListIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            mc2 mc2Var = (mc2) next;
            long j2 = mc2Var.b;
            long j3 = mc2Var.c;
            long j4 = j2 == -9223372036854775807L ? 0L : j2;
            k95<ec2> k95Var = mc2Var.a;
            if (j3 == -9223372036854775807L) {
                this.t = k95.v(k95Var);
                this.u = new long[]{j4};
                return;
            } else {
                k95.b bVar = k95.u;
                this.t = k95.w(k95Var, ul8.x);
                this.u = new long[]{j4, j3 + j4};
                return;
            }
        }
        long[] jArr = new long[i * 2];
        this.u = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        ul8 ul8VarB = k95.B(v, ul8Var);
        int i3 = 0;
        while (i2 < ul8VarB.w) {
            mc2 mc2Var2 = (mc2) ul8VarB.get(i2);
            long j5 = mc2Var2.b;
            long j6 = mc2Var2.c;
            k95<ec2> k95Var2 = mc2Var2.a;
            j5 = j5 == j ? 0L : j5;
            long j7 = j5 + j6;
            if (i3 != 0) {
                int i4 = i3 - 1;
                long j8 = this.u[i4];
                if (j8 < j5) {
                    this.u[i3] = j5;
                    arrayList.add(k95Var2);
                    i3++;
                } else if (j8 == j5 && ((k95) arrayList.get(i4)).isEmpty()) {
                    arrayList.set(i4, k95Var2);
                } else {
                    md6.g("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.u[i4] = j5;
                    arrayList.set(i4, k95Var2);
                }
            } else {
                this.u[i3] = j5;
                arrayList.add(k95Var2);
                i3++;
            }
            if (j6 != j) {
                this.u[i3] = j7;
                arrayList.add(ul8.x);
                i3++;
            }
            i2++;
            j = j;
        }
        this.t = k95.q(arrayList);
    }

    @Override // defpackage.r4a
    public final int a(long j) {
        int iB = n6b.b(this.u, j, false);
        if (iB < this.t.size()) {
            return iB;
        }
        return -1;
    }

    @Override // defpackage.r4a
    public final long e(int i) {
        xl7.g(i < this.t.size());
        return this.u[i];
    }

    @Override // defpackage.r4a
    public final List f(long j) {
        int iF = n6b.f(this.u, j, false);
        if (iF != -1) {
            return this.t.get(iF);
        }
        k95.b bVar = k95.u;
        return ul8.x;
    }

    @Override // defpackage.r4a
    public final int g() {
        return this.t.size();
    }
}
