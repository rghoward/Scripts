package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cj6 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ dj6 t;

    public cj6(dj6 dj6Var) {
        this.t = dj6Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object item;
        dj6 dj6Var = this.t;
        va6 va6Var = dj6Var.x;
        if (i < 0) {
            item = !va6Var.S.isShowing() ? null : va6Var.v.getSelectedItem();
        } else {
            item = dj6Var.getAdapter().getItem(i);
        }
        dj6Var.setText(dj6Var.convertSelectionToString(item), false);
        AdapterView.OnItemClickListener onItemClickListener = dj6Var.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                view = !va6Var.S.isShowing() ? null : va6Var.v.getSelectedView();
                i = !va6Var.S.isShowing() ? -1 : va6Var.v.getSelectedItemPosition();
                j = !va6Var.S.isShowing() ? Long.MIN_VALUE : va6Var.v.getSelectedItemId();
            }
            onItemClickListener.onItemClick(va6Var.v, view, i, j);
        }
        va6Var.dismiss();
    }
}
