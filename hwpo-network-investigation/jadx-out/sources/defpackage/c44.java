package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c44<T> {
    public int a;
    public int b;
    public final h30<cva<T>> c = new h30<>();
    public final l27 d = new l27();
    public vb6 e;
    public boolean f;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void a(oo7<T> oo7Var) {
        oo7Var.getClass();
        this.f = true;
        boolean z = oo7Var instanceof oo7.b;
        h30<cva<T>> h30Var = this.c;
        l27 l27Var = this.d;
        if (!z) {
            if (oo7Var instanceof oo7.a) {
                l27Var.c(null, ub6.c.c);
                throw null;
            }
            if (oo7Var instanceof oo7.c) {
                oo7.c cVar = (oo7.c) oo7Var;
                l27Var.b(cVar.a);
                this.e = cVar.b;
                return;
            } else {
                if (!(oo7Var instanceof oo7.d)) {
                    u.b();
                    return;
                }
                h30Var.clear();
                this.b = 0;
                this.a = 0;
                h30Var.addLast(new cva<>(0, ((oo7.d) oo7Var).a));
                return;
            }
        }
        oo7.b bVar = (oo7.b) oo7Var;
        vb6 vb6Var = bVar.e;
        int i = bVar.c;
        int i2 = bVar.d;
        List<cva<T>> list = bVar.b;
        l27Var.b(vb6Var);
        this.e = bVar.f;
        int iOrdinal = bVar.a.ordinal();
        if (iOrdinal == 0) {
            h30Var.clear();
            this.b = i2;
            this.a = i;
            h30Var.addAll(list);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                u.b();
                return;
            } else {
                this.b = i2;
                h30Var.addAll(list);
                return;
            }
        }
        this.a = i;
        int size = list.size() - 1;
        eg5 eg5Var = new eg5(size, ie3.a(size, 0, -1), -1);
        while (eg5Var.v) {
            h30Var.addFirst(list.get(eg5Var.nextInt()));
        }
    }

    public final List<oo7<T>> b() {
        if (!this.f) {
            return hf3.t;
        }
        ArrayList arrayList = new ArrayList();
        vb6 vb6VarD = this.d.d();
        h30<cva<T>> h30Var = this.c;
        if (h30Var.isEmpty()) {
            arrayList.add(new oo7.c(vb6VarD, this.e));
            return arrayList;
        }
        oo7.b<Object> bVar = oo7.b.g;
        arrayList.add(oo7.b.a.a(th1.T(h30Var), this.a, this.b, vb6VarD, this.e));
        return arrayList;
    }
}
