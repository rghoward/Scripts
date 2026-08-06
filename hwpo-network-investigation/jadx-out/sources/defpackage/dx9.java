package defpackage;

import androidx.media3.ui.d;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dx9 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        d.b bVar = (d.b) obj;
        d.b bVar2 = (d.b) obj2;
        int iCompare = Integer.compare(bVar2.b, bVar.b);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = bVar.c.compareTo(bVar2.c);
        return iCompareTo != 0 ? iCompareTo : bVar.d.compareTo(bVar2.d);
    }
}
