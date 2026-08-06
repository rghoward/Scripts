package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ns6 extends vt1<Integer> {
    public static final co6 s;
    public final bq6[] k;
    public final ArrayList l;
    public final toa[] m;
    public final ArrayList<bq6> n;
    public final nq2 o;
    public int p;
    public long[][] q;
    public a r;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends IOException {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final bq6.b a;
        public final up6 b;

        public b(bq6.b bVar, up6 up6Var) {
            this.a = bVar;
            this.b = up6Var;
        }
    }

    static {
        co6.b.a aVar = new co6.b.a();
        vl8 vl8Var = vl8.z;
        k95.b bVar = k95.u;
        ul8 ul8Var = ul8.x;
        List list = Collections.EMPTY_LIST;
        ul8 ul8Var2 = ul8.x;
        co6.e.a aVar2 = new co6.e.a();
        s = new co6("MergingMediaSource", new co6.c(aVar), null, new co6.e(aVar2), np6.B, co6.g.a);
    }

    public ns6(bq6... bq6VarArr) {
        nq2 nq2Var = new nq2();
        this.k = bq6VarArr;
        this.o = nq2Var;
        this.n = new ArrayList<>(Arrays.asList(bq6VarArr));
        this.p = -1;
        this.l = new ArrayList(bq6VarArr.length);
        for (int i = 0; i < bq6VarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new toa[bq6VarArr.length];
        this.q = new long[0][];
        new HashMap();
        zg1.b(8, "expectedKeys");
        zg1.b(2, "expectedValuesPerKey");
        new l17(to1.a(8)).y = new k17();
    }

    @Override // defpackage.bq6
    public final up6 c(bq6.b bVar, ki kiVar, long j) {
        bq6[] bq6VarArr = this.k;
        int length = bq6VarArr.length;
        up6[] up6VarArr = new up6[length];
        toa[] toaVarArr = this.m;
        int iB = toaVarArr[0].b(bVar.a);
        for (int i = 0; i < length; i++) {
            bq6.b bVarA = bVar.a(toaVarArr[i].l(iB));
            up6VarArr[i] = bq6VarArr[i].c(bVarA, kiVar, j - this.q[iB][i]);
            ((List) this.l.get(i)).add(new b(bVarA, up6VarArr[i]));
        }
        return new ms6(this.o, this.q[iB], up6VarArr);
    }

    @Override // defpackage.bq6
    public final co6 h() {
        bq6[] bq6VarArr = this.k;
        return bq6VarArr.length > 0 ? bq6VarArr[0].h() : s;
    }

    @Override // defpackage.vt1, defpackage.bq6
    public final void j() throws a {
        a aVar = this.r;
        if (aVar != null) {
            throw aVar;
        }
        super.j();
    }

    @Override // defpackage.bq6
    public final void m(co6 co6Var) {
        this.k[0].m(co6Var);
    }

    @Override // defpackage.bq6
    public final void n(up6 up6Var) {
        ms6 ms6Var = (ms6) up6Var;
        int i = 0;
        while (true) {
            bq6[] bq6VarArr = this.k;
            if (i >= bq6VarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            boolean[] zArr = ms6Var.u;
            up6[] up6VarArr = ms6Var.t;
            up6 up6Var2 = zArr[i] ? ((wma) up6VarArr[i]).t : up6VarArr[i];
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((b) list.get(i2)).b.equals(up6Var2)) {
                    list.remove(i2);
                    break;
                }
            }
            bq6VarArr[i].n(ms6Var.u[i] ? ((wma) up6VarArr[i]).t : up6VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.qk0
    public final void r(yua yuaVar) {
        this.j = yuaVar;
        this.i = n6b.p(null);
        int i = 0;
        while (true) {
            bq6[] bq6VarArr = this.k;
            if (i >= bq6VarArr.length) {
                return;
            }
            y(Integer.valueOf(i), bq6VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.vt1, defpackage.qk0
    public final void t() {
        super.t();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList<bq6> arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.vt1
    public final bq6.b u(Integer num, bq6.b bVar) {
        int iIntValue = num.intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((b) list.get(i)).a.equals(bVar)) {
                return ((b) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // defpackage.vt1
    public final void x(Object obj, qk0 qk0Var, toa toaVar) {
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            this.p = toaVar.h();
        } else if (toaVar.h() != this.p) {
            this.r = new a();
            return;
        }
        int length = this.q.length;
        toa[] toaVarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.p, toaVarArr.length);
        }
        ArrayList<bq6> arrayList = this.n;
        arrayList.remove(qk0Var);
        toaVarArr[num.intValue()] = toaVar;
        if (arrayList.isEmpty()) {
            s(toaVarArr[0]);
        }
    }
}
