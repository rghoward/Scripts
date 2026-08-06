package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@p87.a("composable")
public final class js1 extends p87<a> {
    public final dt7 c = bl7.i(Boolean.FALSE);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends c67 {
        public oh4<ru<r47>, jo3> A;
        public oh4<ru<r47>, th3> B;
        public oh4<ru<r47>, jo3> C;
        public final fi4<nu, r47, jt1, Integer, g2b> y;
        public oh4<ru<r47>, th3> z;

        public a(js1 js1Var, fr1 fr1Var) {
            super(js1Var);
            this.y = fr1Var;
        }
    }

    @Override // defpackage.p87
    public final c67 a() {
        return new a(this, kr1.a);
    }

    @Override // defpackage.p87
    public final void d(List list, k77 k77Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r47 r47Var = (r47) it.next();
            s87 s87VarB = b();
            li8 li8Var = s87VarB.e;
            r47Var.getClass();
            a0a a0aVar = s87VarB.c;
            Iterable iterable = (Iterable) a0aVar.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((r47) it2.next()) == r47Var) {
                            Iterable iterable2 = (Iterable) li8Var.t.getValue();
                            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                Iterator it3 = iterable2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((r47) it3.next()) == r47Var) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            r47 r47Var2 = (r47) th1.H((List) li8Var.t.getValue());
            if (r47Var2 != null) {
                a0aVar.l(null, wx7.c((Set) a0aVar.getValue(), r47Var2));
            }
            a0aVar.l(null, wx7.c((Set) a0aVar.getValue(), r47Var));
            s87VarB.f(r47Var);
        }
        this.c.setValue(Boolean.FALSE);
    }

    @Override // defpackage.p87
    public final void e(r47 r47Var, boolean z) {
        b().d(r47Var, z);
        this.c.setValue(Boolean.TRUE);
    }
}
