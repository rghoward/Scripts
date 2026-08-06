package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@p87.a("dialog")
public final class a03 extends p87<a> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends c67 implements q54 {
        public final f03 y;
        public final fr1 z;

        public a() {
            throw null;
        }

        public a(a03 a03Var) {
            fr1 fr1Var = tr1.a;
            f03 f03Var = new f03(7);
            super(a03Var);
            this.y = f03Var;
            this.z = fr1Var;
        }
    }

    @Override // defpackage.p87
    public final c67 a() {
        fr1 fr1Var = tr1.a;
        return new a(this);
    }

    @Override // defpackage.p87
    public final void d(List list, k77 k77Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((r47) it.next());
        }
    }

    @Override // defpackage.p87
    public final void e(r47 r47Var, boolean z) {
        b().d(r47Var, z);
        int iC = th1.C((Iterable) b().f.t.getValue(), r47Var);
        int i = 0;
        for (Object obj : (Iterable) b().f.t.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                ws0.m();
                throw null;
            }
            r47 r47Var2 = (r47) obj;
            if (i > iC) {
                b().b(r47Var2);
            }
            i = i2;
        }
    }
}
