package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iab implements yc9<hab> {
    public final ArrayList a = new ArrayList();

    public final void b(Object obj, String str) {
        this.a.add(new hab(str, obj));
    }

    @Override // defpackage.yc9
    public final Iterator<hab> iterator() {
        return this.a.iterator();
    }
}
