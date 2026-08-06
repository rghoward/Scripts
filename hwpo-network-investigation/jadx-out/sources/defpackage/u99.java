package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u99 {
    public final int a;
    public final int b;
    public final int c;
    public final ria d;

    public u99(int i, int i2, int i3, ria riaVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = riaVar;
    }

    public final ba9.a a(int i) {
        return new ba9.a(b47.c(this.d, i), i, 1L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
        int i = this.a;
        sb.append(i);
        sb.append('-');
        ria riaVar = this.d;
        sb.append(b47.c(riaVar, i));
        sb.append(',');
        int i2 = this.b;
        sb.append(i2);
        sb.append('-');
        sb.append(b47.c(riaVar, i2));
        sb.append("), prevOffset=");
        return e44.a(sb, this.c, ')');
    }
}
