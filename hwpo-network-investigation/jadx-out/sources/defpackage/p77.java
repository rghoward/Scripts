package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.h;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p77 extends FrameLayout implements v77 {
    public boolean t;
    public boolean u;
    public boolean v;

    public final void a() {
        setVisibility((!this.v || (!this.t && this.u)) ? 8 : 0);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        a();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setDividersEnabled(boolean z) {
        this.v = z;
        a();
    }

    @Override // defpackage.v77
    public void setExpanded(boolean z) {
        this.t = z;
        a();
    }

    @Override // defpackage.v77
    public void setOnlyShowWhenExpanded(boolean z) {
        this.u = z;
        a();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
