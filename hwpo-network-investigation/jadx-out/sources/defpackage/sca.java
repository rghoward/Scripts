package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sca extends dca {
    public final String b;
    public final int c;
    public final oh4<ada, g2b> d;

    /* JADX WARN: Multi-variable type inference failed */
    public sca(Object obj, String str, int i, oh4<? super ada, g2b> oh4Var) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = oh4Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return e44.a(sb, this.c, ')');
    }
}
