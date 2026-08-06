package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n89 {
    public final e70 a;
    public final uc8 b;
    public final ad8 c;

    public n89(e70 e70Var, uc8 uc8Var, ad8 ad8Var) {
        e70Var.getClass();
        uc8Var.getClass();
        ad8Var.getClass();
        this.a = e70Var;
        this.b = uc8Var;
        this.c = ad8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final gd8 a(hd8 hd8Var) {
        int i = hd8Var.a;
        String str = hd8Var.b;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        o89 o89Var = hd8Var.c;
        int i2 = hd8Var.d;
        String strC = rhb.c(hd8Var.e);
        if (strC == null) {
            strC = BuildConfig.FLAVOR;
        }
        boolean z = hd8Var.f;
        boolean z2 = !hd8Var.h;
        List<m89> list = hd8Var.j;
        this.a.getClass();
        ArrayList arrayListB = e70.b(list);
        List<ao0> list2 = hd8Var.k;
        ArrayList arrayList = new ArrayList(ph1.n(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(uo0.c((ao0) it.next()));
        }
        vc8 vc8Var = hd8Var.l;
        int i3 = 0;
        tc8 tc8VarA = vc8Var != null ? this.b.a(vc8Var) : new tc8(i3, 15, (String) null, (ArrayList) (0 == true ? 1 : 0));
        bd8 bd8Var = hd8Var.m;
        return new gd8(i, str, o89Var, i2, strC, z, z2, arrayListB, arrayList, tc8VarA, bd8Var != null ? this.c.a(bd8Var) : new zc8(i3));
    }
}
