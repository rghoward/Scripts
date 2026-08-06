package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xt8 implements hi6<Integer, Uri> {
    @Override // defpackage.hi6
    public final Uri a(Integer num, zk7 zk7Var) {
        int iIntValue = num.intValue();
        Context context = zk7Var.a;
        try {
            if (context.getResources().getResourceEntryName(iIntValue) == null) {
                return null;
            }
            return Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
