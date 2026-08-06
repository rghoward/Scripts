package io.intercom.android.sdk.activities;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.e;
import com.intercom.twig.BuildConfig;
import defpackage.egb;
import defpackage.fib;
import defpackage.ia3;
import defpackage.li5;
import defpackage.m9;
import defpackage.n9;
import defpackage.p21;
import defpackage.qu8;
import defpackage.ru8;
import defpackage.u21;
import defpackage.u9;
import defpackage.umb;
import defpackage.vg7;
import defpackage.w9;
import defpackage.xd5;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.conversation.JavascriptRunner;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Sheet;
import io.intercom.android.sdk.sheets.SheetListener;
import io.intercom.android.sdk.sheets.SheetWebViewPresenter;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.views.IntercomErrorView;
import io.intercom.android.sdk.views.IntercomToolbar;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class IntercomSheetActivity extends IntercomBaseActivity implements IntercomToolbar.Listener, SheetListener {
    private static final int ENTRANCE_ANIMATION_TIME_MS = 250;
    private static final int EXIT_ANIMATION_TIME_MS = 200;
    private static final String PARCEL_CARD_URI = "parcel_card_uri";
    private static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";
    private static final String PARCEL_IS_HOME_SCREEN = "parcel_is_home_screen";
    private static final String PARCEL_PARAMS = "parcel_params";
    private static final String PARCEL_SHEET_URL = "parcel_sheet_url";
    private static final int WEBVIEW_FADE_IN_TIME_MS = 300;
    private Provider<AppConfig> appConfigProvider;
    private String cardUri;
    private View containerView;
    private IntercomErrorView intercomErrorView;
    private IntercomToolbar intercomToolbar;
    private boolean isHomeScreen;
    private JavascriptRunner jsRunner;
    ProgressBar loadingBar;
    private MetricTracker metricTracker;
    private w9<Intent> pickFile;
    private SheetWebViewPresenter presenter;
    private int secondaryColor;
    public ValueCallback<Uri[]> valueCallback;
    WebView webView;
    private String sheetUrl = BuildConfig.FLAVOR;
    private String conversationId = BuildConfig.FLAVOR;
    private HashMap params = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public void animateWindowIn() {
        this.containerView.setVisibility(0);
        this.containerView.setY(findViewById(R.id.content).getMeasuredHeight());
        this.containerView.animate().y(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(250L).start();
    }

    private void animateWindowOut() {
        this.containerView.animate().y(getWindow().getDecorView().getHeight()).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IntercomSheetActivity.this.finish();
                IntercomSheetActivity.this.overridePendingTransition(0, 0);
            }
        }).start();
    }

    public static Intent buildIntent(Context context, String str, Map<String, Object> map, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) IntercomSheetActivity.class);
        intent.putExtra(PARCEL_SHEET_URL, str);
        intent.putExtra(PARCEL_PARAMS, new HashMap(map));
        intent.putExtra(PARCEL_CARD_URI, str2);
        intent.putExtra(PARCEL_CONVERSATION_ID, str3);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cardUpdated() {
        Injector.get().getDataLayer().emitEvent(IntercomEvent.CardUpdated.INSTANCE);
    }

    private void hideKeyboard() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    private void insertWebView() {
        try {
            this.webView = new WebView(this);
        } catch (Resources.NotFoundException unused) {
            this.webView = new WebView(getApplicationContext());
        }
        this.webView.setAlpha(0.0f);
        this.webView.setId(io.intercom.android.sdk.R.id.intercom_sheet_webview);
        this.webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ((FrameLayout) findViewById(io.intercom.android.sdk.R.id.sheet_view)).addView(this.webView, 0);
        this.webView.setWebChromeClient(new WebChromeClient() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.5
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                IntercomSheetActivity.this.loadingBar.setProgress(i);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                IntercomSheetActivity intercomSheetActivity = IntercomSheetActivity.this;
                intercomSheetActivity.valueCallback = valueCallback;
                intercomSheetActivity.pickFile.a(fileChooserParams.createIntent());
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static umb lambda$onCreate$0(View view, umb umbVar) {
        xd5 xd5VarI = umbVar.a.i(647);
        view.setPadding(xd5VarI.a, xd5VarI.b, xd5VarI.c, xd5VarI.d);
        return umb.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onCreate$1(m9 m9Var) {
        Intent intent;
        if (m9Var.t != -1 || (intent = m9Var.u) == null) {
            this.valueCallback.onReceiveValue(null);
        } else {
            this.valueCallback.onReceiveValue(new Uri[]{intent.getData()});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadSheet(Api api) {
        this.loadingBar.setVisibility(0);
        this.intercomErrorView.setVisibility(8);
        api.fetchSheet(this.params, new u21<Sheet.Builder>() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.4
            @Override // defpackage.u21
            public void onFailure(p21<Sheet.Builder> p21Var, Throwable th) {
                IntercomSheetActivity.this.showErrorView();
            }

            @Override // defpackage.u21
            public void onResponse(p21<Sheet.Builder> p21Var, ru8<Sheet.Builder> ru8Var) {
                qu8 qu8Var = ru8Var.a;
                Sheet.Builder builder = ru8Var.b;
                if (!qu8Var.J || builder == null) {
                    IntercomSheetActivity.this.showErrorView();
                    return;
                }
                IntercomSheetActivity.this.intercomErrorView.setVisibility(8);
                IntercomSheetActivity.this.presenter.loadBundle(builder.build().getBody());
                IntercomSheetActivity.this.metricTracker.viewedMessengerSheet(IntercomSheetActivity.this.conversationId, IntercomSheetActivity.this.sheetUrl, IntercomSheetActivity.this.isHomeScreen);
            }
        });
    }

    private void setUpToolbar(Provider<AppConfig> provider) {
        AppConfig appConfig = provider.get();
        IntercomToolbar intercomToolbar = (IntercomToolbar) findViewById(io.intercom.android.sdk.R.id.intercom_toolbar);
        this.intercomToolbar = intercomToolbar;
        intercomToolbar.updateToolbarColors(appConfig);
        this.intercomToolbar.setListener(this);
        this.intercomToolbar.setSubtitleVisibility(8);
        this.intercomToolbar.setBackgroundColor(this.secondaryColor);
        this.intercomToolbar.setLeftNavigationItemVisibility(0);
        this.intercomToolbar.setCloseButtonVisibility(8);
        this.intercomToolbar.setLeftNavigationIcon(getDrawable(io.intercom.android.sdk.R.drawable.intercom_close));
        ProgressBar progressBar = (ProgressBar) this.intercomToolbar.findViewById(io.intercom.android.sdk.R.id.toolbar_progress_bar);
        this.loadingBar = progressBar;
        progressBar.setProgressDrawable(new LayerDrawable(new Drawable[]{new ColorDrawable(appConfig.getSecondaryColorDark()), new ScaleDrawable(new ColorDrawable(-1), 8388611, 1.0f, -1.0f)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showErrorView() {
        this.loadingBar.setVisibility(8);
        this.intercomErrorView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSubmitActionError(final Map<String, Object> map) {
        e eVarCreate = new e.a(this).setTitle(io.intercom.android.sdk.R.string.intercom_couldnt_load_content).setMessage(io.intercom.android.sdk.R.string.intercom_give_it_another_try).setPositiveButton(io.intercom.android.sdk.R.string.intercom_reload, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.8
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IntercomSheetActivity.this.onSubmitSheetAction(map);
            }
        }).create();
        eVarCreate.show();
        eVarCreate.f(-1).setTextColor(ColorUtils.primaryOrDarkColor(this, this.appConfigProvider.get()));
    }

    public void closeSheet() {
        this.metricTracker.closedMessengerSheet(this.conversationId, this.sheetUrl, this.isHomeScreen);
        hideKeyboard();
        animateWindowOut();
    }

    @Override // io.intercom.android.sdk.sheets.SheetListener
    public void onCloseSheetAction() {
        closeSheet();
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseActivity, androidx.fragment.app.g, defpackage.dq1, defpackage.hq1, android.app.Activity
    public void onCreate(Bundle bundle) {
        ia3.b(this);
        super.onCreate(bundle);
        getOnBackPressedDispatcher().b(new vg7(true) { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.1
            @Override // defpackage.vg7
            public void handleOnBackPressed() {
                boolean zCanGoBack = IntercomSheetActivity.this.webView.canGoBack();
                IntercomSheetActivity intercomSheetActivity = IntercomSheetActivity.this;
                if (zCanGoBack) {
                    intercomSheetActivity.webView.goBack();
                } else {
                    intercomSheetActivity.closeSheet();
                }
            }
        });
        Injector injector = Injector.get();
        this.metricTracker = injector.getMetricTracker();
        Provider<AppConfig> appConfigProvider = injector.getAppConfigProvider();
        this.appConfigProvider = appConfigProvider;
        this.secondaryColor = appConfigProvider.get().getSecondaryColor();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.sheetUrl = extras.getString(PARCEL_SHEET_URL, BuildConfig.FLAVOR);
            this.conversationId = extras.getString(PARCEL_CONVERSATION_ID, BuildConfig.FLAVOR);
            this.params = (HashMap) extras.getSerializable(PARCEL_PARAMS);
            this.cardUri = extras.getString(PARCEL_CARD_URI);
            this.isHomeScreen = extras.getBoolean(PARCEL_IS_HOME_SCREEN, false);
        }
        setContentView(io.intercom.android.sdk.R.layout.intercom_activity_sheet);
        setUpToolbar(this.appConfigProvider);
        View viewFindViewById = findViewById(io.intercom.android.sdk.R.id.sheet_root);
        this.containerView = viewFindViewById;
        li5 li5Var = new li5();
        WeakHashMap<View, fib> weakHashMap = egb.a;
        egb.d.c(viewFindViewById, li5Var);
        if (TextUtils.isEmpty(this.sheetUrl) || this.params == null) {
            closeSheet();
        }
        this.containerView.setVisibility(8);
        this.containerView.post(new Runnable() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.2
            @Override // java.lang.Runnable
            public void run() {
                IntercomSheetActivity.this.animateWindowIn();
            }
        });
        insertWebView();
        JavascriptRunner javascriptRunner = new JavascriptRunner(this.webView);
        this.jsRunner = javascriptRunner;
        SheetWebViewPresenter sheetWebViewPresenter = new SheetWebViewPresenter(this.webView, javascriptRunner, this.sheetUrl, this, injector);
        this.presenter = sheetWebViewPresenter;
        sheetWebViewPresenter.setUpWebView();
        IntercomErrorView intercomErrorView = (IntercomErrorView) this.containerView.findViewById(io.intercom.android.sdk.R.id.error_layout_sheet);
        this.intercomErrorView = intercomErrorView;
        intercomErrorView.setActionButtonTextColor(ColorUtils.primaryOrDarkColor(this, this.appConfigProvider.get()));
        this.intercomErrorView.setActionButtonClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IntercomSheetActivity.this.loadSheet(Injector.get().getApi());
            }
        });
        this.pickFile = registerForActivityResult(new u9(), new n9() { // from class: mi5
            @Override // defpackage.n9
            public final void a(Object obj) {
                this.t.lambda$onCreate$1((m9) obj);
            }
        });
        loadSheet(injector.getApi());
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onInboxClicked() {
        closeSheet();
    }

    @Override // io.intercom.android.sdk.sheets.SheetListener
    public void onSheetTitleAction(String str) {
        this.intercomToolbar.setTitle(str);
    }

    @Override // io.intercom.android.sdk.sheets.SheetListener
    public void onSubmitSheetAction(final Map<String, Object> map) {
        Injector.get().getApi().submitSheet(this.cardUri, map, new u21<Void>() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.7
            @Override // defpackage.u21
            public void onFailure(p21<Void> p21Var, Throwable th) {
                IntercomSheetActivity.this.showSubmitActionError(map);
            }

            @Override // defpackage.u21
            public void onResponse(p21<Void> p21Var, ru8<Void> ru8Var) {
                boolean z = ru8Var.a.J;
                IntercomSheetActivity intercomSheetActivity = IntercomSheetActivity.this;
                if (!z) {
                    intercomSheetActivity.showSubmitActionError(map);
                } else {
                    intercomSheetActivity.cardUpdated();
                    IntercomSheetActivity.this.closeSheet();
                }
            }
        });
    }

    @Override // io.intercom.android.sdk.sheets.SheetListener
    public void onWebViewFinishedLoad() {
        this.jsRunner.runPendingScripts();
        this.webView.animate().alpha(1.0f).setDuration(300L).start();
        this.loadingBar.setVisibility(8);
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onCloseClicked() {
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onToolbarClicked() {
    }
}
