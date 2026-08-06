package defpackage;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.hwpo_training_app.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class dq1 extends hq1 implements whb, wt4, f19, bh7, f87, ja, gh7, hi7, rh7, sh7, jr6 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final b Companion = new b();
    private vhb _viewModelStore;
    private final ba activityResultRegistry;
    private int contentLayoutId;
    private final tz1 contextAwareHelper;
    private final ss5 defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final ss5 fullyDrawnReporter$delegate;
    private boolean hasPictureInPictureSystemFeature;
    private final mr6 menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final ss5 onBackPressedDispatcher$delegate;
    private final ss5 onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<sy1<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<sy1<z07>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<sy1<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<sy1<az7>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<sy1<cz7>> onPictureInPictureUiStateChangedListeners;
    private final CopyOnWriteArrayList<sy1<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final d reportFullyDrawnExecutor;
    private final c19 savedStateRegistryController;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements g76 {
        public a() {
        }

        @Override // defpackage.g76
        public final void t(m76 m76Var, s66.a aVar) {
            dq1 dq1Var = dq1.this;
            dq1Var.ensureViewModelStore();
            dq1Var.getLifecycle().c(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public Object a;
        public vhb b;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface d extends Executor {
        void a0(View view);

        void m();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class e implements d, ViewTreeObserver.OnDrawListener, Runnable {
        public final long t = SystemClock.uptimeMillis() + 10000;
        public Runnable u;
        public boolean v;

        public e() {
        }

        @Override // dq1.d
        public final void a0(View view) {
            if (this.v) {
                return;
            }
            this.v = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.getClass();
            this.u = runnable;
            View decorView = dq1.this.getWindow().getDecorView();
            decorView.getClass();
            if (!this.v) {
                decorView.postOnAnimation(new eq1(0, this));
            } else if (xj5.a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // dq1.d
        public final void m() {
            dq1 dq1Var = dq1.this;
            dq1Var.getWindow().getDecorView().removeCallbacks(this);
            dq1Var.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z;
            Runnable runnable = this.u;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.t) {
                    this.v = false;
                    dq1.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.u = null;
            lh4 fullyDrawnReporter = dq1.this.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.b) {
                z = fullyDrawnReporter.c;
            }
            if (z) {
                this.v = false;
                dq1.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            dq1.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends ba {
        public f() {
        }

        @Override // defpackage.ba
        public final void b(final int i, o9 o9Var, Object obj) {
            Bundle bundleExtra;
            final int i2;
            o9Var.getClass();
            dq1 dq1Var = dq1.this;
            final o9.a synchronousResult = o9Var.getSynchronousResult(dq1Var, obj);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: fq1
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Serializable serializable = synchronousResult.a;
                        dq1.f fVar = this.t;
                        String str = (String) fVar.a.get(Integer.valueOf(i));
                        if (str == null) {
                            return;
                        }
                        ba.a aVar = (ba.a) fVar.e.get(str);
                        if ((aVar != null ? aVar.a : null) == null) {
                            fVar.g.remove(str);
                            fVar.f.put(str, serializable);
                            return;
                        }
                        n9<O> n9Var = aVar.a;
                        n9Var.getClass();
                        if (fVar.d.remove(str)) {
                            n9Var.a((O) serializable);
                        }
                    }
                });
                return;
            }
            Intent intentCreateIntent = o9Var.createIntent(dq1Var, obj);
            if (intentCreateIntent.getExtras() != null) {
                Bundle extras = intentCreateIntent.getExtras();
                extras.getClass();
                if (extras.getClassLoader() == null) {
                    intentCreateIntent.setExtrasClassLoader(dq1Var.getClassLoader());
                }
            }
            if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentCreateIntent.getAction())) {
                String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                c9.e(dq1Var, stringArrayExtra, i);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentCreateIntent.getAction())) {
                dq1Var.startActivityForResult(intentCreateIntent, i, bundle);
                return;
            }
            og5 og5Var = (og5) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                og5Var.getClass();
                i2 = i;
                try {
                    dq1Var.startIntentSenderForResult(og5Var.t, i2, og5Var.u, og5Var.v, og5Var.w, 0, bundle);
                    g2b g2bVar = g2b.a;
                } catch (IntentSender.SendIntentException e) {
                    e = e;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: gq1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.t.a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                i2 = i;
            }
        }
    }

    public dq1() {
        this.contextAwareHelper = new tz1();
        this.menuHostHelper = new mr6(new Runnable() { // from class: rp1
            @Override // java.lang.Runnable
            public final void run() {
                this.t.invalidateMenu();
            }
        });
        c19 c19Var = new c19(new e19(this, new s97(1, this)));
        this.savedStateRegistryController = c19Var;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter$delegate = new o7a(new up1(0, this));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new f();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = new o7a(new vp1(0, this));
        if (getLifecycle() == null) {
            aa0.c("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        getLifecycle().a(new g76() { // from class: wp1
            @Override // defpackage.g76
            public final void t(m76 m76Var, s66.a aVar) {
                dq1._init_$lambda$1(this.t, m76Var, aVar);
            }
        });
        getLifecycle().a(new g76() { // from class: xp1
            @Override // defpackage.g76
            public final void t(m76 m76Var, s66.a aVar) {
                dq1._init_$lambda$2(this.t, m76Var, aVar);
            }
        });
        getLifecycle().a(new a());
        c19Var.a();
        x09.b(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new b19.b() { // from class: yp1
            @Override // b19.b
            public final Bundle a() {
                return dq1._init_$lambda$3(this.a);
            }
        });
        addOnContextAvailableListener(new ih7() { // from class: zp1
            @Override // defpackage.ih7
            public final void a(dq1 dq1Var) {
                dq1._init_$lambda$4(this.a, dq1Var);
            }
        });
        this.defaultViewModelProviderFactory$delegate = new o7a(new aq1(0, this));
        this.onBackPressedDispatcher$delegate = new o7a(new bq1(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(dq1 dq1Var, m76 m76Var, s66.a aVar) {
        Window window;
        View viewPeekDecorView;
        m76Var.getClass();
        aVar.getClass();
        if (aVar != s66.a.ON_STOP || (window = dq1Var.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(dq1 dq1Var, m76 m76Var, s66.a aVar) {
        m76Var.getClass();
        aVar.getClass();
        if (aVar == s66.a.ON_DESTROY) {
            dq1Var.contextAwareHelper.b = null;
            if (!dq1Var.isChangingConfigurations()) {
                dq1Var.getViewModelStore().a();
            }
            dq1Var.reportFullyDrawnExecutor.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$3(dq1 dq1Var) {
        Bundle bundle = new Bundle();
        ba baVar = dq1Var.activityResultRegistry;
        baVar.getClass();
        LinkedHashMap linkedHashMap = baVar.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(baVar.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(baVar.g));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(dq1 dq1Var, Context context) {
        context.getClass();
        Bundle bundleA = dq1Var.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            ba baVar = dq1Var.activityResultRegistry;
            LinkedHashMap linkedHashMap = baVar.b;
            LinkedHashMap linkedHashMap2 = baVar.a;
            Bundle bundle = baVar.g;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                baVar.d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        fza.a(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                baVar.b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final zg7 zg7Var) {
        getLifecycle().a(new g76(this) { // from class: tp1
            public final /* synthetic */ dq1 u;

            {
                this.u = this;
            }

            @Override // defpackage.g76
            public final void t(m76 m76Var, s66.a aVar) {
                dq1.addObserverForBackInvoker$lambda$0(zg7Var, this.u, m76Var, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$0(zg7 zg7Var, dq1 dq1Var, m76 m76Var, s66.a aVar) {
        m76Var.getClass();
        aVar.getClass();
        if (aVar == s66.a.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = dq1Var.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            zg7Var.d(onBackInvokedDispatcher);
        }
    }

    private final d createFullyDrawnExecutor() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g19 defaultViewModelProviderFactory_delegate$lambda$0(dq1 dq1Var) {
        return new g19(dq1Var.getApplication(), dq1Var, dq1Var.getIntent() != null ? dq1Var.getIntent().getExtras() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this._viewModelStore = cVar.b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new vhb();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lh4 fullyDrawnReporter_delegate$lambda$0(dq1 dq1Var) {
        return new lh4(dq1Var.reportFullyDrawnExecutor, new vb(1, dq1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b fullyDrawnReporter_delegate$lambda$0$0(dq1 dq1Var) {
        dq1Var.reportFullyDrawn();
        return g2b.a;
    }

    private final z03 getOnBackPressedInput() {
        return (z03) this.onBackPressedInput$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zg7 onBackPressedDispatcher_delegate$lambda$0(final dq1 dq1Var) {
        final zg7 zg7Var = new zg7(new Runnable() { // from class: cq1
            @Override // java.lang.Runnable
            public final void run() {
                dq1.onBackPressedDispatcher_delegate$lambda$0$0(this.t);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            if (!xj5.a(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: sp1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.t.addObserverForBackInvoker(zg7Var);
                    }
                });
                return zg7Var;
            }
            dq1Var.addObserverForBackInvoker(zg7Var);
        }
        return zg7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedDispatcher_delegate$lambda$0$0(dq1 dq1Var) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e2) {
            if (!xj5.a(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e2;
            }
        } catch (NullPointerException e3) {
            if (!xj5.a(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z03 onBackPressedInput_delegate$lambda$0(dq1 dq1Var) {
        z03 z03Var = new z03();
        dq1Var.getNavigationEventDispatcher().b(z03Var);
        return z03Var;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        dVar.a0(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.jr6
    public void addMenuProvider(cs6 cs6Var) {
        cs6Var.getClass();
        mr6 mr6Var = this.menuHostHelper;
        mr6Var.b.add(cs6Var);
        mr6Var.a.run();
    }

    @Override // defpackage.gh7
    public final void addOnConfigurationChangedListener(sy1<Configuration> sy1Var) {
        sy1Var.getClass();
        this.onConfigurationChangedListeners.add(sy1Var);
    }

    public final void addOnContextAvailableListener(ih7 ih7Var) {
        ih7Var.getClass();
        tz1 tz1Var = this.contextAwareHelper;
        tz1Var.getClass();
        dq1 dq1Var = tz1Var.b;
        if (dq1Var != null) {
            ih7Var.a(dq1Var);
        }
        tz1Var.a.add(ih7Var);
    }

    @Override // defpackage.rh7
    public final void addOnMultiWindowModeChangedListener(sy1<z07> sy1Var) {
        sy1Var.getClass();
        this.onMultiWindowModeChangedListeners.add(sy1Var);
    }

    public final void addOnNewIntentListener(sy1<Intent> sy1Var) {
        sy1Var.getClass();
        this.onNewIntentListeners.add(sy1Var);
    }

    @Override // defpackage.sh7
    public final void addOnPictureInPictureModeChangedListener(sy1<az7> sy1Var) {
        sy1Var.getClass();
        this.onPictureInPictureModeChangedListeners.add(sy1Var);
    }

    public final void addOnPictureInPictureUiStateChangedListener(sy1<cz7> sy1Var) {
        sy1Var.getClass();
        this.onPictureInPictureUiStateChangedListeners.add(sy1Var);
    }

    @Override // defpackage.hi7
    public final void addOnTrimMemoryListener(sy1<Integer> sy1Var) {
        sy1Var.getClass();
        this.onTrimMemoryListeners.add(sy1Var);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final void enterPictureInPictureMode(bz7 bz7Var) {
        throw null;
    }

    @Override // defpackage.ja
    public final ba getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // defpackage.wt4
    public lb2 getDefaultViewModelCreationExtras() {
        z17 z17Var = new z17((Object) null);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = z17Var.a;
        if (application != null) {
            linkedHashMap.put(thb.a.d, getApplication());
        }
        linkedHashMap.put(x09.a, this);
        linkedHashMap.put(x09.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(x09.c, extras);
        }
        return z17Var;
    }

    @Override // defpackage.wt4
    public thb.c getDefaultViewModelProviderFactory() {
        return (thb.c) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public lh4 getFullyDrawnReporter() {
        return (lh4) this.fullyDrawnReporter$delegate.getValue();
    }

    @gy2
    public Object getLastCustomNonConfigurationInstance() {
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.a;
        }
        return null;
    }

    @Override // defpackage.hq1, defpackage.m76
    public s66 getLifecycle() {
        return super.getLifecycle();
    }

    @Override // defpackage.f87
    public e87 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().c().c;
    }

    @Override // defpackage.bh7
    public final zg7 getOnBackPressedDispatcher() {
        return (zg7) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // defpackage.f19
    public final b19 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // defpackage.whb
    public vhb getViewModelStore() {
        if (getApplication() == null) {
            aa0.c("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        ensureViewModelStore();
        vhb vhbVar = this._viewModelStore;
        vhbVar.getClass();
        return vhbVar;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @gy2
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @gy2
    public void onBackPressed() {
        getOnBackPressedInput().a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator<sy1<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // defpackage.hq1, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        tz1 tz1Var = this.contextAwareHelper;
        tz1Var.getClass();
        tz1Var.b = this;
        Iterator it = tz1Var.a.iterator();
        while (it.hasNext()) {
            ((ih7) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = co8.u;
        co8.a.b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
        this.hasPictureInPictureSystemFeature = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        mr6 mr6Var = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<cs6> it = mr6Var.b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator<cs6> it = this.menuHostHelper.b.iterator();
            while (it.hasNext()) {
                if (it.next().a(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<sy1<z07>> it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new z07(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<sy1<Intent>> it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator<cs6> it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<sy1<az7>> it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new az7(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        cz7 cz7VarA = cz7.a.a(pictureInPictureUiState);
        Iterator<sy1<cz7>> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(cz7VarA);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator<cs6> it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @gy2
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @gy2
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        vhb vhbVar = this._viewModelStore;
        if (vhbVar == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            vhbVar = cVar.b;
        }
        if (vhbVar == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.a = objOnRetainCustomNonConfigurationInstance;
        cVar2.b = vhbVar;
        return cVar2;
    }

    @Override // defpackage.hq1, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (getLifecycle() instanceof n76) {
            s66 lifecycle = getLifecycle();
            lifecycle.getClass();
            ((n76) lifecycle).h(s66.b.v);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<sy1<Integer>> it = this.onTrimMemoryListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public final <I, O> w9<I> registerForActivityResult(o9<I, O> o9Var, ba baVar, n9<O> n9Var) {
        o9Var.getClass();
        baVar.getClass();
        n9Var.getClass();
        return baVar.c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, o9Var, n9Var);
    }

    @Override // defpackage.jr6
    public void removeMenuProvider(cs6 cs6Var) {
        cs6Var.getClass();
        this.menuHostHelper.c(cs6Var);
    }

    @Override // defpackage.gh7
    public final void removeOnConfigurationChangedListener(sy1<Configuration> sy1Var) {
        sy1Var.getClass();
        this.onConfigurationChangedListeners.remove(sy1Var);
    }

    public final void removeOnContextAvailableListener(ih7 ih7Var) {
        ih7Var.getClass();
        tz1 tz1Var = this.contextAwareHelper;
        tz1Var.getClass();
        tz1Var.a.remove(ih7Var);
    }

    @Override // defpackage.rh7
    public final void removeOnMultiWindowModeChangedListener(sy1<z07> sy1Var) {
        sy1Var.getClass();
        this.onMultiWindowModeChangedListeners.remove(sy1Var);
    }

    public final void removeOnNewIntentListener(sy1<Intent> sy1Var) {
        sy1Var.getClass();
        this.onNewIntentListeners.remove(sy1Var);
    }

    @Override // defpackage.sh7
    public final void removeOnPictureInPictureModeChangedListener(sy1<az7> sy1Var) {
        sy1Var.getClass();
        this.onPictureInPictureModeChangedListeners.remove(sy1Var);
    }

    public final void removeOnPictureInPictureUiStateChangedListener(sy1<cz7> sy1Var) {
        sy1Var.getClass();
        this.onPictureInPictureUiStateChangedListeners.remove(sy1Var);
    }

    @Override // defpackage.hi7
    public final void removeOnTrimMemoryListener(sy1<Integer> sy1Var) {
        sy1Var.getClass();
        this.onTrimMemoryListeners.remove(sy1Var);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (wra.b()) {
                wra.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            lh4 fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.b) {
                try {
                    fullyDrawnReporter.c = true;
                    ArrayList arrayList = fullyDrawnReporter.d;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((mh4) obj).invoke();
                    }
                    fullyDrawnReporter.d.clear();
                    g2b g2bVar = g2b.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        dVar.a0(decorView);
        super.setContentView(i);
    }

    public final void setPictureInPictureParams(bz7 bz7Var) {
        throw null;
    }

    @Override // android.app.Activity
    @gy2
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @gy2
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @gy2
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @gy2
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void addMenuProvider(cs6 cs6Var, m76 m76Var) {
        cs6Var.getClass();
        m76Var.getClass();
        this.menuHostHelper.a(cs6Var, m76Var);
    }

    public void addMenuProvider(cs6 cs6Var, m76 m76Var, s66.b bVar) {
        cs6Var.getClass();
        m76Var.getClass();
        bVar.getClass();
        this.menuHostHelper.b(cs6Var, m76Var, bVar);
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        dVar.a0(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        dVar.a0(decorView);
        super.setContentView(view, layoutParams);
    }

    public final <I, O> w9<I> registerForActivityResult(o9<I, O> o9Var, n9<O> n9Var) {
        o9Var.getClass();
        n9Var.getClass();
        return registerForActivityResult(o9Var, this.activityResultRegistry, n9Var);
    }

    @Override // android.app.Activity
    @gy2
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<sy1<z07>> it = this.onMultiWindowModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new z07(z));
        }
    }

    @Override // android.app.Activity
    @gy2
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<sy1<az7>> it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new az7(z));
        }
    }

    public dq1(int i) {
        this();
        this.contentLayoutId = i;
    }
}
