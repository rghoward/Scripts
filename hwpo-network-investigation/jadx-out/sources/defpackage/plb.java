package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class plb implements r4a {
    public final List<ilb> t;
    public final long[] u;
    public final long[] v;

    public plb(ArrayList arrayList) {
        this.t = Collections.unmodifiableList(new ArrayList(arrayList));
        this.u = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            ilb ilbVar = (ilb) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.u;
            jArr[i2] = ilbVar.b;
            jArr[i2 + 1] = ilbVar.c;
        }
        long[] jArr2 = this.u;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.v = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // defpackage.r4a
    public final int a(long j) {
        long[] jArr = this.v;
        int iB = n6b.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // defpackage.r4a
    public final long e(int i) {
        xl7.g(i >= 0);
        long[] jArr = this.v;
        xl7.g(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.r4a
    public final List<ec2> f(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List<ilb> list = this.t;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = this.u;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                ilb ilbVar = list.get(i);
                ec2 ec2Var = ilbVar.a;
                if (ec2Var.e == -3.4028235E38f) {
                    arrayList2.add(ilbVar);
                } else {
                    arrayList.add(ec2Var);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new olb());
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            ec2.a aVarA = ((ilb) arrayList2.get(i3)).a.a();
            aVarA.e = (-1) - i3;
            aVarA.f = 1;
            arrayList.add(aVarA.a());
        }
        return arrayList;
    }

    @Override // defpackage.r4a
    public final int g() {
        return this.v.length;
    }
}
