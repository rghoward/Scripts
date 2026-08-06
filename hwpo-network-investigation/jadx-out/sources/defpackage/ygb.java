package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ygb extends wp5 implements mh4<Object> {
    public final /* synthetic */ zgb<View> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygb(zgb<View> zgbVar) {
        super(0);
        this.u = zgbVar;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.u.T.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
