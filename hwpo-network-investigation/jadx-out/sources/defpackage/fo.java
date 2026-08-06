package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fo implements dz3 {
    public final AutofillValue a;

    public fo(AutofillValue autofillValue) {
        this.a = autofillValue;
    }

    @Override // defpackage.dz3
    public final CharSequence a() {
        if (this.a.isText()) {
            return this.a.getTextValue();
        }
        return null;
    }
}
