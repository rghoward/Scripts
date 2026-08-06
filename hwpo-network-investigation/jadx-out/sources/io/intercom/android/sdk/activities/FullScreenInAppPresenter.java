package io.intercom.android.sdk.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
class FullScreenInAppPresenter {
    public void closeWindow(final Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        decorView.setAlpha(1.0f);
        decorView.animate().alpha(0.0f).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.activities.FullScreenInAppPresenter.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
        }).start();
    }
}
