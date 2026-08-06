package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.e;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dk1 extends GridLayoutManager.c {
    public final /* synthetic */ um6 d;
    public final /* synthetic */ int e;

    public dk1(um6 um6Var, int i) {
        this.d = um6Var;
        this.e = i;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int d(int i) {
        e<T> eVar = this.d.e;
        if ((eVar.f.get(i) instanceof w60.a) || eVar.f.size() == 1) {
            return this.e;
        }
        return 1;
    }
}
