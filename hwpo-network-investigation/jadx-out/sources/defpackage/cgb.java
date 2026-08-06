package defpackage;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cgb extends egb.b<CharSequence> {
    @Override // egb.b
    public final CharSequence a(View view) {
        return egb.j.b(view);
    }

    @Override // egb.b
    public final void b(View view, CharSequence charSequence) {
        egb.j.c(view, charSequence);
    }

    @Override // egb.b
    public final boolean d(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
