package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class py9 implements Iterable<String> {
    public final /* synthetic */ String t;
    public final /* synthetic */ oy9 u;

    public py9(oy9 oy9Var, String str) {
        this.t = str;
        this.u = oy9Var;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        String str = this.t;
        oy9 oy9Var = this.u;
        return oy9Var.c.a(oy9Var, str);
    }

    public final String toString() {
        pl5 pl5Var = new pl5(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        pl5Var.a(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
