package io.intercom.android.sdk.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.intercom.twig.BuildConfig;
import com.intercom.twig.Twig;
import defpackage.ca0;
import defpackage.egb;
import defpackage.fib;
import defpackage.ia3;
import defpackage.mn9;
import defpackage.umb;
import defpackage.vg7;
import defpackage.xd5;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.carousel.CarouselListener;
import io.intercom.android.sdk.carousel.CarouselPresenter;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.carousel.CarouselScreenPagerAdapter;
import io.intercom.android.sdk.carousel.CarouselView;
import io.intercom.android.sdk.carousel.PermissionManager;
import io.intercom.android.sdk.carousel.permission.PermissionRequest;
import io.intercom.android.sdk.carousel.permission.PermissionRequestFactory;
import io.intercom.android.sdk.carousel.permission.PermissionResultListener;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.IntercomRootActivity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.models.carousel.CarouselScreen;
import io.intercom.android.sdk.models.carousel.ScreenAction;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.android.sdk.utilities.LinkOpener;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.IntercomShimmerLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class IntercomCarouselActivity extends IntercomBaseActivity implements ViewPager.j, View.OnClickListener, CarouselListener, PermissionResultListener, CarouselView {
    private static final String PARCEL_CAROUSEL_ID = "parcel_carousel_id";
    private static final int PERMISSION_REQUEST_CODE = 12306;
    private static final String STATE_CURRENT_PERMISSION_ACTION = "state_current_permission_action";
    private static final String STATE_CURRENT_SCREEN_ID = "state_current_screen_id";
    private static final String STATE_HAS_RECORDED_COMPLETION_STATS = "state_has_recorded_completion_stats";
    private static final String STATE_IS_LAST_SCREEN_VIEWED = "state_is_last_screen_viewed";
    private static final String STATE_NUMBER_OF_SCREENS_SEEN = "state_number_of_screens_seen";
    private static final String STATE_SENT_TO_SETTINGS = "state_sent_to_settings";
    CarouselScreenPagerAdapter adapter;
    Provider<AppConfig> appConfigProvider;
    CarouselPresenter carouselPresenter;
    private View closeBackground;
    private ImageButton closeButton;
    private ConstraintLayout closeButtonContainer;
    MetricTracker metricTracker;
    LinearLayout navigationDotsLayout;
    PermissionManager permissionManager;
    PermissionRequest permissionRequest;
    private ConstraintLayout rootView;
    private FrameLayout stateContainer;
    ViewPager viewPager;
    private final Twig twig = LumberMill.getLogger();
    boolean isLastScreenViewed = false;
    boolean hasRecordedCompletionStats = false;
    int numberOfScreensSeen = 0;
    ScreenAction currentPermissionAction = ScreenAction.NULL;
    boolean sentToSettings = false;
    String currentScreenId = BuildConfig.FLAVOR;

    private FrameLayout.LayoutParams buildContentLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.intercom_carousel_padding);
        layoutParams.setMarginStart(dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize);
        return layoutParams;
    }

    private View buildErrorMessage(int i) {
        TextView textView = new TextView(this);
        textView.setLayoutParams(buildContentLayoutParams());
        BlockUtils.setMarginBottom(textView, 16);
        styleErrorMessage(textView);
        textView.setText(i);
        return textView;
    }

    public static Intent buildIntent(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) IntercomCarouselActivity.class);
        intent.putExtra(PARCEL_CAROUSEL_ID, str);
        intent.setFlags(268435456);
        return intent;
    }

    private mn9 buildLoadingContainer() {
        IntercomShimmerLayout intercomShimmerLayout = new IntercomShimmerLayout(this);
        intercomShimmerLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        intercomShimmerLayout.setClickable(true);
        intercomShimmerLayout.setFocusable(true);
        return intercomShimmerLayout;
    }

    private View buildLoadingContent() {
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(buildContentLayoutParams());
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setBackgroundResource(R.drawable.intercom_content_loading);
        return imageView;
    }

    private View buildLoadingState() {
        mn9 mn9VarBuildLoadingContainer = buildLoadingContainer();
        mn9VarBuildLoadingContainer.addView(buildLoadingContent());
        return mn9VarBuildLoadingContainer;
    }

    private View buildRetryButton() {
        TextView textView = (TextView) LayoutInflater.from(this).inflate(R.layout.intercom_carousel_action_button, (ViewGroup) this.stateContainer, false);
        FontUtils.setRobotoMediumTypeface(textView);
        textView.setText(R.string.intercom_retry);
        BackgroundUtils.setButtonColor(textView, this.appConfigProvider.get().getPrimaryColor());
        textView.setLayoutParams(buildRetryButtonLayoutParams());
        textView.setOnClickListener(new View.OnClickListener() { // from class: oh5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.t.lambda$buildRetryButton$2(view);
            }
        });
        return textView;
    }

    private FrameLayout.LayoutParams buildRetryButtonLayoutParams() {
        FrameLayout.LayoutParams layoutParamsBuildContentLayoutParams = buildContentLayoutParams();
        layoutParamsBuildContentLayoutParams.height = getResources().getDimensionPixelSize(R.dimen.intercom_office_hours_height);
        layoutParamsBuildContentLayoutParams.setMargins(layoutParamsBuildContentLayoutParams.leftMargin, layoutParamsBuildContentLayoutParams.topMargin, layoutParamsBuildContentLayoutParams.rightMargin, getResources().getDimensionPixelSize(R.dimen.intercom_carousel_action_button_bottom_padding));
        layoutParamsBuildContentLayoutParams.gravity = 80;
        return layoutParamsBuildContentLayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$buildRetryButton$2(View view) {
        this.carouselPresenter.retryFetch(getIntent().getStringExtra(PARCEL_CAROUSEL_ID));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static umb lambda$setInsets$0(View view, umb umbVar) {
        xd5 xd5VarI = umbVar.a.i(647);
        view.setPadding(xd5VarI.a, xd5VarI.b, xd5VarI.c, xd5VarI.d);
        return umb.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupViewPagerWithScreens$1() {
        onPageSelected(this.viewPager.getCurrentItem());
    }

    private void setCloseButtonColor(int i) {
        int color = getColor(i);
        this.closeBackground.getBackground().setTint(color);
        this.closeButton.getDrawable().setTint(color);
    }

    private void setInsets() {
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.intercom_carousel_root);
        this.rootView = constraintLayout;
        ca0 ca0Var = new ca0();
        WeakHashMap<View, fib> weakHashMap = egb.a;
        egb.d.c(constraintLayout, ca0Var);
    }

    private void setupViewPagerWithScreens(List<CarouselScreen> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<CarouselScreen> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CarouselScreenFragment.newInstance(it.next()));
        }
        CarouselScreenPagerAdapter carouselScreenPagerAdapter = new CarouselScreenPagerAdapter(getSupportFragmentManager(), arrayList);
        this.adapter = carouselScreenPagerAdapter;
        this.viewPager.setAdapter(carouselScreenPagerAdapter);
        ViewPager viewPager = this.viewPager;
        if (viewPager.n0 == null) {
            viewPager.n0 = new ArrayList();
        }
        viewPager.n0.add(this);
        this.viewPager.post(new Runnable() { // from class: nh5
            @Override // java.lang.Runnable
            public final void run() {
                this.t.lambda$setupViewPagerWithScreens$1();
            }
        });
    }

    private void showRationaleDialog(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        e eVarShow = new e.a(this).setTitle(i).setMessage(i2).setPositiveButton(R.string.intercom_app_settings, onClickListener).setNegativeButton(R.string.intercom_not_now, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.activities.IntercomCarouselActivity.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i3) {
                IntercomCarouselActivity.this.skipPermissionScreen();
            }
        }).setCancelable(false).show();
        int iPrimaryOrDarkColor = ColorUtils.primaryOrDarkColor(this, this.appConfigProvider.get());
        eVarShow.f(-2).setTextColor(iPrimaryOrDarkColor);
        eVarShow.f(-1).setTextColor(iPrimaryOrDarkColor);
    }

    private void showState(View view) {
        setCloseButtonColor(R.color.intercom_carousel_grey);
        this.stateContainer.removeAllViews();
        this.stateContainer.addView(view);
        this.stateContainer.setVisibility(0);
    }

    private void styleErrorMessage(TextView textView) {
        textView.setBreakStrategy(0);
        textView.setTextColor(getColor(R.color.intercom_black));
        textView.setTextSize(34.0f);
        textView.setTypeface(null, 1);
        textView.setLineSpacing(ScreenUtils.dpToPx(6.0f, textView.getContext()), 1.0f);
        textView.setGravity(1);
    }

    private void updateCloseButtonColor(boolean z) {
        setCloseButtonColor(z ? R.color.intercom_carousel_grey : R.color.intercom_white);
    }

    public void closeCarouselAndResetPersistedData() {
        this.carouselPresenter.resetPersistedCarousel();
        finish();
    }

    @Override // io.intercom.android.sdk.carousel.CarouselListener
    public void dismissCarousel(String str) {
        if (!Carousel.NULL.equals(this.carouselPresenter.getCarousel())) {
            this.carouselPresenter.recordDismissedOrCompletedStats(this.isLastScreenViewed, this.hasRecordedCompletionStats);
            this.carouselPresenter.recordDismissedOrCompletedMetric(str, this.isLastScreenViewed, this.numberOfScreensSeen);
        }
        closeCarouselAndResetPersistedData();
    }

    public void goToSettings() {
        this.sentToSettings = true;
        startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", getPackageName(), null)));
    }

    @Override // io.intercom.android.sdk.carousel.CarouselView
    public void logEmptyCarouselError() {
        this.twig.e("Could not open carousel without id", new Object[0]);
    }

    @Override // io.intercom.android.sdk.carousel.CarouselView
    public void logUserNotRegisteredError() {
        this.twig.e("The app config has not been retrieved, please call registerUnidentifiedUser() or registerIdentifiedUser(Registration) before calling displayCarousel(carouselId).", new Object[0]);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        dismissCarousel(MetricTracker.Context.FROM_CLOSE_BUTTON);
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseActivity, androidx.fragment.app.g, defpackage.dq1, defpackage.hq1, android.app.Activity
    public void onCreate(Bundle bundle) {
        ia3.b(this);
        super.onCreate(bundle);
        getOnBackPressedDispatcher().b(new vg7(true) { // from class: io.intercom.android.sdk.activities.IntercomCarouselActivity.1
            @Override // defpackage.vg7
            public void handleOnBackPressed() {
                if (IntercomCarouselActivity.this.carouselPresenter.getCarousel().isDismissible()) {
                    IntercomCarouselActivity.this.dismissCarousel(MetricTracker.Context.FROM_ANDROID_BACK_BUTTON);
                }
            }
        });
        setContentView(R.layout.intercom_activity_carousel);
        setInsets();
        this.viewPager = (ViewPager) findViewById(R.id.intercom_view_pager);
        this.closeBackground = findViewById(R.id.intercom_close_background);
        this.closeButton = (ImageButton) findViewById(R.id.intercom_close);
        this.closeButtonContainer = (ConstraintLayout) findViewById(R.id.intercom_carousel_close_container);
        this.navigationDotsLayout = (LinearLayout) findViewById(R.id.intercom_page_navigation_layout);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.intercom_state_container);
        this.stateContainer = frameLayout;
        frameLayout.setVisibility(8);
        this.closeButton.setOnClickListener(this);
        this.closeButtonContainer.setOnClickListener(this);
        Injector injector = Injector.get();
        this.appConfigProvider = injector.getAppConfigProvider();
        PermissionManager permissionManager = new PermissionManager(this);
        this.permissionManager = permissionManager;
        PermissionRequest permissionRequestCreate = PermissionRequestFactory.create(permissionManager);
        this.permissionRequest = permissionRequestCreate;
        permissionRequestCreate.attach(this);
        this.metricTracker = injector.getMetricTracker();
        this.carouselPresenter = new CarouselPresenter(injector.getApi(), injector.getUserIdentity(), this.metricTracker, this.permissionManager, injector.getDataLayer());
        if (bundle != null) {
            restoreInstanceState(bundle);
        }
        this.carouselPresenter.attachView(this);
        this.carouselPresenter.fetchCarousel(getIntent().getStringExtra(PARCEL_CAROUSEL_ID));
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseActivity, defpackage.uy, androidx.fragment.app.g, android.app.Activity
    public void onDestroy() {
        this.permissionRequest.detach();
        super.onDestroy();
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageSelected(int i) {
        List<CarouselScreen> screens = this.carouselPresenter.getCarousel().getScreens();
        int size = screens.size();
        if (size > i) {
            CarouselScreen carouselScreen = screens.get(i);
            this.currentPermissionAction = carouselScreen.getPermissionAction();
            this.currentScreenId = carouselScreen.getId();
            boolean zIsColorLight = ColorUtils.isColorLight(carouselScreen.getBackgroundColor());
            renderNavigationDots(this.adapter.getCount(), zIsColorLight, i);
            updateCloseButtonColor(zIsColorLight);
            if (i >= this.numberOfScreensSeen) {
                this.carouselPresenter.recordScreenSeenStats(carouselScreen.getId());
                this.numberOfScreensSeen = i + 1;
            }
            if (i + 1 == size) {
                this.isLastScreenViewed = true;
                if (this.hasRecordedCompletionStats) {
                    return;
                }
                this.carouselPresenter.recordCompletedStatsIfNeeded();
                this.hasRecordedCompletionStats = true;
            }
        }
    }

    @Override // androidx.fragment.app.g, defpackage.dq1, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == PERMISSION_REQUEST_CODE) {
            this.carouselPresenter.recordPermissionRequestedMetric(this.currentPermissionAction.getType(), iArr, this.currentScreenId);
            this.permissionRequest.handleResult(strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.sentToSettings) {
            this.sentToSettings = false;
            this.carouselPresenter.recordSentToPermissionSettingsMetric(this.currentPermissionAction, this.currentScreenId);
        }
    }

    @Override // defpackage.dq1, defpackage.hq1, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(STATE_IS_LAST_SCREEN_VIEWED, this.isLastScreenViewed);
        bundle.putBoolean(STATE_HAS_RECORDED_COMPLETION_STATS, this.hasRecordedCompletionStats);
        bundle.putInt(STATE_NUMBER_OF_SCREENS_SEEN, this.numberOfScreensSeen);
        bundle.putParcelable(STATE_CURRENT_PERMISSION_ACTION, this.currentPermissionAction);
        bundle.putBoolean(STATE_SENT_TO_SETTINGS, this.sentToSettings);
        bundle.putString(STATE_CURRENT_SCREEN_ID, this.currentScreenId);
    }

    @Override // io.intercom.android.sdk.carousel.CarouselListener
    public void openLink(String str) {
        dismissCarousel(MetricTracker.Context.FROM_CTA);
        LinkOpener.handleUrl(str, this, Injector.get().getApi());
    }

    public void renderNavigationDots(int i, boolean z, int i2) {
        this.navigationDotsLayout.removeAllViews();
        int i3 = z ? R.drawable.intercom_tab_dot_selector_dark : R.drawable.intercom_tab_dot_selector_light;
        for (int i4 = 0; i4 < i; i4++) {
            View view = new View(this);
            int iDpToPx = ScreenUtils.dpToPx(16.0f, this);
            view.setLayoutParams(new ViewGroup.LayoutParams(iDpToPx, iDpToPx));
            view.setBackgroundResource(i3);
            this.navigationDotsLayout.addView(view);
            if (i4 == i2) {
                view.setSelected(true);
            }
        }
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
    public void requestBackgroundLocationPermission() {
        showRationaleDialog(R.string.intercom_access_background_location_title, R.string.intercom_access_background_location_message, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.activities.IntercomCarouselActivity.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IntercomCarouselActivity.this.permissionManager.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, IntercomCarouselActivity.PERMISSION_REQUEST_CODE);
            }
        });
    }

    @Override // io.intercom.android.sdk.carousel.CarouselListener
    public void requestPermissions(ScreenAction screenAction) {
        this.permissionRequest.request(screenAction, PERMISSION_REQUEST_CODE);
    }

    public void restoreInstanceState(Bundle bundle) {
        this.isLastScreenViewed = bundle.getBoolean(STATE_IS_LAST_SCREEN_VIEWED, false);
        this.hasRecordedCompletionStats = bundle.getBoolean(STATE_HAS_RECORDED_COMPLETION_STATS, false);
        this.numberOfScreensSeen = bundle.getInt(STATE_NUMBER_OF_SCREENS_SEEN, 0);
        ScreenAction screenAction = (ScreenAction) bundle.getParcelable(STATE_CURRENT_PERMISSION_ACTION);
        if (screenAction != null) {
            this.currentPermissionAction = screenAction;
        }
        this.sentToSettings = bundle.getBoolean(STATE_SENT_TO_SETTINGS, false);
        String string = bundle.getString(STATE_CURRENT_SCREEN_ID);
        if (string != null) {
            this.currentScreenId = string;
        }
    }

    @Override // io.intercom.android.sdk.carousel.CarouselListener
    public void selectNextScreen(String str) {
        int currentItem = this.viewPager.getCurrentItem() + 1;
        if (currentItem < this.adapter.getCount()) {
            this.viewPager.setCurrentItem(currentItem);
        } else {
            dismissCarousel(str);
        }
    }

    public void selectNextScreenWithDelay() {
        new Handler().postDelayed(new Runnable() { // from class: io.intercom.android.sdk.activities.IntercomCarouselActivity.5
            @Override // java.lang.Runnable
            public void run() {
                IntercomCarouselActivity.this.selectNextScreen(MetricTracker.Context.FROM_PERMISSION);
            }
        }, 1000L);
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
    public void showDeniedPermanently() {
        showGoToSettingsDialog();
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
    public void showDeniedTemporarily() {
        selectNextScreen(MetricTracker.Context.FROM_PERMISSION);
    }

    @Override // io.intercom.android.sdk.carousel.CarouselView
    public void showGenericError() {
        showState(buildErrorMessage(R.string.intercom_something_went_wrong_try_again));
        this.stateContainer.addView(buildRetryButton());
    }

    public void showGoToSettingsDialog() {
        showRationaleDialog(R.string.intercom_permission_denied, R.string.intercom_go_to_device_settings, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.activities.IntercomCarouselActivity.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IntercomCarouselActivity.this.goToSettings();
            }
        });
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
    public void showGranted() {
        selectNextScreenWithDelay();
    }

    @Override // io.intercom.android.sdk.carousel.CarouselView
    public void showLoading() {
        showState(buildLoadingState());
    }

    @Override // io.intercom.android.sdk.carousel.CarouselView
    public void showNotFoundError() {
        showState(buildErrorMessage(R.string.intercom_page_not_found));
    }

    public void showOrHideNavigationDots(List<CarouselScreen> list) {
        this.navigationDotsLayout.setVisibility(list.size() > 1 ? 0 : 8);
    }

    @Override // io.intercom.android.sdk.carousel.CarouselView
    public void showSuccess(Carousel carousel) {
        this.stateContainer.setVisibility(8);
        List<CarouselScreen> screens = carousel.getScreens();
        if (screens.isEmpty()) {
            closeCarouselAndResetPersistedData();
        } else {
            this.carouselPresenter.recordOpenMetric();
        }
        this.closeButtonContainer.setVisibility(carousel.isDismissible() ? 0 : 8);
        showOrHideNavigationDots(screens);
        setupViewPagerWithScreens(screens);
    }

    @Override // io.intercom.android.sdk.carousel.CarouselListener
    public void skipPermissionScreen() {
        this.metricTracker.skippedPermission(this.currentPermissionAction.getType(), this.carouselPresenter.getCarousel().getInstanceId(), this.carouselPresenter.getCarouselSource());
        selectNextScreen(MetricTracker.Context.FROM_PERMISSION_SKIPPED);
    }

    @Override // io.intercom.android.sdk.carousel.CarouselListener
    public void startChat() {
        dismissCarousel(MetricTracker.Context.FROM_CTA);
        if (this.appConfigProvider.get().isInboundMessages()) {
            startActivity(ConversationScreenOpenerKt.getComposerIntent(this, BuildConfig.FLAVOR, false, null, null, IntercomRootActivity.class));
        }
    }

    @Override // io.intercom.android.sdk.carousel.CarouselListener
    public void trackActionButtonTappedStats() {
        this.carouselPresenter.recordActionButtonTappedStats(this.currentScreenId);
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrolled(int i, float f, int i2) {
    }
}
