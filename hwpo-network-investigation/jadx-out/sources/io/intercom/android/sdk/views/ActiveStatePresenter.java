package io.intercom.android.sdk.views;

import android.view.View;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BackgroundUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ActiveStatePresenter {
    private static final String ENGLISH_LOCALE = "en";

    public void presentStateDot(boolean z, View view, AppConfig appConfig) {
        if (ENGLISH_LOCALE.equals(appConfig.getLocale())) {
            BackgroundUtils.setBackground(view, new ActiveStateDrawable(view.getContext().getColor(z ? R.color.intercom_active_state : R.color.intercom_away_state), view.getContext().getColor(R.color.intercom_white), view.getResources().getDisplayMetrics().density * 1.0f));
        } else {
            view.setBackgroundResource(0);
        }
    }
}
