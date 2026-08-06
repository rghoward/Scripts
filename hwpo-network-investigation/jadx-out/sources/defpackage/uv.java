package defpackage;

import defpackage.fw;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uv<T, V extends fw> {
    public final yv<T, V> a;
    public final mv b;

    public uv(yv<T, V> yvVar, mv mvVar) {
        this.a = yvVar;
        this.b = mvVar;
    }

    public final String toString() {
        return "AnimationResult(endReason=" + this.b + ", endState=" + this.a + ')';
    }
}
