package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class p9 extends o9<Uri, Boolean> {
    @Override // defpackage.o9
    public final o9.a<Boolean> getSynchronousResult(Context context, Uri uri) {
        context.getClass();
        uri.getClass();
        return null;
    }

    @Override // defpackage.o9
    public final Boolean parseResult(int i, Intent intent) {
        return Boolean.valueOf(i == -1);
    }
}
