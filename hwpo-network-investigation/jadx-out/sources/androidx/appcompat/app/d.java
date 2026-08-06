package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController.RecycleListView t;
    public final /* synthetic */ AlertController u;
    public final /* synthetic */ AlertController.b v;

    public d(AlertController.b bVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.v = bVar;
        this.t = recycleListView;
        this.u = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        AlertController.b bVar = this.v;
        boolean[] zArr = bVar.E;
        AlertController.RecycleListView recycleListView = this.t;
        if (zArr != null) {
            zArr[i] = recycleListView.isItemChecked(i);
        }
        bVar.I.onClick(this.u.b, i, recycleListView.isItemChecked(i));
    }
}
