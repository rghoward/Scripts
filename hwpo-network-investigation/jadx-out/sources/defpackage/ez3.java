package defpackage;

import android.os.Build;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ez3 {
    public static final fo a(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new fo(AutofillValue.forText(charSequence));
        }
        return null;
    }
}
