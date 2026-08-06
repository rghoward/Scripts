package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.hwpo_training_app.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sw8 extends ViewGroup {
    public final int t;
    public final ArrayList u;
    public final ArrayList v;
    public final vw8 w;
    public int x;

    public sw8(Context context) {
        super(context);
        this.t = 5;
        ArrayList arrayList = new ArrayList();
        this.u = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.v = arrayList2;
        this.w = new vw8();
        setClipChildren(false);
        xw8 xw8Var = new xw8(context);
        addView(xw8Var);
        arrayList.add(xw8Var);
        arrayList2.add(xw8Var);
        this.x = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
