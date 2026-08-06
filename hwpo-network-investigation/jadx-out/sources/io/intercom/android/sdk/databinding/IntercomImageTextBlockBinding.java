package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;
import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomImageTextBlockBinding implements wfb {
    public final FrameLayout imageHolder;
    private final LinearLayout rootView;
    public final TextView text;
    public final TextView title;

    private IntercomImageTextBlockBinding(LinearLayout linearLayout, FrameLayout frameLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.imageHolder = frameLayout;
        this.text = textView;
        this.title = textView2;
    }

    public static IntercomImageTextBlockBinding bind(View view) {
        int i = R.id.image_holder;
        FrameLayout frameLayout = (FrameLayout) nt3.b(i, view);
        if (frameLayout != null) {
            i = R.id.text;
            TextView textView = (TextView) nt3.b(i, view);
            if (textView != null) {
                i = R.id.title;
                TextView textView2 = (TextView) nt3.b(i, view);
                if (textView2 != null) {
                    return new IntercomImageTextBlockBinding((LinearLayout) view, frameLayout, textView, textView2);
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomImageTextBlockBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_image_text_block, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IntercomImageTextBlockBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
