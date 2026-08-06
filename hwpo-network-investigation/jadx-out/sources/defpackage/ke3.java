package defpackage;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ke3 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile ke3 b;
    public static Class<?> c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = c;
        return cls != null ? new zw9(cls, charSequence) : super.newEditable(charSequence);
    }
}
