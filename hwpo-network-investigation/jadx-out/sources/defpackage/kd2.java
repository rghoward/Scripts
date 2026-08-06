package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kd2 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Context u;

    public /* synthetic */ kd2(Context context, int i) {
        this.t = i;
        this.u = context;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Context context = this.u;
        switch (i) {
            case 0:
                Resources resources = context.getResources();
                resources.getClass();
                return Integer.valueOf(wk6.b((resources.getDisplayMetrics().densityDpi / 160.0f) * 1.0f));
            default:
                Bitmap.Config[] configArr = v.a;
                File cacheDir = context.getCacheDir();
                if (cacheDir != null) {
                    cacheDir.mkdirs();
                    return cacheDir;
                }
                aa0.c("cacheDir == null");
                return null;
        }
    }
}
