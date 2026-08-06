package defpackage;

import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sqb {
    public static void a(cm cmVar) {
        ViewParent parent = cmVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(cmVar, cmVar);
        }
    }
}
