package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hx3 {
    public final boolean a;
    public final boolean b;
    public final du7 c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Map<wn5<?>, Object> h;

    public hx3(boolean z, boolean z2, du7 du7Var, Long l, Long l2, Long l3, Long l4, Map<wn5<?>, ? extends Object> map) {
        map.getClass();
        this.a = z;
        this.b = z2;
        this.c = du7Var;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.h = qi6.l(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        Long l = this.d;
        if (l != null) {
            arrayList.add("byteCount=" + l.longValue());
        }
        Long l2 = this.e;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2.longValue());
        }
        Long l3 = this.f;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3.longValue());
        }
        Long l4 = this.g;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4.longValue());
        }
        Map<wn5<?>, Object> map = this.h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return th1.F(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ hx3(boolean z, boolean z2, du7 du7Var, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, du7Var, l, l2, l3, l4, if3.t);
    }
}
