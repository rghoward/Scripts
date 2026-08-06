package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l8d extends d9d {
    @Override // defpackage.d9d
    public final void a(Iterator it, y9d y9dVar) {
        if (it.hasNext()) {
            Object next = it.next();
            boolean zHasNext = it.hasNext();
            String str = this.a;
            if (!zHasNext) {
                y9dVar.a(next, str);
                return;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            sb.append(']');
            y9dVar.a(sb.toString(), str);
        }
    }
}
