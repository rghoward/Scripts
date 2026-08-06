package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q9 extends o9<String, Uri> {
    @Override // defpackage.o9
    public final Intent createIntent(Context context, String str) {
        String str2 = str;
        context.getClass();
        str2.getClass();
        Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str2);
        type.getClass();
        return type;
    }

    @Override // defpackage.o9
    public final o9.a<Uri> getSynchronousResult(Context context, String str) {
        context.getClass();
        str.getClass();
        return null;
    }

    @Override // defpackage.o9
    public final Uri parseResult(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
