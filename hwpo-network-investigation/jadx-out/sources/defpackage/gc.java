package defpackage;

import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gc implements oh4<String, g2b> {
    public final /* synthetic */ MaterialButton t;

    public gc(MaterialButton materialButton) {
        this.t = materialButton;
    }

    @Override // defpackage.oh4
    public final g2b invoke(String str) {
        this.t.setText(str);
        return g2b.a;
    }
}
