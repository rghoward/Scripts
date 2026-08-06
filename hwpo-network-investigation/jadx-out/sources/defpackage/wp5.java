package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wp5<R> implements ni4<R>, Serializable {
    public final int t;

    public wp5(int i) {
        this.t = i;
    }

    @Override // defpackage.ni4
    public final int getArity() {
        return this.t;
    }

    public final String toString() {
        ll8.a.getClass();
        return ml8.a(this);
    }
}
