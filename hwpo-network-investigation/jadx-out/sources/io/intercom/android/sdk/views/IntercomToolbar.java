package io.intercom.android.sdk.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.ColorUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class IntercomToolbar extends Toolbar implements View.OnTouchListener, View.OnClickListener {
    private static final int TITLE_FADE_DURATION_MS = 150;
    private final View activeStateView;
    private final ImageView avatar;
    private final ImageButton backButton;
    private final BackButtonCountDrawable backButtonCountDrawable;
    private final ImageButton close;
    private Listener listener;
    private final TextView subtitle;
    final TextView title;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface Listener {
        void onCloseClicked();

        void onInboxClicked();

        void onToolbarClicked();
    }

    public IntercomToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewInflate = View.inflate(context, R.layout.intercom_toolbar, this);
        viewInflate.setOnTouchListener(this);
        this.title = (TextView) viewInflate.findViewById(R.id.intercom_toolbar_title);
        this.subtitle = (TextView) viewInflate.findViewById(R.id.intercom_toolbar_subtitle);
        ImageButton imageButton = (ImageButton) viewInflate.findViewById(R.id.intercom_toolbar_close);
        this.close = imageButton;
        ImageButton imageButton2 = (ImageButton) viewInflate.findViewById(R.id.intercom_toolbar_inbox);
        this.backButton = imageButton2;
        this.avatar = (ImageView) viewInflate.findViewById(R.id.intercom_toolbar_avatar);
        this.activeStateView = viewInflate.findViewById(R.id.intercom_toolbar_avatar_active_state);
        BackButtonCountDrawable backButtonCountDrawable = new BackButtonCountDrawable(getContext(), null);
        this.backButtonCountDrawable = backButtonCountDrawable;
        imageButton2.setImageDrawable(backButtonCountDrawable);
        imageButton2.setOnClickListener(this);
        imageButton.setOnClickListener(this);
    }

    public void fadeOutTitle(int i) {
        this.title.animate().alpha(0.0f).setDuration(i).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.views.IntercomToolbar.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IntercomToolbar.this.title.setText((CharSequence) null);
            }
        }).start();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.listener == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.intercom_toolbar_close) {
            this.listener.onCloseClicked();
        } else if (id == R.id.intercom_toolbar_inbox) {
            this.listener.onInboxClicked();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.listener != null && motionEvent.getAction() == 1 && view.getId() == R.id.intercom_toolbar) {
            this.listener.onToolbarClicked();
        }
        return false;
    }

    public void setCloseButtonVisibility(int i) {
        this.close.setVisibility(i);
    }

    public void setLeftNavigationIcon(Drawable drawable) {
        this.backButton.setImageDrawable(drawable);
    }

    public void setLeftNavigationItemVisibility(int i) {
        this.backButton.setVisibility(i);
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
        this.subtitle.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.subtitle.setAlpha(1.0f);
    }

    public void setSubtitleVisibility(int i) {
        this.subtitle.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            fadeOutTitle(TITLE_FADE_DURATION_MS);
        } else {
            this.title.setAlpha(1.0f);
            this.title.setText(charSequence);
        }
    }

    public void setUpNoteToolbar(Participant participant, boolean z, ActiveStatePresenter activeStatePresenter, AppConfig appConfig) {
        this.title.setTextColor(getContext().getColor(R.color.intercom_accessibility_black));
        this.subtitle.setTextColor(getContext().getColor(R.color.intercom_accessibility_grey));
        this.close.setColorFilter(getContext().getColor(R.color.intercom_accessibility_grey));
        this.backButton.setVisibility(8);
        this.avatar.setVisibility(0);
        this.activeStateView.setVisibility(0);
        this.title.setTextSize(14.0f);
        this.subtitle.setAlpha(1.0f);
        View viewFindViewById = findViewById(R.id.intercom_toolbar_divider);
        viewFindViewById.setVisibility(0);
        viewFindViewById.setBackgroundColor(-16777216);
        AvatarUtils.loadAvatarIntoView(participant.getAvatar(), this.avatar, appConfig);
        activeStatePresenter.presentStateDot(z, this.activeStateView, appConfig);
    }

    public void setUpPostToolbar(Participant participant, boolean z, ActiveStatePresenter activeStatePresenter, AppConfig appConfig) {
        setBackgroundColor(0);
        this.subtitle.setTextColor(-1);
        this.title.setTextColor(-1);
        this.close.setColorFilter(-1);
        this.backButton.setVisibility(8);
        this.avatar.setVisibility(0);
        this.activeStateView.setVisibility(0);
        this.title.setTextSize(14.0f);
        findViewById(R.id.intercom_toolbar_divider).setVisibility(0);
        AvatarUtils.loadAvatarIntoView(participant.getAvatar(), this.avatar, appConfig);
        activeStatePresenter.presentStateDot(z, this.activeStateView, appConfig);
    }

    public void updateToolbarColors(AppConfig appConfig) {
        boolean zIsSecondaryColorRenderDarkText = appConfig.isSecondaryColorRenderDarkText();
        ColorUtils.setTextColorWhiteOrBlack(this.title, zIsSecondaryColorRenderDarkText);
        ColorUtils.setTextColorWhiteOrBlack(this.subtitle, zIsSecondaryColorRenderDarkText);
        ColorUtils.setImageColorWhiteOrBlack(this.close, zIsSecondaryColorRenderDarkText);
        ColorUtils.setImageColorWhiteOrBlack(this.backButton, zIsSecondaryColorRenderDarkText);
    }

    public IntercomToolbar(Context context) {
        this(context, null);
    }
}
