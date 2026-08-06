package defpackage;

import android.os.Bundle;
import androidx.fragment.app.f;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qta extends xf4 {
    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int f() {
        return 2;
    }

    @Override // defpackage.xf4
    public final f w(int i) {
        if (i == 0) {
            rbb.Companion.getClass();
            rbb rbbVar = new rbb();
            Bundle bundle = new Bundle();
            bundle.putSerializable("com.fitr_training.tracking.presentation.values_list.ValuesListFragment.VALUE_TYPE", ebb.BENCHMARK);
            rbbVar.setArguments(bundle);
            return rbbVar;
        }
        if (i != 1) {
            z90.a(pk.d(i, "Wrong position (", ") in TrackingTabAdapter"));
            return null;
        }
        rbb.Companion.getClass();
        rbb rbbVar2 = new rbb();
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("com.fitr_training.tracking.presentation.values_list.ValuesListFragment.VALUE_TYPE", ebb.CHALLENGES);
        rbbVar2.setArguments(bundle2);
        return rbbVar2;
    }
}
