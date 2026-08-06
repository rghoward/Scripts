package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jic extends fgc {
    public final nkc b;
    public final t9a c;
    public final /* synthetic */ mkc d;

    public jic(mkc mkcVar, t9a t9aVar) {
        nkc nkcVar = new nkc("OnRequestInstallCallback");
        this.d = mkcVar;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.b = nkcVar;
        this.c = t9aVar;
    }
}
