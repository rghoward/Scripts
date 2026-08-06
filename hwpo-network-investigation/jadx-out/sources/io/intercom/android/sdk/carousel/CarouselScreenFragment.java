package io.intercom.android.sdk.carousel;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.f;
import com.intercom.twig.BuildConfig;
import defpackage.ty0;
import defpackage.vi1;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.CarouselImageClickListener;
import io.intercom.android.sdk.blocks.ContentLayoutManager;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.ViewHolderGenerator;
import io.intercom.android.sdk.models.carousel.ActionType;
import io.intercom.android.sdk.models.carousel.CarouselScreen;
import io.intercom.android.sdk.models.carousel.ScreenAction;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class CarouselScreenFragment extends f {
    public static final int CAROUSEL_ANIMATION_DELAY_MS = 300;
    public static final int CAROUSEL_ANIMATION_MS = 400;
    private static final String KEY_CAROUSEL_SCREEN = "carousel_screen";
    private LinearLayout actionLayout;
    private CarouselListener listener;
    private PermissionManager permissionManager;
    private boolean tickShouldAnimate = true;
    private CarouselScreen carouselScreen = CarouselScreen.NULL;

    private void animateTickIcon(ImageView imageView) {
        imageView.clearAnimation();
        imageView.setAlpha(0.0f);
        imageView.setScaleX(0.0f);
        imageView.setScaleY(0.0f);
        imageView.setRotation(-360.0f);
        imageView.animate().alpha(1.0f).rotationBy(360.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(300L).setDuration(400L).start();
        this.tickShouldAnimate = false;
    }

    private void applyBottomGradient(final View view, final ContentAwareScrollView contentAwareScrollView, int i) {
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i, vi1.h(i, 0)}));
        contentAwareScrollView.setListener(new ContentAwareScrollView.Listener() { // from class: io.intercom.android.sdk.carousel.CarouselScreenFragment.1
            @Override // io.intercom.android.sdk.views.ContentAwareScrollView.Listener
            public void onBottomReached() {
                view.setVisibility(8);
            }

            @Override // io.intercom.android.sdk.views.ContentAwareScrollView.Listener
            public void onScrollChanged(int i2) {
                if (contentAwareScrollView.isAtBottom()) {
                    return;
                }
                view.setVisibility(0);
            }
        });
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.intercom.android.sdk.carousel.CarouselScreenFragment.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (contentAwareScrollView.isAtBottom()) {
                    view.setVisibility(8);
                }
            }
        });
    }

    private FrameLayout buttonWithTickIcon(TextView textView, int i) {
        textView.setText(BuildConfig.FLAVOR);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        FrameLayout frameLayout = new FrameLayout(textView.getContext());
        frameLayout.setLayoutParams(textView.getLayoutParams());
        ImageView imageView = (ImageView) layoutInflaterFrom.inflate(R.layout.intercom_carousel_action_button_tick, (ViewGroup) frameLayout, false);
        imageView.getDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
        frameLayout.addView(textView);
        frameLayout.addView(imageView);
        if (this.tickShouldAnimate) {
            animateTickIcon(imageView);
        }
        return frameLayout;
    }

    private TextView createButton(ScreenAction screenAction) {
        TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.intercom_carousel_action_button, (ViewGroup) this.actionLayout, false);
        FontUtils.setRobotoMediumTypeface(textView);
        textView.setText(screenAction.getTitle());
        textView.getBackground().setColorFilter(Color.parseColor(screenAction.getBackgroundColor()), PorterDuff.Mode.SRC_IN);
        textView.setTextColor(Color.parseColor(screenAction.getTextColor()));
        textView.setOnClickListener(new ActionOnClickListener(screenAction, this.listener));
        textView.setContentDescription(screenAction.getTitle() + ", button");
        return textView;
    }

    private void displayScreenActions() {
        this.actionLayout.removeAllViews();
        List<ScreenAction> actions = this.carouselScreen.getActions();
        ScreenAction permissionAction = this.carouselScreen.getPermissionAction();
        for (ScreenAction screenAction : actions) {
            TextView textViewCreateButton = createButton(screenAction);
            if (!ScreenAction.NULL.equals(permissionAction)) {
                PermissionManager permissionManager = this.permissionManager;
                if (permissionManager.permissionsGranted(permissionAction.getValidPermissions(permissionManager))) {
                    if (ActionType.SKIP.equals(screenAction.getType())) {
                        this.actionLayout.addView(buttonWithTickIcon(textViewCreateButton, Color.parseColor(screenAction.getTextColor())));
                    } else {
                        screenAction.isPermissionAction();
                    }
                }
            }
            this.actionLayout.addView(textViewCreateButton);
        }
    }

    public static CarouselScreenFragment newInstance(CarouselScreen carouselScreen) {
        CarouselScreenFragment carouselScreenFragment = new CarouselScreenFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY_CAROUSEL_SCREEN, carouselScreen);
        carouselScreenFragment.setArguments(bundle);
        return carouselScreenFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.f
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.listener = (CarouselListener) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context + " must implement CarouselListener");
        }
    }

    @Override // androidx.fragment.app.f
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.carouselScreen = (CarouselScreen) ty0.a(arguments, KEY_CAROUSEL_SCREEN, CarouselScreen.class);
        }
        Injector injector = Injector.get();
        Api api = injector.getApi();
        ContentLayoutManager contentLayoutManager = new ContentLayoutManager(getContext(), new ViewHolderGenerator(new UploadingImageCache(), api, injector.getAppConfigProvider(), BuildConfig.FLAVOR, new CarouselImageClickListener(api), null, injector.getGson(), injector.getMetricTracker()).getCarouselHolder());
        this.permissionManager = new PermissionManager(getActivity());
        View viewInflate = layoutInflater.inflate(R.layout.intercom_fragment_carousel_screen, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.intercom_carousel_fragment_root);
        this.actionLayout = (LinearLayout) viewInflate.findViewById(R.id.intercom_carousel_action_layout);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.intercom_carousel_content_container);
        View viewFindViewById = viewInflate.findViewById(R.id.intercom_carousel_gradient);
        ContentAwareScrollView contentAwareScrollView = (ContentAwareScrollView) viewInflate.findViewById(R.id.intercom_carousel_scroll_view);
        int color = Color.parseColor(this.carouselScreen.getBackgroundColor());
        applyBottomGradient(viewFindViewById, contentAwareScrollView, color);
        linearLayout.setBackgroundColor(color);
        displayScreenActions();
        contentLayoutManager.renderCarouselScreen(this.carouselScreen, frameLayout);
        return viewInflate;
    }

    @Override // androidx.fragment.app.f
    public void onResume() {
        super.onResume();
        displayScreenActions();
    }
}
