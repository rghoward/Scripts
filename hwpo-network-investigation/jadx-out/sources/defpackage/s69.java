package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s69 implements nn7 {
    public final int t;
    public final List<s69> u;
    public Float v = null;
    public Float w = null;
    public c69 x = null;
    public c69 y = null;

    public s69(int i, ArrayList arrayList) {
        this.t = i;
        this.u = arrayList;
    }

    @Override // defpackage.nn7
    public final boolean V() {
        return this.u.contains(this);
    }
}
