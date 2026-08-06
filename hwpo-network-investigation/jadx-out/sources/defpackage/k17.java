package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k17<V> implements l5a<List<V>>, Serializable {
    public final int t;

    public k17() {
        zg1.b(2, "expectedValuesPerKey");
        this.t = 2;
    }

    @Override // defpackage.l5a
    public final Object get() {
        return new ArrayList(this.t);
    }
}
