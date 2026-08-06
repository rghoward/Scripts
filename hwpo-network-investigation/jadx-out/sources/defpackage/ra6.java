package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ra6 implements wfb {
    public final MaterialCardView a;
    public final MaterialTextView b;
    public final ImageButton c;
    public final ImageView d;
    public final MaterialTextView e;
    public final MaterialTextView f;
    public final ImageView g;
    public final MaterialTextView h;

    public ra6(MaterialCardView materialCardView, MaterialTextView materialTextView, ImageButton imageButton, ImageView imageView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, ImageView imageView2, MaterialTextView materialTextView4) {
        this.a = materialCardView;
        this.b = materialTextView;
        this.c = imageButton;
        this.d = imageView;
        this.e = materialTextView2;
        this.f = materialTextView3;
        this.g = imageView2;
        this.h = materialTextView4;
    }

    public static ra6 bind(View view) {
        int i = R.id.attachmentsCount;
        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.attachmentsCount, view);
        if (materialTextView != null) {
            i = R.id.moreButton;
            ImageButton imageButton = (ImageButton) nt3.b(R.id.moreButton, view);
            if (imageButton != null) {
                i = R.id.noteIcon;
                ImageView imageView = (ImageView) nt3.b(R.id.noteIcon, view);
                if (imageView != null) {
                    i = R.id.valueDate;
                    MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.valueDate, view);
                    if (materialTextView2 != null) {
                        i = R.id.valuePercentage;
                        MaterialTextView materialTextView3 = (MaterialTextView) nt3.b(R.id.valuePercentage, view);
                        if (materialTextView3 != null) {
                            i = R.id.valuePercentageBg;
                            ImageView imageView2 = (ImageView) nt3.b(R.id.valuePercentageBg, view);
                            if (imageView2 != null) {
                                i = R.id.valueText;
                                MaterialTextView materialTextView4 = (MaterialTextView) nt3.b(R.id.valueText, view);
                                if (materialTextView4 != null) {
                                    return new ra6((MaterialCardView) view, materialTextView, imageButton, imageView, materialTextView2, materialTextView3, imageView2, materialTextView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ra6 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_value_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ra6 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
