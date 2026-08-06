package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g8c implements Iterator {
    public int t = 0;
    public final /* synthetic */ i8c u;

    public g8c(i8c i8cVar) {
        this.u = i8cVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t < this.u.t.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        i8c i8cVar = this.u;
        String str = i8cVar.t;
        int i = this.t;
        if (i < str.length()) {
            this.t = i + 1;
            return new i8c(String.valueOf(i8cVar.t.charAt(i)));
        }
        vl.b();
        return null;
    }
}
