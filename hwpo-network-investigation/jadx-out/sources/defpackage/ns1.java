package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ns1 extends RuntimeException {
    public final le7<Object> t;
    public final t27 u;
    public final uf5 v;
    public final int w;

    public ns1(le7 le7Var, t27 t27Var, uf5 uf5Var, int i, Exception exc) {
        super(exc);
        this.t = le7Var;
        this.u = t27Var;
        this.v = uf5Var;
        this.w = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listH;
        List listT;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.w);
        sb.append(":\n            |");
        zc9 zc9VarB = xs.b(new ms1(this, null));
        if (zc9VarB.hasNext()) {
            Object next = zc9VarB.next();
            if (zc9VarB.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (zc9VarB.hasNext()) {
                    arrayList.add(zc9VarB.next());
                }
                listH = arrayList;
            } else {
                listH = ws0.h(next);
            }
        } else {
            listH = hf3.t;
        }
        int size = listH.size();
        if (50 >= size) {
            listT = th1.T(listH);
        } else {
            ArrayList arrayList2 = new ArrayList(50);
            if (listH instanceof RandomAccess) {
                for (int i = size - 50; i < size; i++) {
                    arrayList2.add(listH.get(i));
                }
            } else {
                ListIterator listIterator = listH.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            listT = arrayList2;
        }
        sb.append(th1.F(listT, "\n", null, null, null, 62));
        sb.append("\n            ");
        return s2a.c(sb.toString());
    }
}
