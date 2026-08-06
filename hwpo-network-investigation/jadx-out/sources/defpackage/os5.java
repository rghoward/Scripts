package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class os5 implements wfb {
    public final FrameLayout a;
    public final ImageView b;
    public final AppCompatEditText c;

    public os5(FrameLayout frameLayout, ImageView imageView, AppCompatEditText appCompatEditText) {
        this.a = frameLayout;
        this.b = imageView;
        this.c = appCompatEditText;
    }

    public static os5 bind(View view) {
        int i = R.id.btnClearText;
        ImageView imageView = (ImageView) nt3.b(R.id.btnClearText, view);
        if (imageView != null) {
            i = R.id.searchFieldEditText;
            AppCompatEditText appCompatEditText = (AppCompatEditText) nt3.b(R.id.searchFieldEditText, view);
            if (appCompatEditText != null) {
                return new os5((FrameLayout) view, imageView, appCompatEditText);
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static os5 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_search_edit_text, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static os5 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
