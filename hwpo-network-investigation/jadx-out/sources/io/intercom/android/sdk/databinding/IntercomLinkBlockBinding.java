package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;
import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomLinkBlockBinding implements wfb {
    public final TextView author;
    public final ImageView avatar;
    public final TextView description;
    private final LinearLayout rootView;
    public final TextView title;

    private IntercomLinkBlockBinding(LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.author = textView;
        this.avatar = imageView;
        this.description = textView2;
        this.title = textView3;
    }

    public static IntercomLinkBlockBinding bind(View view) {
        int i = R.id.author;
        TextView textView = (TextView) nt3.b(i, view);
        if (textView != null) {
            i = R.id.avatar;
            ImageView imageView = (ImageView) nt3.b(i, view);
            if (imageView != null) {
                i = R.id.description;
                TextView textView2 = (TextView) nt3.b(i, view);
                if (textView2 != null) {
                    i = R.id.title;
                    TextView textView3 = (TextView) nt3.b(i, view);
                    if (textView3 != null) {
                        return new IntercomLinkBlockBinding((LinearLayout) view, textView, imageView, textView2, textView3);
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomLinkBlockBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_link_block, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IntercomLinkBlockBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
