package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vh9 extends gm3<g2b> {
    public final int b;

    public vh9() {
        super(g2b.a);
        this.b = R.anim.sessions_list_slide_layout_animator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vh9) && this.b == ((vh9) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return pk.d(this.b, "PlayListAnimation(anim=", ")");
    }
}
