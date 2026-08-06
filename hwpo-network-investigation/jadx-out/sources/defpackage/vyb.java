package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vyb implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iA = fzb.a(obj);
        int iA2 = fzb.a(obj2);
        if (iA != iA2) {
            if (iA == 0 || iA2 == 0) {
                throw null;
            }
            return iA - iA2;
        }
        int iA3 = uu3.a(iA);
        if (iA3 == 0) {
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        if (iA3 == 1) {
            return ((String) obj).compareTo((String) obj2);
        }
        if (iA3 == 2) {
            return ((Long) obj).compareTo((Long) obj2);
        }
        if (iA3 == 3) {
            return ((Double) obj).compareTo((Double) obj2);
        }
        throw null;
    }
}
