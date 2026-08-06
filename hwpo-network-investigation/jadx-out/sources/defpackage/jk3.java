package defpackage;

import android.view.View;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jk3 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ View u;

    public /* synthetic */ jk3(int i, View view) {
        this.t = i;
        this.u = view;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        View view = this.u;
        switch (i) {
            case 0:
                ((MaterialToolbar) view).setTitle((CharSequence) obj);
                break;
            default:
                ((MaterialTextView) view).setText((CharSequence) obj);
                break;
        }
        return g2b.a;
    }
}
