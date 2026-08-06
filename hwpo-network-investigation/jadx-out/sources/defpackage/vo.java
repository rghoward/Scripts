package defpackage;

import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vo {
    public static int[] a(nia niaVar, RectF rectF, int i, final pp ppVar) {
        return niaVar.f.getRangeForRect(rectF, i == 1 ? new mx(new pob(niaVar.f.getText(), niaVar.j())) : new GraphemeClusterSegmentFinder(niaVar.f.getText(), niaVar.a), new Layout.TextInclusionStrategy() { // from class: uo
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) ppVar.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }
}
