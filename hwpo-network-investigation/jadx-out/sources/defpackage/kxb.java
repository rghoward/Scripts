package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kxb implements di7 {
    public final /* synthetic */ t2d t;

    public kxb(y8c y8cVar, t2d t2dVar) {
        this.t = t2dVar;
        Objects.requireNonNull(y8cVar);
    }

    @Override // defpackage.di7
    public final void onSuccess(Object obj) {
        this.t.a.a.s();
    }
}
