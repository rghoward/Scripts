package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.views.IntercomToolbar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomActivitySheetBinding implements wfb {
    public final IntercomToolbar intercomToolbar;
    private final LinearLayout rootView;
    public final LinearLayout sheetRoot;
    public final FrameLayout sheetView;

    private IntercomActivitySheetBinding(LinearLayout linearLayout, IntercomToolbar intercomToolbar, LinearLayout linearLayout2, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.intercomToolbar = intercomToolbar;
        this.sheetRoot = linearLayout2;
        this.sheetView = frameLayout;
    }

    public static IntercomActivitySheetBinding bind(View view) {
        int i = R.id.intercom_toolbar;
        IntercomToolbar intercomToolbar = (IntercomToolbar) nt3.b(i, view);
        if (intercomToolbar != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i2 = R.id.sheet_view;
            FrameLayout frameLayout = (FrameLayout) nt3.b(i2, view);
            if (frameLayout != null) {
                return new IntercomActivitySheetBinding(linearLayout, intercomToolbar, linearLayout, frameLayout);
            }
            i = i2;
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static IntercomActivitySheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_activity_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IntercomActivitySheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
