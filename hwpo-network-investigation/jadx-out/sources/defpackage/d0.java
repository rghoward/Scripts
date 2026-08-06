package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0<I extends T, T, VH extends RecyclerView.e0> extends xa<List<T>> {
    @Override // defpackage.xa
    public final boolean a(int i, Object obj) {
        List<? extends T> list = (List) obj;
        return ((e93) this).b.invoke((T) list.get(i), list, Integer.valueOf(i)).booleanValue();
    }

    @Override // defpackage.xa
    public final void b(Object obj, int i, RecyclerView.e0 e0Var, List list) {
        Object obj2 = ((List) obj).get(i);
        ya yaVar = (ya) e0Var;
        yaVar.getClass();
        list.getClass();
        if (obj2 == null) {
            ac4.c("null cannot be cast to non-null type kotlin.Any");
            return;
        }
        yaVar.v = obj2;
        oh4<? super List<? extends Object>, g2b> oh4Var = yaVar.x;
        if (oh4Var == null) {
            return;
        }
        oh4Var.invoke(list);
    }
}
