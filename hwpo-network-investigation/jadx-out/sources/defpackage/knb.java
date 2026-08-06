package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class knb implements jnb {
    public final String b;
    public final zk8 c;
    public final zk8 d;

    public knb(String str) {
        this.b = str;
        this.c = new zk8(str);
        this.d = new zk8(str.concat(" maximum"));
    }

    @Override // defpackage.jnb
    public final yk8 a() {
        return this.c;
    }

    @Override // defpackage.jnb
    public final yk8 b() {
        return this.d;
    }

    public final String toString() {
        return this.b;
    }
}
