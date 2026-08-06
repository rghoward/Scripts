package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l08 {
    public final AutofillManager a;

    public l08(AutofillManager autofillManager) {
        this.a = autofillManager;
    }

    public final void a() {
        this.a.commit();
    }

    public final void b(cm cmVar, int i, AutofillValue autofillValue) {
        this.a.notifyValueChanged(cmVar, i, autofillValue);
    }

    public final void c(cm cmVar, int i, Rect rect) {
        this.a.notifyViewEntered(cmVar, i, rect);
    }

    public final void d(cm cmVar, int i) {
        this.a.notifyViewExited(cmVar, i);
    }

    public final void e(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            hf0.a(view, this.a, i, z);
        }
    }

    public final void f(cm cmVar, int i, Rect rect) {
        this.a.requestAutofill(cmVar, i, rect);
    }
}
