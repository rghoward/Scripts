package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;
import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomWebviewCardInputBinding implements wfb {
    public final AutoCompleteTextView input;
    private final FrameLayout rootView;

    private IntercomWebviewCardInputBinding(FrameLayout frameLayout, AutoCompleteTextView autoCompleteTextView) {
        this.rootView = frameLayout;
        this.input = autoCompleteTextView;
    }

    public static IntercomWebviewCardInputBinding bind(View view) {
        int i = R.id.input;
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) nt3.b(i, view);
        if (autoCompleteTextView != null) {
            return new IntercomWebviewCardInputBinding((FrameLayout) view, autoCompleteTextView);
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomWebviewCardInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_webview_card_input, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IntercomWebviewCardInputBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
