package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController t;
    public final /* synthetic */ AlertController.b u;

    public c(AlertController.b bVar, AlertController alertController) {
        this.u = bVar;
        this.t = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        AlertController.b bVar = this.u;
        DialogInterface.OnClickListener onClickListener = bVar.w;
        AlertController alertController = this.t;
        onClickListener.onClick(alertController.b, i);
        if (bVar.G) {
            return;
        }
        alertController.b.dismiss();
    }
}
