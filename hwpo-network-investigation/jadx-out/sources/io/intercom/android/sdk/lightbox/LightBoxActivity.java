package io.intercom.android.sdk.lightbox;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Transition;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.intercom.twig.BuildConfig;
import defpackage.anb;
import defpackage.bnb;
import defpackage.dnb;
import defpackage.ia3;
import defpackage.k85;
import defpackage.uy;
import defpackage.vg7;
import defpackage.x10;
import defpackage.yv9;
import defpackage.zmb;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.utilities.IntercomCoilKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class LightBoxActivity extends uy implements LightBoxListener {
    private static final int ANIMATION_TIME_MS = 300;
    private static final String EXTRA_ACTIVITY_FULLSCREEN = "extra_activity_fullscreen";
    private static final String EXTRA_IMAGE_URL = "extra_image_url";
    public static final String TRANSITION_KEY = "lightbox_image";
    private String imageUrl = BuildConfig.FLAVOR;
    ViewGroup rootView;

    private void fadeIn() {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(getColor(R.color.intercom_full_transparent_full_black)), Integer.valueOf(getColor(R.color.intercom_transparent_black_lightbox)));
        valueAnimatorOfObject.setDuration(300L);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.lightbox.LightBoxActivity.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LightBoxActivity.this.rootView.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        valueAnimatorOfObject.start();
    }

    private void fadeOut() {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(getColor(R.color.intercom_transparent_black_lightbox)), Integer.valueOf(getColor(R.color.intercom_full_transparent_full_black)));
        valueAnimatorOfObject.setDuration(300L);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.lightbox.LightBoxActivity.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LightBoxActivity.this.rootView.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        valueAnimatorOfObject.start();
    }

    public static Intent imageIntent(Context context, String str, boolean z) {
        return new Intent(context, (Class<?>) LightBoxActivity.class).putExtra(EXTRA_IMAGE_URL, str).putExtra(EXTRA_ACTIVITY_FULLSCREEN, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadImage(ImageView imageView) {
        k85.a aVar = new k85.a(imageView.getContext());
        aVar.c = this.imageUrl;
        aVar.b();
        aVar.c(R.drawable.intercom_image_load_failed);
        aVar.f(imageView);
        IntercomCoilKt.loadIntercomImage(imageView.getContext(), aVar.a());
    }

    private void reloadAfterTransition(final LightBoxImageView lightBoxImageView) {
        getWindow().getSharedElementEnterTransition().addListener(new Transition.TransitionListener() { // from class: io.intercom.android.sdk.lightbox.LightBoxActivity.2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                new Handler().postDelayed(new Runnable() { // from class: io.intercom.android.sdk.lightbox.LightBoxActivity.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        LightBoxActivity.this.loadImage(lightBoxImageView);
                    }
                }, 10L);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }
        });
    }

    @Override // io.intercom.android.sdk.lightbox.LightBoxListener
    public void closeLightBox() {
        fadeOut();
        supportFinishAfterTransition();
    }

    @Override // androidx.fragment.app.g, defpackage.dq1, defpackage.hq1, android.app.Activity
    public void onCreate(Bundle bundle) {
        x10 anbVar;
        Bundle extras = getIntent().getExtras();
        boolean z = false;
        if (extras != null) {
            this.imageUrl = extras.getString(EXTRA_IMAGE_URL, BuildConfig.FLAVOR);
            z = extras.getBoolean(EXTRA_ACTIVITY_FULLSCREEN, false);
        }
        ia3.b(this);
        super.onCreate(bundle);
        getOnBackPressedDispatcher().b(new vg7(true) { // from class: io.intercom.android.sdk.lightbox.LightBoxActivity.1
            @Override // defpackage.vg7
            public void handleOnBackPressed() {
                LightBoxActivity.this.closeLightBox();
            }
        });
        setContentView(R.layout.intercom_activity_lightbox);
        if (z) {
            Window window = getWindow();
            yv9 yv9Var = new yv9(getWindow().getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                anbVar = new dnb(window, yv9Var);
            } else if (i >= 30) {
                anbVar = new bnb(window, yv9Var);
            } else {
                anbVar = i >= 26 ? new anb(window, yv9Var) : new zmb(window, yv9Var);
            }
            anbVar.b(519);
        }
        this.rootView = (ViewGroup) findViewById(R.id.root_view);
        LightBoxImageView lightBoxImageView = (LightBoxImageView) findViewById(R.id.full_image);
        lightBoxImageView.setTransitionName(TRANSITION_KEY);
        loadImage(lightBoxImageView);
        reloadAfterTransition(lightBoxImageView);
        lightBoxImageView.setLightBoxListener(this);
        fadeIn();
    }
}
