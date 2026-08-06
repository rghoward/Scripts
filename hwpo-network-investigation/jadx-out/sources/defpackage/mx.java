package defpackage;

import android.text.SegmentFinder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mx extends SegmentFinder {
    public final /* synthetic */ pob a;

    public mx(pob pobVar) {
        this.a = pobVar;
    }

    public final int nextEndBoundary(int i) {
        return this.a.j0(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.W(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.X(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.i0(i);
    }
}
