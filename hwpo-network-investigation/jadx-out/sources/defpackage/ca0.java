package defpackage;

import android.view.View;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ca0 implements gb6.a, pg7 {
    public static /* synthetic */ void a(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void c(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    @Override // defpackage.pg7
    public umb b(View view, umb umbVar) {
        return IntercomCarouselActivity.lambda$setInsets$0(view, umbVar);
    }

    @Override // gb6.a
    public void invoke(Object obj) {
        ((m80.e) obj).a();
    }
}
