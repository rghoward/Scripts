package defpackage;

import io.intercom.android.sdk.utilities.coil.RoundedCornersAnimatedTransformation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ys7 implements Iterable<js7<? extends String, ? extends b>>, zn5 {
    public static final ys7 u = new ys7(if3.t);
    public final Map<String, b> t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final RoundedCornersAnimatedTransformation a;
        public final String b;

        public b(RoundedCornersAnimatedTransformation roundedCornersAnimatedTransformation, String str) {
            this.a = roundedCornersAnimatedTransformation;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && xj5.a(this.b, bVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Entry(value=");
            sb.append(this.a);
            sb.append(", memoryCacheKey=");
            return wu0.a(sb, this.b, ')');
        }
    }

    public ys7(Map<String, b> map) {
        this.t = map;
    }

    public final <T> T d(String str) {
        b bVar = this.t.get(str);
        if (bVar != null) {
            return (T) bVar.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ys7) {
            return xj5.a(this.t, ((ys7) obj).t);
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<js7<? extends String, ? extends b>> iterator() {
        Map<String, b> map = this.t;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, b> entry : map.entrySet()) {
            arrayList.add(new js7(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.t + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final LinkedHashMap a;

        public a(ys7 ys7Var) {
            this.a = qi6.m(ys7Var.t);
        }

        public a() {
            this.a = new LinkedHashMap();
        }
    }
}
