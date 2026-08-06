package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y77 extends FrameLayout implements v77 {
    public final TextView t;
    public boolean u;
    public boolean v;
    public h w;
    public ColorStateList x;

    public y77(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.t = (TextView) findViewById(R.id.navigation_menu_subheader_label);
    }

    public final void a() {
        h hVar = this.w;
        if (hVar != null) {
            setVisibility((!hVar.isVisible() || (!this.u && this.v)) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        this.w = hVar;
        hVar.setCheckable(false);
        this.t.setText(hVar.e);
        a();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.w;
    }

    @Override // defpackage.v77
    public void setExpanded(boolean z) {
        this.u = z;
        a();
    }

    @Override // defpackage.v77
    public void setOnlyShowWhenExpanded(boolean z) {
        this.v = z;
        a();
    }

    public void setTextAppearance(int i) {
        TextView textView = this.t;
        textView.setTextAppearance(i);
        ColorStateList colorStateList = this.x;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.x = colorStateList;
        if (colorStateList != null) {
            this.t.setTextColor(colorStateList);
        }
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
