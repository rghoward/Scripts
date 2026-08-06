package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface kw7 extends Map, zn5, ou1, iu1 {
    jw7.a builder();

    @Override // defpackage.iu1
    default Object o(hf8 hf8Var) {
        return pu1.a(this, hf8Var);
    }

    jw7 x0(hf8 hf8Var, oab oabVar);
}
