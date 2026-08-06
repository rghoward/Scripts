package defpackage;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xz1 implements e3c {
    public static final void c(ggb.a aVar, EditText editText) {
        Object systemService = aVar.getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).showSoftInput(editText, 1);
    }

    @Override // defpackage.e3c
    public boolean a(Class cls) {
        return false;
    }

    @Override // defpackage.e3c
    public z2c b(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }
}
