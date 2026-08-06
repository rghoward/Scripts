package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xr8 implements wr8 {
    public final a0a a;
    public final a0a b;

    public xr8() {
        a0a a0aVarB = b0a.b(hf3.t);
        this.a = a0aVarB;
        this.b = a0aVarB;
    }

    @Override // defpackage.wr8
    public final g2b a(ao0 ao0Var) {
        a0a a0aVar = this.a;
        Iterator it = ((List) a0aVar.getValue()).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((ao0) it.next()).a == ao0Var.a) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return g2b.a;
        }
        ArrayList arrayListU = th1.U((Collection) a0aVar.getValue());
        arrayListU.set(i, ao0Var);
        a0aVar.getClass();
        a0aVar.l(null, arrayListU);
        return g2b.a;
    }

    @Override // defpackage.wr8
    public final g2b b(ArrayList arrayList) {
        a0a a0aVar = this.a;
        a0aVar.getClass();
        a0aVar.l(null, arrayList);
        return g2b.a;
    }

    @Override // defpackage.wr8
    public final Object c(int i) {
        for (Object obj : (Iterable) this.a.getValue()) {
            if (((ao0) obj).a == i) {
                return obj;
            }
        }
        return null;
    }

    @Override // defpackage.wr8
    public final g2b clear() {
        a0a a0aVar = this.a;
        a0aVar.getClass();
        a0aVar.l(null, hf3.t);
        return g2b.a;
    }

    @Override // defpackage.wr8
    public final a0a d() {
        return this.b;
    }
}
