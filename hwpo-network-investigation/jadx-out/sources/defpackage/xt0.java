package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xt0 implements z4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetBehavior b;

    public xt0(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.b = bottomSheetBehavior;
        this.a = i;
    }

    @Override // defpackage.z4
    public final boolean a(View view) {
        this.b.L(this.a);
        return true;
    }
}
