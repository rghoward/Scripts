package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zk8 implements yk8 {
    public final String a;
    public final ieb b = new ieb(null);
    public final j15 c = new j15(null);
    public final ieb d = new ieb(null);
    public final j15 e = new j15(null);

    public zk8(String str) {
        this.a = str;
    }

    @Override // defpackage.yk8
    public final j15 a() {
        return this.e;
    }

    @Override // defpackage.yk8
    public final ieb b() {
        return this.b;
    }

    @Override // defpackage.yk8
    public final j15 c() {
        return this.c;
    }

    @Override // defpackage.yk8
    public final ieb d() {
        return this.d;
    }

    public final String toString() {
        return eca.a(')', "RectRulers(", this.a);
    }
}
