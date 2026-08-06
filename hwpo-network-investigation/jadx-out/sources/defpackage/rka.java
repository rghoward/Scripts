package defpackage;

import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class rka implements oh4<String, g2b> {
    public final /* synthetic */ MaterialToolbar t;

    public rka(MaterialToolbar materialToolbar) {
        this.t = materialToolbar;
    }

    @Override // defpackage.oh4
    public final g2b invoke(String str) {
        this.t.setSubtitle(str);
        return g2b.a;
    }
}
