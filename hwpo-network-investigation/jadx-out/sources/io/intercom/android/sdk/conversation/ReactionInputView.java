package io.intercom.android.sdk.conversation;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.intercom.twig.Twig;
import defpackage.k85;
import defpackage.k9a;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.models.Reaction;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ReactionInputView extends LinearLayout {
    private static final float REACTION_SCALE = 2.5f;
    private static final int VIBRATION_DURATION_MS = 10;
    private final ColorFilter deselectedFilter;
    Integer highlightedViewIndex;
    private ReactionListener listener;
    private ReactionReply reactionReply;
    private final List<ImageView> reactionViews;
    int reactionsLoaded;
    private final View.OnTouchListener touchListener;
    private final Twig twig;
    private final Vibrator vibrator;

    public ReactionInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.twig = LumberMill.getLogger();
        this.highlightedViewIndex = null;
        this.reactionsLoaded = 0;
        this.touchListener = new View.OnTouchListener() { // from class: io.intercom.android.sdk.conversation.ReactionInputView.2
            private final Rect touchRect = new Rect();

            private void handleTouchMove(MotionEvent motionEvent) {
                ReactionInputView.this.getHitRect(this.touchRect);
                if (!this.touchRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    ReactionInputView reactionInputView = ReactionInputView.this;
                    if (reactionInputView.highlightedViewIndex != null) {
                        reactionInputView.highlightSelectedReaction();
                    }
                    ReactionInputView.this.highlightedViewIndex = null;
                    return;
                }
                for (int i2 = 0; i2 < ReactionInputView.this.getChildCount(); i2++) {
                    ReactionInputView.this.getChildAt(i2).getHitRect(this.touchRect);
                    if (this.touchRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        Integer num = ReactionInputView.this.highlightedViewIndex;
                        if (num == null || num.intValue() != i2) {
                            ReactionInputView.this.vibrateForSelection();
                            ReactionInputView.this.selectViewAtIndex(ReactionInputView.REACTION_SCALE, i2);
                        }
                        ReactionInputView reactionInputView2 = ReactionInputView.this;
                        Integer num2 = reactionInputView2.highlightedViewIndex;
                        if (num2 == null) {
                            Integer currentSelectedIndex = reactionInputView2.getCurrentSelectedIndex();
                            if (currentSelectedIndex != null && currentSelectedIndex.intValue() != i2) {
                                ReactionInputView.this.deselectViewAtIndex(currentSelectedIndex.intValue());
                            }
                        } else if (num2.intValue() != i2) {
                            ReactionInputView reactionInputView3 = ReactionInputView.this;
                            reactionInputView3.deselectViewAtIndex(reactionInputView3.highlightedViewIndex.intValue());
                        }
                        ReactionInputView.this.highlightedViewIndex = Integer.valueOf(i2);
                    }
                }
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0013  */
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    handleTouchMove(motionEvent);
                } else if (actionMasked == 1) {
                    ReactionInputView.this.handleTouchUp();
                } else if (actionMasked == 2) {
                    handleTouchMove(motionEvent);
                }
                return true;
            }
        };
        this.reactionViews = new ArrayList();
        setVisibility(8);
        if (isInEditMode()) {
            this.vibrator = null;
        } else {
            this.vibrator = (Vibrator) context.getSystemService("vibrator");
        }
        this.deselectedFilter = ColorUtils.newGreyscaleFilter();
    }

    private void resetView() {
        removeAllViews();
        this.reactionViews.clear();
    }

    public void deselectViewAtIndex(int i) {
        ImageView imageView = this.reactionViews.get(i);
        imageView.animate().setInterpolator(new OvershootInterpolator(0.6f)).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
        imageView.setColorFilter(this.deselectedFilter);
    }

    public Integer getCurrentSelectedIndex() {
        for (int i = 0; i < getChildCount(); i++) {
            Integer reactionIndex = this.reactionReply.getReactionIndex();
            Reaction reaction = this.reactionReply.getReactionSet().get(i);
            if (reactionIndex == null || reactionIndex.equals(Integer.valueOf(reaction.getIndex()))) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    public void handleTouchUp() {
        Reaction reaction;
        Integer num = this.highlightedViewIndex;
        if (num != null && num.intValue() >= 0 && this.highlightedViewIndex.intValue() < this.reactionReply.getReactionSet().size() && (reaction = this.reactionReply.getReactionSet().get(this.highlightedViewIndex.intValue())) != null && (this.reactionReply.getReactionIndex() == null || reaction.getIndex() != this.reactionReply.getReactionIndex().intValue())) {
            this.reactionReply.setReactionIndex(reaction.getIndex());
            ReactionListener reactionListener = this.listener;
            if (reactionListener != null) {
                reactionListener.onReactionSelected(reaction);
            }
        }
        highlightSelectedReaction();
        this.highlightedViewIndex = null;
    }

    public void highlightSelectedReaction() {
        for (int i = 0; i < getChildCount(); i++) {
            Integer reactionIndex = this.reactionReply.getReactionIndex();
            Reaction reaction = this.reactionReply.getReactionSet().get(i);
            if (reactionIndex == null || reactionIndex.equals(Integer.valueOf(reaction.getIndex()))) {
                selectViewAtIndex(1.0f, i);
            } else {
                deselectViewAtIndex(i);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnTouchListener(this.touchListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setOnTouchListener(null);
    }

    public void preloadReactionImages(ReactionReply reactionReply) {
        for (Reaction reaction : reactionReply.getReactionSet()) {
            k85.a aVar = new k85.a(getContext());
            aVar.c = reaction.getImageUrl();
            IntercomCoilKt.loadIntercomImage(getContext(), aVar.a());
        }
    }

    public void selectViewAtIndex(float f, int i) {
        ImageView imageView = this.reactionViews.get(i);
        imageView.animate().setInterpolator(new OvershootInterpolator(2.0f)).scaleX(f).scaleY(f).setDuration(200L).start();
        imageView.clearColorFilter();
    }

    public void setUpReactions(ReactionReply reactionReply, boolean z, ReactionListener reactionListener) {
        final Context context = getContext();
        this.reactionReply = reactionReply;
        this.listener = reactionListener;
        resetView();
        List<Reaction> reactionSet = reactionReply.getReactionSet();
        final int size = reactionSet.size();
        int i = 0;
        while (i < reactionSet.size()) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            final ImageView imageView = new ImageView(context);
            int dimensionPixelSize = this.getResources().getDimensionPixelSize(R.dimen.intercom_reaction_size);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
            imageView.setPivotY(this.getResources().getDimensionPixelSize(R.dimen.intercom_reaction_offset));
            imageView.setPivotX(dimensionPixelSize / 2);
            this.reactionViews.add(imageView);
            frameLayout.addView(imageView);
            Reaction reaction = reactionSet.get(i);
            k85.a aVar = new k85.a(context);
            ReactionInputView reactionInputView = this;
            final boolean z2 = z;
            aVar.d = new k9a() { // from class: io.intercom.android.sdk.conversation.ReactionInputView.1
                @Override // defpackage.k9a
                public void onSuccess(Drawable drawable) {
                    imageView.setImageDrawable(drawable);
                    ReactionInputView reactionInputView2 = ReactionInputView.this;
                    int i2 = reactionInputView2.reactionsLoaded + 1;
                    reactionInputView2.reactionsLoaded = i2;
                    if (i2 == size) {
                        if (!z2) {
                            reactionInputView2.setVisibility(0);
                            return;
                        }
                        reactionInputView2.setVisibility(0);
                        ReactionInputView reactionInputView3 = ReactionInputView.this;
                        reactionInputView3.setY(ScreenUtils.dpToPx(60.0f, context) + reactionInputView3.getHeight());
                        ReactionInputView.this.animate().setInterpolator(new OvershootInterpolator(0.6f)).translationY(0.0f).setDuration(300L).start();
                    }
                }

                @Override // defpackage.k9a
                public void onError(Drawable drawable) {
                }

                @Override // defpackage.k9a
                public void onStart(Drawable drawable) {
                }
            };
            aVar.d();
            aVar.c = reaction.getImageUrl();
            IntercomCoilKt.loadIntercomImage(context, aVar.a());
            Integer reactionIndex = reactionReply.getReactionIndex();
            if (reactionIndex != null && !reactionIndex.equals(Integer.valueOf(reaction.getIndex()))) {
                reactionInputView.deselectViewAtIndex(i);
            }
            reactionInputView.addView(frameLayout);
            i++;
            this = reactionInputView;
            z = z2;
        }
    }

    public void vibrateForSelection() {
        if (DeviceUtils.hasPermission(getContext(), "android.permission.VIBRATE")) {
            this.vibrator.vibrate(10L);
        }
    }

    public ReactionInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReactionInputView(Context context) {
        this(context, null, 0);
    }
}
