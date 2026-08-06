package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z41 extends p9 {
    public final k55 a;

    public z41(k55 k55Var) {
        k55Var.getClass();
        this.a = k55Var;
    }

    @Override // defpackage.o9
    public final Intent createIntent(Context context, Uri uri) {
        Uri uri2 = uri;
        context.getClass();
        uri2.getClass();
        Intent intentAddFlags = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri2).addFlags(1).addFlags(2);
        intentAddFlags.getClass();
        this.a.getClass();
        intentAddFlags.putExtra("android.intent.extra.sizeLimit", 524288000L);
        return intentAddFlags;
    }
}
