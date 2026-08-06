package defpackage;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tc2 {
    public static final void a(CursorAnchorInfo.Builder builder, sk8 sk8Var) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(h40.d(sk8Var)).setHandwritingBounds(h40.d(sk8Var)).build());
    }
}
