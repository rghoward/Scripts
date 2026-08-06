package io.intercom.android.sdk.activities;

import defpackage.dq1;
import io.intercom.android.sdk.views.IntercomToolbar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
class InAppToolbarListener implements IntercomToolbar.Listener {
    private final dq1 activity;

    public InAppToolbarListener(dq1 dq1Var) {
        this.activity = dq1Var;
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onCloseClicked() {
        this.activity.getOnBackPressedDispatcher().c().a();
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onInboxClicked() {
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onToolbarClicked() {
    }
}
