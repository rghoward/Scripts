package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class rza {
    public rza() {
        new ConcurrentHashMap();
    }

    public static rb4 e(rb4[] rb4VarArr, int i) {
        int i2 = (i & 1) == 0 ? CarouselScreenFragment.CAROUSEL_ANIMATION_MS : 700;
        boolean z = (i & 2) != 0;
        rb4 rb4Var = null;
        int i3 = Integer.MAX_VALUE;
        for (rb4 rb4Var2 : rb4VarArr) {
            int iAbs = (Math.abs(rb4Var2.c - i2) * 2) + (rb4Var2.d == z ? 0 : 1);
            if (rb4Var == null || i3 > iAbs) {
                rb4Var = rb4Var2;
                i3 = iAbs;
            }
        }
        return rb4Var;
    }

    public Typeface a(Context context, ib4.b bVar, Resources resources, int i) {
        throw null;
    }

    public Typeface b(Context context, rb4[] rb4VarArr, int i) {
        throw null;
    }

    public Typeface c(Context context, int i, List list) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File fileC = sza.c(context);
        if (fileC == null) {
            return null;
        }
        try {
            if (sza.a(fileC, resources, i)) {
                return Typeface.createFromFile(fileC.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileC.delete();
        }
    }
}
