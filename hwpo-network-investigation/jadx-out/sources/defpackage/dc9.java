package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dc9 extends wp5 implements oh4<List<Float>, Boolean> {
    public final /* synthetic */ d32 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc9(d32 d32Var) {
        super(1);
        this.u = d32Var;
    }

    @Override // defpackage.oh4
    public final Boolean invoke(List<Float> list) {
        list.add((Float) this.u.invoke());
        return true;
    }
}
