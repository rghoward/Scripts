package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.ac4;
import defpackage.wfb;
import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomBlocksContainerCardLayoutBinding implements wfb {
    private final LinearLayout rootView;

    private IntercomBlocksContainerCardLayoutBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static IntercomBlocksContainerCardLayoutBinding bind(View view) {
        if (view != null) {
            return new IntercomBlocksContainerCardLayoutBinding((LinearLayout) view);
        }
        ac4.c("rootView");
        return null;
    }

    public static IntercomBlocksContainerCardLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_blocks_container_card_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IntercomBlocksContainerCardLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
