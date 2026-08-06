package io.intercom.android.sdk.ui.coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import defpackage.b85;
import defpackage.p75;
import defpackage.ti8;
import defpackage.uq1;
import defpackage.vl4;
import defpackage.yeb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomImageLoaderKt {
    private static volatile b85 imageLoader;
    private static final Object imageLoaderLock = new Object();

    public static final b85 getImageLoader(Context context) {
        context.getClass();
        b85 b85Var = imageLoader;
        if (b85Var != null) {
            return b85Var;
        }
        synchronized (imageLoaderLock) {
            try {
                b85 b85Var2 = imageLoader;
                if (b85Var2 != null) {
                    return b85Var2;
                }
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                b85.a aVar = new b85.a(applicationContext);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                aVar.a();
                uq1.a aVar2 = new uq1.a();
                if (Build.VERSION.SDK_INT >= 28) {
                    aVar2.e.add(new p75.a());
                } else {
                    aVar2.e.add(new vl4.a());
                }
                aVar2.e.add(new yeb.a());
                aVar2.e.add(new PdfDecoder.Factory());
                aVar.c = aVar2.c();
                ti8 ti8VarB = aVar.b();
                imageLoader = ti8VarB;
                return ti8VarB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
