package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fq4 implements eq4 {
    public static final a Companion = new a();
    public final es4 a;
    public final q1 b;
    public final q1 c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public fq4(es4 es4Var) {
        es4Var.getClass();
        this.a = es4Var;
        this.b = new q1();
        this.c = new q1();
    }

    @Override // defpackage.eq4
    public final j74 a() {
        return this.b.b;
    }

    @Override // defpackage.eq4
    public final Object b(boolean z, yp8 yp8Var) throws Throwable {
        Object objC = nr1.c.c(z, BuildConfig.FLAVOR, new kq4(0, this.b, p1.class, "getNextPageKey", "getNextPageKey()Ljava/lang/Integer;", 0), new lq4(this, null), new mq4(this, null), new nq4(this, null), yp8Var);
        return objC == v72.t ? objC : g2b.a;
    }

    @Override // defpackage.eq4
    public final j74 c() {
        return this.c.b;
    }

    @Override // defpackage.eq4
    public final Object d(String str, boolean z, up8 up8Var) throws Throwable {
        Object objC = nr1.c.c(z, BuildConfig.FLAVOR, new gq4(0, this.c, p1.class, "getNextPageKey", "getNextPageKey()Ljava/lang/Integer;", 0), new hq4(this, str, null), new iq4(this, null), new jq4(this, null), up8Var);
        return objC == v72.t ? objC : g2b.a;
    }
}
