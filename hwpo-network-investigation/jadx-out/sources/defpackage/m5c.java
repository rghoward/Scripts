package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m5c implements l5c {

    @Deprecated
    public static final exc a;

    @Deprecated
    public static final exc b;

    @Deprecated
    public static final exc c;

    static {
        ozc ozcVar = t4c.c.a;
        a = new exc("45761323", ozcVar, BuildConfig.FLAVOR);
        b = new exc("45762029", ozcVar, BuildConfig.FLAVOR);
        c = new exc("45762030", ozcVar, BuildConfig.FLAVOR);
    }

    @Override // defpackage.l5c
    public final String a() {
        return (String) a.get();
    }

    @Override // defpackage.l5c
    public final String b() {
        return (String) b.get();
    }

    @Override // defpackage.l5c
    public final String c() {
        return (String) c.get();
    }
}
