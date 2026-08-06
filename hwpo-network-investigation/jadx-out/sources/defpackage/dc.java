package defpackage;

import com.hwpo_training_app.core.widget.SearchEditText;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dc implements oh4<String, g2b> {
    public final /* synthetic */ jc t;

    public dc(jc jcVar) {
        this.t = jcVar;
    }

    @Override // defpackage.oh4
    public final g2b invoke(String str) {
        ((SearchEditText) this.t.receiver).setHint(str);
        return g2b.a;
    }
}
