package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends CursorAdapter {
    public final int t;
    public final int u;
    public final /* synthetic */ AlertController.RecycleListView v;
    public final /* synthetic */ AlertController w;
    public final /* synthetic */ AlertController.b x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AlertController.b bVar, ContextThemeWrapper contextThemeWrapper, Cursor cursor, AlertController.RecycleListView recycleListView, AlertController alertController) {
        super((Context) contextThemeWrapper, cursor, false);
        this.x = bVar;
        this.v = recycleListView;
        this.w = alertController;
        Cursor cursor2 = getCursor();
        this.t = cursor2.getColumnIndexOrThrow(bVar.K);
        this.u = cursor2.getColumnIndexOrThrow(bVar.L);
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.t));
        this.v.setItemChecked(cursor.getPosition(), cursor.getInt(this.u) == 1);
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.x.b.inflate(this.w.L, viewGroup, false);
    }
}
