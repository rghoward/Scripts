package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xh9 extends gm3<List<? extends h08>> {
    public final ArrayList b;

    public xh9(ArrayList arrayList) {
        super(arrayList);
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xh9) && this.b.equals(((xh9) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ml.a("ShowOptionDialog(options=", this.b, ")");
    }
}
